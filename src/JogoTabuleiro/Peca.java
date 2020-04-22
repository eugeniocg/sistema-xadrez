package JogoTabuleiro;

public class Peca {

	protected Posicao posicao;                  //Modificador protected
	private Tabuleiro tabuleiro;

	public Peca(Tabuleiro tabuleiro) {          //Construtor da classe Peca
		this.tabuleiro = tabuleiro;
		posicao=null;
	}

	protected Tabuleiro getTabuleiro() {        //Modificador protected
		return tabuleiro;
	}

	
	

}
