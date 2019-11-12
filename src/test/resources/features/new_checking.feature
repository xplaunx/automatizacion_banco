@NewChecking
Feature: Created a new checking valid
  As a user
  I want create a new checking
  
  
   Scenario Outline: Create a new checking standard valid
   Given I am in the new checking page
   When i entry <account_type> <owner_ship> <account_name> <initial_deposit>
   Then the system show a page view-checking <account_name> <initial_deposit>
   
   Examples:
  | account_type | owner_ship   | account_name   | initial_deposit |
  | "standard"   | "individual" | "Teresa Eras"  | "25.01"          |
  | "standard"   | "Joint"      | "Reinel Dias"  | "50000.00"         |
  | "interest"   | "individual" | "Teresa Luian"  | "9999999999.00"    |
  | "interest"   | "Joint"      | "Reinel Casa"  | "25.00"         |
  
  
   
   
