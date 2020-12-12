package framework1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Peacethrough {
	
	public static WebDriver dr;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32new\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.get("https://peacethroughmusic.live/");
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		/*System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Downloads\\geckodriver-v0.27.0-win64\\geckodriver.exe");
		  DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		  capabilities.setCapability("marionette",true);
		 // dr= new FirefoxDriver(capabilities);
		dr=new FirefoxDriver(capabilities);*/
		
	List<WebElement> la	=dr.findElements(By.tagName("a"));
	for(int i=0;i<la.size();i++){
		
		
	System.out.println(la.get(i).getText());
	
	//la.get(i).click();
	
	
	
	
		
		
		
		
	}

	}

}
