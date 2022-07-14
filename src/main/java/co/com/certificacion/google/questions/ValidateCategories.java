package co.com.certificacion.google.questions;

import co.com.certificacion.google.userinterfaces.CartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateCategories implements Question {
    private String elements;

    public ValidateCategories(String elements) {
       this.elements=elements;
    }

    @Override
    public Object answeredBy(Actor actor) {


        return Text.of(CartPage.COMPROBATE_CATEGORIES.of(this.elements)).viewedBy(actor).asString();
    }

   public static ValidateCategories message(String elements){

        return new ValidateCategories(elements);
   }

}
