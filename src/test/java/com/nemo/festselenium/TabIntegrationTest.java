package com.nemo.festselenium;

import static org.junit.Assert.*;

import org.junit.Test;

import com.nemo.festselenium.fixture.AppletFixture;
import com.nemo.festselenium.fixture.TabbedPaneFixture;

public class TabIntegrationTest extends BaseIntegerationTest {
    String TAB_APPLET_ID = "tab_applet";

	@Test
	public void test() {
		AppletFixture af = selenium.applet(TAB_APPLET_ID);
		TabbedPaneFixture pane = af.tabbedPane("pane");
		pane.selectTab(2).click();
		pane.selectTab("Tab 1");
		pane.requireTabTitles(new String[]{"Tab 1","Tab 2", "Tab 3", "Tab 4"});
	}

	@Override
	void onSetUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void onTearDown() {
		// TODO Auto-generated method stub
		
	}

	@Override
	String getAppletUrl() {
		// TODO Auto-generated method stub
		return TAB_APPLET_ID+".html";
	}

}
