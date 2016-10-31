package com.nemo.festselenium.fixture;

import com.nemo.festselenium.fixture.AppletFixture;
import com.nemo.festselenium.fixture.ComponentContext;
import com.nemo.festselenium.selenium.JavaSelenium;

public class EchoSelenium implements JavaSelenium {

	String action;
	
	public String lastCommandResult() {
		return action;
	}
	@Override
	public String eval(String action) {
		return this.action = action;
	}
	
	@Override
	public AppletFixture applet(String name) {
		String appletId = "window.document.getElementById(\""+ name +"\")";
	
		ComponentContext appletContext = new ComponentContext(this, appletId,
				appletId + "." + ComponentContext.GET_APPLET_TEST_FIXTURE);
		return new AppletFixture(appletContext);
	};
	

}
