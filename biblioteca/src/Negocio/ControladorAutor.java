package Negocio;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Modelo.Autor;
import Vista.InterfazAutor;



public class ControladorAutor
{
	private Connection con;
	private java.sql.Statement st;
	private java.sql.PreparedStatement psInsertar;

	
	public void datosInsertar(String text, String text2, String text3) throws SQLException {
		//int codigo = Integer.parseInt(txtCodigo.getText());
				String nombre = text;
				String nacionalidad = text2;
				String descripcion = text3;
				String url = "jdbc:mysql://localhost:3306/biblioteca?user=root";
				con = DriverManager.getConnection(url);
				st = con.createStatement();
				psInsertar = con.prepareStatement("INSERT INTO autor (nombre,nacionalidad,descripcion)" + "VALUES(?,?,?)");
				//INSERT INTO `autor` (`codigo`, `nombre`, `nacionalidad`, `descripcion`) VALUES ('80', 'juan', 'cuenca', 'asdasdasdasdasdasdasdasdsdaasd');
				//psInsertar.setLong(1, codigo);
				psInsertar.setString(1, nombre);
				psInsertar.setString(2, nacionalidad);
				psInsertar.setString(3, descripcion);
				psInsertar.executeUpdate();
				System.out.println("Subido");
	}

	
}
