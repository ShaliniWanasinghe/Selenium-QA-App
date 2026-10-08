import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class LoginExplicitWait {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://vle.fas.vau.ac.lk/login/index.php");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

        WebElement usernameField = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.id("username"))
        );
        usernameField.sendKeys("yourUsername");

        WebElement passwordField = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.id("password"))
        );
        passwordField.sendKeys("yourPassword");

        WebElement loginButton = wait.until(
            ExpectedConditions.elementToBeClickable(By.id("loginbtn"))
        );
        loginButton.click();

        driver.quit();
    }
}
