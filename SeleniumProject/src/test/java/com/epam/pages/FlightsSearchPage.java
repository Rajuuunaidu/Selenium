package com.epam.pages;

import org.openqa.selenium.By;

public class FlightsSearchPage {
	private By messageBy = By.tagName("h1");
	private By from = By.xpath("//*[@id=\"c0LBu-origin\"]");
	private By to=By.xpath("//*[@id=\"c0LBu-destination\"]");
	private By dateOfJourney = By.xpath("//*[@id=\"c0LBu-depart-input\"]");
	private By Return = By.xpath("//*[@id=\"rqW4-return-input\"]");
	private By passengerCount = By.xpath("//*[@id=\"c0LBu-travelers\"]/div[1]");
	private By searchBar = By.xpath("//*[@id=\"c0LBu-submit\"]");
	private By cabinClass=By.xpath("//*[@id=\"c10IV-travelers_content\"]/div/div[2]/div[1]");
public static void setPassengerDetails() {
	
}

public void setReturnDate() {
	
}
public void setDateOfJourney() {
	
}
public void setCabinClass() {
	
}
/*rest Of the methods are same as StaySearchPAge we can reuse those functions*/
}
