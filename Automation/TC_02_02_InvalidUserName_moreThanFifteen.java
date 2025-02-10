
public class TC_02_02_InvalidUserName_moreThanFifteen {

public static void main(String[] args) throws InterruptedException {
		
		String userNameData = "myspecialusername123";
		String passwordData = "Test@123";
		String creditCardNoData = "4343460003000836";
		String telephoneNoData = "(977) 321-5659";
		String expectedResult = "Username must be alphanumeric and between 5 to 15 characters.";
		

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
