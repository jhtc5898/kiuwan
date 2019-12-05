package Vista;

import java.awt.EventQueue;
import java.sql.SQLException;

import Negocio.Conexion;

public class Main {

	public static void main(String[] args) throws SQLException 
	{
		InterfazAutor window = new InterfazAutor();
		window.setVisible(true);	
		//Conexion cn = new Conexion();
		//cn.conexion();
		//cn.datos();
	}

}
