import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class assignment6 {


    static void login(String user_name1, String pass_word1) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.name("txtUsername"));
        WebElement username = driver.findElement(By.name("txtUsername"));
        username.sendKeys(user_name1);
        WebElement password = driver.findElement(By.name("txtPassword"));
        password.sendKeys(pass_word1);
        driver.findElement(By.name("Submit"));
        WebElement login = driver.findElement(By.name("Submit"));
        login.click();

        //String expectedURL = driver.getCurrentUrl();
        //System.out.println(expectedURL);

        driver.findElement(By.id("spanMessage"));
        WebElement errormessage = driver.findElement(By.id("spanMessage"));
        String errormessagelogin;

        errormessagelogin = errormessage.getText();
        System.out.println(errormessagelogin);
        String loginerrormessage = "Invalid credentials";

        //String actualURL = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";


        if (loginerrormessage.equals(errormessagelogin)) {
            System.out.println("Invalid credentials");
        }

        driver.close();

    }
    static void loginssuccessfully(String user_name2, String pass_word2) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.name("txtUsername"));
        WebElement username = driver.findElement(By.name("txtUsername"));
        username.sendKeys(user_name2);
        WebElement password = driver.findElement(By.name("txtPassword"));
        password.sendKeys(pass_word2);
        driver.findElement(By.name("Submit"));
        WebElement login = driver.findElement(By.name("Submit"));
        login.click();

        driver.findElement(By.id("welcome")).click();
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[contains(text(), 'Log')]")));

        String expectedURL = driver.getCurrentUrl();
        System.out.println(expectedURL);

        driver.findElement(By.id("spanMessage"));
        WebElement errormessage = driver.findElement(By.id("spanMessage"));
        String errormessagelogin;

        errormessagelogin = errormessage.getText();
        System.out.println(errormessagelogin);
        String loginerrormessage = "Invalid credentials";

        //String actualURL = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";

        driver.close();

    }



   public static void main(String[] args) {

       login("user", "admin123");
       login("admin", "user123");
       login("user", "user123");
       loginssuccessfully("admin", "admin123");


       //SafariDriver SafariDriver = new SafariDriver();

       //SafariDriver.get("http://www.google.com");
    //   SafariDriver.findElement(By.name("q")).sendKeys("google");
       //SafariDriver.close();

    }
}
