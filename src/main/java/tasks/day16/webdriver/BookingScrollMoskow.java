package webdriver;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookingScrollMoskow {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.booking.com/");
        driver.findElement(By.xpath("//input[@id='ss']")).click();
        driver.findElement(By.xpath("//input[@id='ss']")).sendKeys("Москва");
        Actions make = new Actions(driver);
        make
                .sendKeys(Keys.ENTER)
                .build()
                .perform();
        WebElement element = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='hotellist_inner']/div[10]")));
        element = driver.findElement(By.xpath("//div[@id='hotellist_inner']/div[10]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor)driver).executeScript("arguments[0].style.backgroundColor='green'", element);
        ((JavascriptExecutor)driver).executeScript("arguments[0].style.color='red'", element);
        ((JavascriptExecutor)driver).executeScript("arguments[0].click()", element);
        driver.close();



    }
}
