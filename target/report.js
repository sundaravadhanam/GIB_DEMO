$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/TransferServiceEnabling.feature");
formatter.feature({
  "name": "Enabling the Transfer service for a Account",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Negative Scenario without filling the Mandatory field",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Negative"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Login into the Admin portal",
  "rows": [
    {
      "cells": [
        "300217",
        "525452"
      ]
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "TransferServiceEnable.login_into_the_Admin_portal(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the authenticate button",
  "keyword": "And "
});
formatter.match({
  "location": "TransferServiceEnable.click_on_the_authenticate_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to the Customer Master",
  "keyword": "When "
});
formatter.match({
  "location": "TransferServiceEnable.navigate_to_the_Customer_Master()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search for the ECORP and Select",
  "keyword": "And "
});
formatter.match({
  "location": "TransferServiceEnable.search_for_the_ECORP_and_Select()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Edit and Enable the transfer service in the Product service",
  "keyword": "And "
});
formatter.match({
  "location": "TransferServiceEnable.edit_and_Enable_the_transfer_service_in_the_Product_service()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Do not enter the mandatory fields and submit",
  "keyword": "Then "
});
formatter.match({
  "location": "TransferServiceEnable.do_not_enter_the_mandatory_fields_and_submit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the outcome",
  "keyword": "And "
});
formatter.match({
  "location": "TransferServiceEnable.validate_the_outcome()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});