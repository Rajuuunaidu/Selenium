package com.epam.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class StaySearchPage  {
	WebDriver sdriver;
	public StaySearchPage(WebDriver driver){
		sdriver=driver;
	}
	
	private By messageBy = By.tagName("h1");
	private By textBox = By.xpath("//*[@id=\"ss\"]");
	private By checkOut = By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[1]/div[2]/div/div/div/div/span");
	private By checkIn = By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[1]/div[3]/div/div/div/div/span");
	private By guestCount = By.xpath("//*[@id=\"xp__guests__toggle\"]/span[2]");
	private By searchBar = By.xpath("//*[@id=\"frm\"]/div[1]/div[4]/div[2]/button/span[1]");

	public static void setText() {
		/* this method is used to fill the text in the textField element */
	}

	public static void setCheckIn() {
		/* used to set date to the dateField element */
	}

	public static void setCheckOut() {
		/* used to set date to the dateField element */
	}

	public static void setGuestCount() {
		/* used to set the number of visitors */
	}

	public static void search() {
		/* used to search */
	}

	public static boolean isEnabled() {

		return true;
	}

	public  String getMessageText( ) {
		return sdriver.findElement(messageBy).getText();
	}

}
