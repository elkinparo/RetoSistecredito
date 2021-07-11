package co.com.falabella.paginaweb.stepdefinitions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.falabella.paginaweb.userinterfaces.PickUpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class PickUP implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(PickUpPage.select_retirar));
		actor.attemptsTo(Click.on(PickUpPage.select_tienda));
		actor.attemptsTo(Click.on(PickUpPage.Btn_continuar));
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static PickUP on() {
		// TODO Auto-generated method stub
		return instrumented(PickUP.class);
	}

}
