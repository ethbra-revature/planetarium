# Planetarium Sprint 1 Acceptance Testing Summary

For addressing user stories’ acceptance criteria, I analyzed the application’s sufficiency in meeting the requirements, as well as judged its qualitative aspects.

## User Story 1
**As a new user, I want to open an account with the Planetarium so I can save my celestial findings**

**Overall Score:** 3  
**Reasoning:**  
Creating an account follows all the connected requirements to prevent account creation. However, there are instances where the website isn’t sufficiently interactive. Users will attempt to create an account with a pre-existing username but don’t receive feedback from the browser to indicate the name is unavailable. This is only evident while checking the console.



## User Story 2
**As a user, I want to securely access my account so I can interact with the Planetarium in a secure environment**

**Overall Score:** 4  
**Reasoning:**  
All associated security requirements are properly met. Users cannot see password text, only view their own celestial bodies, and require login to view bodies.



## User Story 3
**As a user, I want to see my planets and moons added to the Planetarium so I can track my findings**

**Overall Score:** 4  
**Reasoning:**  
Viewing planets meets the requirement of requiring login. Users can easily see their celestial bodies on the home page, which matches the description of the user story.



## User Story 4
**As a user, I want to add new planets and moons to the Planetarium so I can update my findings**

**Overall Score:** 2  
**Reasoning:**  
The application prevents users from uploading celestial bodies with different file extensions (e.g., GIF), but it doesn’t show the appropriate browser alert. There are also instances of grammatical errors that don’t match the testing wireframe. This creates testing errors and inconsistent messages in the application. Small grammatical errors aren’t severe, but interactivity is important to give a responsive feel and provide information to the user. I also chose 2 to emphasize its comparatively bad quality to the other user stories



## User Story 5
**As a user, I want to remove planets and moons from the Planetarium so I can correct my findings**

**Overall Score:** 4  
**Reasoning:**  
This user story has only one associated requirement and otherwise meets the described steps.
