package co.com.certificacion.google.questions;

import co.com.certificacion.google.userinterfaces.CartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.Queue;

public class ValidateMessageCriteria implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(CartPage.TXT_Criteria).viewedBy(actor).asString();
    }

   public static ValidateMessageCriteria message(){
        return new ValidateMessageCriteria();
   }

}
