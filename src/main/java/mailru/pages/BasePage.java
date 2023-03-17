package mailru.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static mailru.constants.Constants.URLS.URL;

public class BasePage {
    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;

    }

    public void goTourl(String url) {
        driver.get(URL);
    }

    private final By loginButton = By.cssSelector(".resplash-btn.resplash-btn_primary.resplash-btn_mailbox-big.ceb-cfba-w13pva");


    public BasePage pressLogIn() {
        driver.findElement(loginButton).click();
        return this;
    }
}
