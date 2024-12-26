# Project Planetarium

A foray into test automation

This project demonstrates fundamental automated testing practices and 
design. This provides practical experience and a visual proof of my ability
during training. The testing suite looks for incompatibility between the 
functionality of the web application and our test plan using boundary 
value analysis and equivalence partitioning. 

## Technologies

- **Jira** helps systematize ticketing issues
    - **AIO Tests** helps automate information pipelines between Java 
      reports and Jira  
- **JUnit** is the de facto standard for implementing tests in a Java project
- **Cucumber** integrates visually interpretable steps and features with 
  the testing suit
  - **Gherkin** syntax embeds natural language in test steps to help 
    multidisciplinary stakeholders understand testing issues
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

The features are a way of communicating in natural language how we
should walk through the test, what inputs should be made, and how
the webpage should react.

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