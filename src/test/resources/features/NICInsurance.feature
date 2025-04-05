Feature: National Insurance Application

  Background: Launch Application
    Given user launch insurance application "https://nicportal.nic.co.in/nicportal/signin/login"
    When user select the guest login
    Then user close the instruction popup
    
@sanity   
  Scenario: To verify user able to buy two wheeler insurance policy
    When user click check premium of two wheeler policy
    Then user fills out the application form with valid details
    And user click policy quotation

@smoke
  Scenario Outline: To verify user able to apply private car insurance policy 
    When user click cashless guarage
    And user search the products in search bar  "<search>"
    And user click the products
    And user select claim procedure
    Then user scrolldown in claim procedure
    And user select the list of cashless garage
    And user download list of service center

    Examples: 
      | search      |
      | private car |

@regression
  Scenario: To verify user able to download policy details in national mediclaim insurance
    When user select the products
    Then user click health insurance
    And user select national mediclaim policy
    And user click download options
    And user select the policy details

@retesting
  Scenario: To verify user able to view required documents in national overseas policy insurance
    When user select the products in home page
    Then user click travel insurance
    And user select national overseas policy insurance
    And user click claim procedure options
    And user scrolldown to view required documents

@functional
  Scenario: To verify user able to download policy form in National Bharat Griha Raksha Plus policy
    When user select the products in home
    Then user click home and property
    And user select National Bharat Griha Raksha policy
    And user click download function
    And user select the policy form
