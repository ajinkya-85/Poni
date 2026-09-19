package main;

import javax.swing.JFrame;

public class Main {
	
	public static void main(String[] arg) {
		//System.out.println("Hello world");
		JFrame window =  new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setTitle("Poni");
		
		GamePanel gamePanel = new GamePanel();
		window.add(gamePanel);//passing the panel object
		
		window.pack();
		
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		gamePanel.startGaneThread();
	}

}
