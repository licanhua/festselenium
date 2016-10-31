package com.nemo.festselenium.fixture;

import static org.fest.assertions.Assertions.assertThat;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.nemo.festselenium.fixture.ComponentFixture;
import com.nemo.festselenium.fixture.ListItemFixture;

public class ListItemFixtureTest extends ComponentFixture_TestCaseBase {

	private ListItemFixture componentFixture;

	@Before
	public void setUp() throws Exception {
		componentFixture = new ListItemFixture(context);	
	}

	@Test
	public void testValue() {
		assertThat(componentFixture.value()).isEqualTo(
				createQueryString("value()"));
	}

	@Test
	public void testDrag() {
		assertThatReturnsSelf(componentFixture.drag());
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("drag()"));
	}

	@Test
	public void testDrop() {
		assertThatReturnsSelf(componentFixture.drop());
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("drop()"));
	}

	@Test
	public void testIndex() {
		try {
			assertThatReturnsSelf(componentFixture.index());
			fail("we expect exception");
		} catch (NumberFormatException e) {
		assertThat(e.getMessage()).contains(
				createQueryString("index()"));
		}
	}

	@Test
	public void testSelect() {
		assertThatReturnsSelf(componentFixture.select());
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("select()"));
	}

	@Override
	ComponentFixture<?> fixture() {
		return componentFixture;
	}

}
