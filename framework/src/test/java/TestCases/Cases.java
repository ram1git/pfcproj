package TestCases;

import junit.framework.Assert;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Login;
import Pages.Videos;
import Testbase.Base;

public class Cases extends Base{
	
	public Login log;
	public Videos vid;
	public static final Logger logg=Logger.getLogger(Cases.class.getName());
	
	public Cases(){
		
		super();
		
		logg.info(Cases.class.getName()+"constructor is getting executed");
		
	}
	
	
	@BeforeTest
	
	public void before(){
		
		init();
		logg.info(Cases.class.getName()+"Beforetest is getting executed");
		
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	
	public void testcase(){
		
		log=new Login();
	vid=log.ulogin();
		//System.out.println(dr.getTitle());
		Assert.assertEquals(dr.getTitle(), "Home - Playing For Change");
		
		logg.info(Cases.class.getName()+"test1 is getting executed");
		
	}
@Test	
public void videos(){
	
	vid.showvideos();
	
	logg.info(Cases.class.getName()+"videos test is getting executed");
	
}
}
