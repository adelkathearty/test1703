package mailru.basetest;


import org.junit.jupiter.api.Test;


import static mailru.constants.Constants.URLS.URL;


public class ComposeEmailTest extends BaseTest {


    @Test
    public void composeEmailTest() {
        BasePage.goTourl(URL);
        BasePage.pressLogIn();
        LoginPage.enterEmail().enterPassword().pressLoginButton();
        ComposeEmailPage.composeEmail();
    }

}
