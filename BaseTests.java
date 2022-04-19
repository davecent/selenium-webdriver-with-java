package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

import java.util.List;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        // Exercise for Chapter 3
        WebElement shiftingContentLink = driver.findElement(By.linkText("Shifting Content"));
        shiftingContentLink.click();
        System.out.println(driver.getTitle());
        WebElement menuElementLink = driver.findElement(By.linkText("Example 1: Menu Element"));
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        driver.quit();
    }

 public static void main(String args[]) {
        BaseTests test = new BaseTests();
        test.setUp();
 }
    }
