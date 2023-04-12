package test.archetype;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        System.setProperty("webdriver.chrome.driver", "drive\\chromedriver.exe");
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://thetown.com.br/pt/");
        Assert.assertTrue(driver.getCurrentUrl().equals("https://thetown.com.br/pt/"));
        driver.close();
    }
}
