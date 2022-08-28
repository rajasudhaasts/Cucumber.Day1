Feature: Find and Edit lead in Leaftaps Application

Background: Positive Login
Given Type the username as 'Demosalesmanager'
And Type the password as 'crmsfa'
When Click on the Login button
Then Verify the home page is displayed

Scenario Outline: Find and Edit Lead with different data
Given Click CRMSFA Link
And Click Leads Tab
And Click Find Leads Link
Given Type the First name as <firstName>
And Click the Find Leads button
Then Click the First Matching Result
And Click the Edit button
Then Change the Company name as <companyName>
And Click Upadte Button
Then Verify the View Leads Page
  
Examples:
|firstName|companyName|
|Test|Raja|
