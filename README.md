# QA Demo Task - Automated Registration Form Testing

## 📌 Overview
This repository contains test cases and automation scripts for a **Registration Form** QA task. The test suite includes both **valid and invalid input scenarios**, automated using **Selenium**.

## 📂 Repository Structure

```sh
qa-demo-task/  
├─ TestCases/  
├─ Automation/  
└─ README.md  
```

## 📝 Test Cases
The test cases cover different scenarios for form validation:

🔹 **[View Test Case Document](TestCases/README.md)**  
🔹 **[Download as XLXS](TestCases/TestCasesRegistrationForm.xlsx)**  

## 🚀 Automation Scripts
The automation scripts are written in **Java (Selenium)**. Below is the breakdown of test scenarios:

#### Valid Input
- **[TC_01_01_ValidInput.java](automation/TC_01_01_ValidInput.java)** – Tests successful registration.

#### Invalid Username
- **[TC_02_01_InvalidUsername_lessThanFiveChars.java](Automation/TC_02_01_InvalidUsername_lessThanFiveChars.java)** – Less than 5 characters.  
- **[TC_02_02_InvalidUserName_moreThanFifteen.java](Automation/TC_02_02_InvalidUserName_moreThanFifteen.java)** – More than 15 characters.  
- **[TC_02_03_InvalidUsername_NoNumbers.java](Automation/TC_02_03_InvalidUsername_NoNumbers.java)** – No numbers included.  
- **[TC_02_04_InvalidUserName_NoAlphabet.java](Automation/TC_02_04_InvalidUserName_NoAlphabet.java)** – No alphabets included.  

#### Invalid Password
- **[TC_02_05_InvalidPassword_NoSpecialChar.java](Automation/TC_02_05_InvalidPassword_NoSpecialChar.java)** – No special character.  
- **[TC_02_06_InvalidPassword_NoUpperCase.java](Automation/TC_02_06_InvalidPassword_NoUpperCase.java)** – No uppercase letter.  
- **[TC_02_07_InvalidPassword_NoLowerCase.java](Automation/TC_02_07_InvalidPassword_NoLowerCase.java)** – No lowercase letter.  
- **[TC_02_08_InvalidPassword_NoNumber.java](Automation/TC_02_08_InvalidPassword_NoNumber.java)** – No numeric character.  
- **[TC_02_09_InvalidPassword_LessThanEightChars.java](Automation/TC_02_09_InvalidPassword_LessThanEightChars.java)** – Less than 8 characters.  

#### Invalid Input in Other Fields
- **[TC_02_10_InValidCreditCardNo.java](Automation/TC_02_10_InValidCreditCardNo.java)** – Invalid credit card number.  
- **[TC_02_11_InValidTelephoneNo.java](Automation/TC_02_11_InValidTelephoneNo.java)** – Invalid telephone number.  
- **[TC_03_01_InValidInput_EmptyField.java](Automation/TC_03_01_InValidInput_EmptyField.java)** – Empty form submission.  

## ⚙️ How to Run the Tests
1. Clone this repository:
   ```sh
   git clone https://github.com/yourusername/qa-demo-task.git
   cd qa-demo-task
   ```
2. Install dependencies (Selenium, Java, WebDriver).
3. Run test scripts using:
   ```sh
    mvn test
   ```
4. Check the test results.

## 📧 Contact

For any queries, feel free to reach out.
