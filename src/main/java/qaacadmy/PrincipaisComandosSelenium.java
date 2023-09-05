package qaacadmy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class PrincipaisComandosSelenium {

   @Test
    public void testSeleniumClick() throws InterruptedException{

       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();//abrir o browser
       driver.get("https://www.qaacademy.com.br/");
       Thread.sleep(3000);
       driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/button[1]")).click();
       Thread.sleep(1000);
       driver.findElement(By.xpath("//*[@placeholder='Nome']")).click();
      driver.findElement(By.xpath("//*[@placeholder='Nome']")).sendKeys("flavio dias");
      driver.findElement(By.xpath("//*[@placeholder='Email']")).click();
      driver.findElement(By.xpath("//*[@placeholder='Email']")).sendKeys("qaacademybr@gmail.com");
      driver.findElement(By.xpath("//*[@id='comp-k37gdiro']/button]")).click();
   }
}
