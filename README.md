<div align="center">

# VLE TestPilot 
## Login Test Runner

## Overview
This is a Java-based test automation project utilizing **Selenium WebDriver** to automate and test the Virtual Learning Environment (VLE) of Vavuniya University, as well as demonstrating various Selenium core concepts.

</div>

## Prerequisites
1. **Java Development Kit (JDK)** : Ensure JDK 11 or higher is installed and properly configured in your system's PATH.
2. **Google Chrome** : Ensure the Google Chrome browser is installed.
3. **Visual Studio Code** : The project is structured to work out of the box with VS Code.
4. **Extension Pack for Java (VS Code)** : Make sure you have Microsoft's Java extension pack installed in VS Code to run the `.java` files easily.


## Project Structure
- `src/`: Contains all the Java source code for test scripts.
  - `App.java`: A simple starter script to open the VLE login page.
  - `LoginTestRunner.java`: A comprehensive test runner that validates multiple login scenarios and generates a **PDF Test Report** (`Login_Test_Report.pdf`).
  - `LocatorsDemo.java`: A script demonstrating different element locator strategies (ID, Name, XPath, CSS Selector, etc.).
  - `SeleniumCommandsExample.java`: A script showing basic browser navigation commands.
  - `LoginExplicitWait.java`, `LoginImplicitWait.java`, `LoginFluentWait.java`: Scripts demonstrating different synchronization wait strategies in Selenium.
- `lib/`: Contains external JAR dependencies required for the project.
  - `selenium-java-4.36.0/`: The Selenium WebDriver library.
  - `itextpdf-5.5.13.3.jar`: Library used for generating PDF reports.

## How to Run the Tests

### Method 1: Using Visual Studio Code (Recommended)
This is the easiest way to run the tests since the project already has `.vscode` configurations.

1. Open the project folder `TestApp` in **Visual Studio Code**.
2. Open any `.java` file inside the `src/` directory (e.g., `src/LoginTestRunner.java`).
3. You will see a `Run | Debug` button appear above the `public static void main` method.
4. Click **Run**.
5. The Chrome browser will launch automatically (Selenium Manager handles the WebDriver matching automatically), execute the predefined test steps, and close once finished.

### Method 2: Command Line Execution (For Advanced Users)
If you prefer running tests via the command line or PowerShell, follow these steps from the root directory of the project (`TestApp/`):

1. **Compile the Java files** (linking the required `.jar` libraries):
   ```powershell
   javac -cp "lib/itextpdf-5.5.13.3.jar;lib/selenium-java-4.36.0/*" -d bin src/*.java
   ```
2. **Run a specific test class** (e.g., `LoginTestRunner`):
   ```powershell
   java -cp "bin;lib/itextpdf-5.5.13.3.jar;lib/selenium-java-4.36.0/*" LoginTestRunner
   ```

## Key Test Scenarios

### 1. Generating Test Reports (`LoginTestRunner.java`)
This is the main testing script of the app. It tests 4 different login scenarios:
- Correct Username & Correct Password
- Correct Username & Wrong Password
- Wrong Username & Correct Password
- Wrong Username & Wrong Password

<img width="1023" height="616" alt="image" src="https://github.com/user-attachments/assets/aebfee71-03d2-437b-b618-3ea215f451aa" />



**Output**: Upon completion, it automatically generates a structured PDF document named `Login_Test_Report.pdf` at the root of the project detailing the test cases, expected outcomes, actual outcomes, and Pass/Fail status.

### 2. Learning Selenium Concepts
Run the other scripts to see specific Selenium concepts in action:
- **`SeleniumCommandsExample.java`**: Watch the browser open pages, fetch titles, navigate backward, and close.
- **`LocatorsDemo.java`**: Observe how Selenium finds elements on a demo registration page using different attributes like `id`, `name`, or `xpath`.
- **`Wait` files**: These scripts will show how Selenium pauses and waits for elements to load to prevent flaky test failures.
