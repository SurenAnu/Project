package org.Base_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.logging.FileHandler;

import javax.swing.Action;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Class_one {

	//web driver
	public static void url(WebDriver d, String url ) {
d.get(url);
	}
	
	public static void max(WebDriver d) {

		d.manage().window().maximize();
	}
	
	
	public static void title(WebDriver d) {
	String title = d.getTitle();
		System.out.println(title);
		
	}
	public static void geturl(WebDriver d){
		String url = d.getCurrentUrl();
		System.out.println(url);
	}
	public static void click(WebElement e) {
e.click();
	} 
	public static void sendkey(WebElement e, String s) {
	e.sendKeys(s);
	}
	public static  void getatt(WebElement e, String s) {
String string = e.getAttribute(s);
System.out.println(string);
	}
	public static void select(WebElement e, int n) {
	Select A = new Select(e);
			A.selectByIndex(n);
	}
	 
	public static void implicit(WebDriver d) {
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	public static void options(WebElement e) {
		Select a = new Select(e);
		List<WebElement> options = a.getOptions();
		for (WebElement opt : options) {
			String text = opt.getText();
			System.out.println(text);
		}}

		public static void js_click(WebDriver d , WebElement e) {
			JavascriptExecutor js = (JavascriptExecutor) d;
			js.executeScript("arguments[0].click()",e );
		}	
			
		public static void cont_pr(WebDriver d) throws AWTException {
			Robot a = new Robot();	
a.keyPress(KeyEvent.VK_CONTROL);
		}
public static void con_re(WebDriver d) throws AWTException {
	Robot a = new Robot();
	a.keyRelease(KeyEvent.VK_CONTROL);
		}
		public static void Tpr_key(WebDriver d) throws AWTException {
			Robot a = new Robot();	
a.keyPress(KeyEvent.VK_T);
		}
		public static void Tre_key(WebDriver d) throws AWTException {
			Robot a = new Robot();	
a.keyRelease(KeyEvent.VK_T);
		}
		public static void enter(WebDriver d) throws AWTException {
			Robot b = new Robot();	
b.keyPress(KeyEvent.VK_ENTER);
b.keyRelease(KeyEvent.VK_ENTER);
		}
		public static void down(WebDriver d) throws AWTException {
			Robot b = new Robot();	
b.keyPress(KeyEvent.VK_DOWN);
b.keyRelease(KeyEvent.VK_DOWN);
		}
	
		public static void Action_click(WebDriver d) {
			Actions a = new Actions(d);
	a.contextClick().build().perform();
		}
		public static void window_handle() {
		
		}
	
	
	public static void min(WebDriver d) {
		d.manage().window().minimize();

	}
	public static void screen(WebDriver d) throws IOException {
		TakesScreenshot A = (TakesScreenshot) d;
		File as = A.getScreenshotAs(OutputType.FILE);
		File st = new File("C:\\Users\\SURENANU\\eclipse-workspace\\Base_class\\pic\\picture.png");
		org.openqa.selenium.io.FileHandler.copy(as, st);
		
	}
	
			
		public static void sel_all_opt(WebElement e) {
			Select ss = new Select(e);
			List<WebElement> allSelectedOptions = ss.getAllSelectedOptions();
			for (WebElement webse : allSelectedOptions) {
				String text = webse.getText();
				System.err.println(text);
			}}
			
			
		
			public static void tourl(WebDriver  d , String s) {
				d.navigate().to(s);
				
			}
		
		
			
		public static void rightcl(WebDriver d,WebElement e ) {
			Actions b = new Actions(d);
			b.contextClick(e).build().perform();
		}
	
		public static void winhand(WebDriver d) {
			String handle = d.getWindowHandle();
			System.out.println(handle);
		}
		
	public static void winhans(WebDriver d) {
		Set<String> handles = d.getWindowHandles();
		
		System.out.println(handles);
	}
		
	public static void fore() {

	}
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
