package com.nemo.festselenium.fixture;

import static org.fest.assertions.Assertions.assertThat;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.nemo.festselenium.fixture.ComponentFixture;
import com.nemo.festselenium.fixture.TableCellFixture;
import com.nemo.festselenium.fixture.TableFixture;
public class TableCellFixtureTest extends ComponentFixture_TestCaseBase {

	private TableCellFixture componentFixture;

	@Before
	public void setUp() throws Exception {
		componentFixture = new TableCellFixture(context);			
	}

	@Test
	public void testTable() {
		TableFixture c = componentFixture.table();
		assertThat(c.getComponentContext().getComponentQueryString()).isEqualTo(
				createQueryString("table()"));
	}

	@Test
	public void testSelect() {
		assertThatReturnsSelf(componentFixture.select());
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("select()"));
	}

	@Test
	public void testStartEditing() {
		assertThatReturnsSelf(componentFixture.startEditing());
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("startEditing()"));
	}

	@Test
	public void testStopEditing() {
		assertThatReturnsSelf(componentFixture.stopEditing());
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("stopEditing()"));
	}

	@Test
	public void testCancelEditing() {
		assertThatReturnsSelf(componentFixture.cancelEditing());
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("cancelEditing()"));
	}

	@Test
	public void testEnterValue() {
		assertThatReturnsSelf(componentFixture.enterValue("O"));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("enterValue(\"O\")"));
	}

	@Test
	public void testRequireValue() {
		assertThatReturnsSelf(componentFixture.requireValue("O"));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("requireValue(\"O\")"));
	}

	@Test
	public void testValue() {
		String s=componentFixture.value();
		assertThat(s).isEqualTo(
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
	public void testRow() {
		try {
			componentFixture.row();
			fail("we expect exception");
		} catch (NumberFormatException e) {
		assertThat(e.getMessage()).contains(
				createQueryString("row()"));
		}
	}

	@Test
	public void testColumn() {
		try {
			componentFixture.column();
			fail("we expect exception");
		} catch (NumberFormatException e) {
		assertThat(e.getMessage()).contains(
				createQueryString("column()"));
		}
	}

	@Override
	ComponentFixture<?> fixture() {
		return componentFixture;
	}

}
