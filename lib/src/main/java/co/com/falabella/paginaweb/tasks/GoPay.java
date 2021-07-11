package co.com.falabella.paginaweb.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.falabella.paginaweb.userinterfaces.HomePay;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class GoPay implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(HomePay.Go_Pay));
		actor.attemptsTo(Click.on(HomePay.Select_departamentos));
		actor.attemptsTo(Click.on(HomePay.Select_departamento));
		actor.attemptsTo(Click.on(HomePay.Select_ciudades));
		actor.attemptsTo(Click.on(HomePay.Select_ciudad));
		actor.attemptsTo(Click.on(HomePay.Select_Barrios));
		actor.attemptsTo(Click.on(HomePay.Select_Barrio));
		actor.attemptsTo(Click.on(HomePay.Btn_continuar));
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static GoPay on() {
		// TODO Auto-generated method stub
		return instrumented(GoPay.class);
	}

}
