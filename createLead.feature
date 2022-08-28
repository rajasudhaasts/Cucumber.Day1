Feature: Create a new lead in Leaftaps Application

Background: Positive Login
Given Type the username as 'Demosalesmanager'
And Type the password as 'crmsfa'
When Click on the Login button
Then Verify the home page is displayed

Scenario Outline: Find and Edit Lead with different data
Given Click CRMSFA Link
And Click Leads Tab
And Click Find Leads Link
And Type the Lead ID as <leadID>
And Click the Search button
And Type the first name as <firstName>
And Type the last name as <lastName>
And Click Create Leads Button
Then Verify the View Leads Page
  
Examples:
|companyName|firstName|lastName|
|TestCompany1|Raja|Sudha|
|TestCompany2|Aviren|Smith|