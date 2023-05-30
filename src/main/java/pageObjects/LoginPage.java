package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoginPage {
        public WebDriver driver;
        public LoginPage(WebDriver driver){
        this.driver = driver;
    }
        By txtUser = By.id("user-name");
        By txtPassword = By.name("password");
        By btnLogin = By.id("login-button");
        By sucessoLogin = By.xpath("//div[contains(text(),'Swag Labs')]");
        public void realizarLogin() throws IOException {
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//src//test//resources//global.properties");
            Properties properties = new Properties();
            properties.load(fis);
            String user = properties.getProperty("usuario");
            String password = properties.getProperty("senha");

            driver.findElement(txtUser).sendKeys(user);
            driver.findElement(txtPassword).sendKeys(password);
            driver.findElement(btnLogin).click();
        }
        public void validaSucessoLogin() throws InterruptedException {
            Thread.sleep(5000);
            String texto = driver.findElement(sucessoLogin).getText();
            Assert.assertEquals("Swag Labs", texto);
        }
}