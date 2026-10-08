import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;


public class LocatorsDemo {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\path\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.automationtesting.in/Register.html");

        // I. ID
        driver.findElement(By.id("firstname")).sendKeys("Shalini");

        // II. Name
        driver.findElement(By.name("lastname")).sendKeys("Wanasinghe");

        // III. Class Name
        driver.findElement(By.className("btn-primary")).click();

        // IV. Tag Name
        int inputCount = driver.findElements(By.tagName("input")).size();
        System.out.println("Total <input> tags = " + inputCount);

        // V. Link Text
        driver.findElement(By.linkText("Practice")).click();

        driver.navigate().back();

        // VI. Partial Link Text
        driver.findElement(By.partialLinkText("Test")).click();

        driver.navigate().back();

        // VII. CSS Selector
        driver.findElement(By.cssSelector("input[type='email']")).sendKeys("test@gmail.com");

        // VIII. XPath
        driver.findElement(By.xpath("//input[@value='FeMale']")).click();

        driver.quit();
    }
}
