import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.time.Duration;
import java.time.Instant;

public class TheProject {
    private WebDriver driver;

    @BeforeTest
    public void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Andrew\\IdeaProjects\\TheAssessmentProject\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        //get the website url
        driver.get("https://www.workspacemanager.co/");
        Thread.sleep(5000);
        //maximize the window
        driver.manage().window().maximize();
        Thread.sleep(5000);
    }
    @Test (priority = 0)
    public void login() throws InterruptedException {
        //click on the login/signin button
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div/button")).click();
        Thread.sleep(5000);
        //input valid email address
        driver.findElement(By.id("email")).sendKeys("kadridamilola2@gmail.com");
        Thread.sleep(5000);
        //input valid password
        driver.findElement(By.id("password")).sendKeys("Awesomeman@12");
        Thread.sleep(5000);
        //click signin button
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/div[2]/form/div[3]/button")).click();
        Thread.sleep(20000);
    }
    @Test (priority = 1)
    public void logout() throws InterruptedException {
        //click on logout button
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/div[1]/div[11]/h5")).click();
        Thread.sleep(10000);
    }
    @Test (priority = 2)
    public void incorrectDetails() throws InterruptedException {
        //input invalid email address
        driver.findElement(By.id("email")).sendKeys("kadrijunior@yahoo.com");
        Thread.sleep(5000);
        //input invalid password
        driver.findElement(By.id("password")).sendKeys("Awesomeness@12");
        Thread.sleep(5000);
        //click signin button
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/div[2]/form/div[3]/button")).click();
Thread.sleep(10000);
    }
    @AfterTest
    public void quitbrowser(){
        //quit browser
        driver.quit();
    }
}
