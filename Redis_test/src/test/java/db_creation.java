import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class db_creation {

    ChromeDriver wd;

    @Test

    public void dbCreation() {
            wd = new ChromeDriver();
            wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            wd.manage().window().maximize();
            openSite("https://app-qa.redislabs.com/#/login");
            stop();
        }

        public void openSite (String site){
            wd.get(site);
        }

        public void stop () {
            wd.quit();
        }
    }
