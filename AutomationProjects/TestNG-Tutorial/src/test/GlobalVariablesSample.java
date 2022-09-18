package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Properties;

public class GlobalVariablesSample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		FileInputStream finput = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\TestNG-Tutorial\\src\\test\\data.properties");
		prop.load(finput);
		prop.getProperty("browser");
		System.out.println(prop.getProperty("browser"));
		prop.getProperty("url");
		prop.setProperty("browser", "Firefox");
		System.out.println(prop.getProperty("browser"));
		prop.setProperty("browser", "ie");
		FileOutputStream foutput=new FileOutputStream("C:\\Users\\DELL\\eclipse-workspace\\TestNG-Tutorial\\src\\test\\data.properties");
		
		prop.store(foutput, null);
		
		
		
		
		

	}

}
