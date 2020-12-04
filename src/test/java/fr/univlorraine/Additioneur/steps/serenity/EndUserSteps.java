package fr.univlorraine.Additioneur.steps.serenity;

import fr.univlorraine.Additioneur.pages.AdderPage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class EndUserSteps {

    AdderPage adderPage;

    @Step
    public void enters(String number) {
        adderPage.enter_number(number);
    }

    @Step
    public void starts_set_current() {
        adderPage.press_set_current();
    }

    @Step
    public void starts_add() {
        adderPage.press_add();
    }

    @Step
    public void starts_sub() {
        adderPage.press_sub();
    }

    @Step
    public void starts_time() {
        adderPage.press_time();
    }

    @Step
    public void starts_div() {
        adderPage.press_div();
    }

    @Step
    public void should_be_current(float current) {
        assertThat(Float.parseFloat(adderPage.getCurrent()), is(current));
    }

    @Step
    public void should_be_reponse(float reponse) {
        assertThat(Float.parseFloat(adderPage.getReponse()), is(reponse));
    }

    @Step
    public void is_the_home_page() {
        adderPage.open();
    }

}
