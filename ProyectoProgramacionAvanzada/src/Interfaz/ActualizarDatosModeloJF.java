package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

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

public class ActualizarDatosModeloJF extends JFrame {

	private JPanel contentPane;
	private final ConfirmacionJD ventanaConfirmacion=new ConfirmacionJD(this,true);
	private JTextField fechaActualizacionTxt;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ActualizarDatosModeloJF frame = new ActualizarDatosModeloJF();
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
	public ActualizarDatosModeloJF() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		setBounds(0,0,1400, 800);
		
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel tituloLbl = new JLabel("Actualizar Datos de Modelos");
		tituloLbl.setHorizontalAlignment(SwingConstants.CENTER);
		tituloLbl.setFont(new Font("Bookman Old Style", Font.BOLD, 40));
		tituloLbl.setBounds(10, 11,1400, 50);
		contentPane.add(tituloLbl);
		
		JLabel modeloLbl = new JLabel("Modelo :");
		modeloLbl.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		modeloLbl.setHorizontalAlignment(SwingConstants.LEFT);
		modeloLbl.setBounds(10, 100, 240, 30);
		contentPane.add(modeloLbl);
		
		JComboBox listaModeloDesplegable = new JComboBox();
		listaModeloDesplegable.setModel(new DefaultComboBoxModel(new String[] {"MODELOS", "2", "3", "4", "5", "6", "7", "8", "9"}));
		listaModeloDesplegable.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		listaModeloDesplegable.setBounds(100,95,240,30);
		contentPane.add(listaModeloDesplegable);
		
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
		
		JLabel cinturalbl = new JLabel("Cintura :");
		cinturalbl.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		cinturalbl.setHorizontalAlignment(SwingConstants.LEFT);
		cinturalbl.setBounds(10,450, 240, 30);
		contentPane.add(cinturalbl);
		
		JTextField cinturaTxt = new JTextField();
		cinturaTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if((c<'0'|| c>'9')&&c!='.')e.consume(); 
			}
		});
		cinturaTxt.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		cinturaTxt.setBounds(250 ,450, 200, 30);
		cinturaTxt.setColumns(10);
		contentPane.add(cinturaTxt);
		
		JLabel bustolbl = new JLabel("Busto :");
		bustolbl.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		bustolbl.setHorizontalAlignment(SwingConstants.LEFT);
		bustolbl.setBounds(10,500, 240, 30);
		contentPane.add(bustolbl);
		
		JTextField bustoTxt = new JTextField();
		bustoTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if((c<'0'|| c>'9')&&c!='.')e.consume(); 
			}
		});
		bustoTxt.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		bustoTxt.setBounds(250 ,500, 200, 30);
		bustoTxt.setColumns(10);
		contentPane.add(bustoTxt);
		
		JLabel tallaZapatoslbl = new JLabel("Talla de zapatos :");
		tallaZapatoslbl.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		tallaZapatoslbl.setHorizontalAlignment(SwingConstants.LEFT);
		tallaZapatoslbl.setBounds(10,550, 240, 30);
		contentPane.add(tallaZapatoslbl);
		
		JTextField tallaZapatosTxt = new JTextField();
		tallaZapatosTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(tallaZapatosTxt.getText().length()==2) {
					e.consume();
				}else {
				char c = e.getKeyChar();
				if(c<'0'|| c>'9')e.consume(); 
				}
			}
		});
		tallaZapatosTxt.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		tallaZapatosTxt.setBounds(250 ,550, 40, 30);
		tallaZapatosTxt.setColumns(10);
		contentPane.add(tallaZapatosTxt);
		
		JLabel pesolbl = new JLabel("Peso :");
		pesolbl.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		pesolbl.setHorizontalAlignment(SwingConstants.LEFT);
		pesolbl.setBounds(10,600, 240, 30);
		contentPane.add(pesolbl);
		
		JTextField pesoTxt = new JTextField();
		pesoTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(pesoTxt.getText().length()==2) {
					e.consume();
				}else {
				char c = e.getKeyChar();
				if(c<'0'|| c>'9')e.consume(); 
				}
			}
		});
		pesoTxt.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		pesoTxt.setBounds(250 ,600, 40, 30);
		pesoTxt.setColumns(10);
		contentPane.add(pesoTxt);
		
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
		
		JLabel fechaActualizacionLbl = new JLabel("Fecha de actualizacion :");
		fechaActualizacionLbl.setHorizontalAlignment(SwingConstants.LEFT);
		fechaActualizacionLbl.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		fechaActualizacionLbl.setBounds(10, 229, 280, 30);
		contentPane.add(fechaActualizacionLbl);
		
		fechaActualizacionTxt = new JTextField();
		fechaActualizacionTxt.setText(new SimpleDateFormat("dd/MM/YYYY").format(new Date()));
		fechaActualizacionTxt.setEditable(false);
		fechaActualizacionTxt.setHorizontalAlignment(SwingConstants.LEFT);
		fechaActualizacionTxt.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		fechaActualizacionTxt.setBounds(282, 229, 208, 28);
		contentPane.add(fechaActualizacionTxt);
		fechaActualizacionTxt.setColumns(10);
		
		JButton actualizarBtn = new JButton("Actualizar");
		actualizarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fechaActualizacionTxt.setText(new SimpleDateFormat("dd/MM/YYYY").format(new Date()));
			}
		});
		actualizarBtn.setBounds(511, 229, 125, 30);
		contentPane.add(actualizarBtn);
		
	}
}
