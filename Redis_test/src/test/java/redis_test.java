import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class redis_test extends ApplicationManager {


    @Test

    public void CreateAndChangeDB() throws Exception {
        init();
        login("testuser@testuser.com", "123456");
        wait(3000);
        clickOnPlusBtn();
        fillSubscrName("LenaTest");
        choosePlan();
        clickOnContinueBtn();
        enterDBName("LenaDB");
        clickOnActivateBtn();
        waitForActivation();
        wait(10000);
        clickOnEditBtn();
        enterDBName("Lena2");
        clickOnUpdateBtn();
        wait(3000);
        clickOnSideMenu();
        clickOnDBSection();
        //stop();
        }

}
