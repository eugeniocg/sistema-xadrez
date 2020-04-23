package Xadrez;

import JogoTabuleiro.Posicao;
import JogoTabuleiro.Tabuleiro;
import Xadrez.Pecas.Rei;
import Xadrez.Pecas.Torre;

public class PartidaDeXadrez {

	private Tabuleiro tabuleiro;
	
	public PartidaDeXadrez() {           //Construtor da classe PartidaDeXadrez
		tabuleiro=new Tabuleiro(8, 8);   //Instanciano tabuleiro com linha e coluna 8
		iniciandoAlocacaoPecas();
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
	
	public void iniciandoAlocacaoPecas() {      //Iniciando e Colocando as Pecas no Tabuleiro
		tabuleiro.lugarDaPeca(new Torre(tabuleiro, Cor.BRANCO), new Posicao(2, 1));
		tabuleiro.lugarDaPeca(new Rei(tabuleiro, Cor.PRETO), new Posicao(0, 4));
		tabuleiro.lugarDaPeca(new Rei(tabuleiro, Cor.BRANCO), new Posicao(7, 4));
	}
	
}