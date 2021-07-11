package co.com.falabella.paginaweb.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.falabella.paginaweb.userinterfaces.CategoryFalabella;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class GoTo  implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(CategoryFalabella.Close_Popup1));
		actor.attemptsTo(Click.on(CategoryFalabella.Falabella_Category));
		actor.attemptsTo(Click.on(CategoryFalabella.Venta_Rapida));
		actor.attemptsTo(Click.on(CategoryFalabella.Celulares));
		
		
	}

	public static GoTo theApp() {
		// TODO Auto-generated method stub
		return instrumented(GoTo.class);
	}
	

}
