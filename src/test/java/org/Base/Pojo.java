package org.Base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo extends Base {
	public Pojo() {
		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindBy(id="email")
	private WebElement txtUser;
	@FindBy(id="pass")
	private WebElement txtPass;
	@FindBy(name="login")
	private WebElement btnLogin;
	@FindBy(xpath="//span[text()='Log in as Steven Green']")
	private WebElement text;
	public WebElement getText() {
		return text;
	}
	public WebElement getTxtUser() {
		return txtUser;
	}
	public WebElement getTxtPass() {
		return txtPass;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}

}
