import org.testng.annotations.Test;

public class PIMTest extends TestBase {


    @Test
    public void test01() throws InterruptedException {
        startLoginPage()
                .loginToPIMpage()
                .searchEmployeeId("0083")
                .validateFirstAndLastName("Joe", "Root");
        Thread.sleep(5000);

    }
}



