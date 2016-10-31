package com.nemo.festselenium;

import org.junit.After;
import org.junit.Before;

import com.nemo.festselenium.selenium.DefaultJavaSelenium;

public abstract class BaseIntegerationTest {
    
	DefaultJavaSelenium selenium;
	String browserString = "*iexplore";
	String url= "http://localhost:8080/";

	void sleep(int ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}

	@Before
	public final void setUp() throws Exception {
		selenium = new DefaultJavaSelenium("localhost",4444, browserString , url);
		selenium.start();
		selenium.windowMaximize();

				
		onSetUp();
		
		selenium.open(getAppletUrl());
		// sleep 10s
		sleep(1000);
	}

	@After
	public final void tearDown() throws Exception {
		onTearDown();
		selenium.stop();
	}	
	
	abstract void onSetUp() ;
	abstract void onTearDown();
	abstract String getAppletUrl();
}
