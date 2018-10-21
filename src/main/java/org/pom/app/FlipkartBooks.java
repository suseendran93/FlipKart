package org.pom.app;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartBooks extends Base {

	
	@FindBy(xpath = "//span[text()='Sports, Books & More']")
	private WebElement booksTab;

	@FindBy(xpath = "//a[@title='Books']")
	private WebElement books;

	@FindBy(xpath = "//a[@class='_1bn9xk']")
	private List<WebElement> booksToBeAdded;

	@FindBy(xpath = "//button[@class='_2AkmmA _29YdH8']")
	private WebElement loginCloseBtn;

	@FindBy(xpath = "//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")
	private WebElement addToCartBtn;

	@FindBy(xpath = "//button[@class='_2AkmmA _14O7kc mrmU5i']")
	private WebElement continueShoppingBtn;

	@FindBy(xpath = "//div[text()='Amount Payable']/span")
	private WebElement amountPayable;
	
	public FlipkartBooks() throws IOException {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAmountPayable() {
		return amountPayable;
	}

	public WebElement getAddToCartBtn() {
		return addToCartBtn;
	}

	public WebElement getContinueShoppingBtn() {
		return continueShoppingBtn;
	}

	public WebElement getLoginCloseBtn() {
		return loginCloseBtn;
	}

	public WebElement getBooksTab() {
		return booksTab;
	}

	public WebElement getBooks() {
		return books;
	}

	public List<WebElement> getBooksToBeAdded() {
		return booksToBeAdded;
	}

}
