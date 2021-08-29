package Interfaz;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class agregarDatosJF extends JFrame {

	private JPanel contentPane;
	private Dimension dim;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					agregarDatosJF frame = new agregarDatosJF();
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
	public agregarDatosJF() {
		setTitle("The Star Rover Agregar Datos");
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton volverBtn = new JButton("Volver");
		volverBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame ventanaPrincipal= new principalJF();
				ventanaPrincipal.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		volverBtn.setBounds(1270,700,70,40);
		contentPane.add(volverBtn);
		
		JLabel tituloLbl = new JLabel("Agregar Datos");
		tituloLbl.setHorizontalAlignment(SwingConstants.CENTER);
		tituloLbl.setFont(new Font("Bookman Old Style", Font.BOLD, 40));
		tituloLbl.setBounds(10, 11,1400, 50);
		contentPane.add(tituloLbl);
		
		JButton crearEventoBtn = new JButton("Crear Evento");
		crearEventoBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame ventanaCrearEvento=new crearEventoJF();
				ventanaCrearEvento.setVisible(true);
				dispose();
			}
		});
		crearEventoBtn.setBounds(20,80, 120, 40);
		contentPane.add(crearEventoBtn);
		
		JButton crearEmpleadoBtn = new JButton("Crear Empleado");
		crearEmpleadoBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame ventanaCrearEvento=new crearEmpleadoJF();
				ventanaCrearEvento.setVisible(true);
				dispose();
			}
		});
		crearEmpleadoBtn.setBounds(20,140, 140, 40);
		contentPane.add(crearEmpleadoBtn);
		
		
        
	}
}
