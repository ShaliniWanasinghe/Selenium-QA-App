import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

class TestResult {
    String id, scenario, testCase, preCond, steps, data, expected, actual, status;
    TestResult(String id, String scenario, String testCase, String preCond, String steps,
               String data, String expected, String actual, String status) {
        this.id = id;
        this.scenario = scenario;
        this.testCase = testCase;
        this.preCond = preCond;
        this.steps = steps;
        this.data = data;
        this.expected = expected;
        this.actual = actual;
        this.status = status;
    }
}

public class LoginTestRunner {

    static WebDriver driver;
    static List<TestResult> results = new ArrayList<>();

    public static void main(String[] args) throws Exception {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\3rd Year\\3152-Software Quality Assurance\\TestApp\\src\\drivers\\chromedriver.exe"); // path to driver
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        testLogin("validUser", "wrongPass", "TC01");
        testLogin("validUser", "validPass", "TC02");
        testLogin("wrongUser", "wrongPass", "TC03");
        testLogin("wrongUser", "validPass", "TC04");

        driver.quit();
        generatePDF();

        System.out.println("Test Execution Completed & PDF Generated");
    }

    public static void testLogin(String username, String password, String tcID) {
        try {
            driver.get("https://vle.fas.vau.ac.lk/login/index.php");

            String scenario="", testcase="";
            switch (tcID) {
                case "TC01": scenario="Correct Username, Wrong Password"; testcase="Valid username, wrong password"; break;
                case "TC02": scenario="Correct Username, Correct Password"; testcase="Valid login details"; break;
                case "TC03": scenario="Wrong Username, Wrong Password"; testcase="Invalid credentials"; break;
                case "TC04": scenario="Wrong Username, Correct Password"; testcase="Incorrect username"; break;
            }

            driver.findElement(By.id("username")).sendKeys(username);
            driver.findElement(By.id("password")).sendKeys(password);
            driver.findElement(By.id("loginbtn")).click();
            Thread.sleep(2000);

            String expected="", actual="", status="";

            if (tcID.equals("TC02")) { 
                expected = "Dashboard should load";
                if (driver.getPageSource().contains("Dashboard")) {
                    actual="Dashboard opened";
                    status="Pass";
                } else {
                    actual="Login failed";
                    status="Fail";
                }
            } else {
                expected = "Error message should display";
                if (driver.getPageSource().contains("Invalid login")) {
                    actual="Error message appeared";
                    status="Pass";
                } else {
                    actual="Unexpected behavior";
                    status="Fail";
                }
            }

            results.add(new TestResult(
                    tcID, scenario, testcase,
                    "User login required",
                    "Open site → Enter credentials → Login",
                    "U: "+username+" / P: "+password,
                    expected, actual, status
            ));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void generatePDF() throws Exception {
        Document doc = new Document();
        PdfWriter.getInstance(doc, new FileOutputStream("Login_Test_Report.pdf"));
        doc.open();

        Paragraph title = new Paragraph("VLE Login Test Report\n\n",
                new Font(Font.FontFamily.HELVETICA,18,Font.BOLD));
        title.setAlignment(Element.ALIGN_CENTER);
        doc.add(title);

        PdfPTable table = new PdfPTable(9);
        table.setWidthPercentage(100);

        String[] header = {"ID","Scenario","Test Case","Pre-Condition","Steps","Test Data","Expected","Actual","Status"};

        for (String h : header) {
            PdfPCell cell = new PdfPCell(new Phrase(h));
            cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
            table.addCell(cell);
        }

        for (TestResult r : results) {
            table.addCell(r.id);
            table.addCell(r.scenario);
            table.addCell(r.testCase);
            table.addCell(r.preCond);
            table.addCell(r.steps);
            table.addCell(r.data);
            table.addCell(r.expected);
            table.addCell(r.actual);
            table.addCell(r.status);
        }

        doc.add(table);
        doc.close();
    }
}
