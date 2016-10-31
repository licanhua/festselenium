package com.nemo.festselenium.selenium;

import com.nemo.festselenium.fixture.AppletFixture;
import com.nemo.festselenium.fixture.ComponentContext;
import com.thoughtworks.selenium.DefaultSelenium;

public class DefaultJavaSelenium extends DefaultSelenium implements
		JavaSelenium {

	private String jsPrefix;

	@Override
	public String eval(String action) {
		if (jsPrefix == null)
			throw new RuntimeException(
					"You didn't call JavaSelenium::start()\n");

		return getEval(action);
	}

	@Override
	public AppletFixture applet(String name) {
		if (name == null || name.length() == 0) {
			throw new RuntimeException(
					"applet name can't be null or zero length\n");
		}
		createPrefix(name);
	
		ComponentContext appletContext = new ComponentContext(this, jsPrefix,
				jsPrefix + "." + ComponentContext.GET_APPLET_TEST_FIXTURE);
		return new AppletFixture(appletContext);

	}

	public DefaultJavaSelenium(String pHost, int pPort, String pBrowserString,
			String pUrl) {
		super(pHost, pPort, pBrowserString, pUrl);
		jsPrefix = null;
	}

	private void createPrefix(String appletId) {
		String userAgent = getEval("navigator.userAgent");

		if (userAgent != null && !userAgent.isEmpty()) {
			if (userAgent.contains("Firefox") || userAgent.contains("MSIE")
					|| userAgent.contains("Safari")
					|| userAgent.contains("Opera")) {
				// JSPrefix = "window.document['" + ObjectID + "'].";
				jsPrefix = String.format(
						"window.document.getElementById(\"%s\")", appletId);
			} else
				// JSPrefix = "document['" + ObjectID + "'].";
				jsPrefix = String.format("document.getElementById(\"%s\")",
						appletId);
		}
	}

	private String getJSPrefix() {
		return jsPrefix;
	}

}
