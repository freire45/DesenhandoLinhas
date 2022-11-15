package br.com.erickfreire.desenhandolinhas;

import java.awt.Graphics;

import javax.swing.JPanel;

public class DesenhandoLinhas extends JPanel {
	
	int contador = 1;
	int valor = 0;
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		int largura = getWidth();
		int altura = getHeight();
		int contador = 1;
		int passos = 0;

		while (altura - passos >= 0) {

			g.drawLine(0, 0, passos, altura - passos);
			passos = passos + 15;
			contador++;

		}
		
		
	}
	
	

}
