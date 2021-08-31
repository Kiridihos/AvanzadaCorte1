package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import com.toedter.calendar.JDateChooser;

public class CrearPortafolioJF extends JFrame {

	private JPanel contentPane;
	private final ConfirmacionJD ventanaConfirmacion=new ConfirmacionJD(this,true);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrearPortafolioJF frame = new CrearPortafolioJF();
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
	public CrearPortafolioJF() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		setBounds(0,0,1400, 800);
		
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel tituloLbl = new JLabel("Crear Portafolio");
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
		
		JLabel fotoLbl = new JLabel("Foto :");
		fotoLbl.setHorizontalAlignment(SwingConstants.LEFT);
		fotoLbl.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		fotoLbl.setBounds(10, 152, 240, 30);
		contentPane.add(fotoLbl);
		
		JTextField fotoTxt= new JTextField();
		fotoTxt.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		fotoTxt.setColumns(10);
		fotoTxt.setBounds(250, 152, 400, 30);
		contentPane.add(fotoTxt);
		
		DefaultListModel cosas= new DefaultListModel();
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(250, 213, 240, 200);
		contentPane.add(scrollPane);
		JList fotosLst = new JList();
		scrollPane.setViewportView(fotosLst);

		JButton agregarFotoBtn = new JButton("Agregar");
		agregarFotoBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(fotoTxt.getText().isBlank()==false) {
				if(cosas.getSize()==0){
					cosas.addElement(fotoTxt.getText());
					fotosLst.setModel(cosas);
				}else {
					boolean repetido=false;
					for(int i=0;i<cosas.getSize();i++) {
						if(cosas.get(i).toString().equals(fotoTxt.getText())) {
							repetido=true;
						}else {
							repetido=false;
						}
					}
					if(repetido==false) {
						cosas.addElement(fotoTxt.getText());
						fotosLst.setModel(cosas);
					}
				}	
				}
			}
		});
		agregarFotoBtn.setBounds(125, 211, 89, 23);
		contentPane.add(agregarFotoBtn);

		JButton eliminarBtn = new JButton("Eliminar");
		eliminarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cosas.getSize()>0) {
				cosas.remove(fotosLst.getSelectedIndex());
				fotosLst.setModel(cosas);
				}
			}
		});
		eliminarBtn.setBounds(125, 258, 89, 23);
		contentPane.add(eliminarBtn);
		
		JLabel objetivoLbl = new JLabel("Objetivo :");
		objetivoLbl.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		objetivoLbl.setHorizontalAlignment(SwingConstants.LEFT);
		objetivoLbl.setBounds(10, 450, 240, 30);
		contentPane.add(objetivoLbl);
		
		
		JTextField objetivoTxt = new JTextField();
		objetivoTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if((c<'a'|| c>'z')&& c!=' ')e.consume(); 
			}
		});
		objetivoTxt.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		objetivoTxt.setBounds(250,450, 400, 30);
		contentPane.add(objetivoTxt);
		objetivoTxt.setColumns(10);
		
		JButton volverBtn = new JButton("Volver");
		volverBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame ventanaAgregarDatos= new AgregarDatosJF();
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
		
		JLabel fechaCreacionLbl = new JLabel("Fecha de creacion :");
		fechaCreacionLbl.setHorizontalAlignment(SwingConstants.LEFT);
		fechaCreacionLbl.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		fechaCreacionLbl.setBounds(10, 508, 240, 30);
		contentPane.add(fechaCreacionLbl);
		
		JDateChooser fechaCreacion = new JDateChooser();
		fechaCreacion.setBounds(250, 508, 200, 30);
		fechaCreacion.setFont(nombreTxt.getFont());
		contentPane.add(fechaCreacion);
	}
}
