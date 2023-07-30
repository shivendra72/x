package test;

import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Check {
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
	    this.driver = new ChromeDriver();
		String baseURL = "https://www.youtube.com/watch?v=hepoF1IUv8E";
		driver.manage().window().maximize();
		driver.get(baseURL);
	}

	

	@Test
	public void test() {
		driver.findElement(By.xpath("//*[@id=\"logo-icon\"]/yt-icon-shape/icon-shape/div")).click();
		
	}
	
	@After
	public void tearDown() throws Exception {
		
	}

}
