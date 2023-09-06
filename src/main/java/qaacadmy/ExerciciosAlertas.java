package qaacadmy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ExerciciosAlertas {
    WebDriver driver;
    @Before
    public void iniciaTeste(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.automationtesting.in/Alerts.html");

    }

@Test
    public void testesAlertaSimples() throws InterruptedException {
        driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
        Alert alert = driver.switchTo().alert();
        String mensagemAlerta = alert.getText();
        String mensagemEsperada = "I am an alert box!";
        Thread.sleep(2000);
        alert.accept();
    Assert.assertEquals(mensagemEsperada, mensagemAlerta );

    }
    @Test
    public void testesAlertaComOkCancela() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        Alert alert = driver.switchTo().alert();
        String mensagemAlerta = alert.getText();
        String mensagemEsperada = "press a Button !";
        Thread.sleep(2000);
        alert.dismiss();
        Assert.assertEquals(mensagemEsperada, mensagemAlerta );

    }
    @Test
    public void testesAlertaComPrompt() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'Alert with Testbox)]")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("QA Academy | Formaçao em automatizaçao de testes web");
        Thread.sleep(5000);
        alert.accept();

    }
    @After
    public  void after(){
        driver.quit();
    }
    }