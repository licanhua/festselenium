package com.nemo.festselenium.fixture;

import static org.fest.assertions.Assertions.assertThat;
import org.junit.Before;
import org.junit.Test;

import com.nemo.festselenium.fixture.ComponentFixture;
import com.nemo.festselenium.fixture.SliderFixture;

public class SliderFixtureTest extends ComponentFixture_TestCaseBase {

	private SliderFixture componentFixture;

	@Before
	public void setUp() throws Exception {
		componentFixture = new SliderFixture(context);			
	}

	@Test
	public void testSlideTo() {
		assertThatReturnsSelf(componentFixture.slideTo(10));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("slideTo(10)"));
	}

	@Test
	public void testSlideToMaximum() {
		assertThatReturnsSelf(componentFixture.slideToMaximum());
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("slideToMaximum()"));
	}

	@Test
	public void testSlideToMinimum() {
		assertThatReturnsSelf(componentFixture.slideToMinimum());
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("slideToMinimum()"));
	}

	@Override
	ComponentFixture<?> fixture() {
		return componentFixture;
	}

}
