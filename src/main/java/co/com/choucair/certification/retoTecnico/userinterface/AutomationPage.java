package co.com.choucair.certification.retoTecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class AutomationPage extends PageObject {
    public static final Target BUTTON_JOIN_TODAY = Target.the("Button to starts the sing in").located(By.linkText("Join Today"));
    public static final Target FIRST_NAME = Target.the("Ingresar Nombre").located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("Ingresar Apellido").located(By.id("lastName"));
    public static final Target MAIL = Target.the("Ingresar Email").located(By.id("email"));
    public static final Target SELECT_MONTH = Target.the("Seleccionar Mes").located(By.xpath("//option[contains(text(),'February')]"));
    public static final Target SELECT_DAY = Target.the("Seleccionar Dia").located(By.xpath("//select[@id='birthDay']//*[contains(@label,'14')]"));
    public static final Target SELECT_YEAR = Target.the("Seleccionar año").located(By.xpath("//*[contains(@label,'1991')]"));
    public static final Target BUTTON_LOCATION = Target.the("Seleccionar año").located(By.xpath("//span[contains(text(),'Next: Location')]"));

    public static final Target BUTTON_DEVICE= Target.the("Siguiente Dispositivos").located(By.xpath("//span[contains(text(),'Next: Devices')]"));

    public static final Target BUTTON_NEXT_STEP = Target.the("Siguiente ultimo Paso").located(By.xpath("//span[contains(text(),'Next: Last Step')]"));

    public static final Target PASSWORD = Target.the("Campo ingresar clave").located(By.id("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("Campo confirmar clave").located(By.id("confirmPassword"));
    public static final Target TERMS = Target.the("Aceptar terminos").located(By.xpath("//*[contains(@ng-class,'{error: userForm.termOfUse.$error.required}')]"));
    public static final Target POLITICS = Target.the("Aceptar politicas").located(By.xpath("//*[contains(@ng-class,'{error: userForm.privacySetting.$error.required}')]"));

    public static final Target CHECK_USER_CREATED = Target.the("Validar Creacion Usuario").located(By.xpath("//span[contains(text(),'Complete Setup')]"));
}
