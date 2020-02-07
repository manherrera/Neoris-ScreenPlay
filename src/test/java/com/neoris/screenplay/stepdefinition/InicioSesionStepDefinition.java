package com.neoris.screenplay.stepdefinition;

import com.neoris.screenplay.exception.AutenticacionFallidaError;
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
    public void QuiereAutenticarse(String actor) {
        theActorCalled(actor).attemptsTo(
                Open.browserOn(inicioSesionPage)
        );
    }

    @When("^[a-z,A-Z]{1,50} se autentica$")
    public void SeAutentica() {
        theActorInTheSpotlight().attemptsTo(
                IniciarSesion.con(unUsuarioPorDefecto()));
    }

    @Then("^[a-z,A-Z]{1,50} debe ver la pagina de inicio$")
    public void DebeVerLaPaginaDeInicio() {
        theActorInTheSpotlight().should(seeThat(LaPaginaDeInicio.esVisible())
                .orComplainWith(AutenticacionFallidaError.class, "authentication failed"));
    }
}

