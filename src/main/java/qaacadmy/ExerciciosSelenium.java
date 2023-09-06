package qaacadmy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExerciciosSelenium {
    static WebDriver driver;
    @Test
    public void testFormularioSelenium() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@placeholder='First Name']")).sendKeys("David");
        driver.findElement(By.xpath("//*[@placeholder='Last Name']")).sendKeys("Leandro");
        driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[2]/div/textarea")).sendKeys("Av modolo, 16");
        driver.findElement(By.xpath("//*[@ng-model='EmailAdress']")).sendKeys("rosielenicao@gmail.com");
        driver.findElement(By.xpath("//*[@ng-model='Phone']")).sendKeys("15996685096");

        driver.findElement(By.xpath("//*[@ng-model='radiovalue' and @value='Male']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@ng-model='radiovalue' and @value='Male']")).isSelected());

        driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='checkbox1']")).isSelected());

    }
    @AfterClass
    public static void after()throws InterruptedException{
        Thread.sleep(3000);
        driver.quit();

    }

}