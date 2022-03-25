import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxtest {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://letcode.in/radio");
        driver.findElement(By.id("nobug"));
        WebElement checkbox = driver.findElement(By.id("nobug"));

        if(!checkbox.isSelected())
            checkbox.click();

        driver.findElement(By.id("foo"));
        WebElement checkboxfoo = driver.findElement(By.id("foo"));

        if(!checkboxfoo.isSelected())
            checkboxfoo.click();

        driver.findElement(By.id("going"));
        WebElement checkboxgoing = driver.findElement(By.id("going"));

        if(!checkboxgoing.isSelected())
            checkboxgoing.click();

    }
}
