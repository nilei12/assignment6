import io.netty.buffer.ByteBufProcessor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slidertest {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://letcode.in/slider");
        Actions actions = new Actions(driver);

        WebElement silder = driver.findElement(By.cssSelector("[name = 'range']"));
        WebElement range = driver.findElement(By.cssSelector("[id = 'generate']"));

        actions.dragAndDropBy(silder,12,0);

    }
}

