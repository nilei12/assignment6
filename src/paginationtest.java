import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class paginationtest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://letcode.in/advancedtable");
        By nextPageButtonLocator = By.cssSelector("#advancedtable_next");
        By universityNameLocator = By.cssSelector("//table[@id='advancedtable']//tr//td[2]");
        By searchBoxLocator = By.cssSelector("#advancedtable_filter input");
        By DynamicWebsiteLocator = By.xpath("//td[text()='$$']/following-sibling::td[2]");

        ArrayList<String> univerisities = new ArrayList<String>();
        WebElement nextPageButtonElement = driver.findElement(nextPageButtonLocator);
        while(nextPageButtonElement.isEnabled())
        {
            //ArrayList<WebElement> nameElements = driver.findElements(universityNameLocator);
       //     for(WebElement element: nameElements)
         //   {
           //     element.getText().trim();
            //}


        }




    }
}
