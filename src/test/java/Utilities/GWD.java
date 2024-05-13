package Utilities;

import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.Locale;

public class GWD {

    public static ThreadLocal <WebDriver> threadDriver=new ThreadLocal<>(); // her bir thread e özel static
    public static ThreadLocal <String> threadBrowserName=new ThreadLocal<>();
    //driver.get() -> bulunduğu hatta ki driverı ver
    //driver.set() -> bulunduğu hata driver set et


    public static WebDriver getDriver(){

        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language", "EN");

        if (threadBrowserName.get()==null){
            threadBrowserName.set("chrome");
        }

        if (threadDriver.get()==null) { // 1 kez oluştur (YOK İSE)
            switch (threadBrowserName.get()){
                case "chrome":threadDriver.set(new ChromeDriver()); break;
                case "firefox": threadDriver.set(new FirefoxDriver());
                case "edge": threadDriver.set(new EdgeDriver()); break;
            }

            threadDriver.get().manage().window().maximize();
            threadDriver.get().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        }
        return threadDriver.get();
    }

    public static void quitDriver(){

        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        //driver kapat
        if (threadDriver.get() != null){ //driver var ise
            threadDriver.get().quit();
            WebDriver driver=threadDriver.get();
            driver=null;
            threadDriver.set(driver);
        }
    }

}
