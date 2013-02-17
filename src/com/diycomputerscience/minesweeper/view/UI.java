package com.diycomputerscience.minesweeper.view;

import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.diycomputerscience.minesweeper.Board;

public class UI extends JFrame {
	
	public UI() {
		this.setTitle("Minesweeper");				
		
		JPanel panel = new JPanel();
		panel.setName("MainPanel");
		panel.setLayout(new GridLayout(Board.MAX_ROWS, Board.MAX_COLS));
		
		this.layoutSquares(panel);
		this.getContentPane().add(panel);			
	}

	public static UI build() {
		UI ui = new UI();
		ui.setSize(300, 400);
		ui.setVisible(true);
		ui.setDefaultCloseOperation(EXIT_ON_CLOSE);
		return ui;
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				build();
			}
					
		});		
	}

}
