#Author: Miguel Angel Alvarez Rios

@stories
Feature: Join today UTest.com
  As a user, I want to be able to register in the UTest´s platform in order to access its functionalities
  @scenario1
  Scenario: Register in the UTest platform
    Given than Miguel wants to access the functionalities of the UTest platform
    When he successfully fills out the registration form
      |firstName     |lastName       |email                        |month   |day    |year   |city       |postalCode   |country   |password      |
      |Miguel Angel  |Alvarez Rios   |miguelangelalvarezrios@gmail.com   |June    |21     |2000   |Medellín   |050025       |Colombia  |contraseñaDePrueba**2022  |
    Then the system will create the user that will allow him to access the platform.
      |successfulMessage                                                          |
      |Welcome to the world's largest community of freelance software testers!    |