package Interfaz;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class MosDesfile {

	public static void main(String[] args) {
		frame4 f=new frame4();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	
}
class frame4 extends JFrame {
	public frame4() {
		setUndecorated(true);
		setLayout(new BorderLayout());
		setBounds(0,0,500,450);
		panel4 p = new panel4();
		add(p, BorderLayout.CENTER);
		setLocationRelativeTo(null);
	}
}

class panel4 extends JPanel{
	public panel4() {
		try {
			Class.forName("org.postgresql.Driver");
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projectC1","postgres","12345");
			int numero,disenador,modelo,salario_modelo,artista,salario_artista,evento_asignado;
			String nombre_coleccion,pabellon;
			Statement st = (Statement) connection.createStatement();
			ResultSet rs = st.executeQuery("SELECT numero,nombre_coleccion,disenador,pabellon,modelo,salario_modelo,artista,salario_artista,evento_asignado from Desfile");
			String[] columnas= {"numero","nombre_coleccion","disenador","pabellon","modelo","salario_modleo","artista","salario_artista","evento_asignado"};
			JTable tabla = new JTable();
			DefaultTableModel modelos = new DefaultTableModel();
			modelos.setColumnIdentifiers(columnas);
			tabla.setModel(modelos);
			while(rs.next()) {
				numero = rs.getInt("numero");
				disenador = rs.getInt("disenador");
				modelo = rs.getInt("modelo");
				salario_modelo= rs.getInt("salario_modelo");
				artista = rs.getInt("artista");
				salario_artista = rs.getInt("salario_artista");
				evento_asignado = rs.getInt("evento_asignado");
				
				nombre_coleccion = rs.getString("nombre_coleccion");
				pabellon = rs.getString("pabellon");
				
				modelos.addRow(new Object[]{numero,nombre_coleccion,disenador,pabellon,modelo,salario_modelo,artista,salario_artista,evento_asignado});
			}
			JScrollPane scroll = new JScrollPane(tabla);
			add(scroll);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}