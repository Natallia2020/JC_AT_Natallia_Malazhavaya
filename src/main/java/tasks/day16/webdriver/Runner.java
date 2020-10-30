package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runner {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
//        driver.navigate().to("https://www.tut.by/");
//        driver.manage().window().getSize();
//        driver.switchTo().window("https://selenium.dev");
//        driver.get("https://selenium.dev");
//        System.out.println(driver.getCurrentUrl());
//        driver.close(); //закрывает только это окно
        driver.navigate().to("https://www.google.com/");
        driver.navigate().to("https://www.ya.ru/");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.quit(); //закрывает все окна
    }
}
