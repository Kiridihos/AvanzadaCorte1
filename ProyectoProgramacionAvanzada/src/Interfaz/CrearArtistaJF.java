package Interfaz;

import java.awt.BorderLayout;
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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class CrearArtistaJF extends JFrame {

	private JPanel contentPane;
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
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,1400, 800);
		
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel tituloLbl = new JLabel("Agregar Artista");
		tituloLbl.setHorizontalAlignment(SwingConstants.CENTER);
		tituloLbl.setFont(new Font("Bookman Old Style", Font.BOLD, 40));
		tituloLbl.setBounds(10, 11,1400, 50);
		contentPane.add(tituloLbl);
		
		JLabel nombreLbl = new JLabel("Nombre Aristico:");
		nombreLbl.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		nombreLbl.setHorizontalAlignment(SwingConstants.LEFT);
		nombreLbl.setBounds(10, 250, 240, 30);
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
		nombreTxt.setBounds(250,250, 400, 30);
		nombreTxt.setColumns(10);
		contentPane.add(nombreTxt);
		
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
		
		JRadioButton contratoRbtn= new JRadioButton("Contrato");
		contratoRbtn.setSelected(true);
		contratoRbtn.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
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
				generoMusicalLbl.setVisible(false);
				generoMusicalesDesplegable.setVisible(false);
			}
		});
		auxiliarRbtn.setHorizontalAlignment(SwingConstants.LEFT);
		auxiliarRbtn.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		auxiliarRbtn.setBounds(370, 100, 120, 30);
		contentPane.add(auxiliarRbtn);
		
		tipoArtistaContratoAux.add(contratoRbtn);
		tipoArtistaContratoAux.add(auxiliarRbtn);
		
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
				nombreLbl.setLocation(10,300 );
			}
		});
		GrupalRbtn.setHorizontalAlignment(SwingConstants.LEFT);
		GrupalRbtn.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		GrupalRbtn.setBounds(370, 150, 120, 30);
		contentPane.add(GrupalRbtn);
		tipoArtista.add(GrupalRbtn);
		tipoArtista.add(solistaRbtn);
		
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
		
	}
}
