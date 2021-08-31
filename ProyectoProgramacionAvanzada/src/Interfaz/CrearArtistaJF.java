package Interfaz;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.ScrollPaneConstants;
import com.toedter.calendar.JDateChooser;

public class CrearArtistaJF extends JFrame {

	private JScrollPane scrollPane ;
	private final ConfirmacionJD ventanaConfirmacion=new ConfirmacionJD(this,true);
	private ButtonGroup tipoArtista=new ButtonGroup();
	private ButtonGroup tipoArtistaContratoAux=new ButtonGroup();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrearArtistaJF frame = new CrearArtistaJF();
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
	public CrearArtistaJF() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		setBounds(0,0,1400,1200);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		setContentPane(scrollPane);
		
		JPanel contentPane = new JPanel();
		contentPane.setBounds(500,500, 1400, 700);
		contentPane.setPreferredSize(new Dimension(1500,800));
		scrollPane.setViewportView(contentPane);
		contentPane.setLayout(null);
		
		JLabel tituloLbl = new JLabel("Crear Artista");
		tituloLbl.setHorizontalAlignment(SwingConstants.CENTER);
		tituloLbl.setFont(new Font("Bookman Old Style", Font.BOLD, 40));
		tituloLbl.setBounds(10, 11,1400, 50);
		contentPane.add(tituloLbl);
		
		JLabel nombreLbl = new JLabel("Nombre Aristico:");
		nombreLbl.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		nombreLbl.setHorizontalAlignment(SwingConstants.LEFT);
		nombreLbl.setBounds(10, 250, 300, 30);
		contentPane.add(nombreLbl);
		
		JComboBox bandasDesplegable1 = new JComboBox();
		bandasDesplegable1.setModel(new DefaultComboBoxModel(new String[] {"Bandas", "2", "3", "4", "5", "6", "7", "8", "9"}));
		bandasDesplegable1.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		bandasDesplegable1.setBounds(250,250, 250, 30);
		bandasDesplegable1.setVisible(false);
		contentPane.add(bandasDesplegable1);
		
