package co.com.falabella.paginaweb.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.falabella.paginaweb.userinterfaces.FalabellaHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;;

public class OpenTheBrowser implements Task {

	@Override
	@Step("{0} opens the browser on falabella home page")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(new FalabellaHomePage()));
		
	}

	public static OpenTheBrowser on() {
		
		//return new OpenTheBrowser();
		return instrumented(OpenTheBrowser.class);
	}

}
