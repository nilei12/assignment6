import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class tabletest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://letcode.in/table");

        List<WebElement> priceElements= driver.findElements(By.cssSelector("#shopping tbody td:nth-child(2)"));
        int total = 0;
        for (WebElement ele: priceElements)
        { total = total + Integer.parseInt(ele.getText().trim());}
        System.out.println(total);

        int actualtotal = Integer.parseInt(driver.findElement(By.cssSelector("tfoot b")).getText().trim());
        System.out.println(actualtotal);

        if (total == actualtotal)
        {
            System.out.println("total is expected");
        }
    }
}
