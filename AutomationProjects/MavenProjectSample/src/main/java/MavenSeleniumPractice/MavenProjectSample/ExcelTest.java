package MavenSeleniumPractice.MavenProjectSample;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.Test;


public class ExcelTest {
	
	@Test
	public static void main(String[] args) throws IOException {
		DataDrivenTest ddt=new DataDrivenTest();
		ArrayList usernames=ddt.exceldata("name");
		usernames.get(0);
		
		
	}

}
