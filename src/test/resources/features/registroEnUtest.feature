# language: en

#Author: Juan Andres Henao
  @stories
  Feature: Utest
    As a user, I want to register in the Utest page

    @escenario1
    Scenario: Register on Utest
      Given Juan Wants to register on Utest website


      When He register on Utest with his personal data
        |strFirstName | strLastName | strMail             | strPassword   | strConfirmPassword
        |Juan Andres  | Henao Diaz  |randommail@gmail.com | Choucair2022? |Choucair2022?

      Then He reads the welcome message of Utest
