
Feature: Enabling the Transfer service for a Account



  @Negative
  Scenario: Negative Scenario without filling the Mandatory field
    Given Login into the Admin portal
    |300217|525452|
    And  Click on the authenticate button
    When Navigate to the Customer Master
    And Search for the ECORP and Select
    And Edit and Enable the transfer service in the Product service
    Then Do not enter the mandatory fields and submit
    And Validate the outcome
@Positive
  Scenario: Negative Scenario without filling the Mandatory field
    Given Login into the Admin portal - positive
    |300217|525452|
    And  Click on the authenticate button- positive
    When Navigate to the Customer Master- positive
    And Search for the ECORP and Select- positive
    And Edit and Enable the transfer service in the Product service- positive
    Then  Enter the mandatory fields and submit- positive
    And Validate the outcome- positive
