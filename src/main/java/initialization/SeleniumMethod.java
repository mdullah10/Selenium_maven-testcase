package initialization;

import org.openqa.selenium.By;

public class SeleniumMethod extends Setup {

    public static void main(String[] args) {
        SetupDriver("windows", "https://www.ebay.com", "chrome");

        //get title
        String title = driver.getTitle();
        System.out.println(title);

        driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("java books");
        driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();


    }
}
