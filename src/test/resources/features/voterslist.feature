Feature: Create New Voter
  Scenario: Create New Voter From Online Form
    Given Open browser and go to egov
    When Press All services1
    And Press on CentralElection
    And Press on Inclusion of data for voters list
    And Select city region
    And Select village
    And Select home
    And Fill last name input
    And Fill name input
    And Fill fathers name input
    And Select birthday
    And Select gender
    And Fill ID number input
    And Select place
    And Select ID card date
    And Select the contact
    And Fill the number input
    And Fill the email input
    And Select reason
    And Fill note input
    And Fill the recapture
    Then Click the send button

