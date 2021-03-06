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

public class PrincipalJF extends JFrame {

	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalJF frame = new PrincipalJF();
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
	public PrincipalJF() {
		setTitle("The Star Rover");
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,1400, 800);
		
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		
		JButton agregarDatosBtn = new JButton("AGREGAR DATOS");
		agregarDatosBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame ventanaAgregarDatos = new AgregarDatosJF();
				ventanaAgregarDatos.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		agregarDatosBtn.setBounds(37, 80, 144, 48);
		contentPane.add(agregarDatosBtn);
		
		JButton mostrarDatosbtn = new JButton("MOSTRAR DATOS");
		mostrarDatosbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame ventanaMostrarDatos= new MostrarDatosJF();
				ventanaMostrarDatos.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		mostrarDatosbtn.setBounds(37, 150, 144, 53);
		contentPane.add(mostrarDatosbtn);
		
		JButton exitBtn = new JButton("SALIR");
		exitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		exitBtn.setBounds(1270,20,70,40);
		contentPane.add(exitBtn);
		
		JLabel tituloLbl = new JLabel("The Star Rover");
		tituloLbl.setFont(new Font("Bookman Old Style", Font.BOLD, 40));
		tituloLbl.setHorizontalAlignment(SwingConstants.CENTER);
		tituloLbl.setBounds(10, 11,1400, 50);
		contentPane.add(tituloLbl);
	}
}
