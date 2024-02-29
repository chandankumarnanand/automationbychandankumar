package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@DataProvider
	public Object[][] data() {
		Object[][] arr= new Object[4][3];
		arr[0][0]="noida";
		arr[1][0]="delhi";
		arr[2][0]="punjab";
		arr[3][0]="meeruat";
		
		arr[0][1]="Afgani chap";
		arr[1][1]="chole bhatore";
		arr[2][1]="lassi";
		arr[3][1]="orange";
		
		arr[0][2]="cheak";
		arr[1][2]="cheak";
		arr[2][2]="cheak";
		arr[3][2]="cheak";
		
		
		return arr;
		
		
		
	}
	@Test(dataProvider="data")
	public void test(String place,String food,String status) {
		System.out.println("place:"+place+""+"food:"+food+""+"status:"+"status");
		
	}
	

}
