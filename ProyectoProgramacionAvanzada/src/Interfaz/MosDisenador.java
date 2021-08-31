package Interfaz;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class MosDisenador {

	public static void main(String[] args) {
		frame2 f=new frame2();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	
}
class frame2 extends JFrame {
	public frame2() {
		setUndecorated(true);
		setLayout(new BorderLayout());
		setBounds(0,0,500,450);
		panel2 p = new panel2();
		add(p, BorderLayout.CENTER);
		setLocationRelativeTo(null);
	}
}

class panel2 extends JPanel{
	public panel2() {
		try {
			Class.forName("org.postgresql.Driver");
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projectC1","postgres","12345");
			int pasaporte;
			String nombre,pais_origen;
			Statement st = (Statement) connection.createStatement();
			ResultSet rs = st.executeQuery("SELECT pasaporte,nombre,pais_origen from Disenador");
			String[] columnas= {"pasaporte","nombre","pais_origen"};
			JTable tabla = new JTable();
			DefaultTableModel modelo = new DefaultTableModel();
			modelo.setColumnIdentifiers(columnas);
			tabla.setModel(modelo);
			while(rs.next()) {
				pasaporte = rs.getInt("pasaporte");
				nombre = rs.getString("nombre");
				pais_origen = rs.getString("pais_origen");
				
				modelo.addRow(new Object[]{pasaporte, nombre, pais_origen});
			}
			JScrollPane scroll = new JScrollPane(tabla);
			add(scroll);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}