package test.archetype;

import org.junit.Assert;
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
        driver.get("https://thetown.com.br/pt/");
        driver.close();
    }
}