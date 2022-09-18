package MavenSeleniumPractice.MavenProjectSample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//working with excel sheets
//1.fileinputstream
//2.xssfworkbook(fileinput)
//3.workbook.getsheetAt(i)---one sheet access
//4.rows iterator
//5.first row-rows.next
//6.firstrow--->cells itertaor
//7.firstrow--->cells itertaor->getcolumnindex
//8.use same column and grab data
//9.intially-rows iterator
//10.if(rows iterator object.get(above column).value matches)
//11.cell itertaor
//12.add cell values to arraylist<object>

public class ExceldataAccess {
	
	public void DataAccess() throws IOException {
		
		FileInputStream finput=new FileInputStream("C://excel");
		XSSFWorkbook workbook=new XSSFWorkbook(finput);
		int worksheetsCount=workbook.getNumberOfSheets();
		for(int i=0;i<worksheetsCount;i++) {
			if(workbook.getSheetName(i).equalsIgnoreCase("Sheet1")) {
				XSSFSheet worksheet=workbook.getSheetAt(i);
				Iterator<Row> rows=worksheet.iterator();
				int count=0;
				int column=0;
				while(rows.hasNext()) {
					//getting first row
					Row firstRow=rows.next();
					Iterator<Cell> firstrowCells=firstRow.iterator();
					
					while(firstrowCells.hasNext()) {
						if(firstrowCells.next().getStringCellValue().equalsIgnoreCase("testdata")) {
							System.out.println(firstrowCells.next().getColumnIndex());
							//to know the column index where testdata is present
							column=count;
						}
						
						count++;
					}
				}
				while(rows.hasNext()) {
					Row r=rows.next();
					if(r.getCell(column).getStringCellValue().equalsIgnoreCase("user2")){
						Iterator<Cell> cells=r.iterator();
						while(cells.hasNext()) {
							ArrayList<Object> al=new ArrayList<Object>();
							al.add(cells.next().getStringCellValue());
						}
						
						
					}
				}
			}
		
			
		}
	}
	

}
