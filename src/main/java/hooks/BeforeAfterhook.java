package hooks;

import Factory.Driverfactory;
import context.DriverContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

public class BeforeAfterhook {
    private final DriverContext driverContext;
    private WebDriver driver;
    public BeforeAfterhook(DriverContext driverContext) {
        this.driverContext = driverContext;
    }
    @Before
    public void before() throws InterruptedException {
      driver = Driverfactory.initializeDriver(System.getProperty("browser","chrome"));
      driverContext.driver = driver;
    }
    @After
    public  void  after(Scenario scenario){
        driver.quit();

    }
}
