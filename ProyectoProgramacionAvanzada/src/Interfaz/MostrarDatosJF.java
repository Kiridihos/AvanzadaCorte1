package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class MostrarDatosJF extends JFrame {

	private JPanel contentPane;
	private final JButton volverBtn = new JButton("Volver");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MostrarDatosJF frame = new MostrarDatosJF();
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
	public MostrarDatosJF() {
		setTitle("The Star Rover Lista Datos");
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,1400, 800);
		
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		
		volverBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame ventanaPrincipal=new PrincipalJF();
				ventanaPrincipal.setVisible(true);
				setVisible(false);
				dispose();

			}
		});
		volverBtn.setBounds(1270,700,70,40);
		contentPane.add(volverBtn);
		
		JLabel tituloLbl = new JLabel("Lista de Datos");
		tituloLbl.setFont(new Font("Bookman Old Style", Font.BOLD, 40));
		tituloLbl.setHorizontalAlignment(SwingConstants.CENTER);
		tituloLbl.setBounds(10, 11,1400, 50);
		contentPane.add(tituloLbl);
	}
}
