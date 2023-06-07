package amaZon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AmazonPOMClass 
{
private WebDriver driver;

@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
private WebElement signinBtn;
public void sendSigninBtn()
{
	signinBtn.click();
}

@FindBy(xpath="//input[@id='ap_email']")
private WebElement userName;
public void sendUserName()
{
userName.sendKeys("7249753920");	
}

@FindBy(xpath="//input[@id='continue']")
private WebElement clickContinueBtn;
public void continueBtn()
{
	clickContinueBtn.click();
}
@FindBy(xpath="//input[@id='ap_password']")
private WebElement enterPassWord;
public void sendPassWord()
{
	enterPassWord.sendKeys("Harish@123");
}

}
