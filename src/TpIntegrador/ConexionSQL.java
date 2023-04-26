package TpIntegrador;

import java.sql.*;

public class ConexionSQL {
	
	public static void EnviarSentencia(String sentencia) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost/libreria", "root", "");
			
			Statement s = c.createStatement();
			 //Enviar una orden SQL
			int res = s.executeUpdate(sentencia);
			System.out.println("actualizado: "+res);		
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void LeerTabla(String sentencia) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost/libreria", "root", "");
			Statement s = c.createStatement();
			//mostrar una tabla
			ResultSet a =  s.executeQuery(sentencia);
			//mostrar elementos de la consulta. con getstring puedo buscar por el nombre de la columna o por el numero de la fila.
			while (a.next()) {
				System.out.println(a.getString("nombre")+" "+a.getString("precio"));	
			}	
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
