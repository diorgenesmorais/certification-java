package com.dms.jcp10ed;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * Primeiro aplicativo de desenho
 *
 * @autor Diorgenes Morais
 *
 * @version 1.0.0
 */
public class DrawPanel extends JPanel {
	private static final long serialVersionUID = -3980870052507436443L;

	// desenha um X a partir dos cantos do painel	
	public void paintComponent(Graphics g){
		// para assegurar que o painel é exibido corretamente
		super.paintComponent(g);
		
		int width = getWidth();
		int height = getHeight();
		// desenha uma linha a partir do canto superior esquerdo até o inferior direito
		g.drawLine(0, 0, width, height);
		// desenha uma linha a partir do canto inferior esquerdo até o superior direito
		g.drawLine(0, height, width, 0);
	}
}
