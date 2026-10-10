<div align="center">
  
# VLE TestPilot

### Web UI Automation Testing with Java & Selenium WebDriver
</div>

**VLE TestPilot** is a Java-based test automation project designed to validate login scenarios on the University of Vavuniya's Virtual Learning Environment (VLE) and demonstrate essential Selenium WebDriver concepts.

The project explores automated UI testing, element locators, browser interactions, synchronization strategies, and PDF test reporting. It was developed as a practical project to strengthen software quality assurance and test automation skills.

## Project Overview

* **Project Name:** VLE TestPilot
* **Project Type:** Web UI Test Automation
* **Programming Language:** Java
* **Automation Tool:** Selenium WebDriver
* **Browser:** Google Chrome
* **Reporting:** PDF test reports using iText
* **Development Environment:** Visual Studio Code

## Key Features

* **Login Scenario Testing:** Tests valid and invalid username/password combinations.
* **Automated Test Reporting:** Generates a PDF report containing test cases, expected results, actual results, and pass/fail statuses.
* **Element Locator Strategies:** Demonstrates locating web elements using ID, Name, XPath, and CSS Selectors.
* **Browser Automation:** Demonstrates browser navigation and basic WebDriver commands.
* **Synchronization Techniques:** Explores implicit waits, explicit waits, and fluent waits.
* **Hands-on QA Learning:** Provides practical examples of core UI automation testing concepts.

## Technology Stack

| Technology                | Purpose                 |
| ------------------------- | ----------------------- |
| Java                      | Programming language    |
| Selenium WebDriver 4.36.0 | Browser automation      |
| Google Chrome             | Browser under test      |
| iText 5.5.13.3            | PDF report generation   |
| Visual Studio Code        | Development environment |

## Project Structure

```text
Selenium-QA-App/
├── .vscode/                     # VS Code configuration
├── lib/
│   ├── selenium-java-4.36.0/    # Selenium dependencies
│   └── itextpdf-5.5.13.3.jar    # PDF reporting library
├── src/
│   ├── App.java                 # Opens the VLE login page
│   ├── LoginTestRunner.java     # Login scenarios and PDF reporting
│   ├── LocatorsDemo.java        # Web element locator examples
│   ├── SeleniumCommandsExample.java
│   ├── LoginImplicitWait.java   # Implicit wait demonstration
│   ├── LoginExplicitWait.java   # Explicit wait demonstration
│   └── LoginFluentWait.java     # Fluent wait demonstration
├── .gitignore
└── README.md
```

## Getting Started

### Prerequisites

Before running the project, ensure that you have:

1. **Java JDK 11 or later** installed and configured.
2. **Google Chrome** installed on your computer.
3. **Visual Studio Code** installed.
4. The **Extension Pack for Java** installed in VS Code.

### Installation

**1. Clone the repository**

```bash
git clone https://github.com/ShaliniWanasinghe/VLE-TestPilot.git
```

**2. Navigate to the project directory**

```bash
cd Selenium-QA-App
```

**3. Open the project in Visual Studio Code**

```bash
code .
```

Open the `src` folder and select the Java test class you want to execute.

### Running the Tests

#### Option 1: Visual Studio Code (Recommended)

1. Open `src/LoginTestRunner.java`.
2. Locate the `main` method.
3. Click **Run** above the method.
4. Allow Chrome to launch and execute the predefined test scenarios.
5. Check the generated `Login_Test_Report.pdf` in the project's root directory, if the test runner completes successfully.

You can also run the other Java classes individually to explore Selenium's features.

#### Option 2: Windows PowerShell

From the project root directory, compile the Java source files:

```powershell
javac -cp "lib/itextpdf-5.5.13.3.jar;lib/selenium-java-4.36.0/*" -d bin src/*.java
```

Run the login test runner:

```powershell
java -cp "bin;lib/itextpdf-5.5.13.3.jar;lib/selenium-java-4.36.0/*" LoginTestRunner
```

**Note:** These commands assume the dependency paths shown in the project structure. If your Selenium JAR files are organized differently, update the classpath accordingly. Selenium Manager can assist with browser driver management, depending on your Selenium version and environment.

## Test Scenarios

The `LoginTestRunner.java` class covers four login scenarios:

| Test Case | Username | Password | Purpose                                   |
| --------- | -------- | -------- | ----------------------------------------- |
| TC01      | Valid    | Valid    | Verify successful login                   |
| TC02      | Valid    | Invalid  | Verify rejection of an incorrect password |
| TC03      | Invalid  | Valid    | Verify rejection of an incorrect username |
| TC04      | Invalid  | Invalid  | Verify rejection of invalid credentials   |

The expected outcome of each scenario should be compared with the actual application response to determine the test status.

### Test Report

After execution, the test runner is designed to generate a PDF report named:

`Login_Test_Report.pdf`

The report documents test cases, expected outcomes, actual outcomes, and pass/fail results.
<
<img width="1023" height="616" alt="image" src="https://github.com/user-attachments/assets/aebfee71-03d2-437b-b618-3ea215f451aa" align="center" />

## Selenium Concepts Demonstrated

| Java Class                     | Concept                                                    |
| ------------------------------ | ---------------------------------------------------------- |
| `App.java`                     | Opening the VLE login page                                 |
| `SeleniumCommandsExample.java` | Browser navigation and WebDriver commands                  |
| `LocatorsDemo.java`            | Identifying web elements with different locator strategies |
| `LoginImplicitWait.java`       | Implicit synchronization                                   |
| `LoginExplicitWait.java`       | Explicit synchronization                                   |
| `LoginFluentWait.java`         | Fluent synchronization                                     |
| `LoginTestRunner.java`         | Login scenario automation and PDF reporting                |

## Learning Outcomes

Through this project, I explored:

* Automating web application interactions using Selenium WebDriver.
* Designing positive and negative login test scenarios.
* Identifying web elements using different locator strategies.
* Understanding synchronization and wait mechanisms.
* Recording test outcomes in a structured PDF report.
* Applying practical software quality assurance concepts to UI testing.

## Future Improvements

Potential enhancements include:

* Organizing test cases using TestNG or JUnit.
* Separating test data, locators, and test logic.
* Implementing the Page Object Model (POM).
* Adding screenshots for failed test cases.
* Integrating automated execution with GitHub Actions.
* Improving test reporting and adding more validation scenarios.

## Author

**Shalini Wanasinghe**

BSc in Information Technology | Aspiring QA Engineer

* GitHub: [@ShaliniWanasinghe](https://github.com/ShaliniWanasinghe)

## Disclaimer

This project is intended for educational and portfolio purposes. Automated tests should only be executed against systems you own or have explicit permission to test. Use authorized test accounts and avoid exposing real credentials in source code or test reports.





