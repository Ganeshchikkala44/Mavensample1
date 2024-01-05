package SampleTest1;

import Factory.Driverfactory;
import org.openqa.selenium.WebDriver;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driverfactory.initializeDriver("firefox");

        driver.get("https://www.automationzone.in");
    }
}

