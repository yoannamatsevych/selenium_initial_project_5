import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class TestCase3 {
    /*
    Test Case 3: Validate Automation Exercise site SUBSCRIPTION formGiven user navigates to “https://automationexercise.com/”
    Then user should see heading2 as “SUBSCRIPTION”
    And user should see and email input box with “Your email address” placeholder
    And user should see arrow submit button
    And user should see “Get the most recent updates from our site and be updated your self...”
    text under the email input box
     */

    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        driver.get("https://automationexercise.com/");

        WebElement h2Subscription = driver.findElement(By.cssSelector("div[class='single-widget']>h2"));

       if (h2Subscription.isDisplayed())
           System.out.println("H2 \"Subscription\" validation PASSED");
       else System.out.println("H2 \"Subscription\" validation FAIL");

        if (h2Subscription.getText().equals("SUBSCRIPTION"))
            System.out.println("H2 text validation PASSED");
        else System.out.println("H2 text validation FAIL");
        System.out.println("================");

        WebElement emailInputBox = driver.findElement(By.id("susbscribe_email"));

       if(emailInputBox.isDisplayed())
           System.out.println("Email input box validation PASSED");
       else System.out.println("Email input box validation FAIL");

        if(emailInputBox.getAttribute("placeholder").equals("Your email address"))
            System.out.println("Placeholder of email input box validation PASSED");
        else System.out.println("Placeholder of email input box validation FAIL");
        System.out.println("=======");
        WebElement arrowSubmitButton = driver.findElement(By.cssSelector("form[class='searchform']>button"));

        if(arrowSubmitButton.isDisplayed()) System.out.println("Arrow submit button validation PASSED");
        else System.out.println("Arrow submit button validation FAIL");
        System.out.println("=======");
        WebElement textAfterEmailBox = driver.findElement(By.cssSelector("form[class='searchform']>p"));

        if(textAfterEmailBox.isDisplayed() && textAfterEmailBox.getText().
                equals("Get the most recent updates from\n" +
                        "our site and be updated your self..."))
            System.out.println("Text validation PASSED");
        else System.out.println("Text validation FAIL");




        driver.quit();

    }
}
