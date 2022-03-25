import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestedframesenario1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/nested_frames");

        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");
        driver.findElement(By.xpath("//body"));
        WebElement left = driver.findElement(By.xpath("//body"));
        System.out.println(left.getText());

        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-middle");
        driver.findElement(By.xpath("//body"));
        WebElement middle = driver.findElement(By.xpath("//body"));
        System.out.println(middle.getText());

        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-right");
        driver.findElement(By.xpath("//body"));
        WebElement right = driver.findElement(By.xpath("//body"));
        System.out.println(right.getText());

        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-bottom");
        driver.findElement(By.xpath("//body"));
        WebElement bottom = driver.findElement(By.xpath("//body"));
        System.out.println(bottom.getText());




    }
}


