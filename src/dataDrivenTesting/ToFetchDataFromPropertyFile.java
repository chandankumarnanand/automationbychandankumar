package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ToFetchDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//1. The physical property file is converted to Java representation
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Desktop\\Project\\Eclipse\\eclipse\\automation\\Automation\\test data\\properpertyfile.properties");
		//2. creating an object of Properties Class
		Properties prop = new Properties();

		//3. calling the load method to read the key and value pair
		prop.load(fis);

		//4 calling the value using the key
		String urlFromPropertyFile = prop.getProperty("url");
		System.out.println(urlFromPropertyFile);

		String browserFromPropertyFile = prop.getProperty("browser");
		System.out.println(browserFromPropertyFile);


	
	}

}
