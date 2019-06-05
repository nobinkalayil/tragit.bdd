import cucumber.api.java.Before;
import driver.Drivermanager;
import org.junit.Test;

public class Hooks {
    Drivermanager drivermanager = new Drivermanager();
    @Before

    public void setup(){
        drivermanager.openBrowser();
        drivermanager.navigate("https://www.travisperkins.co.uk/");
        drivermanager.maximise();
        drivermanager.impliTimeout();

    }
    public void teardown(){}
}
