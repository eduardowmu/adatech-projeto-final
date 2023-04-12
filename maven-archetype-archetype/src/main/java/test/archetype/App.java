package test.archetype;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.setProperty("webdriver.chrome.driver", "drive\\chromedriver.exe");
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://cps-check.com/pt/click-counter");
        driver.findElement(By.id("click-plus")).click();
        countTime(5000L);
        driver.close();
    }

    private static void countTime(Long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}