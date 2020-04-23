package Aplicacao;

import Xadrez.PecaDoXadrez;

public class UI {                     //Classe para Imprimir o Tabuleiro e Pecas
	
	public static void imprimindoTabuleiro(PecaDoXadrez[][] local) { //Imprimindo o Tabuleiro e Pecas
		for(int i=0; i<local.length;i++){
			System.out.print(8-i+" ");
			for(int j=0;j<local.length;j++) {
				imprimindoPeca(local[i][j]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}
	
	public static void imprimindoPeca(PecaDoXadrez peca) {   // Imprimindo a Peca
		if(peca == null) {
			System.out.print("-");
		}
		else { 
			System.out.print(peca);
		}
		System.out.print(" ");
	}
}
