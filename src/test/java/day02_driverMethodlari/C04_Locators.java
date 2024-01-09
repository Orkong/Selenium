package day02_driverMethodlari;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_Locators {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("Webdriver.chrome.driver","src/kurulumDosyalari/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://www.testotomasyonu.com");

        WebElement aramaKutusu =driver.findElement(By.id("global-search"));

        // arama kutusuna phoen yazip aratalim
        aramaKutusu.sendKeys("phone");

        // aratma yapabilmek icin enter'a basalim
        aramaKutusu.submit();

        // arama sonucunda urun bulunabildigini test edin

        WebElement aramaSonucElementi = driver.findElement(By.className("product-count-text"));
        System.out.println(aramaSonucElementi);
        // [[ChromeDriver: chrome on windows (a70d38ae9ae928f402f1dbf18f00c6e0)] -> class name: product-count-text]
        // aramaSonucElementinin data turu WebElement
        // WebElementler sout ile direk yazdirilamaz.
        // getText() ile WebElement uzerindeki yazi alinabilir

        System.out.println(aramaSonucElementi.getText()); // 4 Products Found

        String sonucYazisi = aramaSonucElementi.getText();

        sonucYazisi = sonucYazisi.replaceAll("\\D","");

        System.out.println(sonucYazisi); // "4"

        int sonucSayisi = Integer.parseInt(sonucYazisi);

        if (sonucSayisi>0){
            System.out.println("Arama testi PASSED");
        }else {
            System.out.println("Arama testi FAILED");
        }





        Thread.sleep(3000);
        driver.quit();

    }
}
