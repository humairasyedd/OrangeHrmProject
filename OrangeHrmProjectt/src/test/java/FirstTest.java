import Browser.Browser;
import Browser.Info;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.time.Duration;

public class FirstTest extends TestBase {


    @Test
    public void test01() {
       startLoginPage().loginToPIMpage();

        try {
            Thread.sleep(5000);


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }





        }

    @Test
    public void test02 () {
    }
}
