package mailru.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static mailru.constants.Constants.emailBody.*;

public class ComposeEmailPage {
    WebDriver driver;

    public ComposeEmailPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By composeEmailButton = By.xpath("(//span[@class='compose-button__wrapper'])[1]");
    private final By recipientEmailField = By.xpath("(//input[@type='text'])[1]");
    private final By topicField = By.xpath("(//input[@name='Subject'])[1]");
    private final By inputField = By.xpath("(//div[@aria-label='false'])[1]");
    private final By sendButton = By.xpath("(//span[@class='vkuiButton__in'])[1]");


    public ComposeEmailPage composeEmail() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(composeEmailButton).click();
        driver.findElement(recipientEmailField).sendKeys(emailAddress);
        driver.findElement(topicField).sendKeys(topic);
        driver.findElement(inputField).sendKeys(TextToSend);
        driver.findElement(sendButton).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        return this;
    }
}
