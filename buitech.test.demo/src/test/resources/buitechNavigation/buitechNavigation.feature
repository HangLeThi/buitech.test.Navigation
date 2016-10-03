Feature: I want to test buitech website

  Background: 
    Given I am on  buitech website
    And maximize the browser

  Scenario Outline: verify click on the "<Element>" works correctly
    When I click on "<Element>"
    And the page is display with "<Title>"
    Then I close browser

    Examples: 
      | Element           | Title             |
      | /testing-services  | Testing Services  |
      | /testing-solutions | Testing Solutions |
      | /resources         | Resources         |
      | /clients           | Clients           |
      | /news              | News              |
