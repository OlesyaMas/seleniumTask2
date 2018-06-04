import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class Launcher {
    public static void main(String[] args) {

        WebDriver driver = initChromeDriver();
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");

        WebElement loginField = driver.findElement(By.id("email"));
        loginField.sendKeys("webinar.test@gmail.com");

        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException ie){
        }

        WebElement passField = driver.findElement(By.id("passwd"));
        passField.sendKeys("Xcg7299bnSmMuRLp9ITw");

        WebElement authButton = driver.findElement(By.name("submitLogin"));
        authButton.click();

        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException ie){
        }

        WebElement avatarButton = driver.findElement(By.id("employee_infos"));
        avatarButton.click();

        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException ie){
        }

        WebElement logoutButton = driver.findElement(By.id("header_logout"));
        logoutButton.click();
    }

    public static WebDriver initChromeDriver (){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        return new ChromeDriver(options);
    }
}

