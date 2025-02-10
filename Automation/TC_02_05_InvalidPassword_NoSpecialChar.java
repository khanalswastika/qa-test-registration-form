
public class TC_02_05_InvalidPassword_NoSpecialChar {

public static void main(String[] args) throws InterruptedException {
		
		String userNameData = "User123";
		String passwordData = "Test123";
		String creditCardNoData = "4343460003000836";
		String telephoneNoData = "(977) 321-5659";
		String expectedResult = "Password must be at least 8 characters long and contain at least one uppercase letter, one lowercase letter, one number, and one special character.";
		

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
