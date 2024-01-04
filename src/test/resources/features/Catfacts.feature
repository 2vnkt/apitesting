@fast
Feature: Cat Facts API
  I want to use this template for my feature file

  Scenario: Get Cat Facts
    Given Cat Facts API is Active
    When I Call Get Cat Facts API
    Then I see response has 200 status code car api
    And I validate Cat Facts List

