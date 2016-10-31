package com.nemo.festselenium.fixture;

import static org.fest.assertions.Assertions.assertThat;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.nemo.festselenium.fixture.ComponentFixture;
import com.nemo.festselenium.fixture.TreeRowFixture;

public class TreeRowFixtureTest extends ComponentFixture_TestCaseBase {

	private TreeRowFixture componentFixture;

	@Before
	public void setUp() throws Exception {
		componentFixture = new TreeRowFixture(context);			
	}

	@Test
	public void testExpand() {
		assertThatReturnsSelf(componentFixture.expand());
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("expand()"));
	}

	@Test
	public void testCollapse() {
		assertThatReturnsSelf(componentFixture.collapse());
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("collapse()"));
	}

	@Test
	public void testSelect() {
		assertThatReturnsSelf(componentFixture.select());
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("select()"));
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
	public void testValue() {
		String s=componentFixture.value();
		assertThat(s).isEqualTo(
				createQueryString("value()"));
	}

	@Test
	public void testIndex() {
		try {
			assertThatReturnsSelf(componentFixture.index());
			fail("we expect exception");
		} catch (NumberFormatException e) {
		assertThat(e.getMessage()).contains(
				createQueryString("index"));
		}
	}

	@Override
	ComponentFixture<?> fixture() {
		return componentFixture;
	}

}
