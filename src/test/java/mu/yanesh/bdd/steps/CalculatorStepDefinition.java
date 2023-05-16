package mu.yanesh.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mu.yanesh.bdd.calculator.Calculator;

import static org.junit.Assert.assertEquals;

public class CalculatorStepDefinition {

    Calculator calculator = new Calculator();
    Integer result;
    @Given("I have a calculator")
    public void i_have_a_calculator() {
        calculator = new Calculator();
    }
    @When("I add {int} and {int}")
    public void i_add_and(Integer value1, Integer value2) {
        result = calculator.add(value1, value2);
    }
    @Then("I should get {int}")
    public void i_should_get(Integer value3) {
        assertEquals(result, value3);
    }
}
