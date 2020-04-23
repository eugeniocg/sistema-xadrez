package Xadrez;

import JogoTabuleiro.Tabuleiro;

public class PartidaDeXadrez {

	private Tabuleiro tabuleiro;
	
	public PartidaDeXadrez() {           //Construtor da classe PartidaDeXadrez
		tabuleiro=new Tabuleiro(8, 8);   //Instanciano tabuleiro com linha e coluna 8
	}
	public PecaDoXadrez[][] localDasPecas(){     //Criando matriz com o local das Pecas no Tabuleiro
		PecaDoXadrez[][] mat = new PecaDoXadrez[tabuleiro.getLinha()][tabuleiro.getColuna()];
		for( int i=0;i<tabuleiro.getLinha(); i++) {
			for(int j=0;j<tabuleiro.getColuna();j++) {
				mat[i][j]=(PecaDoXadrez) tabuleiro.peca(i, j);
			}
		}
		return mat;
	}
	
}