		JTextField nombreTxt = new JTextField();
		nombreTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if((c<'a'|| c>'z')&& c!=' ')e.consume(); 
			}
		});
		nombreTxt.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		nombreTxt.setBounds(250,250, 250, 30);
		nombreTxt.setColumns(10);
		contentPane.add(nombreTxt);
		
		//--Solo cuando focus banda activado ver
		JLabel nombreBandaLbl = new JLabel("Nombre Banda:");
		nombreBandaLbl.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		nombreBandaLbl.setHorizontalAlignment(SwingConstants.LEFT);
		nombreBandaLbl.setBounds(10, 250, 200, 30);
		nombreBandaLbl.setVisible(false); 
		contentPane.add(nombreBandaLbl);

		JTextField nombreBandaTxt = new JTextField();
		nombreBandaTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if((c<'a'|| c>'z')&& c!=' ')e.consume(); 
			}
		});
		nombreBandaTxt.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		nombreBandaTxt.setBounds(250,250, 300, 30);
		nombreBandaTxt.setColumns(10);
		nombreBandaTxt.setVisible(false);
		contentPane.add(nombreBandaTxt);
		
		JLabel fechaCreacionlLbl = new JLabel("Fecha de creacion :");
		fechaCreacionlLbl.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		fechaCreacionlLbl.setHorizontalAlignment(SwingConstants.LEFT);
		fechaCreacionlLbl.setBounds(550, 200, 210, 30);
		fechaCreacionlLbl.setVisible(false);
		contentPane.add(fechaCreacionlLbl);
		
		JDateChooser fechaCreacion = new JDateChooser();
		fechaCreacion.setBounds(760, 200, 200, 30);
		fechaCreacion.setFont(nombreTxt.getFont());
		fechaCreacion.setVisible(false);
		contentPane.add(fechaCreacion);
		//----
		
		JLabel generoMusicalLbl = new JLabel("Genero Musical");
		generoMusicalLbl.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		generoMusicalLbl.setHorizontalAlignment(SwingConstants.LEFT);
		generoMusicalLbl.setBounds(10, 200, 240, 30);
		contentPane.add(generoMusicalLbl);
		
		JComboBox generoMusicalesDesplegable = new JComboBox();
		generoMusicalesDesplegable.setModel(new DefaultComboBoxModel(new String[] {"GENERO", "2", "3", "4", "5", "6", "7", "8", "9"}));
		generoMusicalesDesplegable.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		generoMusicalesDesplegable.setBounds(250,200,240, 30);
		contentPane.add(generoMusicalesDesplegable);
		
		JLabel tipoArtistaContratoAuxLbl = new JLabel("Tipo de artista :");
		tipoArtistaContratoAuxLbl.setHorizontalAlignment(SwingConstants.LEFT);
		tipoArtistaContratoAuxLbl.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		tipoArtistaContratoAuxLbl.setBounds(10, 100, 240, 30);
		contentPane.add(tipoArtistaContratoAuxLbl);
		
		JLabel tipoArtistaLbl = new JLabel("Tipo de artista :");
		tipoArtistaLbl.setHorizontalAlignment(SwingConstants.LEFT);
		tipoArtistaLbl.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		tipoArtistaLbl.setBounds(10, 150, 240, 30);
		contentPane.add(tipoArtistaLbl);
		
		JRadioButton solistaRbtn= new JRadioButton("Solista");
		solistaRbtn.setSelected(true);
		solistaRbtn.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				nombreLbl.setLocation(10,250 );
				nombreTxt.setLocation(250, 250);
				nombreBandaLbl.setVisible(false); 
				nombreBandaTxt.setVisible(false);
				fechaCreacionlLbl.setVisible(false);
				fechaCreacion.setVisible(false);
				nombreLbl.setText("Nombre artistico :");
			}
		});
		solistaRbtn.setHorizontalAlignment(SwingConstants.LEFT);
		solistaRbtn.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		solistaRbtn.setBounds(250, 150, 120, 30);
		contentPane.add(solistaRbtn);
		
		JRadioButton GrupalRbtn = new JRadioButton("Grupal");
		GrupalRbtn.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				nombreLbl.setText("Nombre artista principal :");
				nombreLbl.setLocation(10,300 );
				nombreTxt.setLocation(300, 300);
				nombreBandaLbl.setVisible(true); 
				nombreBandaTxt.setVisible(true); 
				fechaCreacionlLbl.setVisible(true);
				fechaCreacion.setVisible(true);
			}
		});
		GrupalRbtn.setHorizontalAlignment(SwingConstants.LEFT);
		GrupalRbtn.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		GrupalRbtn.setBounds(370, 150, 120, 30);
		contentPane.add(GrupalRbtn);
		tipoArtista.add(GrupalRbtn);
		tipoArtista.add(solistaRbtn);

		JRadioButton contratoRbtn= new JRadioButton("Contrato");
		contratoRbtn.setSelected(true);
		contratoRbtn.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				
				nombreBandaTxt.setVisible(true);
				bandasDesplegable1.setVisible(false);
				nombreBandaLbl.setText("Nombre Banda :");
				nombreLbl.setText("Nombre artista :");
				solistaRbtn.setVisible(true);
				generoMusicalLbl.setVisible(true);
				generoMusicalesDesplegable.setVisible(true);
			}
		});
		contratoRbtn.setHorizontalAlignment(SwingConstants.LEFT);
		contratoRbtn.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		contratoRbtn.setBounds(250, 100, 120, 30);
		contentPane.add(contratoRbtn);
		
		JRadioButton auxiliarRbtn = new JRadioButton("Auxiliar");
		auxiliarRbtn.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				
				nombreBandaTxt.setVisible(false);
				bandasDesplegable1.setVisible(true);
				nombreBandaLbl.setText("Banda :");
				nombreBandaLbl.setVisible(true);
				nombreLbl.setText("Nombre artista :");
				fechaCreacionlLbl.setVisible(false);
				fechaCreacion.setVisible(false);
				GrupalRbtn.setSelected(true);
				solistaRbtn.setVisible(false);
				generoMusicalLbl.setVisible(false);
				generoMusicalesDesplegable.setVisible(false);
				nombreLbl.setLocation(10,300 );
				nombreTxt.setLocation(300, 300);
				
			}
		});
		auxiliarRbtn.setHorizontalAlignment(SwingConstants.LEFT);
		auxiliarRbtn.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		auxiliarRbtn.setBounds(370, 100, 120, 30);
		contentPane.add(auxiliarRbtn);
		
		tipoArtistaContratoAux.add(contratoRbtn);
		tipoArtistaContratoAux.add(auxiliarRbtn);
		
		JLabel tituloSecundarioLbl = new JLabel("Agregar Artista a una Banda");
		tituloSecundarioLbl.setHorizontalAlignment(SwingConstants.CENTER);
		tituloSecundarioLbl.setFont(new Font("Bookman Old Style", Font.BOLD, 40));
		tituloSecundarioLbl.setBounds(10,500,1400, 50);
		contentPane.add(tituloSecundarioLbl);
		
		JLabel artistaLbl = new JLabel("Artista :");
		artistaLbl.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		artistaLbl.setHorizontalAlignment(SwingConstants.LEFT);
		artistaLbl.setBounds(10, 600, 240, 30);
		contentPane.add(artistaLbl);
		
		JComboBox artistasDesplegable = new JComboBox();
		artistasDesplegable.setModel(new DefaultComboBoxModel(new String[] {"Solistas sin banda", "2", "3", "4", "5", "6", "7", "8", "9"}));
		artistasDesplegable.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		artistasDesplegable.setBounds(250,600,240, 30);
		contentPane.add(artistasDesplegable);
		
		JLabel bandaLbl = new JLabel("Banda :");
		bandaLbl.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		bandaLbl.setHorizontalAlignment(SwingConstants.LEFT);
		bandaLbl.setBounds(10, 650, 240, 30);
		contentPane.add(bandaLbl);
		
		JComboBox bandasDesplegable = new JComboBox();
		bandasDesplegable.setModel(new DefaultComboBoxModel(new String[] {"Bandas", "2", "3", "4", "5", "6", "7", "8", "9"}));
		bandasDesplegable.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		bandasDesplegable.setBounds(250,650,240, 30);
		contentPane.add(bandasDesplegable);
		
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
		
		JButton CrearBtn = new JButton("Crear");
		CrearBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaConfirmacion.setVisible(true);
				if(ventanaConfirmacion.isConfirmacion()) {

				}
			}
		});
		CrearBtn.setBounds(250,350,100,40);
		contentPane.add(CrearBtn);
		
		JButton anhadirrBtn = new JButton("A\u00F1adir");
		anhadirrBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaConfirmacion.setVisible(true);
				if(ventanaConfirmacion.isConfirmacion()) {

				}
			}
		});
		anhadirrBtn.setBounds(250,749,100,40);
		contentPane.add(anhadirrBtn);
		
	}
}
