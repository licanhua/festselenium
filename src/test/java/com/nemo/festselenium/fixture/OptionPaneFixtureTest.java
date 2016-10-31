package com.nemo.festselenium.fixture;

import static org.fest.assertions.Assertions.assertThat;
import org.junit.Before;
import org.junit.Test;

import com.nemo.festselenium.fixture.ButtonFixture;
import com.nemo.festselenium.fixture.ComponentFixture;
import com.nemo.festselenium.fixture.OptionPaneFixture;

public class OptionPaneFixtureTest extends ComponentFixture_TestCaseBase {

	private OptionPaneFixture componentFixture;

	@Before
	public void setUp() throws Exception {
		componentFixture = new OptionPaneFixture(context);
	}

	@Test
	public void testTitle() {
		assertThat(componentFixture.title()).isEqualTo(
				createQueryString("title()"));
	}

	@Test
	public void testOkButton() {
		ButtonFixture c = componentFixture.okButton();
		assertThat(c.getComponentContext().getComponentQueryString()).isEqualTo(
				createQueryString("okButton()"));
	}

	@Test
	public void testCancelButton() {
		ButtonFixture c = componentFixture.cancelButton();
		assertThat(c.getComponentContext().getComponentQueryString()).isEqualTo(
				createQueryString("cancelButton()"));
	}

	@Test
	public void testYesButton() {
		ButtonFixture c = componentFixture.yesButton();
		assertThat(c.getComponentContext().getComponentQueryString()).isEqualTo(
				createQueryString("yesButton()"));
	}

	@Test
	public void testNoButton() {
		ButtonFixture c = componentFixture.noButton();
		assertThat(c.getComponentContext().getComponentQueryString()).isEqualTo(
				createQueryString("noButton()"));
	}

	@Test
	public void testButtonWithText() {
		ButtonFixture c = componentFixture.buttonWithText("text");
		assertThat(c.getComponentContext().getComponentQueryString()).isEqualTo(
				createQueryString("buttonWithText(\"text\")"));
	}

	@Test
	public void testRequireErrorMessage() {
		assertThatReturnsSelf(componentFixture.requireErrorMessage());
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("requireErrorMessage()"));
	}

	@Test
	public void testRequireInformationMessage() {
		assertThatReturnsSelf(componentFixture.requireInformationMessage());
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("requireInformationMessage()"));
	}

	@Test
	public void testRequireWarningMessage() {
		assertThatReturnsSelf(componentFixture.requireWarningMessage());
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("requireWarningMessage()"));
	}

	@Test
	public void testRequireQuestionMessage() {
		assertThatReturnsSelf(componentFixture.requireQuestionMessage());
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("requireQuestionMessage()"));
	}

	@Test
	public void testRequirePlainMessage() {
		assertThatReturnsSelf(componentFixture.requirePlainMessage());
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("requirePlainMessage()"));
	}

	@Test
	public void testRequireTitle() {
		assertThatReturnsSelf(componentFixture.requireTitle("t"));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("requireTitle(\"t\")"));
	}

	@Override
	ComponentFixture<?> fixture() {
		return componentFixture;
	}

}
