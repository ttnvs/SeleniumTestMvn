import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.*;


public class TestSuite {

    @Test
    public void test1() {
         System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver_v94.exe");
//        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver_mac_v94");
        WebDriver driver = new ChromeDriver();

        //Please write your code here




        driver.close();
    }

}
