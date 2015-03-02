

Narrative:
As a user
I want to be able
to add a new contact

Scenario: Adding a new contact
Given Main page is opened
When User clicks create new contact button
And User fill fields with title <title> email <email> and phone number <phone>
And Submit create form
Then New contact <title> created and displayed on main page

Examples:
title|email|phone
Test111|test@test.test|0987654321

Scenario: Deleting contact
Given Main page is opened
When Click delete buttn for contact <contact>
Then New contact <contact> deleted and not displayed on main page

Examples:
contact|
Test111|

