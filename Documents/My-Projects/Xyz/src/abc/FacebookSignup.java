package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignup {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("//a[@class=\"_97w5\"]")).click();
		driver.findElement(By.name("firstname")).sendKeys("Shivendra Vikram");
		driver.findElement(By.name("lastname")).sendKeys("Singh");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys("Shivendra@uncodemy.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Shivendra@uncodemy.com");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("Amazon@1234");
		Thread.sleep(2000);
		
		WebElement dateElement = driver.findElement(By.id("day"));
		WebElement monthElement = driver.findElement(By.id("month"));
		WebElement yearElement = driver.findElement(By.id("year"));
		
		Select datedropdown = new Select(dateElement);
		Select monthdropdown = new Select(monthElement);
		Select yeardropdown = new Select(yearElement);
		
		datedropdown.selectByVisibleText("30");
		Thread.sleep(2000);
		monthdropdown.selectByVisibleText("Aug");
		Thread.sleep(2000);
		yeardropdown.selectByVisibleText("1993");
		
		Thread.sleep(2000);
		
		//Gender section
		driver.findElement(By.xpath("//input[@type= 'radio' and @value = '2']")).click();
		//signup
		//driver.findElement(By.name("websubmit")).click();
		
		Thread.sleep(2000);
		driver.close();
		
		
		
	
	}
}

	//public void signup() {
		//Asd fs = new Asd();
        
        //fs.invokeBrowser();
        //fs.signup();
		
	//}

	//public void invokeBrowser() {
		// TODO Auto-generated method stub
		
	//}

	


