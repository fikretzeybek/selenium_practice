package F01_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class f04_ {

    public static void main(String[] args) throws InterruptedException {

        //    . .Exercise2...
        //1-Driver oluşturalim
        //2-Java class'imiza chnomedriver.exet i tanitalim
        //3-Driver'in tum ekranı kaplamasini saglayalim
        //4-Driverla sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini söyleyelim.
        // Egen oncesinde sayfa Yüklenirse, beklemeyi bıraksın.
        //5-"https://www.otto.de” adresine gidelim
        //6-BU web adresinin sayfa basligini (title) ve adres (url)ini alalim
        //7-Title ve url inin "0TT0” kelimesinin içerip icermedigini kontrol edelim
        //8-Ardindan "https://wisequarter.com/” adresine gidip
        //9-BU adresin basligini alalim ve "Quarter” kelimesini icenip icermedigini kontrol edelim
        //10-Bir onceki web sayfamiza geri donelim
        //11-Sayfayı yenileyelim
        //12-Daha sonra web sayfamiza tekrar donelim ve oldugumuuz sayfayi kapatalim
        //13- En son adim olarak butun sayfalarimizi kapatmis olalim

        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.otto.de");

        String ottoUrl = driver.getCurrentUrl();
        String ottoTitle = driver.getTitle();

        if (ottoTitle.contains("0TT0") && ottoUrl.contains("0TT0")){
            System.out.println("Title ve url testi PASSED");
        }else {
            System.out.println("Title ve url testi FAILED");
        }

        driver.get("https://wisequarter.com/");
        String quarterTitle = driver.getTitle();

        if (quarterTitle.contains("Quarter")){
            System.out.println("Title testi PASSED");
        }else {
            System.out.println("Title testi FAILED");
        }

        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();

        driver.quit();
        Thread.sleep(1000);

    }
}
