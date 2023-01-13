import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCase2 {

    /*
    Test Case 2: Validate Automation Exercise site header itemsGiven user navigates to “https://automationexercise.com/”
    Then validate all below header items are displayed and enabled and their text is as below
    Home
    Products
    Cart
    Signup / Login
    Test Cases
    API Testing
    Video Tutorials
    Contact us
     */
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        driver.get("https://automationexercise.com/");

        ArrayList<String> listOfExpectedHeaderItems = new ArrayList<>(Arrays.asList("Home", "Products", "Cart", "Signup / Login",
                "Test Cases", "API Testing", "Video Tutorials", "Contact us")); // Expected output

        List<WebElement> listOfActualHeaderItem = driver.findElements(By.cssSelector("ul[class='nav navbar-nav']>li"));
        int a = 1;
        for (int i = 0; i < listOfExpectedHeaderItems.size(); i++) {
            System.out.println("Header " + a + " displayed: " + listOfActualHeaderItem.get(i).isDisplayed());
            System.out.println("Header " + a + " enabled: " + listOfActualHeaderItem.get(i).isEnabled());
            System.out.println("Actual text of the header " + a + " matching expected text: "
                    + listOfActualHeaderItem.get(i).getText().equals(listOfExpectedHeaderItems.get(i)));
            System.out.println("==============");
            a++;
        }

        driver.quit();

    }
}
