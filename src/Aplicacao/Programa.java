package Aplicacao;

import Xadrez.PartidaDeXadrez;

public class Programa {       //Executando o Programa Partida de Xadrez

	public static void main(String[] args) {
		
		PartidaDeXadrez partidaDeXadrez = new PartidaDeXadrez();
		UI.imprimindoTabuleiro(partidaDeXadrez.localDasPecas());
	}

}
