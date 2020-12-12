package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Testbase.Base;

public class Login extends Base {
	
	
	@FindBy(xpath="//input[@id='user_login']")
	WebElement uname;
	
	@FindBy(xpath="//input[@id='user_pass']")
	WebElement paswd;
	
	@FindBy(xpath="//button[normalize-space()='Log In']")
	WebElement btn;
	////img[@alt='Playing for change logo']
	
	@FindBy(xpath="//img[@alt='Playing for change logo']")
	WebElement img;
	
	public Login(){
		
		PageFactory.initElements(dr, this);
	}


	public Videos ulogin(){
		uname.sendKeys(prop.getProperty("uname"));
		paswd.sendKeys(prop.getProperty("paswd"));
		btn.click();
		img.click();
		return new Videos();
		
	}
	
	
}
