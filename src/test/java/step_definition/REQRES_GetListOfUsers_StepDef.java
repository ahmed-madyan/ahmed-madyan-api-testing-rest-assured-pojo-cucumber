package step_definition;

import page_object_model.REQRES_GetListOfUsers;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class REQRES_GetListOfUsers_StepDef {

    @Given("User invoke the users api successfully")
    public void userInvokeTheUsersApiSuccessfully() {
        REQRES_GetListOfUsers.invokeReqResGetListOfUserSuccessfully();
    }

    @Then("API response status code should be SC_OK")
    public void apiResponseStatusCodeShouldBeSC_OK() {
        REQRES_GetListOfUsers.apiResponseStatusCodeShouldBeSC_OK();
    }

    @And("API response should contain the expected list of users")
    public void apiResponseShouldContainTheExpectedListOfUsers() {
        REQRES_GetListOfUsers.assertNumberOfUsers();
    }
}
