package main;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;



public class GamePanel extends JPanel implements Runnable{
	
	//Screen settings
	final int originalTileSize = 16; // 16 x 16
	final int scale = 4;
	
	final int tileSize = originalTileSize * scale;
	final int maxScreenCol = 20;
	final int maxScreenRow = 15;
	final int screenWidth = tileSize * maxScreenCol;
	final int screenHeight = tileSize * maxScreenRow;
	
	Thread gameThread;
	
	public GamePanel() {
		this.setPreferredSize(new Dimension(screenWidth,screenHeight));
		this.setBackground(Color.black);
		this.setDoubleBuffered(true);
	}

	public void startGaneThread() {
		gameThread = new Thread(this);
		gameThread.start();
	}
	
	@Override
	public void run() {
		
		
	}

}
