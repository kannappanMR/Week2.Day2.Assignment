package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class = 'decorativeSubmit']")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//ul[@class = 'x-tab-strip x-tab-strip-top']//span)[5]")).click();
		driver.findElement(By.xpath("(//div[@class='x-form-item x-tab-item']//input)[5]"))
				.sendKeys("johnclament2000@gmail.com ");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class ='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		driver.findElement(By.xpath("//a[@class='subMenuButton'][1]")).click();
		if (driver.getTitle().contains("Duplicate Lead")) {
			System.out.println("i confirm that the title is Duplicate Lead");
		} else
			System.out.println("i confirm that the title does not have the word Duplicate Lead");

		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		driver.close();
	}

}
