package day02_driverMethodlari;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverGetMethodlari {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","src/kurulumDosyalari/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.testotomasyonu.com");

        // Acilan sayfayinin Title'inda otomasyon gectigini test edin

        String expectedTitleIcerik= "otomasyon";
        String actualTitle= driver.getTitle();

        if (actualTitle.contains(expectedTitleIcerik)){
            System.out.println("Title testi PASSED");
        }else {
            System.out.println("Title otomasyon icermiyor, FAILED");
            System.out.println("Actual title: "+ actualTitle);
        }


        // acilan sayfanin URL'in otomasyon icerdigini test edin

        String expectedUrlIceri="otomasyon";
        String actualUrl= driver.getCurrentUrl();

        if ( actualUrl.contains(expectedTitleIcerik)){
            System.out.println("Url testi PASSED");
        }else {
            System.out.println("Url otomasyon icermiyor FAILED");
        }

        /*
        driver.getWindowHandle()); : driver'in gittigi sayfadak Windowhandle degerini verir
        driver.getWindowHandles());: driver olusturulduktan sonra test boyunca
                                     actigi tum sayfalarin WindowHandle degerlerini bir Set olarak verir

         */
        System.out.println(driver.getWindowHandle());
        // E47E27D48AF7520B115279C3C5A65393
        System.out.println(driver.getWindowHandles());
        // [E47E27D48AF7520B115279C3C5A65393]

        System.out.println("==========Sayfa Kaynagi=======");
        // System.out.println(driver.getPageSource());
        // tum sayfa kaynagini dondurur,
        // sayfa kaynagi ile bir test istenirse, kaydedilip kullanilabilir




        Thread.sleep(3000); // java'da gelir kodlari yazilan milisaniye kadar bekletir
        driver.close();
    }
}
