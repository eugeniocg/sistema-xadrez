package Xadrez.Pecas;

import JogoTabuleiro.Tabuleiro;
import Xadrez.Cor;
import Xadrez.PecaDoXadrez;

public class Rei extends PecaDoXadrez {             //Criando a Classe do Rei(King)

	public Rei(Tabuleiro tabuleiro, Cor cor) {      //Construtor
		super(tabuleiro, cor);
	}

	@Override
	public String toString() {                      //toString
		return "K";
	}

}
