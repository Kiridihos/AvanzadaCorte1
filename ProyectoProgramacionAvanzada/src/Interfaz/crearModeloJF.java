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

public class crearModeloJF extends JFrame {

	private JPanel contentPane;
	private final ConfirmacionJD ventanaConfirmacion=new ConfirmacionJD(this,true);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					crearModeloJF frame = new crearModeloJF();
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
	public crearModeloJF() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		setBounds(0,0,1400, 800);
		
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel tituloLbl = new JLabel("Agregar Modelo");
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
		
		JLabel pasaporteLbl = new JLabel("Pasaporte :");
		pasaporteLbl.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		pasaporteLbl.setHorizontalAlignment(SwingConstants.LEFT);
		pasaporteLbl.setBounds(10, 150, 240, 30);
		contentPane.add(pasaporteLbl);

		JTextField pasaporteTxt = new JTextField();
		pasaporteTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(c<'0'|| c>'9')e.consume(); 
			}
		});
		pasaporteTxt.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		pasaporteTxt.setBounds(250,150, 200, 30);
		pasaporteTxt.setColumns(10);
		contentPane.add(pasaporteTxt);
		
		JLabel paislbl = new JLabel("Pais :");
		paislbl.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		paislbl.setHorizontalAlignment(SwingConstants.LEFT);
		paislbl.setBounds(10, 200, 240, 30);
		contentPane.add(paislbl);

		JComboBox listaPaisesDesplegable = new JComboBox();
		listaPaisesDesplegable.setModel(new DefaultComboBoxModel(new String[] {"PAIS", "2", "3", "4", "5", "6", "7", "8", "9"}));
		listaPaisesDesplegable.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		listaPaisesDesplegable.setBounds(250,200,240, 40);
		contentPane.add(listaPaisesDesplegable);
		
		JLabel fechaNacimientoLbl = new JLabel("Fecha de nacimiento :");
		fechaNacimientoLbl.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		fechaNacimientoLbl.setHorizontalAlignment(SwingConstants.LEFT);
		fechaNacimientoLbl.setBounds(10, 250, 240, 30);
		contentPane.add(fechaNacimientoLbl);

		JDateChooser fechaNacimiento = new JDateChooser();
		fechaNacimiento.setBounds(250, 250, 200, 30);
		fechaNacimiento.setFont(nombreTxt.getFont());
		contentPane.add(fechaNacimiento);
		
		JLabel colorlbl = new JLabel("Color de ojos :");
		colorlbl.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		colorlbl.setHorizontalAlignment(SwingConstants.LEFT);
		colorlbl.setBounds(10, 300, 240, 30);
		contentPane.add(colorlbl);

		JComboBox listaColorDeOjosDesplegable = new JComboBox();
		listaColorDeOjosDesplegable.setModel(new DefaultComboBoxModel(new String[] {"COLOR DE OJOS", "2", "3", "4", "5", "6", "7", "8", "9"}));
		listaColorDeOjosDesplegable.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		listaColorDeOjosDesplegable.setBounds(250,300,240, 40);
		contentPane.add(listaColorDeOjosDesplegable);
		
		JLabel colorPielLbl = new JLabel("Color de piel :");
		colorPielLbl.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		colorPielLbl.setHorizontalAlignment(SwingConstants.LEFT);
		colorPielLbl.setBounds(10, 350, 240, 30);
		contentPane.add(colorPielLbl);

		JComboBox listaColorDePielDesplegable = new JComboBox();
		listaColorDePielDesplegable.setModel(new DefaultComboBoxModel(new String[] {"COLOR DE PIEL", "2", "3", "4", "5", "6", "7", "8", "9"}));
		listaColorDePielDesplegable.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		listaColorDePielDesplegable.setBounds(250,350,240, 40);
		contentPane.add(listaColorDePielDesplegable);
		
		JLabel estaturalbl = new JLabel("Estatura :");
		estaturalbl.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		estaturalbl.setHorizontalAlignment(SwingConstants.LEFT);
		estaturalbl.setBounds(10,400, 240, 30);
		contentPane.add(estaturalbl);
		
		JTextField estaturaTxt = new JTextField();
		estaturaTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if((c<'0'|| c>'9')&&c!='.')e.consume(); 
			}
		});
		estaturaTxt.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		estaturaTxt.setBounds(250 ,400, 200, 30);
		estaturaTxt.setColumns(10);
		contentPane.add(estaturaTxt);
		
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
