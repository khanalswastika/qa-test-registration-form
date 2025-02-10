import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Helper {

	public static String submitForm(
			String userNameData , 
			String passwordData ,
			String creditCardNoData , 
			String telephoneNoData) throws InterruptedException {
		System.out.println("submmiting form");
		String url = "https://chulo-solutions.github.io/qa-internship/";
				
		WebDriver driver = new ChromeDriver();	
		
		driver.manage().window().maximize();
		driver.get(url);
		
		WebElement inputUsername, inputPassword, inputCreditCardNo,inputTelephoneNo, submitButton;
		Thread.sleep(3000);
		
		inputUsername = driver.findElement(By.id("username"));
		inputPassword = driver.findElement(By.id("password"));
		inputCreditCardNo = driver.findElement(By.id("creditCard"));
		inputTelephoneNo = driver.findElement(By.id("telephone"));
		submitButton = driver.findElement(By.xpath("//*[@id=\"validationForm\"]/button"));

		inputUsername.sendKeys(userNameData);
		Thread.sleep(500);
		inputPassword.sendKeys(passwordData);
		Thread.sleep(500);
		inputCreditCardNo.sendKeys(creditCardNoData);
		Thread.sleep(500);
		inputTelephoneNo.sendKeys(telephoneNoData);
		Thread.sleep(500);

		submitButton.click();
		
		Alert alert =driver.switchTo().alert();
		String alertMessage = alert.getText();
		
		alert.accept();
		driver.quit();
		return alertMessage;
	}
}


