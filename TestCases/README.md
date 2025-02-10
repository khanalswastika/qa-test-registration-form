## Test scenario and Test case of Chulo Solution Registration Form


| | |
|-|-|
|Project Name| |
|URL| |
|Feature|Registration Form|
|User Story ID| |
|Version| |
|Environment|Chrome|
|Created by|Swastika Khanal|
|Created Date|9/10/2081|
|Pre-Condition|Registration demo form should be accessible|
|Reviewed By| |
|Browser/OS|Windows|
|Executed Date| |
|Executed by| |
|Status| |
|Remarks| |




| | | | | | | | | | |
|-|-|-|-|-|-|-|-|-|-|
|Test scenario and Test case of Registration Form| | | | | | | | | |
|Test Scenario ID|Test Scenario Description|Test Case ID|Test Case Description|Test Step|Pre Condition|Test data|Expected result|Actual Result|Status|
|TS-CH-RF-01|Check Registration functionality with valid inputs.|TC-01-01|Verify registration with  correct Username , Password,Credit Card  Number and Telephone|1. Open the  registration demo form in the browser.| |Username: user123 |1. The  registration demo form must be opened. |As Expected|Pass|
| | | | |2. When opening there must be input fields of username,password,Credit card number and Telephone Number.|1. Registration form URL must be accessible. | Password: Test@123| 2. There should be a input option for username, password,credit card number and telephone number in the form. |As Expected|Pass|
| | | | |3. Enter a valid username,Password,Credit card number and telephone number on the form.|2. Valid test data should be available."| Credit Card Number: 4343460003000836 | 3. Username, password,credit card number and telephone number should be able to be entered there. |As Expected|Pass|
| | | | |4. Click on "Submit" button which is on the buttom of the form.| | Telephone Number: (977) 321-5659|4. After click on "submit" button user should be registered successfully and a pop-up message box with message "Form Submitted Successfully!" should be seen.|As Expected|Pass|
|TS-CH-RF-02|Check Registration functionality with Invalid inputs.|TC-02-01|Verify registration with  incorrect Username (less than 5 character)|1. Open the  registration demo form in the browser.| |Username: usr2|1. The  registration demo form must be opened.|As Expected|Pass|
| | | | |2. When opening there must be input fields of username,password,Credit card number and Telephone Number. |1. Registration form URL must be accessible. |Password: Test@123|2. There should be an Input field for Username in the form.|As Expected|Pass|
| | | | |3. Enter invalid username and valid Password,Credit card number and telephone number on the form.|2. Valid test data should be available."|Credit Card Number: 4343460003000836|3. Username should be able to be entered there.|As Expected|Pass|
| | | | |4. Click on "Submit" button which is on the buttom of the form.| |Telephone Number: (977) 321-5661|4. After click on "submit" button Error message should be appear  "Username must be alphanumeric and between 5 to 15 characters".|As Expected|Pass|
| | |TC-02-02| Verify registration with  incorrect Username (more than 15 character)|1. Open the  registration demo form in the browser.| |Username: myspecialusername123|1. The  registration demo form must be opened.|As Expected|Pass|
| | | | |2. When opening there must be input fields of username,password,Credit card number and Telephone Number. |1. Registration form URL must be accessible. |Password: Test@123|2. There should be an Input field for Username in the form.|As Expected|Pass|
| | | | |3. Enter invalid username and valid Password,Credit card number and telephone number on the form.|2. Valid test data should be available."|Credit Card Number: 4343460003000836|3. Username should be able to be entered there.|As Expected|Pass|
| | | | |4. Click on "Submit" button which is on the buttom of the form.| |Telephone Number: (977) 321-5661|4. After click on "submit" button Error message should be appear  "Username must be alphanumeric and between 5 to 15 characters".|As Expected|Pass|
| | |TC-02-03|Verify registration with  incorrect Username (without Numbers)|1. Open the  registration demo form in the browser.| |Username: myusername|1. The  registration demo form must be opened.|As Expected|Pass|
| | | | |2. When opening there must be input fields of username,password,Credit card number and Telephone Number. |1. Registration form URL must be accessible. |Password: Test@123|2. There should be an Input field for Username in the form.|As Expected|Pass|
| | | | |3. Enter invalid username and valid Password,Credit card number and telephone number on the form.|2. Valid test data should be available."|Credit Card Number: 4343460003000836|3. Username should be able to be entered there.|As Expected|Pass|
| | | | |4. Click on "Submit" button which is on the buttom of the form.| |Telephone Number: (977) 321-5661|4. After click on "submit" button Error message should be appear  "Username must be alphanumeric and between 5 to 15 characters".|No error Message was Shown and Form was Submitted Successfully.|FAIL|
| | |TC-02-04|Verify registration with  incorrect Username (without Alphabets)|1. Open the  registration demo form in the browser.| |Username: 111111|1. The  registration demo form must be opened.|As Expected|Pass|
| | | | |2. When opening there must be input fields of username,password,Credit card number and Telephone Number. |1. Registration form URL must be accessible. |Password: Test@123|2. There should be an Input field for Username in the form.|As Expected|Pass|
| | | | |3. Enter invalid username and valid Password,Credit card number and telephone number on the form.|2. Valid test data should be available."|Credit Card Number: 4343460003000836|3. Username should be able to be entered there.|As Expected|Pass|
| | | | |4. Click on "Submit" button which is on the buttom of the form.| |Telephone Number: (977) 321-5661|4. After click on "submit" button Error message should be appear  "Username must be alphanumeric and between 5 to 15 characters".|No error Message was Shown and Form was Submitted Successfully.|FAIL|
| | |TC-02-05|Verify registration with  incorrect Password (no special character)|1. Open the  registration demo form in the browser.| |Username: User123|1. The  registration demo form must be opened.|As Expected|Pass|
| | | | |2. When opening there must be input fields of username,password,Credit card number and Telephone Number. |1. Registration form URL must be accessible. |Password: Test123|2. There should be an Input field for Username in the form.|As Expected|Pass|
| | | | |3. Enter invalid password on the form and valid username, credit card number and Telephone Number.|2. Test data with an invalid Password should be available.|Credit Card Number: 4343460003000836|3. Username should be able to be entered there.|As Expected|Pass|
| | | | |4. Click on "Submit" button which is on the buttom of the form.| |Telephone Number: (977) 321-5661|4. After click on "submit" button Error message should be appear  "Password must be at least 8 characters long and contain at least one uppercase letter, one lowercase letter, one number, and one special character.|As Expected|Pass|
| | |TC-02-06| Verify registration with  incorrect Password (no Uppercase character)|1. Open the  registration demo form in the browser.| |Username: user123|1. The  registration demo form must be opened.|As Expected|Pass|
| | | | |2. When opening there must be input fields of username,password,Credit card number and Telephone Number. |1. Registration form URL must be accessible. |Password: test@123|2. There should be an Input field for Username in the form.|As Expected|Pass|
| | | | |3. Enter invalid password on the form and valid username, credit card number and Telephone Number.|2. Test data with an invalid Password should be available.|Credit Card Number: 4343460003000836|3. Username should be able to be entered there.|As Expected|Pass|
| | | | |4. Click on "Submit" button which is on the buttom of the form.| |Telephone Number: (977) 321-5661|4. After click on "submit" button Error message should be appear  "Password must be at least 8 characters long and contain at least one uppercase letter, one lowercase letter, one number, and one special character.|As Expected|Pass|
| | |TC-02-07|Verify registration with  incorrect Password (no lowercase character)|1. Open the  registration demo form in the browser.| |Username: user123|1. The  registration demo form must be opened.|As Expected|Pass|
| | | | |2. When opening there must be input fields of username,password,Credit card number and Telephone Number. |1. Registration form URL must be accessible. |Password: test@123|2. There should be an Input field for Username in the form.|As Expected|Pass|
| | | | |3. Enter invalid password on the form and valid username, credit card number and Telephone Number.|2. Test data with an invalid Password should be available.|Credit Card Number: 4343460003000836|3. Username should be able to be entered there.|As Expected|Pass|
| | | | |4. Click on "Submit" button which is on the buttom of the form.| |Telephone Number: (977) 321-5661|4. After click on "submit" button Error message should be appear  "Password must be at least 8 characters long and contain at least one uppercase letter, one lowercase letter, one number, and one special character.|As Expected|Pass|
| | |TC-02-08|Verify registration with  incorrect Password (no number )|1. Open the  registration demo form in the browser.| |Username: user123|1. The  registration demo form must be opened.|As Expected|Pass|
| | | | |2. When opening there must be input fields of username,password,Credit card number and Telephone Number. |1. Registration form URL must be accessible. |Password: Testpw@@|2. There should be an Input field for Username in the form.|As Expected|Pass|
| | | | |3. Enter invalid password on the form and valid username, credit card number and Telephone Number.|2. Test data with an invalid Password should be available.|Credit Card Number: 4343460003000836|3. Username should be able to be entered there.|As Expected|Pass|
| | | | |4. Click on "Submit" button which is on the buttom of the form.| |Telephone Number: (977) 321-5661|4. After click on "submit" button Error message should be appear  "Password must be at least 8 characters long and contain at least one uppercase letter, one lowercase letter, one number, and one special character.|As Expected|Pass|
| | |TC-02-09|Verify registration with  incorrect Password (less than 8 characters)|Test scenario and Test case of Registration Form| |Username: user123|1. The  registration demo form must be opened.|As Expected|Pass|
| | | | |2. When opening there must be input fields of username,password,Credit card number and Telephone Number. |1. Registration form URL must be accessible. |Password: Pw@123|2. There should be an Input field for Username in the form.|As Expected|Pass|
| | | | |3. Enter invalid password on the form and valid username, credit card number and Telephone Number.|2. Test data with an invalid Password should be available.|Credit Card Number: 4343460003000836|3. Username should be able to be entered there.|As Expected|Pass|
| | | | |4. Click on "Submit" button which is on the buttom of the form.| |Telephone Number: (977) 321-5661|4. After click on "submit" button Error message should be appear  "Password must be at least 8 characters long and contain at least one uppercase letter, one lowercase letter, one number, and one special character.|As Expected|Pass|
| | |TC-02-10|Verify registration with  incorrect credit card number|1. Open the  registration demo form in the browser.| |Username: user123|1. The  registration demo form must be opened.|As Expected|Pass|
| | | | |2. When opening there must be input fields of username,password,Credit card number and Telephone Number.|1. Registration form URL must be accessible. |Password: Test@123|2. There should be an Input field for Username in the form.|As Expected|Pass|
| | | | |3. Enter an invalid Credit Card Number and valid username , password and Telephone number on the form.|2. Test data with an invalid Credit card number should be available.|Credit Card Number: 23434600030008|3. Username should be able to be entered there.|As Expected|Pass|
| | | | |4. Click on "Submit" button which is on the buttom of the form.| |Telephone Number: (977) 321-5661|4. After click on "submit" button Error message should be appear saying "Enter a valid credit card number.|As Expected|Pass|
| | |TC-02-11|Verify registration with  incorrect Telephone Number|1. Open the  registration demo form in the browser.| |Username: user123|1. The  registration demo form must be opened.|As Expected|Pass|
| | | | |2. When opening there must be input fields of username,password,Credit card number and Telephone Number.|1. Registration form URL must be accessible. |Password: Test@123|2.There should be an Input field for Username in the form.|As Expected|Pass|
| | | | |3. Enter an invalid Telephone Number and valid username , password, and credit card number on the form.|2. Test data with an invalid Telephone number should be available.|Credit Card Number: 43434600030008|3.Username should be able to be entered there.|As Expected|Pass|
| | | | |4. Click on "Submit" button which is on the buttom of the form.| |Telephone Number: 9773214421|3.After click on "submit" button Error message should be appear  "Telephone number must follow the format (XXX) XXX-XXXX."|As Expected|Pass|
|TS-CH-RF-03|Check Registration functionality with empty fields.|TC-03-01|Verify registration with empty fields|1. Open the  registration demo form in the browser.| |Username: |1.The  registration demo form must be opened.|As Expected|Pass|
| | | | |2. When opening there must be input field of username,password,credit card number and Telephone Number.|1. Registration form URL must be accessible.|Password: |2. There should be an Input field for Username, Password, Credit Card No and Contact No in the form.|As Expected|Pass|
| | | | |3. Leave all the fields empty.| |Credit Card Number: |3. No Data should be entered there.|As Expected|Pass|
| | | | |4. Click on "Submit" button which is on the buttom of the form.| |Telephone Number:|3. After click on "submit" button Error message should be appear saying "Please fill out this field" |As Expected|Pass|
