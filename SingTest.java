package teste;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class SingTest {
 @Test
 public void testFazerLogin() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rayane\\Documents\\drivers\\chromeDriver\\chromedriver.exe");
	WebDriver navegador = new ChromeDriver();
	navegador.get("https://www.google.com.br");
	Assert.assertEquals("Google" , navegador.getTitle());
	navegador.quit();
	
 }
 }

 
