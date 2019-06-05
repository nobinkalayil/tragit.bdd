package pages;

import driver.Drivermanager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.sql.DriverManager;

public class HeaderPage extends Drivermanager {
    @FindBy(id = "search")
    private WebElement searchbox;
    @FindBy(className = "button")
    private WebElement magnibutton;




    public void dosearch(){
        searchbox.sendKeys("Decking Board");
        magnibutton.click();
    }

}
