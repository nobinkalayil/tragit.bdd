package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Drivermanager {
    public static WebDriver driver;
    public String browser = "chrome";
    public Drivermanager(){
        PageFactory.initElements(driver,this);
    }


    public void openBrowser(){
        switch (browser){
            case "ie":
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                break;
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
                default:
                    WebDriverManager.firefoxdriver().setup();
                    driver= new FirefoxDriver();
        }

    }
    public void navigate(String url){driver.get(url);}
    public void maximise(){driver.manage().window().maximize();}
    public void impliTimeout(){driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);}
    public void quit(){driver.quit();}


}
