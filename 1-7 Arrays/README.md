# Arrays :D

Arrays são estruturas de dados que armazenam elementos em sequência na memória, por isso, conseguimos acessar um elemento pelo seu índice, que sempre começa em 0!

Veja um exemplo de array abaixo, que contém elementos do tipo String e representa uma lista de nomes:

```
nomes = ["Giovanna", "Lucas", "Alex", "Beatriz"]

print(nomes[1]) // "Lucas"
```

O desafio para o dia é implementar uma versão simplificada de uma lista de compras usando arrays. A lista deve permitir adicionar novos itens, remover itens e listar todos os itens.

Ao adicionar um novo item, o usuário deve inserir o nome do produto e a quantidade desejada. Ao remover um item, o usuário deve especificar o nome do produto. Por fim, ao listar todos os itens, a lista deve exibir o nome do produto e a quantidade em um formato legível.

**Observação:** não é necessário criar nenhuma interface do usuário para esse desafio (a não ser que você queira), o objetivo é executar apenas um único arquivo.

## DICA

Você pode criar uma classe chamada `ListaDeCompras` para resolver este desafio.

1. Comece definindo a classe `ListaDeCompras` e inicialize duas listas vazias, itens e quantidades, para armazenar os nomes dos produtos e as quantidades, respectivamente;

2. Crie o método adicionar_item, que recebe como argumentos o nome do produto e a quantidade desejada. Dentro desse método, adicione o nome do produto à lista itens e a quantidade à lista quantidades;

3. Crie o método remover_item, que recebe como argumento o nome do produto a ser removido. Dentro desse método, encontre o índice do produto na lista items e remova o produto tanto da lista itens quanto da lista quantidades;

4. Crie o método listar_itens, que percorre a lista itens e a lista quantidades simultaneamente e exibe o nome do produto e a quantidade em um formato legível;

5. Teste a sua implementação criando uma instância da classe `ListaDeCompras`, adicionando alguns itens, removendo um item e listando todos os itens restantes;

6. Como uma tarefa extra, você pode implementar algumas validações extras, como verificar se o nome do produto está em formato válido e se a quantidade é um número inteiro positivo.