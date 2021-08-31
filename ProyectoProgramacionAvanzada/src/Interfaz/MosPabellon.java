package Interfaz;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class MosPabellon {

	public static void main(String[] args) {
		frame8 f=new frame8();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	
}
class frame8 extends JFrame {
	public frame8() {
		setUndecorated(true);
		setLayout(new BorderLayout());
		setBounds(0,0,500,450);
		panel8 p = new panel8();
		add(p, BorderLayout.CENTER);
		setLocationRelativeTo(null);
	}
}

class panel8 extends JPanel{
	public panel8() {
		try {
			Class.forName("org.postgresql.Driver");
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projectC1","postgres","12345");
			int empleado_responsable,telefono;
			String nombre;
			Statement st = (Statement) connection.createStatement();
			ResultSet rs = st.executeQuery("SELECT nombre,empleado_responsable,telefono from Pabellon");
			String[] columnas= {"nombre","empleado_responsable","telefono"};
			JTable tabla = new JTable();
			DefaultTableModel modelo = new DefaultTableModel();
			modelo.setColumnIdentifiers(columnas);
			tabla.setModel(modelo);
			while(rs.next()) {
				empleado_responsable = rs.getInt("codigo");
				telefono = rs.getInt("ano_creacion");
				
				nombre = rs.getString("nombre");
			
				modelo.addRow(new Object[]{nombre,empleado_responsable,telefono});
			}
			JScrollPane scroll = new JScrollPane(tabla);
			add(scroll);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}