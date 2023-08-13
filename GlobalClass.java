import javax.swing.*;
import java.sql.*;

public class GlobalClass
{
	public Connection con;
	public Statement stmt;
	public ResultSet rs;


	GlobalClass()
	{
		try
		{
			con = DBConnection.getDBConnection();

			if(con==null)
			{
				JOptionPane.showMessageDialog(null,"Connection Error");
			}
		}
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null,ex.getMessage());
		}
	}

	public void recordReader(String sqlcmd)
	{
		try
			{
				stmt= con.createStatement();

				stmt.execute(sqlcmd);

				rs=stmt.getResultSet();
			}

		catch(Exception ex)
			{
				JOptionPane.showMessageDialog(null,ex.getMessage());
			}
	}

	public int idReader(String sqlcmd)
	{
		try
		{
			stmt = con.createStatement();

			stmt.executeQuery(sqlcmd);

			rs=stmt.getResultSet();

			int i=0;

			if(!rs.next())
			{
				i=0;
			}
			else
			{
				String t = rs.getString(1);

				if(t==null)
				{
					i=i+1;
					return i;
				}
				else
				{
					i = Integer.parseInt(t);
				}
			}

			i=i+1;
			return i;
		}
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null,ex.getMessage());
		}
		return 0;
	}

	public void recordManip(String sqlcmd)
	{
		try
		{
			stmt = con.createStatement();

			stmt.executeUpdate(sqlcmd);

		}
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null,ex.getMessage());
		}
	}
}