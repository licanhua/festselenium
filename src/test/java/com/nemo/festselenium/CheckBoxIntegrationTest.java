package com.nemo.festselenium;

import static org.junit.Assert.*;

import org.junit.Test;

import com.nemo.festselenium.fixture.AppletFixture;

public class CheckBoxIntegrationTest extends BaseIntegerationTest {

	String CHECKBOX_APPLET_ID = "checkbox_applet";
	@Test
	public void test() {
		AppletFixture af = selenium.applet(CHECKBOX_APPLET_ID);
		af.checkBox("Chin").focus().check().requireSelected();
		af.checkBox("Chin").focus().uncheck();
		//.requireNotSelected();
		
		af.checkBox("Chin").focus().check().uncheck();
		//.requireNotSelected();
		assertEquals(af.checkBox("Chin").text(), "Chin");
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
		return CHECKBOX_APPLET_ID+".html";
	}

}
