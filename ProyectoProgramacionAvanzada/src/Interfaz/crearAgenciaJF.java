package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JYearChooser;

public class crearAgenciaJF extends JFrame {

	private JPanel contentPane;
	private final ConfirmacionJD ventanaConfirmacion=new ConfirmacionJD(this,true);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					crearAgenciaJF frame = new crearAgenciaJF();
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
	public crearAgenciaJF() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		setBounds(0,0,1400, 800);
		
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel tituloLbl = new JLabel("Crear Agencia");
		tituloLbl.setHorizontalAlignment(SwingConstants.CENTER);
		tituloLbl.setFont(new Font("Bookman Old Style", Font.BOLD, 40));
		tituloLbl.setBounds(10, 11,1400, 50);
		contentPane.add(tituloLbl);
		
		JLabel nombreLbl = new JLabel("Nombre de la agencia:");
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
		contentPane.add(nombreTxt);
		nombreTxt.setColumns(10);
		
		JLabel paislbl = new JLabel("Pais :");
		paislbl.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		paislbl.setHorizontalAlignment(SwingConstants.LEFT);
		paislbl.setBounds(10, 150, 240, 30);
		contentPane.add(paislbl);

		JComboBox listaPaisesDesplegable = new JComboBox();
		listaPaisesDesplegable.setModel(new DefaultComboBoxModel(new String[] {"PAIS", "2", "3", "4", "5", "6", "7", "8", "9"}));
		listaPaisesDesplegable.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		listaPaisesDesplegable.setBounds(250,150,240, 40);
		contentPane.add(listaPaisesDesplegable);
		
		JLabel fechaCreacionLbl = new JLabel("Año de creacion :");
		fechaCreacionLbl.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		fechaCreacionLbl.setHorizontalAlignment(SwingConstants.LEFT);
		fechaCreacionLbl.setBounds(10, 200, 240, 30);
		contentPane.add(fechaCreacionLbl);
		
		JYearChooser anhoCreacion = new JYearChooser();
		anhoCreacion.setBounds(250, 200,70, 30);
		anhoCreacion.setFont(nombreTxt.getFont());
		contentPane.add(anhoCreacion);
		
		JLabel correoLbl = new JLabel("Correo electronico :");
		correoLbl.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		correoLbl.setHorizontalAlignment(SwingConstants.LEFT);
		correoLbl.setBounds(10, 250, 240, 30);
		contentPane.add(correoLbl);

		JTextField correoTxt = new JTextField();
		correoTxt.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		correoTxt.setBounds(250,250, 400, 30);
		correoTxt.setColumns(10);
		contentPane.add(correoTxt);
		
		JLabel nombreduenhoLbl = new JLabel("Nombre del dueño :");
		nombreduenhoLbl.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		nombreduenhoLbl.setHorizontalAlignment(SwingConstants.LEFT);
		nombreduenhoLbl.setBounds(10, 300, 240, 30);
		contentPane.add(nombreduenhoLbl);

		JTextField nombreduenhoTxt = new JTextField();
		nombreduenhoTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if((c<'a'|| c>'z')&& c!=' ')e.consume(); 
			}
		});
		nombreduenhoTxt.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		nombreduenhoTxt.setBounds(250,300, 400, 30);
		nombreduenhoTxt.setColumns(10);
		contentPane.add(nombreduenhoTxt);
		
		JButton volverBtn = new JButton("Volver");
		volverBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame ventanaAgregarDatos= new agregarDatosJF();
				ventanaAgregarDatos.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		volverBtn.setBounds(1270,20,70,40);
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
