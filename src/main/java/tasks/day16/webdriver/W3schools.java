package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class W3schools {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.w3schools.com/java/");
        WebElement elementTutorial
                = driver.findElement(By.xpath("//span[@class='color_h1']"));
        Actions make = new Actions(driver);
        make
                .doubleClick(elementTutorial)
                .sendKeys(Keys.CONTROL, "C")
                .build()
                .perform();
        driver.navigate().to("https://www.google.com/");
        WebElement searchField
                = driver.findElement(By.name("q"));
                searchField.sendKeys(Keys.CONTROL, "V");
        Actions make2 = new Actions(driver);
        make2
                .sendKeys(Keys.ENTER)
                .build()
                .perform();

    }
}
