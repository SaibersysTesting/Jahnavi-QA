package sairam;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;



public class Swdpractice {
	@Test
	public <FireFoxDriver> void example()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jahanavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//FireFoxDriver driver = new FirefoxDriver();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("pinintijahnavi@yahoo.in");
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys("findajskdxnd");
		driver.findElement(By.id("u_0_w")).click();
	}

}
