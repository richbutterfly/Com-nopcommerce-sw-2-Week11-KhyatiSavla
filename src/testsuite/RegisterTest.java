package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * 5. Write down the following test into ‘RegisterTest’
 * class
 * 1. userShouldNavigateToRegisterPageSuccessful
 * ly
 * click on the ‘Register’ link
 * Verify the text ‘Register’
 * 2. userShouldRegisterAccountSuccessfully *
 * click on the ‘Register’ link
 * Select gender radio button
 * Enter First name
 * Enter Last name
 * Select Day Month and Year
 * Enter Email address
 * Enter Password
 * Enter Confirm password
 * Click on REGISTER button
 * Verify the text 'Your registration completed
 */
public class RegisterTest extends BaseTest {
    String baseURL = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseURL);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        driver.findElement(By.linkText("Register")).click();// click on register link
        String expectedText = "Register";
        String actualText = driver.findElement(By.xpath("//h1")).getText();
        Assert.assertEquals("Correct Message not displayed", expectedText, actualText);
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        driver.findElement(By.linkText("Register")).click();// click on register link
        driver.findElement(By.id("gender")).click();// click on Gender radio button link
        driver.findElement(By.id("FirstName")).sendKeys("Prime");// Type first name
        driver.findElement(By.name("LastName")).sendKeys("Testing");// Type last name
        driver.findElement(By.name("DateOfBirthDay")).click();// click on Day
        driver.findElement(By.name("DateOfBirthMonth")).click();// click on Month
        driver.findElement(By.name("DateOfBirthYear")).click();// click on Year
        driver.findElement(By.id("Email")).sendKeys("testingprime@gmail.com");// Type email address
        driver.findElement(By.id("Password")).sendKeys("123456");// Type password
        driver.findElement(By.name("ConfirmPassword")).sendKeys("123456");// Type confirm password
        driver.findElement(By.id("register-button")).click();// click on Register button
        String expectedText = "Your registration completed";
        String actualText = driver.findElement(By.xpath("//div[@class = 'result']")).getText();
        Assert.assertEquals(expectedText, actualText);

    }


    @After
    public void tearDown() {
        closeBrowser();
    }
}
