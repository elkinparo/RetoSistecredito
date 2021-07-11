package co.com.falabella.paginaweb.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;


import co.com.falabella.paginaweb.userinterfaces.CelphonsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SelectProduct implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(CelphonsPage.Select_Celphon));
		
	}

	public static SelectProduct on() {
		// TODO Auto-generated method stub
		return instrumented(SelectProduct.class);
	}
	

}
