package MavenSeleniumPractice.MavenProjectSample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DataDrivenTest {
	@Test
	public ArrayList<String> exceldata(String testcasename) throws IOException {
		
		ArrayList<String> data=new ArrayList<String>();
		
		FileInputStream finput=new FileInputStream("C://InputDataSheet.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(finput); //accepts file input stream argument where excel is present
		//accessing worksheet from workbook
		int SheetCount=workbook.getNumberOfSheets();
		for(int i=0;i<SheetCount;i++) {
			if(workbook.getSheetName(i).equalsIgnoreCase("sheet1")) {
				XSSFSheet sheet=workbook.getSheetAt(i);
				//sheet.rowIterator();
				Iterator<Row> rows=sheet.iterator();
				Row FirstRow=rows.next();
				Iterator<Cell> cell=FirstRow.cellIterator();
				int k=0;
				int column=0;
				while(cell.hasNext()) {
					Cell cellvalue=cell.next();
					if(cellvalue.getStringCellValue().equalsIgnoreCase("Testdata")) {
						System.out.println(cellvalue.getColumnIndex()); //to know the coulumn where testdata is present
						column=k;
					}
				}
				
				while(rows.hasNext()) {
					Row r=rows.next();
					if(r.getCell(column).getStringCellValue().equalsIgnoreCase("name")) {
						Iterator<Cell> namecells=r.cellIterator();
						while(namecells.hasNext()) {
							data.add(namecells.next().getStringCellValue());
						}
					}
				}
			}
			
		}
	return data;
	}

}
