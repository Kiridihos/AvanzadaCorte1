package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class crearEmpleadoJF extends JFrame {

	private JPanel contentPane;
	private final ConfirmacionJD ventanaConfirmacion=new ConfirmacionJD(this,true);
	private ButtonGroup tipoEmpleado=new ButtonGroup();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					crearEmpleadoJF frame = new crearEmpleadoJF();
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
	public crearEmpleadoJF() {
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,1400, 800);
		
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel tituloLbl = new JLabel("Agregar Empleado");
		tituloLbl.setHorizontalAlignment(SwingConstants.CENTER);
		tituloLbl.setFont(new Font("Bookman Old Style", Font.BOLD, 40));
		tituloLbl.setBounds(10, 11,1400, 50);
		contentPane.add(tituloLbl);
		
		JLabel nombreLbl = new JLabel("Nombre :");
		nombreLbl.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		nombreLbl.setHorizontalAlignment(SwingConstants.LEFT);
		nombreLbl.setBounds(10, 100, 240, 30);
		contentPane.add(nombreLbl);

		JTextField nombreTxt = new JTextField();
		nombreTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if((c<'a'|| c>'z')&& c!=' ')e.consume(); 
			}
		});
		nombreTxt.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		nombreTxt.setBounds(250,100, 400, 30);
		nombreTxt.setColumns(10);
		contentPane.add(nombreTxt);
		
		JLabel celularLbl = new JLabel("Celular :");
		celularLbl.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		celularLbl.setHorizontalAlignment(SwingConstants.LEFT);
		celularLbl.setBounds(10, 150, 240, 30);
		contentPane.add(celularLbl);

		JTextField celularTxt = new JTextField();
		celularTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(c<'0'|| c>'9')e.consume(); 
			}
		});
		celularTxt.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		celularTxt.setBounds(250,150, 400, 30);
		celularTxt.setColumns(10);
		contentPane.add(celularTxt);
		
		JLabel tipoLbl = new JLabel("Tipo :");
		tipoLbl.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		tipoLbl.setHorizontalAlignment(SwingConstants.LEFT);
		tipoLbl.setBounds(700, 100, 70, 30);
		contentPane.add(tipoLbl);
				
		JLabel ProfesionLbl = new JLabel("Profesion :");
		ProfesionLbl.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		ProfesionLbl.setHorizontalAlignment(SwingConstants.LEFT);
		ProfesionLbl.setBounds(700, 150, 120, 30);
		ProfesionLbl.setVisible(false);
		contentPane.add(ProfesionLbl);
		
		JComboBox profesionesDesplegable = new JComboBox();
		profesionesDesplegable.setBounds(850, 153, 400, 30);
		profesionesDesplegable.setVisible(false);
		contentPane.add(profesionesDesplegable);
		
		JLabel UniversidadLbl = new JLabel("Universidad :");
		UniversidadLbl.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		UniversidadLbl.setHorizontalAlignment(SwingConstants.LEFT);
		UniversidadLbl.setBounds(700, 200, 140, 30);
		UniversidadLbl.setVisible(false);
		contentPane.add(UniversidadLbl);
		
		JTextField universidadTxt = new JTextField();
		universidadTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if((c<'a'|| c>'z')&& c!=' ')e.consume(); 
			}
		});
		universidadTxt.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		universidadTxt.setBounds(850,200, 400, 30);
		universidadTxt.setColumns(10);
		universidadTxt.setVisible(false);
		contentPane.add(universidadTxt);
		
		JRadioButton directivoRbtn= new JRadioButton("Directivo");
		directivoRbtn.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				ProfesionLbl.setVisible(true);
				profesionesDesplegable.setVisible(true);
				UniversidadLbl.setVisible(true);
				universidadTxt.setVisible(true);
			}
		});
		directivoRbtn.setHorizontalAlignment(SwingConstants.LEFT);
		directivoRbtn.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		directivoRbtn.setBounds(780, 100, 120, 30);
		contentPane.add(directivoRbtn);
		
		JRadioButton rasosRbtn = new JRadioButton("Rasos");
		rasosRbtn.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				ProfesionLbl.setVisible(false);
				profesionesDesplegable.setVisible(false);
				UniversidadLbl.setVisible(false);
				universidadTxt.setVisible(false);
			}
		});
		rasosRbtn.setHorizontalAlignment(SwingConstants.LEFT);
		rasosRbtn.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		rasosRbtn.setBounds(900, 100, 120, 30);
		contentPane.add(rasosRbtn);
		tipoEmpleado.add(rasosRbtn);
		tipoEmpleado.add(directivoRbtn);
		
		JButton volverBtn = new JButton("Volver");
		volverBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame ventanaAgregarDatos= new agregarDatosJF();
				ventanaAgregarDatos.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		volverBtn.setBounds(1270,700,70,40);
		contentPane.add(volverBtn);
		
		JButton guardarBtn = new JButton("Guardar");
		guardarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaConfirmacion.setVisible(true);
				if(ventanaConfirmacion.isConfirmacion()) {

				}
			}
		});
		guardarBtn.setBounds(700,700,100,40);
		contentPane.add(guardarBtn);	
	}
}
