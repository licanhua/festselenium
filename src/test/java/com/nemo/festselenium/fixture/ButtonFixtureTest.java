package com.nemo.festselenium.fixture;

import java.awt.Point;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.nemo.festselenium.fixture.AppletFixture;
import com.nemo.festselenium.fixture.ButtonFixture;
import com.nemo.festselenium.fixture.ComponentFixture;

import static org.fest.assertions.Assertions.assertThat;

public class ButtonFixtureTest extends ComponentFixture_TestCaseBase {

	private ButtonFixture componentFixture;	

	@Before
	public void setUp() throws Exception {

		  componentFixture = new ButtonFixture(context);	
	}

	@After
	public void tearDown() throws Exception {
	}


	/*
	 * What kind of methods JButtonFixture supported
	 */
	@Test
	public void testButtonFixtureMethodSupported () {
		AppletFixture f = selenium.applet("test_applet");
		ButtonFixture bF1 = f.button("test");
		ButtonFixture bF2 = f.button();
		Point p =new Point(1,1);
		bF1.click();
		bF1.doubleClick();
		bF1.focus();
		bF1.pressKey('A');
		bF1.releaseKey('B');
		bF1.rightClick();
		bF1.text();
		bF1.showPopupMenu();
		bF1.showPopupMenuAt(p); 
		bF2.click().click();
		
		String s1=selenium.lastCommandResult();
		bF2.click();
		assertThat(s1).isEqualTo(selenium.lastCommandResult());
		
	}

	
	@Test
	public void testText() {
		assertThat(componentFixture.text()).isEqualTo(
				componentFixture.getComponentContext().getComponentQueryString()+".text()");	
		
	} 
	
	@Test
	public void testRequireText () {		
		assertThatReturnsSelf(componentFixture.requireText("OK"));
		assertThat(selenium.lastCommandResult()).isEqualTo(
			createQueryString("requireText(\"OK\")"));
	}

	@Override
	ComponentFixture<?> fixture() {
		// TODO Auto-generated method stub
		return componentFixture;
	}
}
