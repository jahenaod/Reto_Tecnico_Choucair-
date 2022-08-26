package co.com.choucair.certification.retoTecnico.stepdefinitions;

import co.com.choucair.certification.retoTecnico.model.UserData;
import co.com.choucair.certification.retoTecnico.questions.checkCreatedUser;
import co.com.choucair.certification.retoTecnico.tasks.OpenUp;
import co.com.choucair.certification.retoTecnico.tasks.makeSignIn;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static org.seleniumhq.jetty9.security.UserDataConstraint.get;

public class StepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Juan Wants to register on Utest website$")
    public void juanWantsToRegisterOnUtestWebsite() throws Exception {
        OnStage.theActorCalled("Juan").wasAbleTo(OpenUp.thePage());
    }


    @When("^He register on Utest with his personal data$")
    public void heRegisterOnUtestWithHisPersonalData(List<UserData> userData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(makeSignIn.information(userData.get(0)));

    }

    @Then("^He reads the welcome message of Utest$")
    public void heReadsTheWelcomeMessageOfUtest(String validation) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(checkCreatedUser.createdUser(), org.hamcrest.Matchers.containsString(validation)));
    }

}
