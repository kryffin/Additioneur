package fr.univlorraine.Additioneur.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://localhost:4200/")
public class AdderPage extends PageObject {

    @FindBy(id = "current")
    private WebElementFacade current;

    @FindBy(id = "input")
    private WebElementFacade input;

    @FindBy(id = "reponse")
    private WebElementFacade reponse;

    @FindBy(id = "setCurrent")
    private WebElementFacade setCurrent;

    @FindBy(id = "add")
    private WebElementFacade add;

    @FindBy(id = "sub")
    private WebElementFacade sub;

    @FindBy(id = "time")
    private WebElementFacade time;

    @FindBy(id = "div")
    private WebElementFacade div;

    public void enter_number(String keyword) {
        input.type(keyword);
    }

    public void press_set_current() {
        setCurrent.click();
    }

    public void press_add() {
        add.click();
    }

    public void press_sub() {
        sub.click();
    }

    public void press_time() {
        time.click();
    }

    public void press_div() {
        div.click();
    }

    public String getCurrent () {
        return current.getText();
    }

    public String getReponse () {
        return reponse.getText();
    }
}
