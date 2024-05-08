import org.example.BrowserManager;
import org.example.Utils;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils {
    //creat obj to call BrowserManager class's method into this class
    BrowserManager browserManager = new BrowserManager();

    @BeforeMethod
    //method to open browser
    public  void setUP(){
        browserManager.openBrowser();
    }

   @AfterMethod
    //method to close browser(all web page)
    public void tearDown(ITestResult result) {if (!result.isSuccess()){takeScreenShot(result.getName());}

        browserManager.closeBrowser();
    }
}
