package test.archetype;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
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
        driver.get("https://cps-check.com/pt/click-counter");
        this.clickButton1000X(driver);
        String cliques = driver.findElement(By.id("count")).getAttribute("value");
        driver.close();
        Assert.assertTrue(cliques.equals("10"));
    }

    private void clickButton1000X(ChromeDriver driver) {
        for(int i = 0; i < 10; i++) {
            driver.findElement(By.id("click-plus")).click();
        }
    }
}
