package qaacadmy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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

        driver.findElement(By.xpath("//div[@id='msdd']")).click();


        driver.findElement(By.xpath("//a[contains(text(),'Portuguese')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'English')]")).click();


        boolean linguagemPortuguesSelecionada = driver.findElement(By.xpath("//div[contains(text(),'Portuguese') and @class='ui-autocomplete-multiselect-item']")).isDisplayed();
        boolean linguagemEnglishSelecionada = driver.findElement(By.xpath("//div[contains(text(),'English') and @class='ui-autocomplete-multiselect-item']")).isDisplayed();
        Assert.assertTrue(linguagemPortuguesSelecionada && linguagemEnglishSelecionada);

        Select selectObject = new Select(driver.findElement(By.xpath("//select[@id='Skills']")));
        selectObject.selectByVisibleText("Java");

        driver.findElement(By.xpath("//body/span[1]/span[1]/span[1]")).click();
        driver.findElement(By.xpath("//li[contains(text(),'United states of America')]")).click();

        Select selectAnoAniversario = new Select( driver.findElement(By.xpath("//select[@id='yearbox']")));
        selectAnoAniversario.selectByVisibleText("1988");

        Select selectMes = new Select( driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[11]/div[2]/select[1]")));
        selectMes.selectByVisibleText("April");

        Select selectDia = new Select( driver.findElement(By.xpath("//select[@id='daybox']")));
        selectDia.selectByVisibleText("15");

        driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("Test");

        driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("Test");

        driver.findElement(By.xpath("//input[@id='submitbtn']")).click();














    }
    @AfterClass
    public static void after()throws InterruptedException{
        Thread.sleep(3000);
        driver.quit();

    }

}