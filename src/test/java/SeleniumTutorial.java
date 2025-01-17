import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTutorial {

    WebDriver driver;

    public void launchBrowserAndApplication() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        // It will launch browser
        WebDriver driver = new ChromeDriver();
        // It will maximize browser window.
        driver.manage().window().maximize();
        // It will launch application
        driver.get("https://www.saucedemo.com/v1/index.html");

        Thread.sleep(3000);

        // Entering username
        // Identify username locator with 'id'
        //WebElement username = driver.findElement(By.id("user-name"));
        //Identify username locator with 'xpath'
        WebElement username = driver.findElement(By.xpath("//input[@name='user-name']"));
        username.sendKeys("standard_user");

        // Entering password
        WebElement pass = driver.findElement(By.id("password"));
        pass.sendKeys("secret_sauce");

        // Clicking on login button
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();


        Thread.sleep(5000);

        driver.close();


    }
}
