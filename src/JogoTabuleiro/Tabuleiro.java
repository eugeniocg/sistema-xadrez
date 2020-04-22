package JogoTabuleiro;

public class Tabuleiro {

	private int linha;
	private int coluna;
	private Peca[][] pecas; // Instanciano uma matriz de peças

	public Tabuleiro(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
		pecas = new Peca[linha][coluna]; // Criando objeto pecas
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}

	public Peca peca(int linha, int coluna) { // sobrecarga criando a peça
		return pecas[linha][coluna];
	}

	public Peca peca(Posicao posicao) { // sobrecarga da peca recebendo a posicao
		return pecas[posicao.getLinha()][posicao.getColuna()];

	}
}
