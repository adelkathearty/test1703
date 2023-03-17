package mailru.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static mailru.constants.Constants.Credentials.login;
import static mailru.constants.Constants.Credentials.password;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    private final By loginField = By.xpath("//input[@placeholder='Account name']");
    private final By enterPasswordButton = By.xpath("//span[normalize-space()='Enter password']");
    private final By passwordField = By.xpath("//input[@placeholder='Password']");
    private final By loginButton = By.xpath("//span[normalize-space()='Sign in']");

    public LoginPage enterEmail() {
        WebElement iframe = driver.findElement(By.xpath("//iframe[@class='ag-popup__frame__layout__iframe']"));
        driver.switchTo().frame(iframe);
        driver.findElement(loginField).sendKeys(login);
        return this;
    }

    public LoginPage enterPassword() {
        driver.findElement(enterPasswordButton).click();
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }

    public LoginPage pressLoginButton() {
        driver.findElement(loginButton).click();
        driver.switchTo().defaultContent();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return this;
    }


}
