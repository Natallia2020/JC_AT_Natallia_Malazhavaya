package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.StandardCopyOption;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES));
        Files.copy(new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)),
                Paths.get("C:\\JAVA\\CoursesYS\\screenshot.png"), StandardCopyOption.REPLACE_EXISTING);
        driver.close();
    }
}
