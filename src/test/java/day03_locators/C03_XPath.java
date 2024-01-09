package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_XPath {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("WebDriver.chrome.driver","src/kurulumDosyalari/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //1- https://testotomasyonu.com/addremove/ adresine gidin
        driver.get("https://testotomasyonu.com/addremove/");



        //2- Add Element butonuna basin
        //driver.findElement(By.id("sub-btn")).click();
        driver.findElement(By.xpath("//*[@id='sub-btn']")).click();


        //3- Remove butonu’nun gorunur oldugunu test edin
        //WebElement removeButone = driver.findElement(By.className("remove-btn"));
        WebElement removeButone = driver.findElement(By.xpath("//*[@class='remove-btn']"));

        if (removeButone.isDisplayed()){
            System.out.println("Remove gorunme testi PASSED");
        }else {
            System.out.println("Test Failed");
        }

        //4- Remove tusuna basin
        removeButone.click();

        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        //WebElement addRemoveYaziElementi =driver.findElement(By.tagName("h2"));
        WebElement addRemoveYaziElementi = driver.findElement(By.xpath("//h2"));


        if (addRemoveYaziElementi.isDisplayed()){
            System.out.println("Remove gorunme Test PASSED");
        }else {
            System.out.println("Remove gorunme testi Failed");
        }


        driver.quit();

    }
}
