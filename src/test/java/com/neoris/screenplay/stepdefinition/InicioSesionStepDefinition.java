package com.neoris.screenplay.stepdefinition;

import com.neoris.screenplay.model.Usuario;
import com.neoris.screenplay.task.IniciarSesion;
import com.neoris.screenplay.userinterface.InicioSesionPage;
import com.neoris.screenplay.question.LaPaginaDeInicio;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.neoris.screenplay.model.UsuarioBuilder.unUsuarioPorDefecto;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.Is.is;

public class InicioSesionStepDefinition {

    private InicioSesionPage inicioSesionPage;

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) quiere autenticarse$")
    public void productorQuiereAutenticarse(String actor) {
        theActorCalled(actor).attemptsTo(
                Open.browserOn(inicioSesionPage)
        );
    }

    @When("^Productor se autentica$")
    public void productorSeAutentica() {
        theActorInTheSpotlight().attemptsTo(
                IniciarSesion.con(unUsuarioPorDefecto()));
    }

    @Then("Productor debe ver la pagina de inicio")
    public void productorDebeVerLaPaginaDeInicio() {
        theActorInTheSpotlight().should(seeThat(LaPaginaDeInicio.esVisible()));
    }
}

