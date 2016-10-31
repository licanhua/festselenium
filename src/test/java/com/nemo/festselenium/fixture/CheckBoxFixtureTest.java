package com.nemo.festselenium.fixture;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.nemo.festselenium.fixture.CheckBoxFixture;
import com.nemo.festselenium.fixture.ComponentFixture;

public class CheckBoxFixtureTest extends ComponentFixture_TestCaseBase {

	private CheckBoxFixture componentFixture;	

	@Before
	public void setUp() throws Exception {
		  componentFixture = new CheckBoxFixture(context);	

	}

	@Test
	public void testText() {
		assertThat(componentFixture.text()).isEqualTo(
				createQueryString("text()"));	
		
	} 
	
	@Test
	public void testRequireText () {
		assertThatReturnsSelf(componentFixture.requireText("expected"));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("requireText(\"expected\")"));
	}
	
	@Test
	public void testCheck() {
		assertThatReturnsSelf(componentFixture.check());
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("check()"));
	}

	@Test
	public void testUncheck() {
		assertThatReturnsSelf(componentFixture.uncheck());
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("uncheck()"));
	}

	@Test
	public void testRequireSelected() {
		assertThatReturnsSelf(componentFixture.requireSelected());
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("requireSelected()"));
	}

	@Test
	public void testRequireNotSelected() {
		assertThatReturnsSelf(componentFixture.requireNotSelected());
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("requireNotSelected()"));
	}

	@Override
	ComponentFixture<?> fixture() {
		return componentFixture;
	}

}
