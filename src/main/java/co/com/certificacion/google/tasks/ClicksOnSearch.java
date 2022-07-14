package co.com.certificacion.google.tasks;

import co.com.certificacion.google.models.Category;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;

import java.util.List;

import static co.com.certificacion.google.userinterfaces.CartPage.Insert_Info;
import static co.com.certificacion.google.userinterfaces.CartPage.LBL_PRICE;

public class ClicksOnSearch implements Task {
    private String category;

    public ClicksOnSearch(List<Category> data) {
        this.category = data.get(0).getCategory();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(this.category).into(Insert_Info));
        actor.attemptsTo(MoveMouse.to(LBL_PRICE),Click.on(LBL_PRICE));

    }
    public static ClicksOnSearch click(List<Category> data){

        return Tasks.instrumented(ClicksOnSearch.class,data);
    }
}
