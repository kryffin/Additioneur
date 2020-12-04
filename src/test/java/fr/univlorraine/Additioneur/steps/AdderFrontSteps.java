package fr.univlorraine.Additioneur.steps;

import fr.univlorraine.Additioneur.steps.serenity.EndUserSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class AdderFrontSteps {

    @Steps
    EndUserSteps endUser;

    private float base = 0.f;
    private float number = 0.f;

    @BeforeScenario
    public void theUserIsOnTheAdderPage() {
        endUser.is_the_home_page();
    }

    @Given("a base number, for exemple $num")
    public void given_a_base_number (float num) {
        base = num;
        endUser.enters(String.valueOf(num));
        endUser.starts_set_current();
        endUser.should_be_current(base);
    }

    @When("I submit another number, for exemple $num")
    public void when_add (float num) {
        number = num;
        endUser.enters(String.valueOf(num));
    }

    @Then("I get the sum of the numbers")
    public void then_summed_up () {
        endUser.starts_add();
        endUser.should_be_reponse(base + number);
    }

    @Then("I get the substraction of the numbers")
    public void then_subbed_up () {
        endUser.starts_sub();
        endUser.should_be_reponse(base - number);
    }

    @Then("I get the timed result of the numbers")
    public void then_timed_up () {
        endUser.starts_time();
        endUser.should_be_reponse(base * number);
    }

    @Then("I get the division of the numbers")
    public void then_divided_up () {
        endUser.starts_div();
        endUser.should_be_reponse(base / number);
    }

}
