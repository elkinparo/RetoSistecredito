package co.com.falabella.paginaweb.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class HomePay {
	public static final Target Go_Pay = Target.the("Boton ir a comprar").located(By.xpath("//body/div[1]/main[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[2]/div[2]/button[1]"));
	public static final Target Select_departamentos = Target.the("seleccionar departamento").located(By.xpath("//select[@id='region']"));
	public static final Target Select_departamento = Target.the("seleccionar antioquia").located(By.xpath("//body/div[3]/div[1]/div[2]/div[1]/section[1]/section[1]/form[1]/div[1]/div[1]/div[1]/div[1]/select[1]/option[2]"));
	public static final Target Select_ciudades = Target.the("seleccionar ciudades").located(By.xpath("//select[@id='ciudad']"));
	public static final Target Select_ciudad = Target.the("seleccionar medellin").located(By.xpath("//option[contains(text(),'MEDELLIN')]"));
	public static final Target Select_Barrios = Target.the("seleccionar Barrios").located(By.xpath("//select[@id='comuna']"));
	public static final Target Select_Barrio = Target.the("seleccionar medellin").located(By.xpath("//body/div[3]/div[1]/div[2]/div[1]/section[1]/section[1]/form[1]/div[1]/div[3]/div[1]/div[1]/select[1]/option[2]"));
	public static final Target Btn_continuar = Target.the("boton continuar").located(By.xpath("//body/div[3]/div[1]/div[2]/div[1]/section[1]/section[1]/form[1]/div[1]/div[4]/div[1]/button[1]"));
}
