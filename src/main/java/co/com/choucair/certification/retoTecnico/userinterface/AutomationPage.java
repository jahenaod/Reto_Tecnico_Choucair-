package co.com.choucair.certification.retoTecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class AutomationPage extends PageObject {
    public static final Target BUTTON_JOIN_TODAY = Target.the("Button to starts the sing in").located(By.linkText("Join Today"));
    public static final Target FIRST_NAME = Target.the("Insert first name").located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("Insert last name").located(By.id("lastName"));
    public static final Target MAIL = Target.the("Insert Email").located(By.id("email"));
    public static final Target SELECT_MONTH = Target.the("Select month").located(By.xpath("//option[contains(text(),'February')]"));
    public static final Target SELECT_DAY = Target.the("Select day").located(By.xpath("//select[@id='birthDay']//*[contains(@label,'14')]"));
    public static final Target SELECT_YEAR = Target.the("Select year").located(By.xpath("//*[contains(@label,'1991')]"));
    public static final Target BUTTON_LOCATION = Target.the("Select year in box").located(By.xpath("//span[contains(text(),'Next: Location')]"));

    public static final Target BUTTON_DEVICE= Target.the("next, devices").located(By.xpath("//span[contains(text(),'Next: Devices')]"));

    public static final Target BUTTON_NEXT_STEP = Target.the("next step, last step").located(By.xpath("//span[contains(text(),'Next: Last Step')]"));

    public static final Target PASSWORD = Target.the("insert password").located(By.id("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("Confirm password").located(By.id("confirmPassword"));
    public static final Target TERMS = Target.the("Allow terms").located(By.xpath("//*[contains(@ng-class,'{error: userForm.termOfUse.$error.required}')]"));
    public static final Target POLITICS = Target.the("Allow politics").located(By.xpath("//*[contains(@ng-class,'{error: userForm.privacySetting.$error.required}')]"));

    public static final Target CHECK_USER_CREATED = Target.the("Check created user").located(By.xpath("//span[contains(text(),'Complete Setup')]"));
}
