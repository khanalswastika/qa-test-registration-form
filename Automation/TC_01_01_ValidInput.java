import java.util.Scanner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_01_01_ValidInput {
	public static void main(String[] args) throws InterruptedException { 
		String userNameData = "User123";
		String passwordData = "Test@123";
		String creditCardNoData = "4343460003000836";
		String telephoneNoData = "(977) 321-5659";
		String expectedResult = "Form submitted successfully!";
		

		Helper helper = new	Helper();
		String result=helper.submitForm(userNameData,passwordData,creditCardNoData,telephoneNoData);
		
		if(result.equals(expectedResult)) {
			System.out.println("Status: PASS");
		}
		else{
			System.out.println("Status: FAIL");
		}
		System.out.println("Message: "+result);

	}
	
}
