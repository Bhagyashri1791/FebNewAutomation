package com.maven.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTestNg {
  @Test
 
  public void DemoTest1() throws InterruptedException 
  {
	  System.out.println("DmoTest1 method");
	  WebDriver driver=new FirefoxDriver();
	  driver.get("http://facebook.com");
	  Thread.sleep(3000);
	  driver.close();
}
}
