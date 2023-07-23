package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public  LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void emailAdress(String myMail) {

    	driver.findElement(By.id("email")).sendKeys(myMail);
    }

    public void password(String myPassword) {
        driver.findElement(By.id("pass")).sendKeys(myPassword);
    }

    public void signIn() {
        driver.findElement(By.id("send2")).click();
    }
}
