package javamyproject;
import java.sql.*;
import javax.swing.*;


public class SqliteConnection {
	Connection conn=null;
	public static Connection dbConnector()
	{
		try
		{
			Class.forName("org.sqlite.JDBC");
			Connection conn= DriverManager.getConnection("jdbc:sqlite:SEPROJECT.sqlite");
			return conn;
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,e);
		return null;
		}
	}
}
