import java.util.Scanner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_03_01_InValidInput_EmptyField {
	public static void main(String[] args) throws InterruptedException { 
		String userNameData = "";
		String passwordData = "";
		String creditCardNoData = "";
		String telephoneNoData = "";
		String expectedResult = "Please fill out this field";
		

		Helper helper = new	Helper();
		String result;
		try {
		 result=helper.submitForm(userNameData,passwordData,creditCardNoData,telephoneNoData);
		}catch(Exception e)
		{
			System.out.println("Status: PASS");
		return;
		}
					System.out.println("Status: FAIL");
		
		System.out.println("Message: "+result);

	}
		
	
}
