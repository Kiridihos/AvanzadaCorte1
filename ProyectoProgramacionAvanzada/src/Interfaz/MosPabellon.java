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
		frame10 f=new frame10();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	
}
class frame10 extends JFrame {
	public frame10() {
		setUndecorated(true);
		setLayout(new BorderLayout());
		setBounds(0,0,500,450);
		panel10 p = new panel10();
		add(p, BorderLayout.CENTER);
		setLocationRelativeTo(null);
	}
}

class panel10 extends JPanel{
	public panel10() {
		try {
			Class.forName("org.postgresql.Driver");
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projectC1","postgres","12345");
			int pasaporte,estatura,cintura,busto,talla_zapatos,peso,agencia,portafolio_de_presentacion;
			String pais,nombre,color_ojos,color_piel,particularidades;
			Statement st = (Statement) connection.createStatement();
			ResultSet rs = st.executeQuery("SELECT pasaporte,pais,nombre,color_ojos,color_piel,estatura,cintura,busto,talla_zapatos,peso,particularidades,agencia,portafolio_de_presentacion from Modelos");
			String[] columnas= {"pasaporte","pais","nombre","color_ojos","color_piel","estatura,cintura",
					 "busto","talla_zapatos","peso","particularidades","agencia","portafolio_de_presentacion"};
			JTable tabla = new JTable();
			DefaultTableModel modelo = new DefaultTableModel();
			modelo.setColumnIdentifiers(columnas);
			tabla.setModel(modelo);
			while(rs.next()) {
				pasaporte = rs.getInt("pasaporte");
				estatura = rs.getInt("estatura"); 
				cintura = rs.getInt("cintura");
			    busto = rs.getInt("busto");
				talla_zapatos = rs.getInt("talla_zapatos");
				peso = rs.getInt("peso");
				agencia = rs.getInt("agencia");
				portafolio_de_presentacion = rs.getInt("portafolio_de_presentacion");
				
				pais = rs.getString("pais");
				nombre = rs.getString("nombre");
				color_ojos = rs.getString("color_ojos");
				color_piel = rs.getString("color_piel");
				particularidades = rs.getString("particularidades");
			
				modelo.addRow(new Object[]{pasaporte,pais,nombre,color_ojos,color_piel,estatura,cintura,
						busto,talla_zapatos,peso,particularidades,agencia,portafolio_de_presentacion});
			}
			JScrollPane scroll = new JScrollPane(tabla);
			add(scroll);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}