package org.sel1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class Selin {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		// WebDriver driver1 = new InternetExplorerDriver();

		// driver.get("https://www.selenium.dev/");
		//
		//// driver1.get("https://www.flipkart.com/");
		//
		// String title = driver.getTitle();
		// System.out.println(title);
		// String pageSource = driver.getPageSource();
		// System.out.println(pageSource);
		////
		// String title1 = driver1.getTitle();
		// System.out.println(title1);

		// WebDriver driver2 = new FirefoxDriver();

		// amazon

		// driver.get("https://www.amazon.in/");
		// WebElement findElement =
		// driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		// findElement.sendKeys("iphone 16");
		// findElement.sendKeys(Keys.ENTER);

		// facebook
		// driver.get("https://www.facebook.com/");
		// driver.findElement(By.xpath("//input[@data-testid='royal-email']")).sendKeys("7010326027");
		// driver.findElement(By.xpath("//input[@data-testid='royal-pass']")).sendKeys("939383835035");
		// driver.findElement(By.xpath("//button[@data-testid='royal-login-button']")).click();

		// hdfc

		// driver.get("https://netbanking.hdfcbank.com/netbanking/");
		// driver.findElement(By.name("fldLoginUserId")).sendKeys("java");
		// driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("84949388");

		// snapdeal

		// driver.get("https://www.snapdeal.com/login");
		// driver.findElement(By.xpath("//input[contains(@id,'userName')]")).sendKeys("7010326027");
		// driver.findElement(By.xpath("//button[text()='continue']")).click();

		// instagram

		// driver.get("https://www.instagram.com/");
		// driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("patrickvasanth");
		// driver.findElement(By.xpath("//input[contains(@aria-label,'Pass')]")).sendKeys("1234567");
		// driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();

		// Automation testing

		// driver.get("http://demo.automationtesting.in/Register.html");
		// driver.findElement(By.xpath("//input[@placeholder='First
		// Name']")).sendKeys("Patrick");
		// driver.findElement(By.xpath("//input[@placeholder='Last
		// Name']")).sendKeys("Vasanth");
		// driver.findElement(By.xpath("//textarea[contains(@ng-model,'Adress')]")).sendKeys("2/90,
		// church street");

		// adactinhotelapp

		// driver.get("http://adactinhotelapp.com/");
		// driver.findElement(By.id("username")).sendKeys("Patrick");
		// driver.findElement(By.id("password")).sendKeys("1223450");
		// driver.findElement(By.id("login")).click();

		// greenstech

		// driver.get("https://greenstech.in/selenium-course-content.html");
		// driver.findElement(By.xpath("//i[contains(@class,'fas fa-plus')]")).click();
		// driver.findElement(By.xpath("//a[contains(@title, 'Interview
		// Questions')]")).click();

		// driver.get("http://www.greenstechnologys.com");
		// List<WebElement> findElements =
		// driver.findElements(By.className("red_text"));
		//
		// for(WebElement element : findElements) {
		// System.out.println(element.getText());
		// }

		// driver.get("http://greenstech.in/selenium-course-content.html");
		// driver.findElement(By.xpath("//"))

		// driver.get("http://greenstech.in/selenium-course-content.html");
		//
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// WebElement findElement =
		// driver.findElement(By.xpath("(//p[contains(@class,'mail-info')])[1]"));
		// System.out.println(findElement.getText());

//		driver.get("http://greenstech.in/selenium-course-content.html");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement findElement = driver.findElement(By.xpath("(//p[contains(@class,'mail-info')])[3]"));
//		System.out.println(findElement.getText());
		
		
//		driver.get("https://www.greenstechnologys.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement findElement = driver.findElement(By.xpath("(//p[@style='text-align:justify; font-size:18px;'])[2]"));
//		
//		System.out.println(findElement.getText());
		
//		driver.get("https://www.facebook.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//input[@data-testid='royal-email']")).sendKeys("7010326027");
//		driver.findElement(By.xpath("//input[@data-testid='royal-pass']")).sendKeys("939383835035");
//		driver.findElement(By.xpath("//button[@data-testid='royal-login-button']")).click();
//		
//		String attribute2 = driver.findElement(By.xpath("//input[@data-testid='royal-email']")).getAttribute("value");
//		String attribute = driver.findElement(By.xpath("//input[@data-testid='royal-pass']")).getAttribute("value");
//		
//		System.out.println(attribute2+attribute);
//		
//		
//		
//		driver.quit();
		
//		driver.get("https://www.flipkart.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		WebElement findElement = driver.findElement(By.xpath("//input[contains(@title,'Search')]"));
//		
//		findElement.sendKeys("iphone");
//		findElement.sendKeys(Keys.ENTER);
//		
//		
//		WebElement findElement2 = driver.findElement(By.xpath("(//div[contains(@class,'tUxRFH')])[1]"));
//		
//		findElement2.click();
		
//		driver.get("http://demo.guru99.com/test/drag_drop.html ");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		Actions a = new Actions(driver);
//		
//		WebElement from = driver.findElement(By.xpath("//li[@id='credit2']"));
//		WebElement to = driver.findElement(By.xpath("//ol[@id='bank']"));
//		WebElement from1 = driver.findElement(By.xpath("(//li[@id='fourth'])[2]"));
//		WebElement to1 = driver.findElement(By.xpath("//ol[@id='amt7']"));
//		a.dragAndDrop(from,to).perform();
//		a.dragAndDrop(from1,to1).perform();
		
		
//		driver.get("https://www.amazon.in/");
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	
//		Actions a = new Actions(driver);
//		
//		WebElement prime = driver.findElement(By.xpath("//div[@id='nav-link-amazonprime']"));
//		
//		a.moveToElement(prime).perform();
//		
//		WebElement findElement = driver.findElement(By.xpath("//img[@id='multiasins-img-link']"));
//		a.click(findElement).perform();
		
		
//		driver.get(" http://www.flipkart.com");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		Actions a = new Actions(driver);
//		
//		WebElement furniture = driver.findElement(By.xpath("//div[@class='YBLJE4']"));
//		
//		a.moveToElement(furniture).perform();
//		
//		WebElement towel = driver.findElement(By.xpath("//a[contains(text(),'Bath linen')]"));
//	
//		a.click(towel).perform();
//		
//		WebElement prints = driver.findElement(By.xpath("(//a[@class='wjcEIp'])[3]"));
//		System.out.println(prints.getAttribute("innerText"));
		
		
//		driver.get("https://www.shopclues.com/wholesale.html");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		Actions a = new Actions(driver);
//		
//		WebElement findElement = driver.findElement(By.xpath("//li[@id='nav_44']"));
//		
//		a.moveToElement(findElement).perform();
//		
//		WebElement findElement2 = driver.findElement(By.xpath("//a[contains(@alt,'CT@Samsung')]"));
//		
//		a.click(findElement2).perform();
//		
//		WebElement findElement3 = driver.findElement(By.xpath("//label[@for='Above 5000']"));
//		
//		a.click(findElement3).perform();
		
		
//		driver.get("https://www.shopclues.com/wholesale.html");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		Actions a = new Actions(driver);
//		
//		WebElement findElement = driver.findElement(By.xpath("//li[@id='nav_45']"));
//		
//		a.moveToElement(findElement).perform();
//		
//		
//		WebElement findElement2 = driver.findElement(By.xpath("//a[contains(@alt,'CT@Weight Gainers')]"));
//	
//		a.click(findElement2).perform();
		
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions a = new Actions(driver);
		
		WebElement findElement = driver.findElement(By.xpath("//div[@title='Courses']"));
		
		a.moveToElement(findElement).perform();
		
		
		WebElement findElement2 = driver.findElement(By.xpath("//div[@title='Software Testing']"));
		
		a.moveToElement(findElement2).perform();
		
		WebElement findElement3 = driver.findElement(By.xpath("//span[contains(text(),'Selenium Certification')]"));
		
		a.click(findElement3).perform();
	}
}
