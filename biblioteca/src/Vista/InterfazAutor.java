package Vista;

import java.awt.EventQueue;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Negocio.Conexion;
import Negocio.ControladorAutor;

import javax.swing.JButton;



import java.sql.Connection;
import java.sql.ResultSet;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.TableModel;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;


public class InterfazAutor extends JFrame implements ActionListener {


	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;
	private Connection con;
	private java.sql.Statement st;
	private java.sql.PreparedStatement psInsertar;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public InterfazAutor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setBounds(100, 100, 538, 116);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		
		JLabel lblNombre = new JLabel("Nombre:");
		panel.add(lblNombre);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad:");
		panel.add(lblNacionalidad);
		
		textField_1 = new JTextField();
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDescripcion = new JLabel("Descripcion:");
		panel.add(lblDescripcion);
		
		textField_2 = new JTextField();
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(this);
		btnGuardar.setActionCommand("btnCargar");
		panel.add(btnGuardar);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String comando = e.getActionCommand();

		System.out.println("Button insertado: " + comando);

		switch (comando) {
		case "btnCargar":
			ControladorAutor ca = new ControladorAutor();
			try {
				ca.datosInsertar(textField.getText(),textField_1.getText(),textField_2.getText());
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		default:
			break;
		}
		
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}

	public JTextField getTextField_2() {
		return textField_2;
	}

	public void setTextField_2(JTextField textField_2) {
		this.textField_2 = textField_2;
	}
	

}
