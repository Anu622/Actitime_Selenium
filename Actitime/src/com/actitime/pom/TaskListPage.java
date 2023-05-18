package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {

	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewBtn;
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustomer;
	@FindBy(xpath="//input[@type='input']")
	private WebElement custNametbx;
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement customerDD;
	@FindBy(xpath="//div[text()='- Select Customer -']")
	private WebElement selectCustomerDD;
	@FindBy(xpath="//div[text()='Our company']")
	private WebElement ourCompany;
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustbtn;
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[1]")
	private WebElement actualCust;
	
	public void TaskListpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getaddNewBtn() {
		return addNewBtn;
	}
	public WebElement getnewCustomer() {
		return newCustomer;
	}
	public WebElement getcustNametbx() {
		return custNametbx;
	}
	public WebElement customerDD() {
		return customerDD;
	}
	public WebElement getselectCustomerDD() {
		return selectCustomerDD;
	}
	public WebElement ourCompany() {
		return ourCompany;
	}
	public WebElement getcreateCustbtn() {
		return createCustbtn;
	}
	public WebElement getactualCust() {
		return actualCust;
	}
}
