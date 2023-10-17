package com.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Headless {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--headless=new");
		
	WebDriverManager.chromedriver().setup();
	

	
	WebDriver driver = new ChromeDriver(option);
	
	driver.get("https://www.amazon.in/");
	
	
	System.out.print("Title is :" + driver.getTitle());
	
	driver.close();
	}

}
