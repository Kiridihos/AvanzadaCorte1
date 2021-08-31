package Interfaz;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Evento {

	public static void main(String[] args) {
		frame f=new frame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	
}
class frame extends JFrame {
	public frame() {
		setUndecorated(true);
		setLayout(new BorderLayout());
		setBounds(0,0,500,450);
		panel p = new panel();
		add(p, BorderLayout.CENTER);
		setLocationRelativeTo(null);
	}
}

class panel extends JPanel{
	public panel() {
		try {
			Class.forName("org.postgresql.Driver");
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projectC1","postgres","12345");
			int codigo, directivoAsignado, salarioDirectivo, empleadoRasoAsignado, salarioEmpRaso;
			String nombre;
			Statement st = (Statement) connection.createStatement();
			ResultSet rs = st.executeQuery("SELECT codigo, nombre, directivo_asignado, salario_directivo, empleado_raso_asignado, salario_empleado_raso from evento");
			String[] columnas= {"Codigo","Nombre","DirAsignado","SalarioDir","EmpRasoAsignado","SalarioEmpRaso"};
			JTable tabla = new JTable();
			DefaultTableModel modelo = new DefaultTableModel();
			modelo.setColumnIdentifiers(columnas);
			tabla.setModel(modelo);
			while(rs.next()) {
				codigo = rs.getInt("codigo");
				nombre = rs.getString("nombre");
				directivoAsignado = rs.getInt("directivo_asignado");
				salarioDirectivo = rs.getInt("salario_directivo");
				empleadoRasoAsignado = rs.getInt("empleado_raso_asignado");
				salarioEmpRaso = rs.getInt("salario_empleado_Raso");
				modelo.addRow(new Object[]{codigo, nombre, directivoAsignado, salarioDirectivo, empleadoRasoAsignado, salarioEmpRaso});
			}
			JScrollPane scroll = new JScrollPane(tabla);
			add(scroll);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}