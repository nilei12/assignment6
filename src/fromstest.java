import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fromstest
{
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://letcode.in/forms");

        driver.findElement(By.id("lasttname"));
        WebElement username = driver.findElement(By.id("lasttname"));
        username.sendKeys("lei");

        driver.findElement(By.id("firstname"));
        WebElement usernamef = driver.findElement(By.id("firstname"));
        usernamef.sendKeys("ni");

        driver.findElement(By.id("email"));
        WebElement usernameemail = driver.findElement(By.id("email"));
        usernameemail.clear();
        usernameemail.sendKeys("leini@busyqa.com");

        driver.findElement(By.id("date"));
        WebElement usernamephone = driver.findElement(By.id("date"));
        usernamephone.sendKeys("1980-12-01");

        driver.findElement(By.id("Addl1"));
        WebElement address = driver.findElement(By.id(" Addl1"));
        address.sendKeys("108 street");

        driver.findElement(By.id("phno"));
        WebElement phonenumber = driver.findElement(By.id("phno"));
        phonenumber.sendKeys("123456789");

    }
}
