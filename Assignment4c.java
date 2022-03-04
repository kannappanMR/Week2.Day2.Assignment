package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4c {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Button.html");
		System.out.println(driver.findElement(By.id("color")).getCssValue("background-color"));
		System.out.println(driver.findElement(By.id("color")).getText());
		System.out.println(driver.findElement(By.id("size")).getLocation());
		System.out.println(driver.findElement(By.id("color")).getSize());
		System.out.println(driver.findElement(By.id("color")).getTagName());
		System.out.println(driver.findElement(By.id("color")).isDisplayed());


	}

}
