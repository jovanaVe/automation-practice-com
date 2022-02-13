package com.practise.automation.tests.pckg1;

import com.practise.automation.pages.CreateAnAccount;
import com.practise.automation.pages.EndToEnd;
import com.practise.automation.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.Random;

public class BaseTest {


        public WebDriver driver;
        public WebDriverWait wait;
        String browser = "chrome";

        public static final String URL = "http://automationpractice.com";

        public HomePage homePage;
        public CreateAnAccount createAnAccount;
        public EndToEnd endToEnd;





        @BeforeMethod
        public void set_up() {
            Browsers browsers = Browsers.valueOf(browser.toUpperCase());
            switch (browsers) {
                case CHROME:
                    System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
                    driver = new ChromeDriver();
                    break;
                case FIREFOX:
                    System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
                    driver = new FirefoxDriver();
                    break;
                case EDGE:
                    System.setProperty("webdriver.edge.driver", "src/test/resources/drivers/edgedriver.exe");
                    driver = new EdgeDriver();
                    break;
            }

            driver.manage().window().maximize();
            wait = new WebDriverWait(driver, 10);


            homePage = new HomePage(driver, wait);
            createAnAccount = new CreateAnAccount(driver, wait);
            endToEnd = new EndToEnd(driver, wait);


            driver.navigate().to(URL);
        }

        @AfterMethod
        public void tear_down() {
            driver.quit();
        }

        public void sleep(int time) {
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
