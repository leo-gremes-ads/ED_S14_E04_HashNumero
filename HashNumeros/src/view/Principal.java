package view;

import controller.Hash;

public class Principal
{
	public static void main(String[] args)
	{
		Hash h = new Hash();
		int[] numeros = {30, 23, 17, 12, 76, 58, 98, 58, 24, 36, 92, 17, 75, 74,
			78, 78, 0, 11, 67, 17};
		
		int tamanho = numeros.length;

		for (int i = 0; i < tamanho; i++) {
			h.adicionarNumero(numeros[i]);
		}
		h.consultarTabela();
	}	
}
