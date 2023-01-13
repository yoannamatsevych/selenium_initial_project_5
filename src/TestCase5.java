import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class TestCase5 {

    public static void main(String[] args) throws InterruptedException {

        /*
        Test Case 5: Validate Automation Exercise site Test Cases pageGiven user navigates to “”
        When user clicks on “Test Cases” header item
        Then validate user is navigated to “Test Cases” page successfully by it’s title and url
        Expected URL = https://automationexercise.com/test_cases
        Expected Title = Automation Practice Website for UI Testing - Test Cases
         */

        WebDriver driver = Driver.getDriver();

        driver.get("https://automationexercise.com/");


        String expectedURL = "https://automationexercise.com/test_cases";
        String expectedTitle = "Automation Practice Website for UI Testing - Test Cases";

        WebElement testCasesHeaderItem = driver.findElement(By.xpath("(//ul[@class='nav navbar-nav']/li)[5]/a"));

        testCasesHeaderItem.click(); // driver navigate to "Test Case" page
        driver.wait(1000);
        if(driver.getTitle().equals("Automation Practice Website for UI Testing - Test Cases") &&
        driver.getCurrentUrl().equals("https://automationexercise.com/test_cases"))
            System.out.println("Navigation to the \"Test case\" page PASSED ");
        else System.out.println("Navigation to the \"Test case\" page FAIL ");


        driver.quit();

    }
}
