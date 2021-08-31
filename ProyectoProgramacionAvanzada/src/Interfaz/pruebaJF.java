package Interfaz;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class pruebaJF extends JFrame {

	private JScrollPane scrollPane ;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pruebaJF frame = new pruebaJF();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public pruebaJF() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setUndecorated(true);
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0,0, 1400, 700);
		setContentPane(scrollPane);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(1500,800));
		scrollPane.setViewportView(panel);
	}

}
