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

public class crearPabellonJF extends JFrame {

	private JPanel contentPane;
	private final ConfirmacionJD ventanaConfirmacion=new ConfirmacionJD(this,true);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					crearPabellonJF frame = new crearPabellonJF();
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
	public crearPabellonJF() {
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
