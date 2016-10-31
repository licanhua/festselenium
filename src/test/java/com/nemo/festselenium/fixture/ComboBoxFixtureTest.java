package com.nemo.festselenium.fixture;

import static org.fest.assertions.Assertions.assertThat;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import com.nemo.festselenium.fixture.ComboBoxFixture;
import com.nemo.festselenium.fixture.ComponentFixture;

public class ComboBoxFixtureTest extends ComponentFixture_TestCaseBase {

	private ComboBoxFixture componentFixture;	
	
	@Before
	public void setUp() throws Exception {
		componentFixture = new ComboBoxFixture(context);
	}

	@Test
	public void testReplaceText() {
		assertThatReturnsSelf(componentFixture.replaceText("text"));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("replaceText(\"text\")"));
	}

	@Test
	public void testSelectAllText() {
		assertThatReturnsSelf(componentFixture.selectAllText());
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("selectAllText()"));
	}

	@Test
	public void testEnterText() {
		assertThatReturnsSelf(componentFixture.enterText("text"));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("enterText(\"text\")"));
	}

	@Test
	public void testClearSelection() {
		assertThatReturnsSelf(componentFixture.clearSelection());
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("clearSelection()"));
	}

	@Test
	public void testSelectItemInt() {
		assertThatReturnsSelf(componentFixture.selectItem(111));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("selectItem(111)"));
	}

	@Test
	public void testSelectItemString() {
		assertThatReturnsSelf(componentFixture.selectItem("text"));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("selectItem(\"text\")"));
	}

	@Test
	public void testValueAt() {
		assertThat(componentFixture.valueAt(1)).isEqualTo(
				createQueryString("valueAt(1)"));
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

	@Test
	public void testRequireSelectionString() {
		assertThatReturnsSelf(componentFixture.requireSelection("text"));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("requireSelection(\"text\")"));
	}

	@Test
	public void testRequireItemCount() {
		assertThatReturnsSelf(componentFixture.requireItemCount(11));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("requireItemCount(11)"));
	}

	@Test
	public void testRequireSelectionInt() {
		assertThatReturnsSelf(componentFixture.requireSelection(11));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("requireSelection(11)"));
	}

	@Test
	public void testRequireNoSelection() {
		assertThatReturnsSelf(componentFixture.requireNoSelection());
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("requireNoSelection()"));
	}

	@Test
	public void testSelectedItem() {
		assertThat(componentFixture.selectedItem()).isEqualTo(
				createQueryString("selectedItem()"));
	}

	@Test
	public void testGetSelectedIndex() {
		try {
			assertThatReturnsSelf(componentFixture.getSelectedIndex());
			fail("we expect exception");
		} catch (NumberFormatException e) {
		assertThat(e.getMessage()).contains(
				createQueryString("target.getSelectedIndex()"));
		}
	}

	@Override
	ComponentFixture<?> fixture() {
		// TODO Auto-generated method stub
		return componentFixture;
	}

}
