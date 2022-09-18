import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import org.openqa.selenium.By;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;


public class MyntraLoginDBCon {

	public static void main(String[] args) throws SQLException {
		
		String host="localhost";
		String port="3306";
		Connection conn=DriverManager.getConnection("jdbc:mysql://"+ host + ":" + port + "/database1", "root","2303");
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery("select * from credentials where username='RM@gmail.com'");
		
		
		
		while(rs.next()) {
			System.out.println(rs.getString("username"));
			System.out.println(rs.getString("password"));
			/*
			 * System.setProperty("webdriver.chrome.driver",
			 * "C:\\chromedriver_win32\\chromedriver.exe\""); WebDriver driver=(WebDriver)
			 * new ChromeDriver(); driver.get("https://www.myntra.com/login/password");
			 * driver.findElement(By.id("mobileNumberPass")).sendKeys(rs.getString(
			 * "username"));
			 * driver.findElement(By.className("form-control has-feedback")).sendKeys(
			 * "Rapmons123"); driver.findElement(By.tagName("button")).click();
			 */
		}

	}

}
