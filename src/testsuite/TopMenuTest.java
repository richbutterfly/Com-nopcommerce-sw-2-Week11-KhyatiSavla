package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

/** 4. Write down the following test into ‘TopMenuTest’
 class
 1. userShouldNavigateToComputerPageSuccessfully
 * click on the ‘Computers’ Tab
 * Verify the text ‘Computers’
 2. userShouldNavigateToElectronicsPageSuccessfully
 * click on the ‘Electronics’ Tab
 * Verify the text ‘Electronics’
 3. userShouldNavigateToApparelPageSuccessfully
 * click on the ‘Apparel’ Tab
 * Verify the text ‘Apparel’ 4.
 userShouldNavigateToDigitalDownloadsPageSuccessfully
 * click on the ‘Digital downloads’ Tab
 * Verify the text ‘Digital downloads’
 5. userShouldNavigateToBooksPageSuccessfully
 * click on the ‘Books’ Tab
 * Verify the text ‘Books’
 6. userShouldNavigateToJewelryPageSuccessfully
 * click on the ‘Jewelry’ Tab
 * Verify the text ‘Jewelry’
 7. userShouldNavigateToGiftCardsPageSuccessfully
 * click on the ‘Gift Cards’ Tab
 * Verify the text ‘Gift Cards’
 */
public class TopMenuTest extends BaseTest {

    String baseURL = "https://demo.nopcommerce.com/";
    @Before
    public void setUp() {
        openBrowser(baseURL);
    }
    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Computers ']")).click();
        String expectedText = "Computers";
        String actualText = driver.findElement(By.xpath("//h1")).getText();
        Assert.assertEquals(expectedText,actualText);
    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully () {
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Electronics ']")).click();
        String expectedText = "Electronics";
        String actualText = driver.findElement(By.xpath("//h1")).getText();
        Assert.assertEquals(expectedText,actualText);
    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully () {
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Apparel ']")).click();
        String expectedText = "Apparel";
        String actualText = driver.findElement(By.xpath("//h1")).getText();
        Assert.assertEquals(expectedText,actualText);
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully () {
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Digital downloads ']")).click();
        String expectedText = "Digital downloads";
        String actualText = driver.findElement(By.xpath("//h1")).getText();
        Assert.assertEquals(expectedText,actualText);
    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully () {
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Books ']")).click();
        String expectedText = "Books";
        String actualText = driver.findElement(By.xpath("//h1")).getText();
        Assert.assertEquals(expectedText,actualText);
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully () {
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Jewelry ']")).click();
        String expectedText = "Jewelry";
        String actualText = driver.findElement(By.xpath("//h1")).getText();
        Assert.assertEquals(expectedText,actualText);
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully () {
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Gift Cards ']")).click();
        String expectedText = "Gift Cards";
        String actualText = driver.findElement(By.xpath("//h1")).getText();
        Assert.assertEquals(expectedText,actualText);
    }




    @After
    public void tearDown() {
        closeBrowser();
    }
}


