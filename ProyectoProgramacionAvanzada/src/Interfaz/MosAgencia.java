package Interfaz;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class MosAgencia {

	public static void main(String[] args) {
		frame6 f=new frame6();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	
}
class frame6 extends JFrame {
	public frame6() {
		setUndecorated(true);
		setLayout(new BorderLayout());
		setBounds(0,0,500,450);
		panel6 p = new panel6();
		add(p, BorderLayout.CENTER);
		setLocationRelativeTo(null);
	}
}

class panel6 extends JPanel{
	public panel6() {
		try {
			Class.forName("org.postgresql.Driver");
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projectC1","postgres","12345");
			int codigo,ano_creacion;
			String nombre,pais,correo_electronico;
			Statement st = (Statement) connection.createStatement();
			ResultSet rs = st.executeQuery("SELECT codigo,nombre,pais,ano_creacion,correo_electronico from Agencia");
			String[] columnas= {"codigo","nombre","pais","ano_creacion","correo_electronico","nombre_dueno"};
			JTable tabla = new JTable();
			DefaultTableModel modelo = new DefaultTableModel();
			modelo.setColumnIdentifiers(columnas);
			tabla.setModel(modelo);
			while(rs.next()) {
				codigo = rs.getInt("codigo");
				ano_creacion = rs.getInt("ano_creacion");
				
				nombre = rs.getString("nombre");
				pais = rs.getString("pais");
				correo_electronico = rs.getString("carreo_electronico");
				
				modelo.addRow(new Object[]{codigo, nombre, pais,ano_creacion,correo_electronico});
			}
			JScrollPane scroll = new JScrollPane(tabla);
			add(scroll);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}