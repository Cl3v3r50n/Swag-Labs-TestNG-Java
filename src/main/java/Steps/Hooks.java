package Steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utils.ContextoSetup;

import java.io.File;
import java.io.IOException;

public class Hooks {

    ContextoSetup contextoSetup;

    public Hooks(ContextoSetup contextoSetup){
        this.contextoSetup = contextoSetup;
    }

    @After(order = 1)
    public void adicionarPrintSucesso(Scenario scenario) throws IOException {
        WebDriver driver = contextoSetup.baseTeste.webDriverManager();
        if(!scenario.isFailed()){
            File sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
            scenario.attach(fileContent, "image/png", "name");
        }
    }

    @After(order = 0)
    public void posCenario() throws IOException {
        contextoSetup.baseTeste.webDriverManager().quit();
    }

    @AfterStep
    public void adicionarPrintErro(Scenario scenario) throws IOException {
        WebDriver driver = contextoSetup.baseTeste.webDriverManager();

        if(scenario.isFailed()){
            File sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
            scenario.attach(fileContent, "image/png", "name");
        }
    }
}
