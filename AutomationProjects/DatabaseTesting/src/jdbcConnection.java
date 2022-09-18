import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class jdbcConnection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException  {
		// TODO Auto-generated method stub
		
		String host="localhost";
		String port="3306";
		
        Connection conn=DriverManager.getConnection("jdbc:mysql://"+ host +":"+ port +"/database1", "root", "2303");
        
        Statement s=conn.createStatement();
        ResultSet rs=s.executeQuery("select * from table2 where name='Suga'");
        while(rs.next()) {
        System.out.println(rs.getString("name"));
        System.out.println(rs.getString("location"));
        }
		

	}

}
