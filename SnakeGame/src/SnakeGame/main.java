package SnakeGame;

import java.awt.Color;

import javax.swing.JFrame;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame=new JFrame("Snake Game");
		frame.setBounds(10, 10, 905, 700);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GamePanel gp=new GamePanel();
		gp.setBackground(Color.DARK_GRAY);
		frame.add(gp);
		frame.setVisible(true);
		

	}

}
