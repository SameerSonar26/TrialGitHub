package com.demoProject.Utility;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.demoProject.exception.InvalidBrowserNameError;

public class Utility {

	public RemoteWebDriver driver;

	public void openBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			System.out.println("Launching Chrome Browser");
		} else if (browserName.equalsIgnoreCase("FireFox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			System.out.println("Launching FireFox Broser");
		} else if (browserName.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			System.out.println("Launching Edge Driver");
		} else {
			throw new InvalidBrowserNameError(browserName);

		}

	}

}
