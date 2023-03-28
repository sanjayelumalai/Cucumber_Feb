package com.pagaObjectManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.PageObjectModel.Loginpage;
import com.PageObjectModel.SearchHotel;

public class POmanager {

	public static WebDriver driver;

	private Loginpage login;

	private SearchHotel search;

	public Loginpage getLogin() {
		return login;
	}

	public SearchHotel getSearch() {
		return search;
	}

	public POmanager(WebDriver dri) {
		driver = dri;
		PageFactory.initElements(driver, this);

	}

}
