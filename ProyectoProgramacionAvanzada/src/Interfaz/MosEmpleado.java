package Interfaz;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class MosEmpleado {

	public static void main(String[] args) {
		frame1 f=new frame1();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	
}
class frame1 extends JFrame {
	public frame1() {
		setUndecorated(true);
		setLayout(new BorderLayout());
		setBounds(0,0,500,450);
		panel1 p = new panel1();
		add(p, BorderLayout.CENTER);
		setLocationRelativeTo(null);
	}
}

class panel1 extends JPanel{
	public panel1() {
		try {
			Class.forName("org.postgresql.Driver");
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projectC1","postgres","12345");
			long celular;
			int carnet;
			String tipoEmpleado, nombre, universidadEgreso;
			boolean esProfesional;
			Statement st = (Statement) connection.createStatement();
			ResultSet rs = st.executeQuery("SELECT carnet, tipo_empleado, nombre, es_profesional, universidad_egresada, celular from empleado");
			String[] columnas= {"Carnet","TipoEmpleado","nombre","Profesional","UniversidadDeEgreso","Celular"};
			JTable tabla = new JTable();
			DefaultTableModel modelo = new DefaultTableModel();
			modelo.setColumnIdentifiers(columnas);
			tabla.setModel(modelo);
			while(rs.next()) {
				carnet = rs.getInt("carnet");
				tipoEmpleado = rs.getString("tipo_empleado");
				nombre = rs.getString("nombre");
				esProfesional = rs.getBoolean("es_profesional");
				universidadEgreso = rs.getString("universidad_egresada");
				celular = rs.getLong("celular");
				modelo.addRow(new Object[]{carnet, tipoEmpleado, nombre, esProfesional, universidadEgreso, celular});
			}
			JScrollPane scroll = new JScrollPane(tabla);
			add(scroll);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}