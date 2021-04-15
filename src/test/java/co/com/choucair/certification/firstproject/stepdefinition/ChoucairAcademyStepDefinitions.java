package co.com.choucair.certification.firstproject.stepdefinition;

import co.com.choucair.certification.firstproject.model.AcademyChoucairData;
import co.com.choucair.certification.firstproject.tasks.Login;
import co.com.choucair.certification.firstproject.tasks.OpenUp;
import co.com.choucair.certification.firstproject.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import co.com.choucair.certification.firstproject.questions.Answer;

import java.util.List;

public class ChoucairAcademyStepDefinitions {
    @Before
    public void SetStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^than brandon wants to learn automation at the academy Choucair$")
    public void thanBrandonWantsToLearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData> academyChoucairData) throws Exception{
        OnStage.theActorCalled(requiredActor:"Brandon").wasAbleto(OpenUp.thePage(),(Login.onThePage()));
    }
    @When("^he search for the course(.*) Recursos Automatizacion Bancolombia on the choucair academy plataform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlataform(List<AcademyChoucairData> academyChoucairData) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));

    }
    @Then("^he finds course called resources (.*)$")
    public void heFindsCourseCalledResourcesRecursosAutomatizacionBancolombia(List<AcademyChoucairData> academyChoucairData) throws Exception{
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrCourse())));

    }
}
