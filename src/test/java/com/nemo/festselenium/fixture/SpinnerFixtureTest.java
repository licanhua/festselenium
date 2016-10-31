package com.nemo.festselenium.fixture;

import static org.fest.assertions.Assertions.assertThat;
import org.junit.Before;
import org.junit.Test;

import com.nemo.festselenium.fixture.ComponentFixture;
import com.nemo.festselenium.fixture.SpinnerFixture;

public class SpinnerFixtureTest extends ComponentFixture_TestCaseBase {

	private SpinnerFixture componentFixture;

	@Before
	public void setUp() throws Exception {
		componentFixture = new SpinnerFixture(context);	
	}

	@Test
	public void testIncrementInt() {
		assertThatReturnsSelf(componentFixture.increment(10));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("increment(10)"));
	}

	@Test
	public void testIncrement() {
		assertThatReturnsSelf(componentFixture.increment());
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("increment()"));
	}

	@Test
	public void testDecrementInt() {
		assertThatReturnsSelf(componentFixture.decrement(10));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("decrement(10)"));
	}

	@Test
	public void testDecrement() {
		assertThatReturnsSelf(componentFixture.decrement());
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("decrement()"));
	}

	@Test
	public void testEnterText() {
		assertThatReturnsSelf(componentFixture.enterText("10"));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("enterText(\"10\")"));
	}

	@Test
	public void testEnterTextAndCommit() {
		assertThatReturnsSelf(componentFixture.enterTextAndCommit("10"));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("enterTextAndCommit(\"10\")"));
	}

	@Test
	public void testText() {
		String s=componentFixture.text();
		assertThat(s).isEqualTo(
				createQueryString("text()"));
	}

	@Override
	ComponentFixture<?> fixture() {
		return componentFixture;
	}

}
