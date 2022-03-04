package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4a {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/checkbox.html");

		System.out.println(driver.findElement(By.xpath("(//input[@type = 'checkbox'])[1]")).isSelected());
		System.out.println(driver.findElement(By.xpath("(//input[@type = 'checkbox'])[6]")).isSelected());

	}

}
