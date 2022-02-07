Feature: Automated scripts to test Paysera"s currency conversion calculation

  @pysera
  Scenario: When user fills "BUY" amount, "SELL" amount box is being emptied and vice versa
    Given user click on sell box
    And user fill "1000" into BUY box
    And user should verify that SELL amount box is emptied
    And user fill "1000" into SELL box
    Then user should verify that BUY amount box is emptied

  @pysera
  Scenario: When user selects country rates must be updated and currency option should be changed to the respective default currency for that country
    Given user goto footer
    When user click on flag icon
    And  user click on country
    And  user select United Kingdom
    And  user should verity currency change to United Kingdom
    And  user goto footer
    And  user click on flag icon
    And  user click on country
    And  user select Germany
    Then user should verify currency change to Germany

  @pysera
  Scenario: When bank provider's exchange amount for selling (X) is lower than the amount, provided by Paysera (Y), then a text box is displayed, representing the loss (X-Y)
    Given user click on sell box
    And user fill "1000" into SELL box
    Then User should verify that a text box is displayed which is representing the loss
