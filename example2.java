 /*
import com.github.javafaker.Faker;
import com.pragmatic.selenium.hrm.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
*/

import java.net.URL;
import java.lang.Object;

import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.firefox.FirefoxOptions;

//comment the above line and uncomment below line to use Chrome
//import org.openqa.selenium.chrome.ChromeDriver;
public class example1 {

// https://www.selenium.dev/documentation/en/remote_webdriver/remote_webdriver_client/

    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
		System.setProperty("webdriver.gecko.driver","C:\\tools\\selenium\\web-drivers\\geckodriver.exe");
		
		// WebDriver driver = new FirefoxDriver();
		FirefoxOptions firefoxOptions = new FirefoxOptions();
		try{
			WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.104:4444/wd/hub/"), firefoxOptions);
			    	
			String baseUrl = "https://www.devopsschool.com/";
			String expectedTitle = "DevOpsSchool.com";
			String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
        //close Fire fox
        driver.close();
		}
		catch(MalformedURLException ex){
		//do exception handling here
		}
		


       
    }

}