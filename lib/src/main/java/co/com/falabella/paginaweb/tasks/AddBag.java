package co.com.falabella.paginaweb.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.falabella.paginaweb.userinterfaces.CelphonsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AddBag implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(CelphonsPage.Add_Bag));
		actor.attemptsTo(Click.on(CelphonsPage.view_bag));
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static AddBag on() {
		// TODO Auto-generated method stub
		return instrumented(AddBag.class);
	}

}
