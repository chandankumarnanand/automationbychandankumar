package dataDrivenTesting;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class testscript {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		FileUtility file =new FileUtility();
		
		String browser = file.toFetchDataFromPropertyFile("browser");
		double coustmersal = file.fetchNumericDataFromExcelSheet("sheet1", 1, 3);
		String coustmername = file.fetchStringDataFromExcelSheet("sheet1", 1, 0);
		
		System.out.println(coustmersal);
		System.out.println(coustmername);
		System.out.println(browser);
		

	}

}
