package mailru.basetest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.JavascriptExecutor;
import mailru.config.WebDriver;
import mailru.pages.BasePage;
import mailru.pages.LoginPage;
import mailru.pages.ComposeEmailPage;


import static mailru.config.BrowserSettings.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {


    protected org.openqa.selenium.WebDriver driver = WebDriver.createDriver();
    protected BasePage BasePage = new BasePage(driver);
    protected LoginPage LoginPage = new LoginPage(driver);
    protected ComposeEmailPage ComposeEmailPage = new ComposeEmailPage(driver);


    @AfterEach
    void cleanCookiesAndLocalStorage() {
        if (CLEAR_COOKIES) {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }

    }

    @AfterAll
    void close() {
        if (!HOLD_BROWSER_OPEN) {
            driver.close();
        }
    }

}
