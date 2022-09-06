package settings;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseSelenium {
    protected WebDriver driver;
    protected final String LINK_FOR_SERVES_SAMOKATE = "https://qa-scooter.praktikum-services.ru/";

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        BaseSeleniumPage.setDriver(driver);
        driver.get(LINK_FOR_SERVES_SAMOKATE);
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}


