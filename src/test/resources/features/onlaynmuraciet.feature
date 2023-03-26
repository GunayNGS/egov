Feature: Send Online Application
  Scenario: Send Online Application
    Given Open browser and go to e-gov.az
    When Press on Allservices
    And Press on CentralElectionCommission
    And Press on OnlineApplication
    And Fill fullname input
    And Fill country input
    And Fill city input
    And Fill adress input
    And Select contact
    And Fill number input
    And Fill email input
    And Select typeOfApplication
    And Fill textOfTheApplication input
    And Fill recapture
    Then Press send button