package workshops.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class SauceDemoHomePageTest {
    WebDriver driver;

    @BeforeClass
    public void setUp(){
        // declaration and instantiation of objects/variables
        System.setProperty("webdriver.chrome.driver","src//test//java//workshops//resources//chromedriver.exe");
       driver = new ChromeDriver();
    }

    @Test
    public void scenario(){

    }
  @AfterClass
    public void terminate(){
        driver.quit();
  }
}
