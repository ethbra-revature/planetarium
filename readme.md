# Project Planetarium

A foray into test automation

This project demonstrates the skills learned for automated testing practices
and design! It's a visual proof of my ability during training and gives
practical experience. 

This testing suite looks for incompatibility between the 
functionality of the web application and our test plan, using **boundary 
value analysis** and **equivalence partitioning**. We have no access to 
code, so we're going in blind! 

## Technologies

- **Jira** streamlines issue management like a pro!
    - **AIO Tests** helps automate information pipelines between Java 
      reports and Jira  
- **JUnit** is the de facto standard for implementing tests in a Java project
- **Cucumber** helps integrate interpretable steps and features with 
  the testing suite for clarity
  - **Gherkin** embeds natural language in test steps to help 
    everyone stay on the same page
- **Selenium** powerfully integrates browser actions in Java 

## Structure

Features were categorized into celestial bodies (`bodies`), then further
into core functions (`Add.java`, `Delete.java`, etc.). 

````
 📂revature 
 ┣ 📂bodies
 ┃ ┣ 🍵Add.java
 ┃ ┣ 🍵Delete.java
 ┃ ┗ 🍵View.java
 ┣ 📂pom
 ┃ ┣ 🍵Home.java
 ┃ ┗ 🍵Signup.java
 ┣ 📂registration
 ┃ ┣ 🍵Login.java
 ┃ ┗ 🍵Register.java
 ┣ 📂util
 ┃ ┣ 🍵DatabaseConnector.java
 ┃ ┗ 🍵Steps.java
 ┣ 🍵Setup.java
 ┗ 🍵TestRunner.java
 📂resources
 ┣ 📂Celestial-Images
 ┣ 📂features
 ┣ 📂reports
````

### Features

Features describe how we should walk through the test in natural 
language; what inputs should be made? How should the page react? 

My features follow the basic structure found in the user stories:
`register`, `log in`, `view`, `add`,
and  `delete`, which is also reflected in the Java test structure.

[//]: # (This information isn't visible)

### Page Object Model

The POM is a representation of elements and useful manipulations in 
the webpage as a Java object. 

#### Setup Page
As it turns out, the Login and Register pages have similar element names and actions,
so they can be combined into a `Signup.java` POM.

#### Home Page

**Primary Features** are

###  