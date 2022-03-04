package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	public static void main(String[] args) throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get( "http://leaftaps.com/opentaps/control/main");
	driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("Demosalesmanager");
	driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("crmsfa");
	driver.findElement(By.xpath("//input[@class = 'decorativeSubmit']")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.xpath("//div[@class ='x-tab-panel']//input[@name='firstName']")).sendKeys("test");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[@class ='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
	driver.getTitle();
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.xpath("//input[@id = 'updateLeadForm_companyName']")).clear();
	driver.findElement(By.xpath("//input[@id = 'updateLeadForm_companyName']")).sendKeys("TCS");
	driver.findElement(By.xpath("//input[@class = 'smallSubmit']")).click();
}

}
