package co.com.choucair.certification.retoTecnico.questions;

import co.com.choucair.certification.retoTecnico.userinterface.AutomationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

    public class checkCreatedUser implements Question<String> {

        public static checkCreatedUser createdUser(){
        return new checkCreatedUser();
        }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(AutomationPage.CHECK_USER_CREATED).viewedBy(actor).asString();
    }

}
