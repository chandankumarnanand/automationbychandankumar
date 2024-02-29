package polymorphism;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Title.verifyGoggleTitle(new ChromeDriver());
		System.out.println("title are verified in chrome");
		Title.verifyGoggleTitle(new EdgeDriver());
		System.out.println("title are verified in edge");
		

	}

}
