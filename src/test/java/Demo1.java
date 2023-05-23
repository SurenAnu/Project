import java.awt.AWTException;
import java.util.Iterator;
import java.util.Set;

import org.Base_class.Class_one;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 extends Class_one {
	public static void main(String[] args) throws InterruptedException, AWTException {
	
	WebDriver driver = new ChromeDriver();
	url(driver, "https://www.facebook.com/");
	max(driver);
	title(driver);
	geturl(driver);
	WebElement login = driver.findElement(By.id("email"));
	click(login);
	sendkey(login, "kuttisurendhar");
	getatt(login, "type");
	getatt(login, "value");
    WebElement cl = driver.findElement(By.linkText("Create new account"));
    click(cl);
    implicit(driver);
    WebElement fn = driver.findElement(By.xpath("//input[@name='firstname']"));
    sendkey(fn, "apapa");
    WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
    select(day, 10);
    options(day);
    WebElement clo = driver.findElement(By.xpath("//img[@class='_8idr img']"));
    click(clo);
    cont_pr(driver);
    Tpr_key(driver);
    con_re(driver);
    Tre_key(driver);
    driver.get("https://search.yahoo.com/search?fr=mcafee&type=E211US1274G0&p=filehippo");
	
	WebElement ss = driver.findElement(By.xpath("(//div[.='Sign In'])[2]"));    
    String currentpage = driver.getWindowHandle();//B
    System.out.println(currentpage);
	Set<String> allpages = driver.getWindowHandles();//A,B
	
    for (String page : allpages) {
    	if (page.equals(currentpage)) {
    		System.out.println("its is reached inside loop ");
			driver.switchTo().window(currentpage);
			break;
		} else {

		}
    	
	}
    
    
    
    
    
    
    
    
    
}}
