@US4
Feature: Add Moons/Planets to Home Page

  Background:
    Given user on Home page
    And user is logged in

  Scenario Outline: Adding Planets
    When user enters planet "<planet_name>"
    And user enters file "<file>"
    Then browser alert says "<alert>"
    And return to Home page

    #Fix this to make it actually work for inputs
    Examples:
      | planet_name                        | file                                                                                                         | alert                       |
      | My 1st _Planet-                    | C:\Users\ethan\IdeaProjects\revature\Project Planetarium\src\test\resources\Celestial-Images\moon-1.jpg      |                             |
      | ThisNameIsOverThirtyCharactersLong | C:\Users\ethan\IdeaProjects\revature\Project Planetarium\src\test\resources\Celestial-Images\moon-1.jpg      | Invalid Planet Name         |
      |                                    | C:\Users\ethan\IdeaProjects\revature\Project Planetarium\src\test\resources\Celestial-Images\moon-1.jpg      | Invalid Planet Name         |
      | Pr()xim@ Centaur! B                | C:\Users\ethan\IdeaProjects\revature\Project Planetarium\src\test\resources\Celestial-Images\moon-1.jpg      | Invalid Planet Name         |
      | Earth                              | C:\Users\ethan\IdeaProjects\revature\Project Planetarium\src\test\resources\Celestial-Images\moon-1.jpg      | Invalid Planet Name         |
      | My 1st _Planet-                    |                                                                                                              | Invalid File Type           |
      | My 1st _Planet-                    | C:\Users\ethan\IdeaProjects\revature\Project Planetarium\src\test\resources\Celestial-Images\rick-roll-rick-ashley.gif| Invalid File Type  |

  Scenario Outline: Adding Moons
    When user enters moon "<moon_name>"
    And user enters owner planet "<planet_id>"
    Then browser alert says "<alert>"
    And return to Home page


      # Do we need a file type to enter (one of the moon rules is about file type handling)
    Examples:
      | moon_name                        | planet_id | alert                     |
      | My 1st_Moon-                     | 1         |                           |
      |                                  | 1         | Invalid Moon Name         |
      | ThisMoonHasTooManyCharactersHere | 1         | Invalid Moon Name         |
      | 404 M**n N*t F()und!             | 1         | Invalid Moon Name         |
      | Luna                             | 1         | Invalid Moon Name         |
      | My 1st_Moon-                     | -99999    | Invalid Planet ID         |

  Scenario Outline: Adding Moons With File
    When user enters moon "<moon_name>"
    And user enters owner planet "<planet_id>"
    And user enters file "<file>"
    Then browser alert says "<alert>"
    And return to Home page


      # Do we need a file type to enter (one of the moon rules is about file type handling)
    Examples:
      | moon_name    | planet_id | file                                                                                                                         | alert             |
      | My 1st_Moon- | 1         | C:\Users\ethan\IdeaProjects\revature\Project Planetarium\src\test\resources\Celestial-Images\rick-roll-rick-ashley.gif       | Invalid File Type |
