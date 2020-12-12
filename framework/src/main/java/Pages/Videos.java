package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Testbase.Base;

public class Videos extends Base{
	
	@FindBy(xpath="//a[normalize-space()='Videos']")
	WebElement svid;
	
	
	public Videos(){
		
		PageFactory.initElements(dr, this);
		
		
	}

	public void showvideos(){
		
		svid.click();
		
	}
	
}
