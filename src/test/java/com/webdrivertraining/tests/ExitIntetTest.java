package com.webdrivertraining.tests;



import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import com.webdrivertraining.testbase.TestBase;

public class ExitIntetTest extends TestBase {
	@Test
	public void IntentTest01() throws AWTException, InterruptedException {
String result,text="THIS IS A MODAL WINDOW";
		getDriver().get("http://the-internet.herokuapp.com/exit_intent");
		
		 Robot robot = new Robot();
		 robot.mouseMove(600,600);
		 Thread.sleep(500);
	     robot.mouseMove(600,0);
	     Thread.sleep(500);
	     result= getDriver().findElement(By.cssSelector("#ouibounce-modal > div.modal > div.modal-title > h3")).getText();
	     System.out.println(result);
	     assertEquals(text,result);
		
	}
	
	
}
