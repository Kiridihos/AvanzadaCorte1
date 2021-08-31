package Interfaz;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		JFrame main=new  PrincipalJF() ;
		main.setVisible(true);
		try {
			Class.forName("org.postgresql.Driver");
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projectC1","postgres","12345");
			
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
