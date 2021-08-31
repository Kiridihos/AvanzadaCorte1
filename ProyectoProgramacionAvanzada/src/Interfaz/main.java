package Interfaz;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JFrame;

public class main {
	public static void main(String[] args) {
		JFrame main=new  principalJF() ;
		main.setVisible(true);
		
		Connection connection=null;
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projectC1","postgres","12345");
			
			if(connection!=null) {
				System.out.println("Conexion exitosa!");
			}else {
				System.out.println("Conexion Erronea");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
