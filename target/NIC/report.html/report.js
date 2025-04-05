$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/NICInsurance.feature");
formatter.feature({
  "name": "National Insurance Application",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Launch Application",
  "description": "",
  "keyword": "Background"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launch insurance application \"https://nicportal.nic.co.in/nicportal/signin/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "in.stepdefinition.NicPolicy.user_launch_insurance_application(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the guest login",
  "keyword": "When "
});
formatter.match({
  "location": "in.stepdefinition.NicPolicy.user_select_the_guest_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user close the instruction popup",
  "keyword": "Then "
});
formatter.match({
  "location": "in.stepdefinition.NicPolicy.user_close_the_instruction_popup()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify user able to buy two wheeler insurance policy",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "user click check premium of two wheeler policy",
  "keyword": "When "
});
formatter.match({
  "location": "in.stepdefinition.NicPolicy.user_click_check_premium_of_two_wheeler_policy()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fills out the application form with valid details",
  "keyword": "Then "
});
formatter.match({
  "location": "in.stepdefinition.NicPolicy.user_fills_out_the_application_form_with_valid_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click policy quotation",
  "keyword": "And "
});
formatter.match({
  "location": "in.stepdefinition.NicPolicy.user_click_policy_quotation()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "To verify user able to apply private car insurance policy",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user click cashless guarage",
  "keyword": "When "
});
formatter.step({
  "name": "user search the products in search bar  \"\u003csearch\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user click the products",
  "keyword": "And "
});
formatter.step({
  "name": "user select claim procedure",
  "keyword": "And "
});
formatter.step({
  "name": "user scrolldown in claim procedure",
  "keyword": "Then "
});
formatter.step({
  "name": "user select the list of cashless garage",
  "keyword": "And "
});
formatter.step({
  "name": "user download list of service center",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "search"
      ]
    },
    {
      "cells": [
        "private car"
      ]
    }
  ]
});
formatter.background({
  "name": "Launch Application",
  "description": "",
  "keyword": "Background"
});
formatter.embedding("image/png", "embedded2.png", null);
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launch insurance application \"https://nicportal.nic.co.in/nicportal/signin/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "in.stepdefinition.NicPolicy.user_launch_insurance_application(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the guest login",
  "keyword": "When "
});
formatter.match({
  "location": "in.stepdefinition.NicPolicy.user_select_the_guest_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user close the instruction popup",
  "keyword": "Then "
});
formatter.match({
  "location": "in.stepdefinition.NicPolicy.user_close_the_instruction_popup()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify user able to apply private car insurance policy",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user click cashless guarage",
  "keyword": "When "
});
formatter.match({
  "location": "in.stepdefinition.NicPolicy.user_click_cashless_guarage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user search the products in search bar  \"private car\"",
  "keyword": "And "
});
formatter.match({
  "location": "in.stepdefinition.NicPolicy.user_search_the_products_in_search_bar(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the products",
  "keyword": "And "
});
formatter.match({
  "location": "in.stepdefinition.NicPolicy.user_click_the_products()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select claim procedure",
  "keyword": "And "
});
formatter.match({
  "location": "in.stepdefinition.NicPolicy.user_select_claim_procedure()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user scrolldown in claim procedure",
  "keyword": "Then "
});
formatter.match({
  "location": "in.stepdefinition.NicPolicy.user_scrolldown_in_claim_procedure()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the list of cashless garage",
  "keyword": "And "
});
formatter.match({
  "location": "in.stepdefinition.NicPolicy.user_select_the_list_of_cashless_garage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user download list of service center",
  "keyword": "And "
});
formatter.match({
  "location": "in.stepdefinition.NicPolicy.user_download_list_of_service_center()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png", null);
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "Launch Application",
  "description": "",
  "keyword": "Background"
});
formatter.embedding("image/png", "embedded4.png", null);
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launch insurance application \"https://nicportal.nic.co.in/nicportal/signin/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "in.stepdefinition.NicPolicy.user_launch_insurance_application(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the guest login",
  "keyword": "When "
});
formatter.match({
  "location": "in.stepdefinition.NicPolicy.user_select_the_guest_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user close the instruction popup",
  "keyword": "Then "
});
formatter.match({
  "location": "in.stepdefinition.NicPolicy.user_close_the_instruction_popup()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify user able to download policy details in national mediclaim insurance",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "user select the products",
  "keyword": "When "
});
formatter.match({
  "location": "in.stepdefinition.NicPolicy.user_select_the_products()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click health insurance",
  "keyword": "Then "
});
formatter.match({
  "location": "in.stepdefinition.NicPolicy.user_click_health_insurance()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select national mediclaim policy",
  "keyword": "And "
});
formatter.match({
  "location": "in.stepdefinition.NicPolicy.user_select_national_mediclaim_policy()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click download options",
  "keyword": "And "
});
formatter.match({
  "location": "in.stepdefinition.NicPolicy.user_click_download_options()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the policy details",
  "keyword": "And "
});
formatter.match({
  "location": "in.stepdefinition.NicPolicy.user_select_the_policy_details()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded5.png", null);
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "Launch Application",
  "description": "",
  "keyword": "Background"
});
formatter.embedding("image/png", "embedded6.png", null);
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launch insurance application \"https://nicportal.nic.co.in/nicportal/signin/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "in.stepdefinition.NicPolicy.user_launch_insurance_application(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the guest login",
  "keyword": "When "
});
formatter.match({
  "location": "in.stepdefinition.NicPolicy.user_select_the_guest_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user close the instruction popup",
  "keyword": "Then "
});
formatter.match({
  "location": "in.stepdefinition.NicPolicy.user_close_the_instruction_popup()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify user able to view required documents in national overseas policy insurance",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@retesting"
    }
  ]
});
formatter.step({
  "name": "user select the products in home page",
  "keyword": "When "
});
formatter.match({
  "location": "in.stepdefinition.NicPolicy.user_select_the_products_in_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click travel insurance",
  "keyword": "Then "
});
formatter.match({
  "location": "in.stepdefinition.NicPolicy.user_click_travel_insurance()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select national overseas policy insurance",
  "keyword": "And "
});
formatter.match({
  "location": "in.stepdefinition.NicPolicy.user_select_national_overseas_policy_insurance()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click claim procedure options",
  "keyword": "And "
});
formatter.match({
  "location": "in.stepdefinition.NicPolicy.user_click_claim_procedure_options()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user scrolldown to view required documents",
  "keyword": "And "
});
formatter.match({
  "location": "in.stepdefinition.NicPolicy.user_scrolldown_to_view_required_documents()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded7.png", null);
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "Launch Application",
  "description": "",
  "keyword": "Background"
});
formatter.embedding("image/png", "embedded8.png", null);
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launch insurance application \"https://nicportal.nic.co.in/nicportal/signin/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "in.stepdefinition.NicPolicy.user_launch_insurance_application(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the guest login",
  "keyword": "When "
});
formatter.match({
  "location": "in.stepdefinition.NicPolicy.user_select_the_guest_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user close the instruction popup",
  "keyword": "Then "
});
formatter.match({
  "location": "in.stepdefinition.NicPolicy.user_close_the_instruction_popup()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify user able to download policy form in National Bharat Griha Raksha Plus policy",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@functional"
    }
  ]
});
formatter.step({
  "name": "user select the products in home",
  "keyword": "When "
});
formatter.match({
  "location": "in.stepdefinition.NicPolicy.user_select_the_products_in_home()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click home and property",
  "keyword": "Then "
});
formatter.match({
  "location": "in.stepdefinition.NicPolicy.user_click_home_and_property()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select National Bharat Griha Raksha policy",
  "keyword": "And "
});
formatter.match({
  "location": "in.stepdefinition.NicPolicy.user_select_National_Bharat_Griha_Raksha_policy()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click download function",
  "keyword": "And "
});
formatter.match({
  "location": "in.stepdefinition.NicPolicy.user_click_download_function()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the policy form",
  "keyword": "And "
});
formatter.match({
  "location": "in.stepdefinition.NicPolicy.user_select_the_policy_form()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded9.png", null);
formatter.after({
  "status": "passed"
});
});