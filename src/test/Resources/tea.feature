@Wip
Feature: As a user I want to visit practiseselenium
        website and choose my choice of tea and place my order

  Background:
    Given I am on practiseselenium website
    When I click herbal tea
    And I choose red type tea

    Scenario Outline:
      Then I can see the payment page
      When I enter my "<Email>", "<Name>", "<Address>", "<cardtype>", "<cardnumber>", "<cardholdername>","<verificationcode>"

      Examples:
      |Email         |Name| Address  |cardtype|cardnumber|cardholdername|verificationcode|
      |abcd@gmail.com|Reddy|Newcastle|visa     |1234556789|reddy           |123              |
      |abcd@gmail.com|Reddy|Newcastle|Master card     |1234556789|reddy           |123              |