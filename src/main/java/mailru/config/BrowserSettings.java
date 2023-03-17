package mailru.config;

/**
 * выбрать браузер и платформу:
 * CHROME_MACOS
 * CHROME_MACOS_INTEL
 * CHROME_WINDOWS
 */

public class BrowserSettings {
    public static final String BROWSER_AND_PLATFORM = "CHROME_MACOS";

    public static final Boolean CLEAR_COOKIES = false; //включение-отключение удаления куки

    public static final Boolean HOLD_BROWSER_OPEN = true; //держать браузер открытым после выполнения теста
}
