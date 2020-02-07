package com.neoris.screenplay.stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class InicioSesionStepDefinition {

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) quiere autenticarse$")
    public void productorQuiereAutenticarse() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^Productor se autentica$")
    public void productorSeAutentica() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("Productor debe ver la pagina de inicio")
    public void productorDebeVerLaPaginaDeInicio() {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
    }
}

