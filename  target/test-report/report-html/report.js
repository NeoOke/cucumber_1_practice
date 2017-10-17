$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "As a user of Google Keep app, I want to login to the application",
  "description": "",
  "id": "as-a-user-of-google-keep-app,-i-want-to-login-to-the-application",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6299145471,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "",
  "description": "",
  "id": "as-a-user-of-google-keep-app,-i-want-to-login-to-the-application;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I navigate to the Landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter my \"username\" and \"password\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I click on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I should login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "loginTest.i_navigate_to_the_Landing_page()"
});
formatter.result({
  "duration": 5086995083,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 12
    },
    {
      "val": "password",
      "offset": 27
    }
  ],
  "location": "loginTest.i_enter_my_and(String,String)"
});
formatter.result({
  "duration": 6775706674,
  "status": "passed"
});
formatter.match({
  "location": "loginTest.i_click_on_the_login_button()"
});
formatter.result({
  "duration": 56035,
  "status": "passed"
});
formatter.match({
  "location": "loginTest.i_should_login_successfully()"
});
formatter.result({
  "duration": 834543171,
  "status": "passed"
});
formatter.after({
  "duration": 24462,
  "status": "passed"
});
});