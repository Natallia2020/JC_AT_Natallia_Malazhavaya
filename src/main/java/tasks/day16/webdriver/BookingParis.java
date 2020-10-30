package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BookingParis {
    public static void main(String[] args) throws InterruptedException, TestException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.booking.com/");
        driver.findElement(By.xpath("//input[@id='ss']")).click();
        driver.findElement(By.xpath("//input[@id='ss']")).sendKeys("Париж");
        driver.findElement(By.xpath("//div[@class='xp__dates-inner xp__dates__checkin']/div/div/div[@class='sb-searchbox__input sb-date-field__field  -empty sb-date__field-svg_icon']/span[@class='sb-date-field__icon sb-date-field__icon-btn bk-svg-wrapper calendar-restructure-sb']"))
                .click();
        driver.findElement(By.xpath("//span[@aria-label='31 Октябрь 2020']")).click();
        driver.findElement(By.xpath("//span[@aria-label='7 Ноябрь 2020']")).click();
        driver.findElement(By.xpath("//span[text()='2 взрослых']")).click();
        driver.findElement(By.xpath("//button[@aria-label='Взрослых: увеличить количество']/span[1]")).click();
        driver.findElement(By.xpath("//button[@aria-label='Взрослых: увеличить количество']/span[1]")).click();
        driver.findElement(By.xpath("//button[@aria-label='Номера: увеличить количество']/span[1]")).click();
        driver.findElement(By.xpath("//button[@data-sb-id='main']")).click();
        WebElement maxPriceHotels = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-id='pri-5']")));
        maxPriceHotels.click();
        WebElement maxPriceHotelsFromCheapest = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-category='price']")));
        maxPriceHotelsFromCheapest.click();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        Thread.sleep(4000);
//        WebElement theCheapestHotel = new WebDriverWait(driver, 10)
//                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"hotellist_inner\"]/div[1]/div[2]/div[3]/div/div[2]/div/div[2]/div/div")));
        WebElement theCheapestHotel = driver.findElement(By.xpath("//*[@id=\"hotellist_inner\"]/div[1]/div[2]/div[3]/div/div[2]/div/div[2]/div/div"));
        String cheapestPrice = theCheapestHotel.getText();
        System.out.println(cheapestPrice);
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        Thread.sleep(4000);
//        WebElement lastPage = new WebDriverWait(driver, 10)
//                .until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='bui-pagination__pages']/ul/li[last()]/a")));
//        lastPage.click();
        driver.findElement(By.xpath("//li[@class='bui-pagination__pages']/ul/li[last()]/a")).click();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        Thread.sleep(4000);
//        WebElement theMostExpensiveHotel = new WebDriverWait(driver, 10)
//                .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='hotellist_inner']/div[last()-1]/div[2]/div[2]/div/div/div/div[2]/div/div")));
        WebElement theMostExpensiveHotel = driver.findElement(By.xpath("//div[@id='hotellist_inner']/div[last()-1]/div[2]/div[2]/div/div/div/div[2]/div/div"));
        String expensivePrice = theMostExpensiveHotel.getText();
        System.out.println(expensivePrice);
        String cheapestPriceNumbers = cheapestPrice.replaceAll("[^0-9]", "");
        String expensivePriceNumbers = expensivePrice.replaceAll("[^0-9]", "");
        int a = Integer.parseInt(cheapestPriceNumbers);
        int b = Integer.parseInt(expensivePriceNumbers);
        if (a<b) {
            System.out.println("OK");
        } else {
            throw new TestException();
        }
        driver.close();
}
}
