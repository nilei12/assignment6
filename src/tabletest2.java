import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tabletest2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://letcode.in/table");

        String presentCheckBoxXpath = "//td[text()='Raj']/parent::tr//input";
        WebElement checkbox= driver.findElement(By.xpath(presentCheckBoxXpath));
        checkbox.click();

    }
}
