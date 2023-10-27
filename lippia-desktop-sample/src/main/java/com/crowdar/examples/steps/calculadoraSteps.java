package com.crowdar.examples.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.crowdar.examples.services.calculadoraServices;

public class calculadoraSteps {
    @Given("Calculadora iniciada")
    public void calculadoraValidacion(){
        calculadoraServices.calculadoraEjecutandose();
    }

    @When("^Primer numero (.*) operacion (.*) segundo numero (.*)$")
    public void accionCalculadora(String n1, String signo, String n2) {
        calculadoraServices.operaciones(n1, signo, n2);
    }

    @Then("^El resultado es (.*)$")
    public void validacionResultado(String resultado) {
        calculadoraServices.resultado(resultado);
    }



}
