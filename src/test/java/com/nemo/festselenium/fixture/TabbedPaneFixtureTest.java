package com.nemo.festselenium.fixture;

import static org.fest.assertions.Assertions.assertThat;
import org.junit.Before;
import org.junit.Test;

import com.nemo.festselenium.fixture.ComponentFixture;
import com.nemo.festselenium.fixture.TabbedPaneFixture;

public class TabbedPaneFixtureTest extends ComponentFixture_TestCaseBase {

	private TabbedPaneFixture componentFixture;

	@Before
	public void setUp() throws Exception {
		componentFixture = new TabbedPaneFixture(context);	
	}

	@Test
	public void testSelectTabInt() {
		assertThatReturnsSelf(componentFixture.selectTab(10));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("selectTab(10)"));
	}

	@Test
	public void testSelectTabString() {
		assertThatReturnsSelf(componentFixture.selectTab("10"));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("selectTab(\"10\")"));
	}

	@Test
	public void testRequireTitle() {
		assertThatReturnsSelf(componentFixture.requireTitle("x",10));
		assertThat(selenium.lastCommandResult()).contains(
				createQueryString("requireTitle(\"x\",index)")).
				contains(".Packages.org.fest.swing.data.Index").
				contains("var index=");
	}

	@Test
	public void testRequireTabTitles() {
		assertThatReturnsSelf(componentFixture.requireTabTitles(new String[]{"11","12","13"}));
		assertThat(selenium.lastCommandResult())
				.endsWith(createQueryString("requireTabTitles(stringarray)")).
				contains("createStringArray([\"11\",\"12\",\"13\"])");
	}

	@Override
	ComponentFixture<?> fixture() {
		return componentFixture;
	}

}
