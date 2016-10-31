package com.nemo.festselenium;

import java.awt.Point;

import org.junit.Test;

import com.nemo.festselenium.fixture.AppletFixture;
import com.nemo.festselenium.fixture.PopupMenuFixture;

public class PopupIntegrationTest extends BaseIntegerationTest {

	 String POPUP_APPLET_ID = "popup_applet";
	@Override
	void onSetUp() {

	}

	@Override
	void onTearDown() {
		// TODO Auto-generated method stub

	}

	@Override
	String getAppletUrl() {
		// TODO Auto-generated method stub
		return POPUP_APPLET_ID+".html";
	}

	@Test 
	public void test() {
		// TODO Auto-generated method stub
		AppletFixture af = selenium.applet(POPUP_APPLET_ID);
		af.menuItem("subMenu").click();
		af.menuItemWithPath(new String[]{"subMenu","submenuItem"});
		Point p = new Point();
		p.x = 10;
		p.y = 10;
		 af.textBox("text").click();
		PopupMenuFixture p2 = af.textBox("text").showPopupMenuAt(p);
		p2.menuItem("item1").click();
	
		
		p2 = af.textBox("text").showPopupMenu();
		p2.menuItem("item2").click();
		
		
	}
}
