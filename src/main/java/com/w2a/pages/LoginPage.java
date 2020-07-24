package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.base.Page;

public class LoginPage  extends Page{

	
	
	public ZohoAppPage doLogin(String username,String password) throws InterruptedException {
		
		type("email_CSS",username);
		Thread.sleep(2000);
		click("nextbtn_ID");
		Thread.sleep(2000);
		type("password_CSS",password);
		click("nextbtn_ID");
		//click("signbtn_CSS");
		
		return new ZohoAppPage();

	}
	
	
	public void gotoSalesandMarketing(){
		
		
	}
	
	public void gotoFinance(){
		
		
	}
	
}
