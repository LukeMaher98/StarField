package com.luke.platformer.main;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;

public class GamePanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public static final int WIDTH = 1280;
	public static final int HEIGHT = 720;
	
	public GamePanel() {
		super();
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setFocusable(true);
		requestFocus();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		Random r = new Random();
		Color randomColor = new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));
		g.setColor(randomColor);
		for(int i = 0; i < 10000; i++) {
			int x = Math.abs(r.nextInt() % WIDTH);
			int y = Math.abs(r.nextInt() % HEIGHT);
			System.out.print("x: " + x + "\ty: " + y + "\n");
			g.drawLine(x, y, x, y);
		}
	}
	
}
