package co.com.falabella.paginaweb.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class CategoryFalabella {
///testId-ThirdLevelMenu-link
	public static final Target Falabella_Category = Target.the("Boton Categorias").located(By.id("testId-HamburgerBtn-toggle"));
	public static final Target Venta_Rapida = Target.the("Boton venta rapida").located(By.className("TaxonomyDesktop-module_menuItem__1kemb"));
	public static final Target Close_Popup1 = Target.the("Cerrar primer mensaje").located(By.id("fake-close"));
	public static final Target Celulares = Target.the("Celulares").located(By.xpath("//a[contains(text(),'Celulares')]"));

}
