import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCommandsExample {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\3rd Year\\3152-Software Quality Assurance\\TestApp\\src\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // 3. Open a webpage
        driver.get("https://vle.fas.vau.ac.lk/login/index.php");
        System.out.println("Opened VLE website");

        // 4. Maximize the browser window
        driver.manage().window().maximize();

        // 5. Get and print the page title
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);

        // 6. Get and print the current URL
        String url = driver.getCurrentUrl();
        System.out.println("Current URL: " + url);

        // 7. Navigate to another page (example: Google)
        driver.navigate().to("https://www.google.com");
        System.out.println("Navigated to Google");

        Thread.sleep(3000); 

        // 8. Go back to the previous page
        driver.navigate().back();
        System.out.println("Navigated back to VLE");

        Thread.sleep(3000);

        // 9. Close current tab
        driver.close();  

        // 10. Quit the browser (if multiple windows)
        // driver.quit(); // closes all windows (optional here)
    }
}
