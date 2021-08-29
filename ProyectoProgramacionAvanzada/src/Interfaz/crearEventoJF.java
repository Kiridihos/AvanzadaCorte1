package Interfaz;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JDateChooser;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.AbstractListModel;

public class crearEventoJF extends javax.swing.JFrame {

	private JPanel contentPane;
	private final confirmacionJD ventanaConfirmacion=new confirmacionJD(this,true);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					crearEventoJF frame = new crearEventoJF();
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
	public crearEventoJF() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setUndecorated(true);
		setBounds(100, 100, 650, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setPreferredSize(new Dimension(400,400));

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

		JLabel tituloLbl = new JLabel("Crear Evento");
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
		nombreTxt.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		nombreTxt.setBounds(250,100, 400, 30);
		contentPane.add(nombreTxt);
		nombreTxt.setColumns(10);

		JLabel fechaInicioLbl = new JLabel("Fecha de inicio :");
		fechaInicioLbl.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		fechaInicioLbl.setHorizontalAlignment(SwingConstants.LEFT);
		fechaInicioLbl.setBounds(10, 150, 240, 30);
		contentPane.add(fechaInicioLbl);

		JDateChooser fechaInicio = new JDateChooser();
		fechaInicio.setBounds(250, 150, 200, 30);
		fechaInicio.setFont(nombreTxt.getFont());
		contentPane.add(fechaInicio);

		JLabel fechaFinalLbl = new JLabel("Fecha final :");
		fechaFinalLbl.setBounds(10,200,240, 30);
		fechaFinalLbl.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		fechaFinalLbl.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(fechaFinalLbl);

		JDateChooser fechaFinal = new JDateChooser();
		fechaFinal.setBounds(250, 200, 200, 30);
		fechaFinal.setFont(nombreTxt.getFont());
		contentPane.add(fechaFinal);

		JLabel directivoEncargadolbl = new JLabel("Directivo encargado :");
		directivoEncargadolbl.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		directivoEncargadolbl.setHorizontalAlignment(SwingConstants.LEFT);
		directivoEncargadolbl.setBounds(10, 250, 240, 30);
		contentPane.add(directivoEncargadolbl);

		JComboBox listaEmpleadosDirectivosDesplegable = new JComboBox();
		listaEmpleadosDirectivosDesplegable.setModel(new DefaultComboBoxModel(new String[] {"directivos", "2", "3", "4", "5", "6", "7", "8", "9"}));
		listaEmpleadosDirectivosDesplegable.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		listaEmpleadosDirectivosDesplegable.setBounds(250,250,240, 40);
		contentPane.add(listaEmpleadosDirectivosDesplegable);
		
		JLabel directivoSalariolbl = new JLabel("Salario :");
		directivoSalariolbl.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		directivoSalariolbl.setHorizontalAlignment(SwingConstants.LEFT);
		directivoSalariolbl.setBounds(500, 250, 240, 30);
		contentPane.add(directivoSalariolbl);
		
		JLabel empleadosAsignadoslbl = new JLabel("Empleados rasos :");
		empleadosAsignadoslbl.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		empleadosAsignadoslbl.setHorizontalAlignment(SwingConstants.LEFT);
		empleadosAsignadoslbl.setBounds(10, 300, 240, 30);
		contentPane.add(empleadosAsignadoslbl);

		JComboBox listaEmpleadosDesplegable = new JComboBox();
		listaEmpleadosDesplegable.setModel(new DefaultComboBoxModel(new String[] {"RASOS", "2", "3", "4", "5", "6", "7", "8", "9"}));
		listaEmpleadosDesplegable.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		listaEmpleadosDesplegable.setBounds(250,300,240, 40);
		contentPane.add(listaEmpleadosDesplegable);

		DefaultListModel cosas= new DefaultListModel();
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(250, 351, 240, 200);
		contentPane.add(scrollPane);

		JList rasosAsignadosLst = new JList();
		scrollPane.setViewportView(rasosAsignadosLst);

		JButton agregarEmpleadoBtn = new JButton("Agregar");
		agregarEmpleadoBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cosas.getSize()==0){
					cosas.addElement(listaEmpleadosDesplegable.getSelectedItem());
					rasosAsignadosLst.setModel(cosas);
				}else {
					boolean repetido=false;
					for(int i=0;i<cosas.getSize();i++) {
						if(cosas.get(i)==listaEmpleadosDesplegable.getSelectedItem()) {
							repetido=true;
						}
					}
					if(repetido==false) {
						cosas.addElement(listaEmpleadosDesplegable.getSelectedItem());
						rasosAsignadosLst.setModel(cosas);
					}
				}	

			}
		});
		agregarEmpleadoBtn.setBounds(105, 348, 89, 23);
		contentPane.add(agregarEmpleadoBtn);

		JButton eliminarBtn = new JButton("Eliminar");
		eliminarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cosas.getSize()>0) {
				cosas.remove(rasosAsignadosLst.getSelectedIndex());
				rasosAsignadosLst.setModel(cosas);
				}
			}
		});
		eliminarBtn.setBounds(105, 390, 89, 23);
		contentPane.add(eliminarBtn);

		JButton guardarBtn = new JButton("Guardar");
		guardarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaConfirmacion.setVisible(true);
				if(ventanaConfirmacion.isConfirmacion()) {
					String id="0";
					String[] datos= {id,nombreTxt.getText(),fechaInicio.getDate().toString(),fechaFinal.getDate().toString()};
				}
			}
		});
		guardarBtn.setBounds(700,700,100,40);
		contentPane.add(guardarBtn);
	}
}
