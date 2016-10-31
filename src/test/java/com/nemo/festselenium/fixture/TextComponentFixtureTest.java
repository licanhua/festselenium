package com.nemo.festselenium.fixture;

import static org.fest.assertions.Assertions.assertThat;
import org.junit.Before;
import org.junit.Test;

import com.nemo.festselenium.fixture.ComponentFixture;
import com.nemo.festselenium.fixture.TextComponentFixture;

public class TextComponentFixtureTest extends ComponentFixture_TestCaseBase {

	private TextComponentFixture componentFixture;

	@Before
	public void setUp() throws Exception {
		componentFixture = new TextComponentFixture(context);	
	}

	@Test
	public void testText() {
		String s=componentFixture.text();
		assertThat(s).isEqualTo(
				createQueryString("text()"));
	}

	@Test
	public void testSelect() {
		assertThatReturnsSelf(componentFixture.select("0"));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("select(\"0\")"));
	}

	@Test
	public void testSelectText() {
		assertThatReturnsSelf(componentFixture.selectText(1, 2));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("selectText(1,2)"));
	}

	@Test
	public void testSelectAll() {
		assertThatReturnsSelf(componentFixture.selectAll());
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("selectAll()"));
	}

	@Test
	public void testDeleteText() {
		assertThatReturnsSelf(componentFixture.deleteText());
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("deleteText()"));
	}

	@Test
	public void testEnterText() {
		assertThatReturnsSelf(componentFixture.enterText("0"));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("enterText(\"0\")"));
	}

	@Test
	public void testSetText() {
		assertThatReturnsSelf(componentFixture.setText("0"));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("setText(\"0\")"));
	}

	@Test
	public void testRequireText() {
		assertThatReturnsSelf(componentFixture.requireText("0"));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("requireText(\"0\")"));
	}

	@Test
	public void testRequireEmpty() {
		assertThatReturnsSelf(componentFixture.requireEmpty());
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("requireEmpty()"));
	}

	@Test
	public void testRequireEditable() {
		assertThatReturnsSelf(componentFixture.requireEditable());
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("requireEditable()"));
	}

	@Test
	public void testRequireNotEditable() {
		assertThatReturnsSelf(componentFixture.requireNotEditable());
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("requireNotEditable()"));
	}

	@Override
	ComponentFixture<?> fixture() {
		return componentFixture;
	}

}
