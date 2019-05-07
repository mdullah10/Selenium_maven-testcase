package ebay;

import initialization.Setup;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage extends Setup {

    @Test

    public void ebayHomePagetitle() {
        SetupDriver("windows", "https://www.ebay.com", "chrome");

        String actualtitle = driver.getTitle();
        System.out.println(actualtitle);
        String expectedtitle = "Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay";
        if (actualtitle.equalsIgnoreCase(expectedtitle)) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }

    @Test

    public void ElectronicslinkTest() {
        System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\drivers\\geckodriver.exe");

        driver = new FirefoxDriver();
        driver.get("https://www.ebay.com");
        driver.findElement(By.xpath("/html/body/div[5]/div[1]/ul/li[5]/a")).click();
    }

    @Test

    public void searchIphone() {
        System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\drivers\\geckodriver.exe");

        driver = new FirefoxDriver();
        driver.get("https://www.ebay.com");
        driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("iphone x");
        driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
    }

    @Test

    public void SignInPageVarification() {
        System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\drivers\\geckodriver.exe");

        driver = new FirefoxDriver();
        driver.get("https://www.ebay.com");
        driver.findElement(By.xpath("/html/body/header/div[1]/ul[1]/li[1]/span/a")).click();

    }

    @Test

    public void signInValidation() {
        System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\drivers\\geckodriver.exe");

        driver = new FirefoxDriver();
        driver.get("https://www.ebay.com");
        driver.findElement(By.xpath("//a[text()='Sign in']")).click();
        driver.findElement(By.xpath("//*[@id=\"userid\"]")).sendKeys("mdulla1984@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("//*[pass");
        driver.findElement(By.xpath("//*[@id=\"sgnBt\"]")).click();
    }

    @Test

    public void navigateForword() {
        System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\drivers\\geckodriver.exe");

        driver = new FirefoxDriver();
        driver.get("https://www.ebay.com");

        driver.navigate().forward();
        driver.navigate().back();

    }
    @Test

    public void fashionLinkTest(){
        System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\drivers\\geckodriver.exe");

        driver = new FirefoxDriver();
        driver.get("https://www.ebay.com");
        driver.findElement(By.linkText("Fashion")).click();
    }
    @Test
    public void ShoesSearch(){
        System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\drivers\\geckodriver.exe");

        driver = new FirefoxDriver();
        driver.get("https://www.ebay.com");
        driver.findElement(By.linkText("Fashion")).click();
        driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("Shoes");
        driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
    }
    @Test
    public void MusicScharching(){
        System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\drivers\\geckodriver.exe");

        driver = new FirefoxDriver();
        driver.get("https://www.ebay.com");
        driver.findElement(By.linkText("Music")).click();

    }
    @Test
    public void SearchBarValidation(){
        System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\drivers\\geckodriver.exe");

        driver = new FirefoxDriver();
        driver.get("https://www.ebay.com");
        driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).click();

    }
    @Test
    public void notifications(){
        System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\drivers\\geckodriver.exe");

        driver = new FirefoxDriver();
        driver.get("https://www.ebay.com");
        driver.findElement(By.xpath("//*[@id=\"gh-Alerts-i\"]")).click();

    }

}