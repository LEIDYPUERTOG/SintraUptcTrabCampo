package Persistencia;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Clase que permite realizar la conexion con la base de
 * datos
 * @author LEIDY
 * @version 1.0
 * @created 24-sep.-2015 8:54:07 a. m.
 */
public class ConexionDB {

	/**
	 * Atributo que permite tener la conexi�n con la base de datos
	 */
	private static Connection conexion;
	/**
	 * Atributo que tiene la contrasenia para la conexion con la
	 * base de datos
	 */
	private String contrasenia="";
	/**
	 * Atributo que permite saber si existe la conexion con la base de datos
	 */
	private boolean hayConexion=false;
	/**
	 * Tiene la URL de conexion con la base de datos
	 */
	private static String URL="jdbc:mysql://localhost/sintrauptc";
	/**
	 * Atributo que tiene el usuario para conectar con la base
	 * de datos
	 */
	private String usuario="root";

	public ConexionDB(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexion = (Connection) DriverManager.getConnection(URL, usuario,contrasenia);

			if (conexion != null) {
				hayConexion = true;

				System.out.println("Conexi�n a base de datos  OK\n");

			}
		} catch (SQLException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static Connection getConexion() {
		return conexion;
	}
	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	public boolean isHayConexion() {
		return hayConexion;
	}
	public void setHayConexion(boolean hayConexion) {
		this.hayConexion = hayConexion;
	}
	public static String getURL() {
		return URL;
	}
	public static void setURL(String uRL) {
		URL = uRL;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
}