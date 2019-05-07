package initialization;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TakeScreenshot extends Setup {
    public static void main(String[] args) {
        SetupDriver("windows", "https://www.ebay.com", "chrome");
        getScreenShot(driver);
    }
        public static void getScreenShot(WebDriver driver){
            DateFormat dateFormat = new SimpleDateFormat("mm.dd.yyyy-HH:mma");
            Date date = new Date();
            String name =dateFormat.format(date);
            File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(file, new File("src\\screenshots\\new.png"+name+".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            driver.quit();
        }


    }

