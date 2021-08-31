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
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JDateChooser;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.AbstractListModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTable;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class MostrarAgencia extends javax.swing.JFrame {

	private JPanel contentPane;
	private final ConfirmacionJD ventanaConfirmacion=new ConfirmacionJD(this,true);
	private JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MostrarAgencia frame = new MostrarAgencia();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		String [] cabezera = {"codigo","nombre","fecha_inicio","fecha_fin","directivo_asignado","salario_directivo","empleado_raso_asignado","salario_empleado_raso"};
		String[][] datos = {
				
				{"1","primavera","2021/08/06","2021/08/26","1000002","2000000","1000001","1500000"},
		};
		
		DefaultTableModel mod = new DefaultTableModel(datos,cabezera);
		JTable tabla = new JTable(mod);
		
		JScrollPane scroll = new JScrollPane(tabla);
		scroll.setBounds(50,40,400,200);
		
		JFrame ventana = new JFrame();
		ventana.getContentPane().setLayout(null);
		ventana.setSize(500,500);
		ventana.setLocationRelativeTo(null);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ventana.getContentPane().add(scroll);
		
		ventana.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public MostrarAgencia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setUndecorated(true);
		setBounds(0,0,1400, 800);
		
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);

		JLabel tituloLbl = new JLabel("Lista Agencias");
		tituloLbl.setHorizontalAlignment(SwingConstants.CENTER);
		tituloLbl.setFont(new Font("Bookman Old Style", Font.BOLD, 40));
		tituloLbl.setBounds(10, 11,1400, 50);
		contentPane.add(tituloLbl);

		DefaultListModel cosas= new DefaultListModel();
		
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
		
		
	}
}
