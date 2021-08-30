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

public class crearDesfileJF extends JFrame {

	private JPanel contentPane;
	private final ConfirmacionJD ventanaConfirmacion=new ConfirmacionJD(this,true);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					crearDesfileJF frame = new crearDesfileJF();
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
	public crearDesfileJF() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		setBounds(0,0,1400, 800);
		
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel tituloLbl = new JLabel("Crear Desfile");
		tituloLbl.setHorizontalAlignment(SwingConstants.CENTER);
		tituloLbl.setFont(new Font("Bookman Old Style", Font.BOLD, 40));
		tituloLbl.setBounds(10, 11,1400, 50);
		contentPane.add(tituloLbl);
		
		JLabel nombreLbl = new JLabel("Nombre de Coleccion :");
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
		
		JLabel fechaLbl = new JLabel("Fecha de inicio :");
		fechaLbl.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		fechaLbl.setHorizontalAlignment(SwingConstants.LEFT);
		fechaLbl.setBounds(10, 150, 240, 30);
		contentPane.add(fechaLbl);
		
		JDateChooser fecha = new JDateChooser();
		fecha.setBounds(250, 150, 200, 30);
		fecha.setFont(nombreTxt.getFont());
		contentPane.add(fecha);
		
		JLabel horalLbl = new JLabel("Hora :");
		horalLbl.setBounds(10,200,240, 30);
		horalLbl.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		horalLbl.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(horalLbl);
		
