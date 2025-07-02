package org.sel1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Selin {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {

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

		// driver.get("http://greenstech.in/selenium-course-content.html");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// WebElement findElement =
		// driver.findElement(By.xpath("(//p[contains(@class,'mail-info')])[3]"));
		// System.out.println(findElement.getText());

		// driver.get("https://www.greenstechnologys.com/");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// WebElement findElement =
		// driver.findElement(By.xpath("(//p[@style='text-align:justify;
		// font-size:18px;'])[2]"));
		//
		// System.out.println(findElement.getText());

		// driver.get("https://www.facebook.com/");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.manage().window().maximize();
		// driver.findElement(By.xpath("//input[@data-testid='royal-email']")).sendKeys("7010326027");
		// driver.findElement(By.xpath("//input[@data-testid='royal-pass']")).sendKeys("939383835035");
		// driver.findElement(By.xpath("//button[@data-testid='royal-login-button']")).click();
		//
		// String attribute2 =
		// driver.findElement(By.xpath("//input[@data-testid='royal-email']")).getAttribute("value");
		// String attribute =
		// driver.findElement(By.xpath("//input[@data-testid='royal-pass']")).getAttribute("value");
		//
		// System.out.println(attribute2+attribute);
		//
		//
		//
		// driver.quit();

		// driver.get("https://www.flipkart.com/");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//
		// WebElement findElement =
		// driver.findElement(By.xpath("//input[contains(@title,'Search')]"));
		//
		// findElement.sendKeys("iphone");
		// findElement.sendKeys(Keys.ENTER);
		//
		//
		// WebElement findElement2 =
		// driver.findElement(By.xpath("(//div[contains(@class,'tUxRFH')])[1]"));
		//
		// findElement2.click();

		// driver.get("http://demo.guru99.com/test/drag_drop.html ");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//
		// Actions a = new Actions(driver);
		//
		// WebElement from = driver.findElement(By.xpath("//li[@id='credit2']"));
		// WebElement to = driver.findElement(By.xpath("//ol[@id='bank']"));
		// WebElement from1 = driver.findElement(By.xpath("(//li[@id='fourth'])[2]"));
		// WebElement to1 = driver.findElement(By.xpath("//ol[@id='amt7']"));
		// a.dragAndDrop(from,to).perform();
		// a.dragAndDrop(from1,to1).perform();

		// driver.get("https://www.amazon.in/");
		//
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//
		// Actions a = new Actions(driver);
		//
		// WebElement prime =
		// driver.findElement(By.xpath("//div[@id='nav-link-amazonprime']"));
		//
		// a.moveToElement(prime).perform();
		//
		// WebElement findElement =
		// driver.findElement(By.xpath("//img[@id='multiasins-img-link']"));
		// a.click(findElement).perform();

		// driver.get(" http://www.flipkart.com");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Actions a = new Actions(driver);
		//
		// WebElement furniture =
		// driver.findElement(By.xpath("//div[@class='YBLJE4']"));
		//
		// a.moveToElement(furniture).perform();
		//
		// WebElement towel = driver.findElement(By.xpath("//a[contains(text(),'Bath
		// linen')]"));
		//
		// a.click(towel).perform();
		//
		// WebElement prints =
		// driver.findElement(By.xpath("(//a[@class='wjcEIp'])[3]"));
		// System.out.println(prints.getAttribute("innerText"));

		// driver.get("https://www.shopclues.com/wholesale.html");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Actions a = new Actions(driver);
		//
		// WebElement findElement = driver.findElement(By.xpath("//li[@id='nav_44']"));
		//
		// a.moveToElement(findElement).perform();
		//
		// WebElement findElement2 =
		// driver.findElement(By.xpath("//a[contains(@alt,'CT@Samsung')]"));
		//
		// a.click(findElement2).perform();
		//
		// WebElement findElement3 = driver.findElement(By.xpath("//label[@for='Above
		// 5000']"));
		//
		// a.click(findElement3).perform();

		// driver.get("https://www.shopclues.com/wholesale.html");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Actions a = new Actions(driver);
		//
		// WebElement findElement = driver.findElement(By.xpath("//li[@id='nav_45']"));
		//
		// a.moveToElement(findElement).perform();
		//
		//
		// WebElement findElement2 =
		// driver.findElement(By.xpath("//a[contains(@alt,'CT@Weight Gainers')]"));
		//
		// a.click(findElement2).perform();

		// driver.get("http://greenstech.in/selenium-course-content.html");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Actions a = new Actions(driver);
		//
		// WebElement findElement =
		// driver.findElement(By.xpath("//div[@title='Courses']"));
		//
		// a.moveToElement(findElement).perform();
		//
		//
		// WebElement findElement2 = driver.findElement(By.xpath("//div[@title='Software
		// Testing']"));
		//
		// a.moveToElement(findElement2).perform();
		//
		// WebElement findElement3 =
		// driver.findElement(By.xpath("//span[contains(text(),'Selenium
		// Certification')]"));
		//
		// a.click(findElement3).perform();
		//
		////
		// driver.get("https://www.snapdeal.com/");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.manage().window().maximize();
		// Actions a = new Actions(driver);
		//
		// WebElement findElement =
		// driver.findElement(By.xpath("//span[contains(text(),'Mobile &
		// Accessories')]"));
		//
		// a.moveToElement(findElement).perform();
		//
		// WebElement findElement2 =
		// driver.findElement(By.xpath("//span[contains(text(),'Printed Back
		// Covers')]"));
		//
		// a.click(findElement2).perform();
		//

		// driver.quit();
		////////////////////////////////////////////////////////////////////////////////////////

		// driver.get("https://www.flipkart.com/");
		// driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Actions a = new Actions(driver);
		//
		// WebElement findElement =
		// driver.findElement(By.xpath("//input[contains(@placeholder,'Search ')]"));
		// findElement.sendKeys("iphone");
		// findElement.sendKeys(Keys.ENTER);
		// WebElement findElement2 =
		// driver.findElement(By.xpath("//span[contains(@class,'BUOuZu')]"));
		// String attribute = findElement2.getAttribute("innerText");
		// String[] split = attribute.split(" ");
		//
		// System.out.println(split[5]);
		//
		// List<WebElement> findElements =
		// driver.findElements(By.xpath("//div[contains(@class,'KzDlHZ')]"));
		// List<WebElement> findElements2 =
		// driver.findElements(By.xpath("//div[contains(@class,'Nx9bqj _4b5DiR')]"));
		//
		// int size = Math.min(findElements.size(), findElements2.size());
		//
		// ArrayList<Integer> priceList = new ArrayList<>();
		//
		// for (int i = 0; i < size; i++) {
		// String text1 = findElements.get(i).getText();
		// String text2 = findElements2.get(i).getText();
		// String cleanPrice = text2.replaceAll("[^0-9.]", "");
		// int price = Integer.parseInt(cleanPrice);
		// priceList.add(price);
		// System.out.println("Title : " + text1 + " | Price : " + price);
		//
		// }
		// int maxPrice = Collections.max(priceList);
		// int minPrice = Collections.min(priceList);
		//
		// System.out.println("Max Price : "+maxPrice+ " "+ "Min Price : " +minPrice);
		///////////////////////////////////////////////////////////////////////////////////////////

		// driver.get("https://www.facebook.com/");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.manage().window().maximize();
		// Actions a = new Actions(driver);
		//
		// Robot r = new Robot();
		//
		// WebElement findElement = driver.findElement(By.id("email"));

		// r.keyPress(KeyEvent.VK_CAPS_LOCK);
		// r.keyPress(KeyEvent.VK_P);
		// r.keyRelease(KeyEvent.VK_P);
		// r.keyPress(KeyEvent.VK_A);
		// r.keyRelease(KeyEvent.VK_A);
		// r.keyPress(KeyEvent.VK_T);
		// r.keyRelease(KeyEvent.VK_T);
		// r.keyPress(KeyEvent.VK_R);
		// r.keyRelease(KeyEvent.VK_R);
		// r.keyPress(KeyEvent.VK_I);
		// r.keyRelease(KeyEvent.VK_I);
		// r.keyPress(KeyEvent.VK_C);
		// r.keyRelease(KeyEvent.VK_C);
		// r.keyPress(KeyEvent.VK_K);
		// r.keyRelease(KeyEvent.VK_K);
		// r.keyRelease(KeyEvent.VK_CAPS_LOCK);

		// r.keyPress(KeyEvent.VK_SHIFT);
		// r.keyPress(KeyEvent.VK_P);
		// r.keyRelease(KeyEvent.VK_P);
		// r.keyRelease(KeyEvent.VK_SHIFT);
		//
		// r.keyPress(KeyEvent.VK_SHIFT);
		// r.keyPress(KeyEvent.VK_A);
		// r.keyRelease(KeyEvent.VK_A);
		// r.keyRelease(KeyEvent.VK_SHIFT);
		//
		// r.keyPress(KeyEvent.VK_SHIFT);
		// r.keyPress(KeyEvent.VK_T);
		// r.keyRelease(KeyEvent.VK_T);
		// r.keyRelease(KeyEvent.VK_SHIFT);
		//
		// r.keyPress(KeyEvent.VK_SHIFT);
		// r.keyPress(KeyEvent.VK_R);
		// r.keyRelease(KeyEvent.VK_R);
		// r.keyRelease(KeyEvent.VK_SHIFT);
		//
		//
		// r.keyPress(KeyEvent.VK_SHIFT);
		// r.keyPress(KeyEvent.VK_I);
		// r.keyRelease(KeyEvent.VK_I);
		// r.keyRelease(KeyEvent.VK_SHIFT);
		//
		// r.keyPress(KeyEvent.VK_SHIFT);
		// r.keyPress(KeyEvent.VK_C);
		// r.keyRelease(KeyEvent.VK_C);
		// r.keyRelease(KeyEvent.VK_SHIFT);
		//
		// r.keyPress(KeyEvent.VK_SHIFT);
		// r.keyPress(KeyEvent.VK_K);
		// r.keyRelease(KeyEvent.VK_K);
		// r.keyRelease(KeyEvent.VK_SHIFT);

		// findElement.sendKeys("Patrickgmailcom");
		// a.doubleClick(findElement).perform();
		//
		// a.contextClick(findElement).perform();
		//
		// for(int i = 0;i<3;i++) {
		// r.keyPress(KeyEvent.VK_DOWN);
		// r.keyRelease(KeyEvent.VK_DOWN);
		// }
		//
		// r.keyPress(KeyEvent.VK_ENTER);
		//
		// WebElement findElement2 = driver.findElement(By.id("pass"));
		//
		// a.contextClick(findElement2).perform();
		//
		// for(int i = 0;i<4;i++) {
		// r.keyPress(KeyEvent.VK_DOWN);
		// r.keyRelease(KeyEvent.VK_DOWN);
		// }
		//
		// r.keyPress(KeyEvent.VK_ENTER);

		// driver.get("https://www.google.com/webhp");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.manage().window().maximize();
		// Actions a = new Actions(driver);
		//
		// Robot r = new Robot();
		//
		// WebElement findElement =
		// driver.findElement(By.xpath("//textarea[contains(@role,'combobox')]"));
		//
		// findElement.sendKeys("vel murugan");
		//
		// r.keyPress(KeyEvent.VK_CONTROL);
		// r.keyPress(KeyEvent.VK_A);
		// r.keyRelease(KeyEvent.VK_CONTROL);
		// r.keyRelease(KeyEvent.VK_A);
		//
		// r.keyPress(KeyEvent.VK_CONTROL);
		// r.keyPress(KeyEvent.VK_X);
		// r.keyRelease(KeyEvent.VK_CONTROL);
		// r.keyRelease(KeyEvent.VK_X);

		// driver.get("http://greenstech.in/selenium-course-content.html");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.manage().window().maximize();
		// Actions a = new Actions(driver);
		// Robot r = new Robot();

		// WebElement findElement =
		// driver.findElement(By.xpath("//div[@id='heading20']"));
		//
		// a.click(findElement).perform();
		//
		// WebElement findElement2 =
		// driver.findElement(By.xpath("(//a[contains(@title,'Interview
		// Questions')])[6]"));
		//
		// a.contextClick(findElement2).perform();
		//
		// r.keyPress(KeyEvent.VK_DOWN);
		// r.keyRelease(KeyEvent.VK_DOWN);
		//
		// r.keyPress(KeyEvent.VK_ENTER);
		// r.keyRelease(KeyEvent.VK_ENTER);

		// driver.get("http://greenstech.in/selenium-course-content.html");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.manage().window().maximize();
		// Actions a = new Actions(driver);
		// Robot r = new Robot();
		//
		// WebElement findElement =
		// driver.findElement(By.xpath("//div[@id='heading304']"));
		//
		// a.click(findElement).perform();
		//
		// a.contextClick(findElement).perform();
		//
		// for(int i =0;i<11;i++) {
		// r.keyPress(KeyEvent.VK_DOWN);
		// r.keyRelease(KeyEvent.VK_DOWN);
		// }
		//
		// r.keyPress(KeyEvent.VK_ENTER);
		// r.keyRelease(KeyEvent.VK_ENTER);

		// driver.get("http://greenstech.in/selenium-course-content.html");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.manage().window().maximize();
		// Actions a = new Actions(driver);
		// Robot r = new Robot();
		//
		// WebElement findElement =
		// driver.findElement(By.xpath("//div[@id='heading201']"));
		// a.click(findElement).perform();
		//
		// for(int i =0;i<4;i++) {
		// r.keyPress(KeyEvent.VK_DOWN);
		// r.keyRelease(KeyEvent.VK_DOWN);
		// }
		//
		// a.contextClick(findElement).perform();
		//
		// for(int i =0;i<3;i++) {
		// r.keyPress(KeyEvent.VK_DOWN);
		// r.keyRelease(KeyEvent.VK_DOWN);
		// }
		//
		// r.keyPress(KeyEvent.VK_ENTER);
		// r.keyRelease(KeyEvent.VK_ENTER);

		// driver.get("https://www.snapdeal.com/");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.manage().window().maximize();
		// Actions a = new Actions(driver);
		// Robot r = new Robot();
		//
		// WebElement findElement =
		// driver.findElement(By.xpath("(//div[@index='0'])[2]"));
		//
		// a.contextClick(findElement).perform();
		//
		// for(int i = 0;i<2;i++) {
		// r.keyPress(KeyEvent.VK_DOWN);
		// r.keyPress(KeyEvent.VK_DOWN);
		// }
		//
		// r.keyPress(KeyEvent.VK_ENTER);
		// r.keyRelease(KeyEvent.VK_ENTER);

		// driver.get(
		// "https://www.cleartrip.com/flights?utm_source=google&utm_medium=cpc&utm_campaign=BR_Cleartrip-Desktab&dxid=CjwKCAjwx8nCBhAwEiwA_z__0_l1ll7H-uZeWknbtx0bXj2FOzKFYsqNxVGHp6__xam-qfxphBmsnBoCm8gQAvD_BwE&gad_source=1&gad_campaignid=88884643&gbraid=0AAAAADu9zM0md2NknFRzdYDhQN2dsCVXn&gclid=CjwKCAjwx8nCBhAwEiwA_z__0_l1ll7H-uZeWknbtx0bXj2FOzKFYsqNxVGHp6__xam-qfxphBmsnBoCm8gQAvD_BwE");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.manage().window().maximize();
		// Actions a = new Actions(driver);
		// Robot r = new Robot();
		//
		//
		// Thread.sleep(3000);
		//
		// WebElement findElement4 =
		// driver.findElement(By.xpath("//svg[@data-testid='closeIcon']"));
		// findElement4.click();
		//
		// WebElement findElement =
		// driver.findElement(By.xpath("//input[contains(@placeholder,'Where
		// from?')]"));
		//
		// findElement.sendKeys("Dubai");
		//
		// WebElement findElement2 =
		// driver.findElement(By.xpath("//input[contains(@placeholder,'Where to?')]"));
		//
		// findElement2.sendKeys("India");
		//
		// WebElement findElement3 =
		// driver.findElement(By.xpath("//button[contains(@class,'sc-dAlyuH')]"));
		//
		// findElement3.click();

		// driver.get("https://www.facebook.com/");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.manage().window().maximize();
		// Actions a = new Actions(driver);
		// Robot r = new Robot();
		//
		// WebElement findElement =
		// driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		//
		// findElement.click();
		//
		// WebElement findElement2 =
		// driver.findElement(By.xpath("//select[@id='month']"));
		//
		// Select s = new Select(findElement2);
		//
		// s.selectByIndex(2);

		// driver.get("https://demo.automationtesting.in/Alerts.html");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.manage().window().maximize();
		// Actions a = new Actions(driver);
		//
		// WebElement findElement =
		// driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		// a.click(findElement).perform();
		// Alert alert = driver.switchTo().alert();
		//
		// alert.accept();
		//
		// Thread.sleep(2000);
		//
		// driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		//
		// driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		//
		// alert.accept();
		//
		// Thread.sleep(2000);
		//
		// driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		//
		// driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		//
		// alert.sendKeys("Patrick");
		//
		// alert.accept();
		//
		//
		// driver.get("https://netbanking.hdfcbank.com/netbanking/");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.manage().window().maximize();
		//
		// Alert alert = driver.switchTo().alert();
		//
		//
		// WebElement findElement =
		// driver.findElement(By.xpath("//a[contains(@class,'login-btn')]"));
		//
		// findElement.click();
		//
		// Thread.sleep(2000);
		//
		// alert.accept();

		// driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.manage().window().maximize();
		////
		//
		// driver.findElement(By.xpath("//a[@class='login_button']")).click();
		//
		// driver.findElement(By.id("Button2")).click();
		//
		//
		// Alert alert = driver.switchTo().alert();
		//
		// System.out.println(alert.getText());
		//
		// alert.accept();

		// driver.get("https://netbanking.hdfcbank.com/netbanking/");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.manage().window().maximize();
		//
		// driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("12343452");
		//
		// driver.findElement(By.xpath("//a[contains(@onclick,'fLogon()')]")).click();

		// driver.get("https://www.icicibank.com/personal-banking/insta-banking/internet-banking");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.manage().window().maximize();
		// Actions a = new Actions(driver);
		//
		//
		// driver.findElement(By.id("modal-close")).click();
		//
		// driver.findElement(By.xpath("//div[@class='popup-close']")).click();
		//
		// Thread.sleep(2000);
		//
		// WebElement findElement =
		// driver.findElement(By.xpath("//button[contains(@class,'login-toggle')]"));
		//
		// a.moveToElement(findElement).perform();
		//
		//
		// driver.findElement(By.xpath("//a[@title='Personal ']")).click();

		// Alert alert = driver.switchTo().alert();

		//
		// driver.get("https://demo.automationtesting.in/Alerts.html");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.manage().window().maximize();

		// TakesScreenshot tk = (TakesScreenshot)(driver);
		//
		// File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
		//
		//
		// File f = new
		// File("C:\\Users\\Lenovo\\eclipse-workspace\\Selenium1\\ScreenShot\\testing.png");
		//
		//
		// FileUtils.copyFile(screenshotAs, f);

		// TakesScreenshot tk = (TakesScreenshot)(driver);
		//
		// WebElement findElement =
		// driver.findElement(By.xpath("//div[contains(@class,'nav-tabs')]"));
		//
		// File screenshotAs = findElement.getScreenshotAs(OutputType.FILE);
		//
		//
		// File f = new
		// File("C:\\Users\\Lenovo\\eclipse-workspace\\Selenium1\\ScreenShot\\testing.png");
		//
		//
		// FileUtils.copyFile(screenshotAs, f);

		// driver.get("http://www.greenstechnologys.com/");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.manage().window().maximize();
		//
		// TakesScreenshot tk = (TakesScreenshot)(driver);
		////
		// File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
		//
		// File f = new
		// File("C:\\Users\\Lenovo\\eclipse-workspace\\Selenium1\\ScreenShot\\greens.png");
		//
		// FileUtils.copyFile(screenshotAs, f);

		// driver.get("http://www.greenstechnologys.com/");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.manage().window().maximize();
		//
		// TakesScreenshot tk = (TakesScreenshot)(driver);
		//
		// JavascriptExecutor je = (JavascriptExecutor)(driver);
		//
		// WebElement findElement =
		// driver.findElement(By.xpath("(//span[@class='red_text'])[6]"));
		//
		// je.executeScript("arguments[0].scrollIntoView(true)", findElement);
		//
		//
		// File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
		//
		// File f = new
		// File("C:\\Users\\Lenovo\\eclipse-workspace\\Selenium1\\ScreenShot\\perumbakkan.png");
		//
		// FileUtils.copyFile(screenshotAs, f);

		// driver.get("http://toolsqa.com/");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.manage().window().maximize();
		//
		//// TakesScreenshot tk = (TakesScreenshot)(driver);
		//
		// JavascriptExecutor je = (JavascriptExecutor)(driver);
		//
		// WebElement findElement =
		// driver.findElement(By.xpath("//div[contains(@class,'latest-articles')]"));
		//
		// je.executeScript("arguments[0].scrollIntoView(true)", findElement);

		// driver.get("https://greenstech.in/selenium-course-content.html");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.manage().window().maximize();
		//
		// TakesScreenshot tk = (TakesScreenshot)(driver);
		//
		// JavascriptExecutor je = (JavascriptExecutor)(driver);
		//
		// WebElement findElement =
		// driver.findElement(By.xpath("//h2[contains(text(),'Interview Questions')]"));
		//
		// je.executeScript("arguments[0].scrollIntoView(true)", findElement);
		//
		// WebElement findElement3 =
		// driver.findElement(By.xpath("//h2[contains(text(),'Job Openings')]"));
		//
		// findElement3.click();
		//
		// Thread.sleep(2000);
		//
		// File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
		//
		// File f = new
		// File("C:\\Users\\Lenovo\\eclipse-workspace\\Selenium1\\ScreenShot\\jobopenings.png");
		//
		// FileUtils.copyFile(screenshotAs, f);
		//
		// WebElement findElement2 =
		// driver.findElement(By.xpath("//h3[contains(text(),'Online Classroom')]"));
		//
		// je.executeScript("arguments[0].scrollIntoView(true)", findElement2);

		// Top Selenium Trends

		// driver.get("https://greenstech.in/selenium-course-content.html");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.manage().window().maximize();
		//
		// TakesScreenshot tk = (TakesScreenshot)(driver);
		//
		// JavascriptExecutor je = (JavascriptExecutor)(driver);
		//
		// WebElement findElement =
		// driver.findElement(By.xpath("//h3[contains(text(),'Top Selenium Trends')]"));
		//
		// je.executeScript("arguments[0].scrollIntoView(true)", findElement);
		//
		//
		// File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
		//
		// File f = new
		// File("C:\\Users\\Lenovo\\eclipse-workspace\\Selenium1\\ScreenShot\\topselenium.png");
		//
		// FileUtils.copyFile(screenshotAs, f);

		// driver.get("https://greenstech.in/selenium-course-content.html");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.manage().window().maximize();
		//
		// TakesScreenshot tk = (TakesScreenshot) (driver);
		// JavascriptExecutor je = (JavascriptExecutor)(driver);
		//
		// WebElement findElement2 =
		// driver.findElement(By.xpath("//span[text()='Certification']"));
		//
		// WebElement findElement =
		// driver.findElement(By.xpath("//h2[contains(text(),'Interview Questions')]"));
		//
		// je.executeScript("arguments[0].scrollIntoView(true)", findElement2);
		//
		// findElement.click();
		//
		//
		// Thread.sleep(2000);
		//
		// File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
		////
		// File f = new
		// File("C:\\Users\\Lenovo\\eclipse-workspace\\Selenium1\\ScreenShot\\interviewquestion.png");
		//
		// FileUtils.copyFile(screenshotAs, f);

		// driver.get("https://www.flipkart.com/");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.manage().window().maximize();
		// Actions a = new Actions(driver);
		//
		// TakesScreenshot tk = (TakesScreenshot) (driver);
		//
		// WebElement findElement =
		// driver.findElement(By.xpath("//div[@class='_1wE2Px']"));
		//
		// a.moveToElement(findElement);
		//
		// File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
		//
		// File f = new
		// File("C:\\Users\\Lenovo\\eclipse-workspace\\Selenium1\\ScreenShot\\flipkartfashion.png");
		//
		// FileUtils.copyFile(screenshotAs, f);

		// driver.get("http://adactinhotelapp.com/");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.manage().window().maximize();
		//
		// // Select s = new Select(element)
		//
		// driver.findElement(By.id("username")).sendKeys("Patrick1234");
		//
		// driver.findElement(By.id("password")).sendKeys("Pat@123456");
		//
		// driver.findElement(By.id("login")).click();
		//
		// Thread.sleep(2000);
		//
		// WebElement location = driver.findElement(By.id("location"));
		//
		// Select s = new Select(location);
		//
		// s.selectByIndex(2);
		//
		// WebElement hotel = driver.findElement(By.id("hotels"));
		//
		// Select s1 = new Select(hotel);
		//
		// s1.selectByIndex(2);
		//
		// WebElement roomtype = driver.findElement(By.id("room_type"));
		//
		// Select s2 = new Select(roomtype);
		//
		// s2.selectByIndex(3);
		//
		// WebElement noOfRoom = driver.findElement(By.id("room_nos"));
		//
		// Select s3 = new Select(noOfRoom);
		//
		// s3.selectByIndex(2);
		//
		// WebElement findElement = driver.findElement(By.id("datepick_in"));
		//
		// findElement.clear();
		//
		// findElement.sendKeys("29/06/2025");
		//
		// WebElement findElement1 = driver.findElement(By.id("datepick_out"));
		//
		// findElement1.clear();
		//
		// findElement1.sendKeys("30/06/2025");
		//
		// WebElement adult_room = driver.findElement(By.id("adult_room"));
		//
		// Select s4 = new Select(adult_room);
		// s4.selectByIndex(3);
		//
		// WebElement child_room = driver.findElement(By.id("child_room"));
		//
		// Select s5 = new Select(child_room);
		// s5.selectByIndex(2);
		//
		// driver.findElement(By.id("Submit")).click();
		//
		// Thread.sleep(2000);
		//
		// driver.findElement(By.id("radiobutton_0")).click();
		//
		// driver.findElement(By.id("continue")).click();
		//
		// driver.findElement(By.name("first_name")).sendKeys("Patrick");
		//
		// driver.findElement(By.name("last_name")).sendKeys("Vasanth");
		//
		// driver.findElement(By.id("address")).sendKeys("2/30 church street");
		//
		// driver.findElement(By.id("cc_num")).sendKeys("1234567890123456");
		//
		// WebElement cc_type = driver.findElement(By.id("cc_type"));
		//
		// Select s6 = new Select(cc_type);
		//
		// s6.selectByIndex(1);
		//
		// WebElement cc_exp_month = driver.findElement(By.id("cc_exp_month"));
		//
		// Select s7 = new Select(cc_exp_month);
		//
		// s7.selectByIndex(1);
		//
		// WebElement cc_exp_year = driver.findElement(By.id("cc_exp_year"));
		//
		// Select s8 = new Select(cc_exp_year);
		//
		// s8.selectByIndex(19);
		//
		// driver.findElement(By.id("cc_cvv")).sendKeys("124");
		//
		//
		// driver.findElement(By.id("book_now")).click();
		//
		// Thread.sleep(4000);
		//
		// driver.findElement(By.xpath("//a[contains(text(),'Booked
		// Itinerary')]")).click();
		//
		//
		// driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		//
		// driver.findElement(By.name("cancelall")).click();
		//
		// Alert a = driver.switchTo().alert();
		//
		// a.accept();

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		List<WebElement> tables = driver.findElements(By.tagName("table"));

		// WebElement table = tables.get(0);

		WebElement table1 = driver.findElement(By.id("customers"));

		String text = table1.getText();
		// System.out.println(text);

		// to get all the row
		List<WebElement> totalrow = table1.findElements(By.tagName("tr"));

		// to get the particular index
		WebElement firstrow = totalrow.get(1);

		// System.out.println(firstrow.getText());

		// get all data in the row
		for (WebElement eachRow : totalrow) {
			// System.out.println(eachRow.getText());
		}

		// get the heading through table->row->heading

		// for(int i=0 ;i<totalrow.size();i++) {
		// WebElement eachRow = totalrow.get(i);
		// List<WebElement> totalheading = eachRow.findElements(By.tagName("th"));
		// for(int j =0 ;j<totalheading.size();j++) {
		// WebElement eachHeading = totalheading.get(j);
		// String text2 = eachHeading.getText();
		//// System.out.println(text2);
		// }
		// }

		// table->heading
		// List<WebElement> totalheading = table1.findElements(By.tagName("th"));
		// for(int j =0 ;j<totalheading.size();j++) {
		// WebElement eachHeading = totalheading.get(j);
		// String text2 = eachHeading.getText();
		//// System.out.println(text2);
		// }

		// table->tr>->td

		// for (int i = 0; i < totalrow.size(); i++) {
		// WebElement eachRow = totalrow.get(i);
		// List<WebElement> totaldata = eachRow.findElements(By.tagName("td"));
		// for (int j = 0; j < totaldata.size(); j++) {
		// WebElement eachdata = totaldata.get(j);
		// String text2 = eachdata.getText();
		// System.out.println(text2);
		// }
		//
		// }

		// table->td

		// List<WebElement> totaldata = table1.findElements(By.tagName("td"));
		// for (int j = 0; j < totaldata.size(); j++) {
		// WebElement eachdata = totaldata.get(j);
		// String text2 = eachdata.getText();
		// System.out.print(text2+"");
		// System.out.println("");
		//
		// }

		for (int i = 0; i < totalrow.size(); i++) {
			WebElement eachRow = totalrow.get(i);
			List<WebElement> totaldata = eachRow.findElements(By.tagName("td"));
			for (int j = 0; j < totaldata.size(); j++) {
				WebElement eachdata = totaldata.get(j);
				String text2 = eachdata.getText();
				if(text2.equals("Austria")) {
					System.out.println(text2);
					
					//Entrie row of the data
					
					System.out.println(eachRow.getText());
					
					System.out.println("Row position:"+i + "Column Position"+ j);
				}
			}

		}

	}

}
