package com.nemo.festselenium.fixture;

import static org.fest.assertions.Assertions.assertThat;
import org.junit.Before;
import org.junit.Test;

import com.nemo.festselenium.fixture.ComponentFixture;
import com.nemo.festselenium.fixture.ScrollBarFixture;

public class ScrollBarFixtureTest extends ComponentFixture_TestCaseBase {

	private ScrollBarFixture componentFixture;

	@Before
	public void setUp() throws Exception {
		componentFixture = new ScrollBarFixture(context);
	}

	@Test
	public void testScrollBlockDown() {
		assertThatReturnsSelf(componentFixture.scrollBlockDown());
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("scrollBlockDown()"));
	}

	@Test
	public void testScrollBlockDownInt() {
		assertThatReturnsSelf(componentFixture.scrollBlockDown(11));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("scrollBlockDown(11)"));
	}

	@Test
	public void testScrollBlockUp() {
		assertThatReturnsSelf(componentFixture.scrollBlockUp());
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("scrollBlockUp()"));
	}

	@Test
	public void testScrollBlockUpInt() {
		assertThatReturnsSelf(componentFixture.scrollBlockUp(11));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("scrollBlockUp(11)"));
	}

	@Test
	public void testScrollTo() {
		assertThatReturnsSelf(componentFixture.scrollTo(12));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("scrollTo(12)"));
	}

	@Test
	public void testScrollToMaximum() {
		assertThatReturnsSelf(componentFixture.scrollToMaximum());
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("scrollToMaximum()"));
	}

	@Test
	public void testScrollToMinimum() {
		assertThatReturnsSelf(componentFixture.scrollToMinimum());
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("scrollToMinimum()"));
	}

	@Test
	public void testScrollUnitDown() {
		assertThatReturnsSelf(componentFixture.scrollUnitDown());
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("scrollUnitDown()"));
	}

	@Test
	public void testScrollUnitDownInt() {
		assertThatReturnsSelf(componentFixture.scrollUnitDown(12));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("scrollUnitDown(12)"));
	}

	@Test
	public void testScrollUnitUp() {
		assertThatReturnsSelf(componentFixture.scrollUnitUp());
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("scrollUnitUp()"));
	}

	@Test
	public void testScrollUnitUpInt() {
		assertThatReturnsSelf(componentFixture.scrollUnitUp(12));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("scrollUnitUp(12)"));
	}

	@Override
	ComponentFixture<?> fixture() {
		return componentFixture;
	}

}
