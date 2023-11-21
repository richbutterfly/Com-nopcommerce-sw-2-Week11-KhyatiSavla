package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * 2. Create the package ‘testsuite’ and create the
 * following classes inside the ‘testsuite’ package.
 * 1. LoginTest
 * 2. TopMenuTest
 * 3. RegisterTest
 * 3. Write down the following test into ‘LoginTest’ class
 * 1. userShouldNavigateToLoginPageSuccessfully *
 * click on the ‘Login’ link
 * Verify the text ‘Welcome, Please Sign
 * In!’
 * 2. userShouldLoginSuccessfullyWithValidCredentials
 * click on the ‘Login’ link
 * Enter valid username
 * Enter valid password
 * Click on ‘LOGIN’ button
 * Verify the ‘Log out’ text is display
 * 3. verifyTheErrorMessage
 * click on the ‘Login’ link
 * Enter invalid username
 * Enter invalid password
 * Click on Login button
 * Verify the error message ‘Login was unsuccessful.
 * Please correct the errors and try again. No customer account found'
 */
public class LoginTest extends BaseTest {
    String baseURL = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseURL);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        WebElement loginBtn = driver.findElement(By.linkText("Log in"));
        loginBtn.click();
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        // Find Login link and click on it
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        // Find the user field and type email address
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("testingprime@gmail.com");
        // Find the password field and type the password
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("123456");
        // Find Login link and click on it
        WebElement loginBtn = driver.findElement(By.xpath("//button[text() ='Log in' ]"));
        loginBtn.click();
        String expectedText = "Log out";
        String actualText = driver.findElement(By.xpath("//a[@class = 'ico-account']")).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void verifyTheErrorMessage() {
        driver.findElement(By.linkText("Log in")).click(); // Click on Login link
        driver.findElement(By.id("Email")).sendKeys("testprime@gmail.com"); // enter Invalid username
        driver.findElement(By.name("Password")).sendKeys("654321"); // enter Invalid password
        driver.findElement(By.xpath("//button[text() ='Log in' ]")).click(); // Click on Login button
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualErrorMessage = driver.findElement(By.xpath("//div[@class = 'message-error validation-summary-errors']")).getText();
        Assert.assertEquals("Invalid Credentials", expectedErrorMessage, actualErrorMessage);

    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
