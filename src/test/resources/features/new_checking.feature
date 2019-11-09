Feature: Created a new checking
  As a user
  I want create a new checking
  
  
  Scenario Outline: Create a new checking
    Given I want create a new checking standard
    When I entry <owner_ship> <account_name> <initial_deposit>
    Then the system show a page view-checking
    Examples: 
     | owner_ship   | account_name | initial_deposit     |
     | "individual" | "Usuario"      | "25"              | 
     | "Joint"      | "UsuarioNuevo" | "100000"          |
