package dataDrivenTesting;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToFetchDataFromExcelSheet {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Desktop\\Project\\Eclipse\\eclipse\\automation\\Automation\\test data\\ExcelData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);

		Sheet sheet = workbook.getSheet("Sheet1");

		Row row = sheet.getRow(1);

		Cell cell =  row.getCell(2);

		boolean customer1Status = cell.getBooleanCellValue();

		System.out.println("Customer 1 Status is : " + customer1Status);

		double customer1PhoneNo = row.getCell(1).getNumericCellValue();

		System.out.println("Customer 1 phone no is : "+customer1PhoneNo);

		String customer1Name = row.getCell(0).getStringCellValue();

		System.out.println("Customer 1 Name is : "+customer1Name);
		
		double salarycoustmer = row.getCell(3).getNumericCellValue();
		
		System.out.println("Customer 1 sal is : "+ salarycoustmer);
		
		
		

	}

}
