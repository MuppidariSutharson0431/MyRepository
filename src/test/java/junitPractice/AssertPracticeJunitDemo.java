package junitPractice;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class AssertPracticeJunitDemo {
	
	@Test
	public void tc1() {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.facebook.com/");
		String actual = driver.getCurrentUrl();
		String expected="https://www.facebook.c/";
		Assert.assertEquals(actual, expected);
		String title = driver.getTitle();
		System.out.println(title);
		

	}
	
	@Test
	public void tc2() {
		SoftAssert s=new SoftAssert();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.facebook.com/");
		String actual = driver.getCurrentUrl();
		String expected="https://www.facebook.c/";
		s.assertEquals(actual, expected);
		String title = driver.getTitle();
		System.out.println(title);
		s.assertAll();
	}

}
