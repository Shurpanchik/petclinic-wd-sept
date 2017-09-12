package ru.pflb.wd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.openqa.selenium.firefox.FirefoxDriver.PROFILE;

/**
 * @author <a href="mailto:8445322@gmail.com">Ivan Bonkin</a>.
 */
public class PetclinicTest {

    /**
     * При клике по меню "Pet Types" не должно появляться 'Not Found - 404 error'
     */
//    @Test(expected = NoSuchElementException.class)
//    public void shouldDisplayPetTypes() {
//        System.setProperty("webdriver.chrome.driver", new File("src/main/resources/chromedriver.exe").getAbsolutePath());
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, SECONDS);
//    }

    private WebDriver driver;

    @Before
    public void initDriver() throws URISyntaxException, IOException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        FirefoxProfile profile = new FirefoxProfile();
        File firebug = new File(FirefoxDriver.class.getResource("/firebug-1.12.7-fx.xpi").toURI());
        File firepath = new File(FirefoxDriver.class.getResource("/firepath-0.9.7-fx.xpi").toURI());
        profile.addExtension(firebug);
        profile.addExtension(firepath);
        profile.setPreference("extensions.firebug.showFirstRunPage", false);
        capabilities.setCapability(PROFILE, profile);
        driver = new FirefoxDriver(capabilities);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, SECONDS);
    }

    @After
    public void closeDriver() {
        driver.quit();
    }

    @Test
    public void shouldFindOwnerAndChangeHisName() {

        // открытие браузера на нужной странице
        driver.get("http://localhost:8080");


    }


    @Test
    public void shouldAddNewPet() {

    }

    /**
     * Домашнее задание.
     * <p>
     * Сценарий:<ol>
     * <li>Открыть http://localhost:8080/</li>
     * <li>Перейти в меню Find Owners -> Add Owner</li>
     * <li>Ввести валидные случайные данные (новые для каждого запуска теста)</li>
     * <li>Нажать Add Owner, открылась страница Owner Information</li>
     * <li>Проверить, что добавилась новая запись, и все ее поля соответствуют введенным значениям, использую поиск в Find Owners</li>
     * </ul>
     */
    public void shouldValidateAddedUser() {
        // TODO
    }
}
