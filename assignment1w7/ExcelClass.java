package week7.assignment1w7;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelClass {
 public static String[][] excelClass(String filename,int sheetNo) throws IOException {
	 XSSFWorkbook book=new XSSFWorkbook("./datasexcel/"+filename+".xlsx");
	 XSSFSheet sheet=book.getSheetAt(sheetNo);
	 XSSFRow row=sheet.getRow(0);
	 int rowNum = sheet.getLastRowNum();
	 int cellNum = row.getLastCellNum();
	 String[][] data=new String[rowNum][cellNum];
	 for(int i=1;i<=rowNum;i++) {
		 for(int j=0;j<cellNum;j++) {
			 String value = sheet.getRow(i).getCell(j).getStringCellValue();
			 data[i-1][j]=value;
		 }
	 }
	 book.close();
	 return data;
 }
}
