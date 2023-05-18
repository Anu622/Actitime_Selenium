package com.actitime.testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass{
	
	@Test
	public void testCreateCustomer() throws IOException, InterruptedException{
		Reporter.log("CreateCustomer", true);
		FileLib f = new FileLib();
		String customerName = f.getExcelData("CreateCustomer", 1, 2);
		String customerDescription = f.getExcelData("CreateCustomer", 1, 3);
		HomePage h = new HomePage(driver);
		h.setTasktab();
		TaskListPage t = new TaskListPage();
		t.getaddNewBtn().click();
		t.getnewCustomer().click();
		t.getcustNametbx().sendKeys(customerName);
		t.customerDD().sendKeys(customerDescription);
		t.getselectCustomerDD().click();
		t.ourCompany().click();
		t.getcreateCustbtn().click();
		Thread.sleep(5000);
		String actualText = t.getactualCust().getText(); 
		Assert.assertEquals(actualText,customerName);
	}
}
