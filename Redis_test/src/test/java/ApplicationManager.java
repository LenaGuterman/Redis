import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    ChromeDriver wd;
    WebDriverWait wait;

    public void clickOnUpdateBtn() {
        wd.findElement(By.xpath("//div[@class=' c-button c-button--secondary ember-view']")).click();
    }

    public void waitForActivation() {
        wait = new WebDriverWait(wd, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='c-database-status__icon c-database-status__icon--v']")));
    }

    public void clickOnEditBtn() {
        wd.findElement(By.xpath("//i[@class='c-icon c-icon--pencil-3 ember-view']")).click();
    }

    public void clickOnActivateBtn() {
        wd.findElement(By.xpath("//div[@class=' c-button c-button--secondary ember-view']")).click();
    }

    public void enterDBName(String DBname) {
        wd.findElement(By.xpath("//input[@class='ember-text-field c-input__input ember-view']")).click();
        wd.findElement(By.xpath("//input[@class='ember-text-field c-input__input ember-view']")).clear();
        wd.findElement(By.xpath("//input[@class='ember-text-field c-input__input ember-view']")).sendKeys(DBname);
    }

    public void clickOnContinueBtn() {
        wd.findElement(By.xpath("//div[@data-id='button-continue-process-new-sub']")).click();
    }

    public void choosePlan() {
        wd.findElement(By.xpath("//div[contains(@data-id,'button-select-sub-plan-30MB')]")).click();
    }

    public void fillSubscrName(String SBname) {
        wd.findElement(By.xpath("//input[@class='ember-text-field c-input__input ember-view']")).click();
        wd.findElement(By.xpath("//input[@class='ember-text-field c-input__input ember-view']")).clear();
        wd.findElement(By.xpath("//input[@class='ember-text-field c-input__input ember-view']")).sendKeys(SBname);
    }

    public void clickOnPlusBtn() {
        wd.findElement(By.xpath("//span[@data-id='button-create-new-subscription']")).click();
    }

    public void wait(int millis) throws Exception {
        Thread.sleep(millis);
    }

    public void clickOnDBSection() {
        wd.findElement(By.id("ember716")).click();
    }

    public void clickOnSideMenu() {
        wd.findElement(By.xpath("//div[@class='c-header__menu-icon']")).click();

    }

    public void init() {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.manage().window().maximize();
        openSite("https://app-qa.redislabs.com/#/login");
    }

    public void login(String username, String password){
            wd.findElement(By.id("ember499")).click();
            wd.findElement(By.id("ember499")).clear();
            wd.findElement(By.id("ember499")).sendKeys(username);
            wd.findElement(By.id("ember500")).click();
            wd.findElement(By.id("ember500")).clear();
            wd.findElement(By.id("ember500")).sendKeys(password);
            wd.findElement(By.id("ember515")).click();

        }

    public void openSite (String site){
            wd.get(site);
        }

    public void stop () {
            wd.quit();
        }
}
