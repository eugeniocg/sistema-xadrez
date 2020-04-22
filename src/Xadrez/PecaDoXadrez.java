package Xadrez;

import JogoTabuleiro.Peca;
import JogoTabuleiro.Tabuleiro;

public class PecaDoXadrez extends Peca {

	private Cor cor;

	public PecaDoXadrez(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro);
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

	
	
}