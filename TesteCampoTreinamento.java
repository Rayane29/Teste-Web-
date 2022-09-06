package teste;

import java.awt.dnd.DropTargetAdapter;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.dynamic.loading.ClassInjector.UsingInstrumentation.Target;

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
	public void deveinteragirComTextArea() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rayane\\Documents\\drivers\\chromeDriver\\chromedriver.exe");
		ChromeDriver navegador =  new ChromeDriver();
		navegador.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		navegador.findElement(By.id("elementosForm:sugestoes")).sendKeys("meu primeiro teste");   
Assert.assertEquals("meu primeiro teste",navegador.findElement(By.id("elementosForm:sugestoes")).getAttribute("value"));
	
	navegador.quit();
	}

	
	@Test
	public void deveinteragirRadioButton() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rayane\\Documents\\drivers\\chromeDriver\\chromedriver.exe");
		ChromeDriver navegador =  new ChromeDriver();
		navegador.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		navegador.findElement(By.id("elementosForm:sexo:1")).click();
		Assert.assertTrue(navegador.findElement(By.id("elementosForm:sexo:1")).isSelected());
		
		navegador.quit();
	}

	@Test
	public void deveinteragirComCheckbok() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rayane\\Documents\\drivers\\chromeDriver\\chromedriver.exe");
	     ChromeDriver navegador =  new ChromeDriver();
		navegador.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		navegador.findElement(By.id("elementosForm:comidaFavorita:0")).click();
		Assert.assertTrue(navegador.findElement(By.id("elementosForm:comidaFavorita:0")).isSelected());
		navegador.quit();
		
	}	
	
	  @Test
	  
	public void deveinteragirComCombo() {
		  System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Rayane\\Documents\\drivers\\chromeDriver\\chromedriver.exe");
		  ChromeDriver navegador =  new ChromeDriver();
			navegador.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
			WebElement element = navegador.findElement(By.id("elementosForm:escolaridade"));
            Select combo = new Select(element);
            combo.selectByIndex(3);
			navegador.quit();
	  } 
	 
	@Test
	  
		public void deveVerificarValoresCombo() {
			  System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Rayane\\Documents\\drivers\\chromeDriver\\chromedriver.exe");
			  ChromeDriver navegador =  new ChromeDriver();
				navegador.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
				WebElement element = navegador.findElement(By.id("elementosForm:escolaridade"));
			  Select combo = new Select(element);
		    List<WebElement> options = combo.getOptions();
		    Assert.assertEquals(8, options.size());
		  
		 
		    boolean encontrou = false;
		    for(WebElement option: options) {
		    	if(option.getText().equals("Mestrado")) {
		    		encontrou = true;
		    		break;
		    		
		    	}
		    }
	Assert.assertTrue(encontrou);  }
	

	
@Test    
   public void deveVerificarValoresComboMultiplo() {
		  System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Rayane\\Documents\\drivers\\chromeDriver\\chromedriver.exe");
		  ChromeDriver navegador =  new ChromeDriver();
			navegador.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
			WebElement element = navegador.findElement(By.id("elementosForm:esportes"));
		  Select combo = new Select(element);
		  combo.selectByVisibleText("Natacao");
		  combo.selectByVisibleText("Corrida") ;
		  combo.selectByVisibleText("O que eh esporte?");
	    
		List<WebElement> allSelectedOptions = combo.getAllSelectedOptions();
       Assert.assertEquals(3, allSelectedOptions.size());
	      navegador.quit();
}

@Test

public void deveInteragirComBotoes() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Rayane\\Documents\\drivers\\chromeDriver\\chromedriver.exe");
	ChromeDriver navegador = new ChromeDriver();
	navegador.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
	WebElement botao = navegador.findElement(By.id("buttonSimple"));
	botao.click();

	Assert.assertEquals("Obrigado!", botao.getAttribute("value"));

}
	
}