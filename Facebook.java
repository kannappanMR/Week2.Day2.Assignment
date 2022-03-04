package week2.day2.assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Kannappan");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Murugappan");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9042539879");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Siemens1234$");
		WebElement elementDropDown = driver.findElement(By.id("day"));
		Select dd = new Select(elementDropDown);
		dd.selectByValue("10");
		List<WebElement> options = dd.getOptions();
		for (int i = 0; i < options.size(); i++) {
			System.out.println(options.get(i).getText());
		}
		WebElement elementDropDown1 = driver.findElement(By.id("month"));
		Select dd1 = new Select(elementDropDown1);
		dd1.selectByValue("12");
		List<WebElement> options1 = dd1.getOptions();
		for (int j = 0; j < options1.size(); j++) {
			System.out.println(options1.get(j).getText());
		}
		WebElement elementDropDown2 = driver.findElement(By.id("year"));
		Select dd2 = new Select(elementDropDown2);
		dd2.selectByValue("2020");
		List<WebElement> options2 = dd2.getOptions();
		for (int k = 0; k < options2.size(); k++) {
			System.out.println(options2.get(k).getText());
		}

		driver.findElement(By.xpath("(//span[@data-name ='gender_wrapper']//input)[1]")).click();

	}

}
