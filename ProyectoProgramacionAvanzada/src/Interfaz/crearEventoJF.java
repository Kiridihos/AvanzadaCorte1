package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JDateChooser;

public class crearEventoJF extends JFrame {

	private JPanel contentPane;
	private JTextField nombreTxt;
	private final JLabel fechaFinalLbl = new JLabel("Fecha final :");

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
		nombreLbl.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		nombreLbl.setHorizontalAlignment(SwingConstants.LEFT);
		nombreLbl.setBounds(10, 100, 300, 40);
		contentPane.add(nombreLbl);
		
		nombreTxt = new JTextField();
		nombreTxt.setFont(new Font("Bookman Old Style", Font.PLAIN, 25));
		nombreTxt.setBounds(320,100, 400, 40);
		contentPane.add(nombreTxt);
		nombreTxt.setColumns(10);
		
		JLabel fechaInicioLbl = new JLabel("Fecha de inicio :");
		fechaInicioLbl.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		fechaInicioLbl.setHorizontalAlignment(SwingConstants.LEFT);
		fechaInicioLbl.setBounds(10, 200, 300, 40);
		contentPane.add(fechaInicioLbl);
		
		JDateChooser fechaInicio = new JDateChooser();
		fechaInicio.setBounds(320, 200, 200, 40);
		fechaInicio.setFont(nombreTxt.getFont());
		contentPane.add(fechaInicio);
		
		fechaFinalLbl.setBounds(10, 300, 300, 40);
		fechaFinalLbl.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		fechaFinalLbl.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(fechaFinalLbl);
		
		JDateChooser fechaFinal = new JDateChooser();
		fechaFinal.setBounds(320, 300, 200, 40);
		fechaFinal.setFont(nombreTxt.getFont());
		contentPane.add(fechaFinal);
		
		JButton guardarBtn = new JButton("Guardar");
		guardarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		guardarBtn.setBounds(10, 378, 109, 40);
		contentPane.add(guardarBtn);
		
	}
}
