package co.com.falabella.paginaweb.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class PickUpPage {
	public static final Target select_retirar = Target.the("seleccionar retirar tu compra").located(By.xpath("//h3[contains(text(),'Retira tu compra')]"));
	public static final Target select_tienda = Target.the("seleccionar tienda").located(By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/ul[1]/li[1]/div[2]/div[2]/button[1]"));
	public static final Target Btn_continuar = Target.the("seleccionar boton continuar").located(By.xpath("//button[contains(text(),'Continuar')]"));
}
