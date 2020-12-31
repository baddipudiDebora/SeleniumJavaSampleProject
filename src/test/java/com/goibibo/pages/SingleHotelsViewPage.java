package com.goibibo.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.goibibo.base.BaseClass;

public class SingleHotelsViewPage extends BaseClass {
	// checkInDatebutton
	@FindBy(xpath = "(//button[contains(text(),'Select')])[1]")
	private WebElement selectRoom;

	// hotelnameDisplayed
	@FindBy(xpath = "//h3[@itemprop='name']")
	private WebElement hotelName;

	// hotelAddressDisplayed
	@FindBy(xpath = "//address[@itemprop='address']")
	private WebElement hotelAddress;

	// hoteRatingDisplayed
	@FindBy(xpath = "//div[@itemprop='aggregateRating']")
	private WebElement hoteRating;

	// viewRoomsButon
	@FindBy(xpath = "//div[@class='TextFieldExpt__Tag-sc-7a7pro-0 fRzssR']")
	private WebElement viewRoomsButon;

	// roomDetailsDisplayed
	@FindBy(xpath = "//div[@class='Roomstyles__RoomTypeStyledWrapper-sc-1ivl7fs-2 fhtAew']")
	private WebElement roomDetails;

	// QandADisplayed
	@FindBy(xpath = "(//div[@class='Layouts__Row-sc-1yzlivq-0 Paginationstyles__ContentWrapperDiv-sc-7rloen-1 krRkIf jpILVX'])[1]")
	private WebElement QuestionsandAnsSec;

	// QandADisplayed
	@FindBy(xpath = "//p[@class='UserAnswerstyles__QuestionTextWrapper-sc-1c5jue4-5 gjbWLv']")
	private List<WebElement> QuestionsSec;

	// constructor
	public SingleHotelsViewPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void selectRoom() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		selectRoom.click();
	}

	public void getFirstHotelName() throws InterruptedException {
		String firstHotel = hotelName.getText();
		System.out.println("The Hotel name is " + firstHotel);
	}

	public void gethotelAddress() throws InterruptedException {
		String hotelAddressDisplayed = hotelAddress.getText();
		System.out.println("The Hotel location is " + hotelAddressDisplayed);
	}

	public void gethotelRating() throws InterruptedException {
		String hotelRatingDisplayed = hoteRating.getText();
		System.out.println("The Hotel guest reviews are " + hotelRatingDisplayed);
	}

	public void viewRooms() throws InterruptedException {
		viewRoomsButon.click();
	}

	public void getRoomDetials() throws InterruptedException {
		String roomDetailsDisplayed = roomDetails.getText();
		System.out.println("The Hotel guest reviews are " + roomDetailsDisplayed);
	}

	public void getQuestionAndAns() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,9000)");
		Thread.sleep(5000);
		int count = 1;
		for (WebElement we : QuestionsSec) {
			System.out.println("Question " + count);
			System.out.println(we.getText());
			count++;
		}
	}

}
