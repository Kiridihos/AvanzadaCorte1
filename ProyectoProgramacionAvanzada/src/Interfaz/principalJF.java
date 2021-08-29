package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class principalJF extends JFrame {

	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					principalJF frame = new principalJF();
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
	public principalJF() {
		setTitle("The Star Rover");
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton AgregarDatosBtn = new JButton("AGREGAR DATOS");
		AgregarDatosBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame ventanaAgregarDatos = new agregarDatosJF();
				ventanaAgregarDatos.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		AgregarDatosBtn.setBounds(74, 80, 144, 48);
		contentPane.add(AgregarDatosBtn);
		
		JButton MostrarDatosbtn = new JButton("MOSTAR DATOS");
		MostrarDatosbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame ventanaMostrarDatos= new MostrarDatosJF();
				ventanaMostrarDatos.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		MostrarDatosbtn.setBounds(301, 78, 144, 53);
		contentPane.add(MostrarDatosbtn);
	}

}
