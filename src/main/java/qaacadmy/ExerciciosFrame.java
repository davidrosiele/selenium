package qaacadmy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ExerciciosFrame {
    WebDriver driver;
    @Before
    public void iniciaTeste(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.automationtesting.in/Frames.html");
}
@Test

    public void testeIframesSimples() {
     driver.switchTo().frame("singleframe");
     driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Teste QA Academy");
     driver.switchTo().defaultContent();

}
    @After
    public  void after(){

        driver.quit();
    }
}