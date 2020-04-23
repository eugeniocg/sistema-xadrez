package Xadrez.Pecas;

import JogoTabuleiro.Tabuleiro;
import Xadrez.Cor;
import Xadrez.PecaDoXadrez;

public class Torre extends PecaDoXadrez{              //Criando a Classe Torre(Rook)

	public Torre(Tabuleiro tabuleiro, Cor cor) {      //Construtor
		super(tabuleiro, cor);
	}

	@Override
	public String toString() {                        //toString
		return "R";
	}
}
