package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.UTestSignUpData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.JoinTodayForm;
import tasks.SignUp;
import tasks.OpenUp;

import java.util.List;


public class UTestStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than (.*) wants to access the functionalities of the UTest platform$")
    public void thanMiguelWantsToAccessTheFunctionalitiesOfTheUTestPlatform(String name) throws Exception {
        OnStage.theActorCalled(name).wasAbleTo(OpenUp.thePage(), (JoinTodayForm.onThePage()));
    }


    @When("^he successfully fills out the registration form$")
    public void heSuccessfullyFillsOutTheRegistrationForm(List<UTestSignUpData> uTestSignUpDataList) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(SignUp.the(uTestSignUpDataList.get(0).getFirstName(), uTestSignUpDataList.get(0).getLastName(), uTestSignUpDataList.get(0).getEmail(),
                uTestSignUpDataList.get(0).getMonth(), uTestSignUpDataList.get(0).getDay(), uTestSignUpDataList.get(0).getYear(), uTestSignUpDataList.get(0).getCity(),
                uTestSignUpDataList.get(0).getPostalCode(), uTestSignUpDataList.get(0).getCountry(), uTestSignUpDataList.get(0).getPassword()));

    }

    @Then("^the system will create the user that will allow him to access the platform\\.$")
    public void theSystemWillCreateTheUserThatWillAllowHimToAccessThePlatform(List<UTestSignUpData> uTestSignUpDataList) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(uTestSignUpDataList.get(0).getSuccessfulMessage())));

    }
}
