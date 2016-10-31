package com.nemo.festselenium.fixture;

import static org.fest.assertions.Assertions.assertThat;
import org.junit.Before;
import org.junit.Test;

import com.nemo.festselenium.fixture.ComponentFixture;
import com.nemo.festselenium.fixture.ProgressBarFixture;

public class ProgressBarFixtureTest extends ComponentFixture_TestCaseBase {

	private ProgressBarFixture componentFixture;

	@Before
	public void setUp() throws Exception {
		componentFixture = new ProgressBarFixture(context);	
	}

	@Test
	public void testRequireValue() {
		assertThatReturnsSelf(componentFixture.requireValue(11));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("requireValue(11)"));
	}

	@Test
	public void testRequireDeterminate() {
		assertThatReturnsSelf(componentFixture.requireDeterminate());
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("requireDeterminate()"));
	}

	@Test
	public void testRequireIndeterminate() {
		assertThatReturnsSelf(componentFixture.requireIndeterminate());
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("requireIndeterminate()"));
	}

	@Test
	public void testText() {
		String s=componentFixture.text();
		assertThat(s).isEqualTo(
				createQueryString("text()"));
	}

	@Test
	public void testRequireText() {
		assertThatReturnsSelf(componentFixture.requireText("X"));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("requireText(\"X\")"));
	}

	@Test
	public void testWaitUntilValueIs() {
		assertThatReturnsSelf(componentFixture.waitUntilValueIs(10));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("waitUntilValueIs(10)"));
	}

	@Test
	public void testWaitUntilIsDeterminate() {
		assertThatReturnsSelf(componentFixture.waitUntilIsDeterminate());
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("waitUntilIsDeterminate()"));
	}

	@Override
	ComponentFixture<?> fixture() {
		return componentFixture;
	}

}
