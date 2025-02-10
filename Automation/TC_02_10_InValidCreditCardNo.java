import java.util.Scanner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_02_10_InValidCreditCardNo {
	public static void main(String[] args) throws InterruptedException { 
		String userNameData = "User123";
		String passwordData = "Test@123";
		String creditCardNoData = "2343460003000836";
		String telephoneNoData = "(977) 321-5659";
		String expectedResult = "Enter a valid credit card number.";
		

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
