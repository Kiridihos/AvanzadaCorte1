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
		setTitle("The Star Rover Mostrar Datos");
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,1400, 800);
		
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel tituloLbl = new JLabel("Mostrar Datos");
		tituloLbl.setHorizontalAlignment(SwingConstants.CENTER);
		tituloLbl.setFont(new Font("Bookman Old Style", Font.BOLD, 40));
		tituloLbl.setBounds(10, 11,1400, 50);
		contentPane.add(tituloLbl);
		
		JButton crearEventoBtn = new JButton("Mostrar Eventos");
		crearEventoBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame ventanaCrearEvento=new MostrarEvento1();
				ventanaCrearEvento.setVisible(true);
				dispose();
			}
		});
		crearEventoBtn.setBounds(20,80, 130, 40);
		contentPane.add(crearEventoBtn);
		
		JButton crearEmpleadoBtn = new JButton("Mostrar Empleados");
		crearEmpleadoBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame ventanaCrearEvento=new CrearEmpleadoJF();
				ventanaCrearEvento.setVisible(true);
				dispose();
			}
		});
		crearEmpleadoBtn.setBounds(170,80, 130, 40);
		contentPane.add(crearEmpleadoBtn);
		
		JButton crearDesfileBtn = new JButton("Mostrar Desfiles");
		crearDesfileBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame ventanaCrearDesfile=new CrearDesfileJF();
				ventanaCrearDesfile.setVisible(true);
				dispose();
			}
		});
		crearDesfileBtn.setBounds(20,140, 130, 40);
		contentPane.add(crearDesfileBtn);
        
		JButton crearDisenhadorBtn = new JButton("Mostrar Diseñadores");
		crearDisenhadorBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame ventanaCrearDisenhador=new CrearDisenhadorJF();
				ventanaCrearDisenhador.setVisible(true);
				dispose();
			}
		});
		crearDisenhadorBtn.setBounds(170,140, 130, 40);
		contentPane.add(crearDisenhadorBtn);
		
		JButton crearPabellonBtn = new JButton("Mostrar Pabellones");
		crearPabellonBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame ventanaCrearPabellon=new CrearPabellonJF();
				ventanaCrearPabellon.setVisible(true);
				dispose();
			}
		});
		crearPabellonBtn.setBounds(20,200, 130, 40);
		contentPane.add(crearPabellonBtn);
		
		JButton crearModeloBtn = new JButton("Mostrar Modelos");
		crearModeloBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame ventanaAgregarModelo=new CrearModeloJF();
				ventanaAgregarModelo.setVisible(true);
				dispose();
			}
		});
		crearModeloBtn.setBounds(170,200, 130, 40);
		contentPane.add(crearModeloBtn);
		
		JButton crearAgenciaBtn = new JButton("Mostrar Agencias");
		crearAgenciaBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame ventanaCreaAgencia=new CrearAgenciaJF();
				ventanaCreaAgencia.setVisible(true);
				dispose();
			}
		});
		crearAgenciaBtn.setBounds(20,260, 130, 40);
		contentPane.add(crearAgenciaBtn);
		
		JButton volverBtn = new JButton("Volver");
		volverBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame ventanaPrincipal= new PrincipalJF();
				ventanaPrincipal.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		volverBtn.setBounds(1270,20,70,40);
		contentPane.add(volverBtn);
	}
}
