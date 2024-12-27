# Project Planetarium

_A foray into test automation_

This project demonstrates the skills learned for automated testing practices
and design! It's a visual proof of my ability during training and gives
practical experience

This testing suite looks for incompatibility between the 
functionality of the web application and our test plan, using **boundary 
value analysis**, **equivalence partitioning**, and manual testing. We have no access to 
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
into core functions (`Add.java`, `Delete.java`, etc.)

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
and  `delete`, which is also reflected in the Java test structure

[//]: # (This information isn't visible)

### Page Object Model

The POM is a representation of elements and useful manipulations in 
the webpage as a Java object. I made categorized the website into
to page objects: `Signup` and `Home`

#### Signup Page

As it turns out, the Login and Register pages have similar element names and actions,
so they can be combined into a `Signup.java` POM. The only main interactions are 
username/password fields and submit, which can be consolidated into one! Nice!

#### Home Page

The home page is not so easy. There are a lot of text fields, and some of them
actually change depending on whether you want to do something with a moon or 
a planet. This isn't terribly challenging, but it's going to need more complexity
in its POM representation


## Testing

Once I've assessed the website to find all the elements and interactions I may need
to build the POMs and I've fleshed out the feature files, the implementation of the
tests becomes quite easy. All it takes is looking at the steps and matching them to
the browser interactions.


## Retrospective

### Successes

[//]: # (What did you exceed in doing well?)

- Consistently ahead of schedule
- Personal research is crucial (Gherkin guides, Selenium docs)
- Understanding the test suite model (runner -> cucumber -> handlers) 

### Challenges

- Browser alerts
- Duplicate methods / Consolidation
- Detecting table updates
- "Guess-and-check" development

### Next Sprint
Next sprint would involve the continuation of the **defect lifecycle**, like
addressing posed issues in the source code, testing for those changes, verifying, 
and so forth. A test suite would also require more in-depth tests, such as unit 
or integration testing. This would entail getting the source code as well.