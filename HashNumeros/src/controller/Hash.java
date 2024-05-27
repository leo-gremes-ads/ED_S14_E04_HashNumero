package controller;

import lib.model.Lista;

public class Hash
{
	Lista<Integer>[] tabela;
	
	public Hash()
	{
		tabela = new Lista[10];
		inicializaTabela();
	}

	private void inicializaTabela()
	{
		int tamanho = tabela.length;
		for (int i = 0; i < tamanho; i++)
			tabela[i] = new Lista<>();
	}

	private int hashCode(int numero)
	{
		return numero / 10;
	}

	public void adicionarNumero(int numero)
	{
		try {
			int hash = hashCode(numero);
			if (tabela[hash].isEmpty())
				tabela[hash].addFirst(numero);
			else
				tabela[hash].addLast(numero);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	public void consultarTabela()
	{
		try {
			int tamanho = tabela.length;
			for (int i = 0; i < tamanho; i++) {
				System.out.print(i + ": ");
				consultaLista(tabela[i]);
				System.out.println();
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	private void consultaLista(Lista<Integer> lista) throws Exception
	{
		int tamanho = lista.size();
		if (tamanho == 1)
			System.out.print(lista.get(0) + " -> FIM!");
		else if (tamanho > 1) {
			for (int i = 0; i < tamanho; i++) {
				int atual = lista.get(0);
				System.out.print(atual + " -> ");
				lista.removeFirst();
				lista.addLast(atual);
			}
			System.out.print("FIM!");
		}
	}
}