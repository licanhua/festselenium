package com.nemo.festselenium.selenium;

import com.nemo.festselenium.fixture.AppletFixture;

public interface JavaSelenium {

	String eval(String action);

	AppletFixture applet(String name);
	
//	String getJSPrefix();
}
