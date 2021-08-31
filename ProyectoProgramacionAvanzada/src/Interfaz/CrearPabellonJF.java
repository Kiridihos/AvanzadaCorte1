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

public class CrearPabellonJF extends JFrame {

	private JPanel contentPane;
	private final ConfirmacionJD ventanaConfirmacion=new ConfirmacionJD(this,true);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrearPabellonJF frame = new CrearPabellonJF();
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
	public CrearPabellonJF() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		setBounds(0,0,1400, 800);
		
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel tituloLbl = new JLabel("Crear Pabellon");
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
		contentPane.add(nombreTxt);
		nombreTxt.setColumns(10);
		
		JLabel empleadoEncargadolbl = new JLabel("Empleado encargado :");
		empleadoEncargadolbl.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		empleadoEncargadolbl.setHorizontalAlignment(SwingConstants.LEFT);
		empleadoEncargadolbl.setBounds(10, 150, 240, 30);
		contentPane.add(empleadoEncargadolbl);

		JComboBox listaEmpleadosDesplegable = new JComboBox();
		listaEmpleadosDesplegable.setModel(new DefaultComboBoxModel(new String[] {"EMPLEADOS", "2", "3", "4", "5", "6", "7", "8", "9"}));
		listaEmpleadosDesplegable.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		listaEmpleadosDesplegable.setBounds(250,150,240, 40);
		contentPane.add(listaEmpleadosDesplegable);
		
		JLabel telefonoLbl = new JLabel("Telefono :");
		telefonoLbl.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		telefonoLbl.setHorizontalAlignment(SwingConstants.LEFT);
		telefonoLbl.setBounds(10, 200, 240, 30);
		contentPane.add(telefonoLbl);

		JTextField telefonoTxt = new JTextField();
		telefonoTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(c<'0'|| c>'9')e.consume(); 
			}
		});
		telefonoTxt.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		telefonoTxt.setBounds(250,200, 200, 30);
		telefonoTxt.setColumns(10);
		contentPane.add(telefonoTxt);
		
		JButton volverBtn = new JButton("Volver");
		volverBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame ventanaAgregarDatos= new AgregarDatosJF();
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
