package qaacadmy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class PrincipaisComandoSelenium {

   @Test
    public void testSeleniumClick(){
       WebDriverManager.chromedriver().setup();
       WebDriver navegador = new ChromeDriver();//abrir o browser
       navegador.get("https://www.qaacademy.com.br/");
       navegador.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/button[1]")).click();
       navegador.findElement(By.xpath("//*[@id='img_1_comp-k0wqferu']/img")).click();
   }
}
