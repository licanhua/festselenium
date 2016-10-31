package com.nemo.festselenium;

import org.junit.Test;

import com.nemo.festselenium.fixture.AppletFixture;
import com.nemo.festselenium.fixture.SpinnerFixture;

import static org.fest.assertions.Assertions.assertThat;

public class SpinnerIntegrationTest extends BaseIntegerationTest {

	String SPINNER_APPLET_ID = "spinner_applet";
	@Override
	void onSetUp() {
		// TODO Auto-generated method stub

	}

	@Test 
	public void test(){
		AppletFixture af = selenium.applet(SPINNER_APPLET_ID);
		SpinnerFixture month = af.spinner("month");
		SpinnerFixture year = af.spinner("year");
		SpinnerFixture date = af.spinner("date");
		month.click().click();
		month.increment(3);
		year.decrement(5);
		assertThat(date.text()).isNotEmpty();
		year.enterText("2022");
		date.enterTextAndCommit("03/2014");
		month.enterText("abc");
	}
	@Override
	void onTearDown() {
		// TODO Auto-generated method stub

	}

	@Override
	String getAppletUrl() {
		// TODO Auto-generated method stub
		return SPINNER_APPLET_ID+".html";
	}

}