		JTextField HoraTxt = new JTextField();
		HoraTxt.setHorizontalAlignment(SwingConstants.RIGHT);
		HoraTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(HoraTxt.getText().length()==2) {
					e.consume();
				}else {
				char c = e.getKeyChar();
				if(c<'0'|| c>'9')e.consume(); 
				}
			}
		});
		HoraTxt.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		HoraTxt.setBounds(250,200, 50, 30);
		HoraTxt.setColumns(2);
		contentPane.add(HoraTxt);
		
		JLabel dosPuntosLbl = new JLabel(":");
		dosPuntosLbl.setHorizontalAlignment(SwingConstants.CENTER);
		dosPuntosLbl.setFont(new Font("Bookman Old Style", Font.BOLD, 25));
		dosPuntosLbl.setBounds(300, 200, 20,30);
		contentPane.add(dosPuntosLbl);
		
		JTextField minutosTxt = new JTextField();
		minutosTxt.setHorizontalAlignment(SwingConstants.RIGHT);
		minutosTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(minutosTxt.getText().length()==2) {
					e.consume();
				}else {
				char c = e.getKeyChar();
				if(c<'0'|| c>'9')e.consume(); 
				}
			}
		});
		minutosTxt.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		minutosTxt.setBounds(325,200, 50, 30);
		minutosTxt.setColumns(2);
		contentPane.add(minutosTxt);
		
		JLabel eventoLbl = new JLabel("Evento asignado :");
		eventoLbl.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		eventoLbl.setHorizontalAlignment(SwingConstants.LEFT);
		eventoLbl.setBounds(10, 250, 240, 30);
		contentPane.add(eventoLbl);

		JComboBox listaEventosDesplegable = new JComboBox();
		listaEventosDesplegable.setModel(new DefaultComboBoxModel(new String[] {"EVENTO", "2", "3", "4", "5", "6", "7", "8", "9"}));
		listaEventosDesplegable.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		listaEventosDesplegable.setBounds(250,250,240, 40);
		contentPane.add(listaEventosDesplegable);
		
		JLabel diseñadorbl = new JLabel("Diseñador encargado :");
		diseñadorbl.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		diseñadorbl.setHorizontalAlignment(SwingConstants.LEFT);
		diseñadorbl.setBounds(10, 300, 240, 30);
		contentPane.add(diseñadorbl);

		JComboBox listaEmpleadosDiseñadoresDesplegable = new JComboBox();
		listaEmpleadosDiseñadoresDesplegable.setModel(new DefaultComboBoxModel(new String[] {"DISEÑADOR", "2", "3", "4", "5", "6", "7", "8", "9"}));
		listaEmpleadosDiseñadoresDesplegable.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		listaEmpleadosDiseñadoresDesplegable.setBounds(250,300,240, 40);
		contentPane.add(listaEmpleadosDiseñadoresDesplegable);
		
		JLabel pabellonlbl = new JLabel("Pabellon :");
		pabellonlbl.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		pabellonlbl.setHorizontalAlignment(SwingConstants.LEFT);
		pabellonlbl.setBounds(10, 350, 240, 30);
		contentPane.add(pabellonlbl);

		JComboBox listaPabellonesDesplegable = new JComboBox();
		listaPabellonesDesplegable.setModel(new DefaultComboBoxModel(new String[] {"PABELLON", "2", "3", "4", "5", "6", "7", "8", "9"}));
		listaPabellonesDesplegable.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		listaPabellonesDesplegable.setBounds(250,350,240, 40);
		contentPane.add(listaPabellonesDesplegable);
		
		JLabel modeloslbl = new JLabel("Modelos :");
		modeloslbl.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		modeloslbl.setHorizontalAlignment(SwingConstants.LEFT);
		modeloslbl.setBounds(10, 400, 240, 30);
		contentPane.add(modeloslbl);

		JComboBox listaModelosDesplegable = new JComboBox();
		listaModelosDesplegable.setModel(new DefaultComboBoxModel(new String[] {"MODELOS", "2", "3", "4", "5", "6", "7", "8", "9"}));
		listaModelosDesplegable.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		listaModelosDesplegable.setBounds(250,400,240, 40);
		contentPane.add(listaModelosDesplegable);
		
		JLabel modeloSalariolbl = new JLabel("Salario :");
		modeloSalariolbl.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		modeloSalariolbl.setHorizontalAlignment(SwingConstants.LEFT);
		modeloSalariolbl.setBounds(500, 400, 90, 30);
		contentPane.add(modeloSalariolbl);
		
		JTextField salarioModeloTxt = new JTextField();
		salarioModeloTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if((c<'0'|| c>'9')&&c!='.')e.consume(); 
			}
		});
		salarioModeloTxt.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		salarioModeloTxt.setBounds(600 ,400, 200, 30);
		salarioModeloTxt.setColumns(10);
		contentPane.add(salarioModeloTxt);

		DefaultListModel cosas= new DefaultListModel();
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(250, 450, 240, 200);
		contentPane.add(scrollPane);
		JList modelosAsignadosLst = new JList();
		scrollPane.setViewportView(modelosAsignadosLst);

		JButton agregarEmpleadoBtn = new JButton("Agregar");
		agregarEmpleadoBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cosas.getSize()==0){
					cosas.addElement(listaModelosDesplegable.getSelectedItem()+"-"+salarioModeloTxt.getText());
					modelosAsignadosLst.setModel(cosas);
				}else {
					boolean repetido=false;
					for(int i=0;i<cosas.getSize();i++) {
						String enlistado=cosas.get(i).toString();
						String dividido[]=enlistado.split("-");
						if(dividido[0].equals(listaModelosDesplegable.getSelectedItem())) {
							repetido=true;
						}else {
							repetido=false;
						}
					}
					if(repetido==false) {
						cosas.addElement(listaModelosDesplegable.getSelectedItem()+"-"+salarioModeloTxt.getText());
						modelosAsignadosLst.setModel(cosas);
					}
				}	

			}
		});
		agregarEmpleadoBtn.setBounds(10, 450, 90,30);
		contentPane.add(agregarEmpleadoBtn);

		JButton eliminarBtn = new JButton("Eliminar");
		eliminarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cosas.getSize()>0) {
				cosas.remove(modelosAsignadosLst.getSelectedIndex());
				modelosAsignadosLst.setModel(cosas);
				}
			}
		});
		eliminarBtn.setBounds(110, 450, 90, 30);
		contentPane.add(eliminarBtn);
		
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
