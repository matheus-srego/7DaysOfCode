import java.util.ArrayList;
import java.util.List;

public class ShoppingList {
	
	public static List<String> itens = new ArrayList<String>();
	public static List<Integer> amounts = new ArrayList<Integer>();
	
	public static void main( String[] args ) {
		
		itensInsertionTest();
		
		listItens();
		
		itensRemovalTest();
		
		listItens();
		
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
	
	public static void listItens() {
		
		System.out.println( " --- LISTA DE COMPRAS --- " );
		System.out.println( " Produto    //    Quantidade " );
		System.out.println( " --------------------------- " );
		
		for( int i = 0; i < itens.size(); i++ ) {
			for( int j = 0; j < amounts.size(); j++ ) {
				if( i == j ) {
					System.out.println( " " + itens.get( i ) + "    //    " + amounts.get( j ) );
					break;
				}
			}

			System.out.println( " --------------------------- " );
			
		}
		
		if( itens.isEmpty() || amounts.isEmpty()) {
			
			System.out.println( "A lista de compras esta vazia" );
			System.out.println( " --------------------------- " );
			
		}
		else {
			System.out.println( " --- FIM DA LISTA DE COMPRAS --- " );			
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
