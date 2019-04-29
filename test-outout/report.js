$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/shubham.kumar/workspace/com.learnautomation.cucumber/features/MyApplication.feature");
formatter.feature({
  "line": 3,
  "name": "Title of your feature",
  "description": "I want to use this template for my feature file",
  "id": "title-of-your-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 7,
  "name": "Test netstorm smoke scenario",
  "description": "",
  "id": "title-of-your-feature;test-netstorm-smoke-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Open chrome and start application",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I enter valid \"username\" and valid \"password\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User should able login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "SmokeTest.open_chrome_and_start_application()"
});
formatter.result({
  "duration": 5555066200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 15
    },
    {
      "val": "password",
      "offset": 36
    }
  ],
  "location": "SmokeTest.i_enter_valid_and_valid(String,String)"
});
formatter.result({
  "duration": 22841250400,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.user_should_able_login_successfully()"
});
formatter.result({
  "duration": 2149978600,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 11,
      "value": "#Then Click on Home icon"
    },
    {
      "line": 12,
      "value": "#Then open NDConfig UI"
    },
    {
      "line": 13,
      "value": "#Then Click on import topologies option"
    },
    {
      "line": 14,
      "value": "#Then Select drop down option in topology"
    }
  ],
  "line": 17,
  "name": "open config UI",
  "description": "",
  "id": "title-of-your-feature;open-config-ui",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "Click on Home icon",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "open NDConfig UI",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Click on import topologies option",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Select drop down option in topology",
  "keyword": "Then "
});
formatter.match({
  "location": "SmokeTest.click_on_Home_icon()"
});
formatter.result({
  "duration": 1104100,
  "error_message": "java.lang.NullPointerException\r\n\tat stepDefination.SmokeTest.click_on_Home_icon(SmokeTest.java:52)\r\n\tat ✽.Given Click on Home icon(C:/Users/shubham.kumar/workspace/com.learnautomation.cucumber/features/MyApplication.feature:19)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "SmokeTest.open_NDConfig_UI()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SmokeTest.click_on_import_topologies_option()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SmokeTest.select_drop_down_option_in_topology()"
});
formatter.result({
  "status": "skipped"
});
});