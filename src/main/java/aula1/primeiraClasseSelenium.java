package aula1;

import com.google.common.annotations.VisibleForTesting;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@DisplayName("test Automatizado ")
public class primeiraClasseSelenium {
    @Test
    @DisplayName("Registrar um Novo Usuario Com Dados Validos")
    public void registrarUsuarioValido(){
        WebDriverManager.chromedriver().setup();
        WebDriver navegador = new ChromeDriver();
        navegador.get("https://www.qaacademy.com.br/");



    }
    }