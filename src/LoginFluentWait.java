import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import java.time.Duration;
import java.util.function.Function;
import org.openqa.selenium.NoSuchElementException;

public class LoginFluentWait {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://vle.fas.vau.ac.lk/login/index.php");

        FluentWait<WebDriver> wait = new FluentWait<>(driver)
            .withTimeout(Duration.ofSeconds(20))
            .pollingEvery(Duration.ofSeconds(2))
            .ignoring(NoSuchElementException.class);

        WebElement usernameField = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.id("username"));
            }
        });
        usernameField.sendKeys("yourUsername");

        WebElement passwordField = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.id("password"));
            }
        });
        passwordField.sendKeys("yourPassword");

        WebElement loginButton = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                WebElement btn = driver.findElement(By.id("loginbtn"));
                if (btn.isEnabled()) {
                    return btn;
                }
                return null;
            }
        });
        loginButton.click();

        driver.quit();
    }
}
