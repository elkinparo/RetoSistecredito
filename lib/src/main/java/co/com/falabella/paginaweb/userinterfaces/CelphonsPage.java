package co.com.falabella.paginaweb.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class CelphonsPage {
	
	
	public static final Target Select_Celphon = Target.the("selecionar Celular").located(By.xpath("//img[@id='testId-pod-image-9722708']"));
	public static final Target Add_Bag = Target.the("agregar bolsa").located(By.xpath("//button[contains(text(),'Agregar a la Bolsa')]"));
	public static final Target view_bag = Target.the("ver bolsa").located(By.xpath("//a[@id='linkButton']"));
	
}
