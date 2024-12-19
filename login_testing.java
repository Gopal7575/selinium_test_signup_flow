package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Git_Hub {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		
		//Create account process
		
		String create_account_link = "//a[@href='https://magento.softwaretestingboard.com/customer/account/create/']";
		driver.findElement(By.xpath(create_account_link)).click();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.jsReturnsValue("return document.readyState==='complete';"));
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Gopal");
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Krishna");
		driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys("gopalakrishna7575@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Gopal@123");
		driver.findElement(By.xpath("//input[@id='password-confirmation']")).sendKeys("Gopal@123");
		
		//sign in process
		
		String sign_in_link = "//a[@href='https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/']";
		driver.findElement(By.xpath("//button[@title='Create an Account']")).click();
		driver.findElement(By.xpath(sign_in_link));
	    driver.findElement(By.xpath("//input [@name='email']")).sendKeys("gopalakrishna7575@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Gopal@123");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	}
}
