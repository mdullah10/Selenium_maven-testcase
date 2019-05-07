package initialization;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Setup {

    public static WebDriver driver = null;

    public static WebDriver SetupDriver(String platform, String url, String browser){

        if (platform.equalsIgnoreCase("mac")&& browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver");

        } else {
            System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        }

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(url);

        return driver;
    }

    public void closeApp() {
        driver.quit();
        //driver.close();
    }

   /* @Test
    public void facebookLogin() {
        SetupDriver("windows", "https://www.facebook.com", "chrome");
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("username");
        driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("pass");
       // driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }
    @Test
    public void messengerRedirect(){
        SetupDriver("windows", "https://www.facebook.com", "chrome");
        driver.findElement(By.linkText("Messenger")).click();
    }
    @Test
    public void findFriend(){
        SetupDriver("windows", "https://www.facebook.com", "chrome");
        driver.findElement(By.linkText("Find Friends")).click();
    }
    @Test
    public void validUsersVarification(){
        SetupDriver("windows", "https://www.facebook.com", "chrome");
        driver.findElement(By.name("firstname")).sendKeys("Michael");
        driver.findElement(By.name("lastname")).sendKeys("Jackson");

    }
    @Test
    public void ProfileValidation(){
        SetupDriver("windows", "https://www.facebook.com", "chrome");
        driver.findElement(By.linkText("Profiles")).click();*/
   // }

}

