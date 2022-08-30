package teste;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteCampoTreinamento {

	@Test
	public void testeTextfield() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rayane\\Documents\\drivers\\chromeDriver\\chromedriver.exe");
		WebDriver navegador = new ChromeDriver();
		navegador.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		navegador.findElement(By.id("elementosForm:nome")).sendKeys("Rayane");
		Assert.assertEquals("Rayane", navegador.findElement(By.id("elementosForm:nome")).getAttribute("value"));

		 navegador.quit();
	}

	@Test
	public void testeinteragirComTextArea() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rayane\\Documents\\drivers\\chromeDriver\\chromedriver.exe");
		ChromeDriver navegador =  new ChromeDriver();
		navegador.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		navegador.findElement(By.id("elementosForm:sugestoes")).sendKeys("meu primeiro teste");   
Assert.assertEquals("meu primeiro teste",navegador.findElement(By.id("elementosForm:sugestoes")).getAttribute("value"));
	
	navegador.quit();
	}

	
	@Test
	public void testeinteragirRadioButton() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rayane\\Documents\\drivers\\chromeDriver\\chromedriver.exe");
		ChromeDriver navegador =  new ChromeDriver();
		navegador.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		navegador.findElement(By.id("elementosForm:sexo:1")).click();
		
		navegador.quit();
	}	
}