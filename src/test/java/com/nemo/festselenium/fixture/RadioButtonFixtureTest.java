package com.nemo.festselenium.fixture;

import static org.fest.assertions.Assertions.assertThat;
import org.junit.Before;
import org.junit.Test;

import com.nemo.festselenium.fixture.ComponentFixture;
import com.nemo.festselenium.fixture.RadioButtonFixture;

public class RadioButtonFixtureTest extends ComponentFixture_TestCaseBase {

	private RadioButtonFixture componentFixture;

	@Before
	public void setUp() throws Exception {
		componentFixture = new RadioButtonFixture(context);	
	}

	@Test
	public void testText() {
		String s=componentFixture.text();
		assertThat(s).isEqualTo(
				createQueryString("text()"));
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

	@Test
	public void testRequireText() {
		assertThatReturnsSelf(componentFixture.requireText("x"));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("requireText(\"x\")"));
	}

	@Override
	ComponentFixture<?> fixture() {
		return componentFixture;
	}

}
