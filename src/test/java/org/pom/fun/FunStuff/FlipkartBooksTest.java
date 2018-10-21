package org.pom.fun.FunStuff;

import java.io.IOException;

import org.pom.app.Base;
import org.pom.app.FlipkartBooks;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FlipkartBooksTest extends Base {

	@BeforeMethod
	public void initializeBrowser() throws InterruptedException {
		initialize("https://www.flipkart.com/");

	}

	@Test
	public void clickOnBooks() throws IOException, InterruptedException {
		FlipkartBooks flipkartBooks = new FlipkartBooks();
		
		btnClick(flipkartBooks.getLoginCloseBtn());
		btnClick(flipkartBooks.getBooksTab());
		Thread.sleep(2000);
		btnClick(flipkartBooks.getBooks());
		Thread.sleep(2000);
		System.out.println(flipkartBooks.getBooksToBeAdded().size());
		for (int i = 0; i <=9; i++) {
			clickLink(flipkartBooks.getBooksToBeAdded(), i);
			Thread.sleep(2000);
			btnClick(flipkartBooks.getAddToCartBtn());
			Thread.sleep(2000);
			btnClick(flipkartBooks.getContinueShoppingBtn());
			Thread.sleep(2000);
			btnClick(flipkartBooks.getBooksTab());
			Thread.sleep(2000);
			btnClick(flipkartBooks.getBooks());
			Thread.sleep(2000);
		}
		clickLink(flipkartBooks.getBooksToBeAdded(), 10);
		Thread.sleep(2000);
		btnClick(flipkartBooks.getAddToCartBtn());
		Thread.sleep(2000);
		Assert.assertEquals(flipkartBooks.getAmountPayable().getText(), "2000");
	}
}
