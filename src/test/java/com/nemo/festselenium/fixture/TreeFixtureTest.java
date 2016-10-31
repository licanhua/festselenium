package com.nemo.festselenium.fixture;

import static org.fest.assertions.Assertions.assertThat;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.nemo.festselenium.core.MouseButton;
import com.nemo.festselenium.fixture.ComponentFixture;
import com.nemo.festselenium.fixture.TreeFixture;
import com.nemo.festselenium.fixture.TreeRowFixture;

public class TreeFixtureTest extends ComponentFixture_TestCaseBase {

	private TreeFixture componentFixture;

	@Before
	public void setUp() throws Exception {
		componentFixture = new TreeFixture(context);
	}

	@Test
	public void testClickRowInt() {
		assertThatReturnsSelf(componentFixture.clickRow(11));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("clickRow(11)"));
	}

	@Test
	public void testClickRowIntMouseButton() {
		MouseButton m = MouseButton.LEFT_BUTTON;
		
		assertThatReturnsSelf(componentFixture.clickRow(0, m));

		assertThat(selenium.lastCommandResult()).startsWith("var mousebutton=").
			contains("clickRow(0,mousebutton)");	
	}

	@Test
	public void testClickPathString() {
		assertThatReturnsSelf(componentFixture.clickPath("11"));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("clickPath(\"11\")"));
	}

	@Test
	public void testClickPathStringMouseButton() {
		MouseButton m = MouseButton.LEFT_BUTTON;
		
		assertThatReturnsSelf(componentFixture.clickPath("0", m));

		assertThat(selenium.lastCommandResult()).startsWith("var mousebutton=").
			contains("clickPath(\"0\",mousebutton)");
	}

	@Test
	public void testDoubleClickRow() {
		assertThatReturnsSelf(componentFixture.doubleClickRow(11));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("doubleClickRow(11)"));
	}

	@Test
	public void testDoubleClickPath() {
		assertThatReturnsSelf(componentFixture.doubleClickPath("11"));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("doubleClickPath(\"11\")"));
	}

	@Test
	public void testRightClickRow() {
		assertThatReturnsSelf(componentFixture.rightClickRow(11));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("rightClickRow(11)"));
	}

	@Test
	public void testRightClickPath() {
		assertThatReturnsSelf(componentFixture.rightClickPath("11"));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("rightClickPath(\"11\")"));
	}

	@Test
	public void testDragInt() {
		assertThatReturnsSelf(componentFixture.drag(11));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("drag(11)"));
	}

	@Test
	public void testDragString() {
		assertThatReturnsSelf(componentFixture.drag("11"));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("drag(\"11\")"));
	}

	@Test
	public void testDropInt() {
		assertThatReturnsSelf(componentFixture.drop(11));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("drop(11)"));
	}

	@Test
	public void testDropString() {
		assertThatReturnsSelf(componentFixture.drop("11"));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("drop(\"11\")"));
	}

	@Test
	public void testSelectPath() {
		assertThatReturnsSelf(componentFixture.selectPath("11"));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("selectPath(\"11\")"));
	}

	@Test
	public void testSelectPaths() {
		assertThatReturnsSelf(componentFixture.selectPaths(new String[]{"A","B","13"}));
		assertThat(selenium.lastCommandResult()).
		endsWith(createQueryString("selectPaths(stringarray)")).
		contains("createStringArray([\"A\",\"B\",\"13\"])");
	}

	@Test
	public void testSelectRow() {
		assertThatReturnsSelf(componentFixture.selectRow(11));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("selectRow(11)"));
	}

	@Test
	public void testSelectRows() {
		assertThatReturnsSelf(componentFixture.selectRows(new int[]{11,12}));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("selectRows([11,12])"));
	}

	@Test
	public void testToggleRow() {
		assertThatReturnsSelf(componentFixture.toggleRow(11));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("toggleRow(11)"));
	}

	@Test
	public void testExpandRow() {
		assertThatReturnsSelf(componentFixture.expandRow(11));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("expandRow(11)"));
	}

	@Test
	public void testCollapseRow() {
		assertThatReturnsSelf(componentFixture.collapseRow(11));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("collapseRow(11)"));
	}

	@Test
	public void testExpandPath() {
		assertThatReturnsSelf(componentFixture.expandPath("11"));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("expandPath(\"11\")"));
	}

	@Test
	public void testCollapsePath() {
		assertThatReturnsSelf(componentFixture.collapsePath("11"));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("collapsePath(\"11\")"));
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
	public void testRequireSelectionStringArray() {
		assertThatReturnsSelf(componentFixture.requireSelection(new String[]{"A","B"}));
		assertThat(selenium.lastCommandResult()).endsWith(createQueryString("requireSelection(stringarray)")).
		contains("createStringArray([\"A\",\"B\"])");	
	}

	@Test
	public void testRequireSelectionIntArray() {
		assertThatReturnsSelf(componentFixture.requireSelection(new int[]{11,12}));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("requireSelection([11,12])"));
	}

	@Test
	public void testRequireNoSelection() {
		assertThatReturnsSelf(componentFixture.requireNoSelection());
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("requireNoSelection()"));
	}

	@Test
	public void testSeparator() {
		String s= componentFixture.separator();
		assertThat(s).isEqualTo(
				createQueryString("separator()"));
	}

	@Test
	public void testSeparatorString() {
		assertThatReturnsSelf(componentFixture.separator("O"));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("separator(\"O\")"));
	}

	@Test
	public void testNodeInt() {
		TreeRowFixture c = componentFixture.node(11);
		assertThat(c.getComponentContext().getComponentQueryString()).isEqualTo(
				createQueryString("node(11)"));
	}

	@Test
	public void testNodeString() {
		TreeRowFixture c = componentFixture.node("11");
		assertThat(c.getComponentContext().getComponentQueryString()).isEqualTo(
				createQueryString("node(\"11\")"));
	}

	@Test
	public void testValueAtString() {
		String s= componentFixture.valueAt("A");
		assertThat(s).isEqualTo(
				createQueryString("valueAt(\"A\")"));
	}

	@Test
	public void testValueAtInt() {
		String s= componentFixture.valueAt(1);
		assertThat(s).isEqualTo(
				createQueryString("valueAt(1)"));
	}

	@Override
	ComponentFixture<?> fixture() {
		return componentFixture;
	}

}
