package co.com.choucair.certification.retoTecnico.tasks;

import co.com.choucair.certification.retoTecnico.model.UserData;
import co.com.choucair.certification.retoTecnico.userinterface.AutomationPage;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.actions.Enter;

public class makeSignIn implements Task {

    private UserData userData;

    public makeSignIn(UserData userData){this.userData = userData;}

    public static makeSignIn information(UserData userData){
        return Tasks.instrumented(makeSignIn.class, userData);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(AutomationPage.BUTTON_JOIN_TODAY),
                Enter.theValue(userData.getStrFirstName()).into(AutomationPage.FIRST_NAME),
                Enter.theValue(userData.getStrLastName()).into(AutomationPage.LAST_NAME),
                Enter.theValue(userData.getStrMail()).into(AutomationPage.MAIL),
                Click.on(AutomationPage.SELECT_MONTH),
                Click.on(AutomationPage.SELECT_DAY),
                Click.on(AutomationPage.SELECT_YEAR),
                WaitUntil.the(AutomationPage.BUTTON_LOCATION, isVisible()).forNoMoreThan(100).seconds(),
                Click.on(AutomationPage.BUTTON_LOCATION),
                Enter.theValue("Medellin").into(AutomationPage.CITY),
                Enter.theValue("05001").into(AutomationPage.POSTAL_CODE),
                WaitUntil.the(AutomationPage.BUTTON_DEVICE, isVisible()).forNoMoreThan(100).seconds(),
                Click.on(AutomationPage.BUTTON_DEVICE),
                WaitUntil.the(AutomationPage.BUTTON_NEXT_STEP, isVisible()).forNoMoreThan(100).seconds(),
                Click.on(AutomationPage.BUTTON_NEXT_STEP),
                WaitUntil.the(AutomationPage.PASSWORD, isVisible()).forNoMoreThan(100).seconds(),
                Enter.theValue(userData.getStrPassword()).into(AutomationPage.PASSWORD),
                Enter.theValue(userData.getStrConfirmPassword()).into(AutomationPage.CONFIRM_PASSWORD),
                Click.on(AutomationPage.TERMS),
                Click.on(AutomationPage.POLITICS));
    }


}
