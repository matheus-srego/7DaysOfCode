import java.util.ArrayList;
import java.util.List;

public class ShoppingList {
	
	public static List<String> itens = new ArrayList<String>();
	public static List<Integer> amounts = new ArrayList<Integer>();
	
	public static void main( String[] args ) {
		
		itensInsertionTest();
		
		itensRemovalTest();
		
	}
	
	public static void insertItens( String itemName, Integer itemQuantity ) {
		
		itens.add( itemName );
		amounts.add( itemQuantity );
		
	}
	
	public static void removeItens( String itemName ) {
		
		for( int i = 0; i < itens.size(); i++ ) {
			if( itens.contains( itemName ) ) {
				Integer amount = amounts.get( i );
				
				itens.remove( itemName );
				amounts.remove( amount );
				
				System.out.println( "\n> " + itemName + " (quantidade: " + amount + ") foi removido da lista de compras.." );
				break;
			}
		}
			
	}
	
	/* --- TEST METHODS --- */
	public static void itensInsertionTest() {
		
		List<String> itensTest = new ArrayList<String>(
			List.of( "Feijão", "Arroz", "Biscoito", "Banana", "Maça" )
		);
		
		List<Integer> amountsTest = new ArrayList<Integer>(
			List.of( 2, 2, 3, 10, 5 )
		);
		
		for( int i = 0; i < itensTest.size(); i++ ) {
			for( int j = 0; j <= amountsTest.size(); j++ ) {
				
				if( i == j ) {
					
					String item = itensTest.get( i );
					Integer amount = amountsTest.get( j );
					
					insertItens( item, amount );
					break;
					
				}
			}
		}
		
	}
	
	public static void itensRemovalTest() {
		
		final List<String> totalItens = new ArrayList<String>();
		totalItens.addAll( itens );
		
		for( String item : totalItens ) {
			
			removeItens( item );
			
		}
		
	}
	
}
