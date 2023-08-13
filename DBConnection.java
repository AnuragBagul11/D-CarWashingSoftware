import java.sql.Connection;
import java.sql.DriverManager;

class DBConnection
{
	public static Connection getDBConnection()
	{
		Connection con;

		try
		{

			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

			con = DriverManager.getConnection("jdbc:odbc:CarWashingSoftware");

			return con;
		}

		catch(Exception ex)
		{
			return null;
		}
	}
}