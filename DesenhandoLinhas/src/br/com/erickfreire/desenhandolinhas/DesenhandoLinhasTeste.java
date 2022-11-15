package br.com.erickfreire.desenhandolinhas;

import javax.swing.JFrame;

public class DesenhandoLinhasTeste {

	public static void main(String[] args) {
		DesenhandoLinhas linhas = new DesenhandoLinhas();
		
		JFrame aplicacao = new JFrame();
		
		aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		aplicacao.add(linhas);
		aplicacao.setSize(250,250);
		aplicacao.setVisible(true);

	}

}
