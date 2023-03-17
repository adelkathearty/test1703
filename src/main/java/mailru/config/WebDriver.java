package mailru.config;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static mailru.config.BrowserSettings.BROWSER_AND_PLATFORM;
import static mailru.constants.Constants.TimeoutVariables.IMPLICIT_WAIT;


public class WebDriver {
    public static org.openqa.selenium.WebDriver createDriver() {
        org.openqa.selenium.WebDriver driver = null;
        switch (BROWSER_AND_PLATFORM) {
            case "CHROME_MACOS":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
                driver = new ChromeDriver();
                break;
            case "CHROME_MACOS_INTEL":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver64");
                driver = new ChromeDriver();
                break;
            case "CHROME_WINDOWS":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            default:
                Assertions.fail("INCORRECT BROWSER NAME" + BROWSER_AND_PLATFORM);
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
        return driver;
    }
}
