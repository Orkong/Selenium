package day02_driverMethodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_DriverManageMethodlari {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","src/kurulumDosyalari/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        /*
            Gorev odaklidir
            Sayfanin acilmasi veya kullanacagimiz webelementlerin bulunmasi icin
            bekleyecegi MAXIMUM suredir

         */

        Thread.sleep(3000);
        driver.manage().window().maximize();
        System.out.println("Max gorunum size: "+driver.manage().window().getSize());
        System.out.println("Max gorunum posion: "+driver.manage().window().getPosition());

        Thread.sleep(3000);
        driver.manage().window().fullscreen();
        System.out.println("Full gorunum size: "+driver.manage().window().getSize());
        System.out.println("Full gorunum posion: "+driver.manage().window().getPosition());

        Thread.sleep(3000);
        driver.manage().window().setPosition(new Point(300,300));
        driver.manage().window().setSize(new Dimension(500,500));
        Thread.sleep(3000);



        Thread.sleep(3000); // gorev merkezli degildir, mutlaka 3 saniye bekler
        driver.quit();
    }
}
