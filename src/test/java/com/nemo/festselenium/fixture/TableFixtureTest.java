package com.nemo.festselenium.fixture;

import static org.fest.assertions.Assertions.assertThat;

import com.nemo.festselenium.core.MouseButton;
import com.nemo.festselenium.core.TableCell;
import com.nemo.festselenium.fixture.ComponentFixture;
import com.nemo.festselenium.fixture.PopupMenuFixture;
import com.nemo.festselenium.fixture.TableCellFixture;
import com.nemo.festselenium.fixture.TableFixture;
import com.nemo.festselenium.fixture.TableHeaderFixture;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TableFixtureTest extends ComponentFixture_TestCaseBase {

	private TableFixture componentFixture;

	@Before
	public void setUp() throws Exception {
		componentFixture = new TableFixture(context);			
	}

	@Test
	public void testCellString() {
		try {
			componentFixture.cell("1,2");
			fail("we expect exception");
		} catch (NumberFormatException e) {
		assertThat(e.getMessage()).contains(
				createQueryString("cell(\"1,2\")"));
		}
	}

	@Test
	public void testCellTableCell() {
		TableCell cell = TableCell.row(1).column(2);
		TableCellFixture c = componentFixture.cell(cell);
		
		String y = componentFixture.getComponentContext().getAppletTestFixtureQueryString();		
		assertThat(c.getComponentContext().getComponentQueryString()).contains(
				y+".createTableCell(1,2)").
				contains(createQueryString("cell(cell)")).
				contains("var cell=");
	}

	@Test
	public void testTableHeader() {
		TableHeaderFixture c = componentFixture.tableHeader();
		assertThat(c.getComponentContext().getComponentQueryString()).isEqualTo(
				createQueryString("tableHeader()"));
	}

	@Test
	public void testSelectionValue() {
		String s=componentFixture.selectionValue();
		assertThat(s).isEqualTo(
				createQueryString("selectionValue()"));
	}

	@Test
	public void testRowCount() {
		try {
			assertThatReturnsSelf(componentFixture.rowCount());
			fail("we expect exception");
		} catch (NumberFormatException e) {
		assertThat(e.getMessage()).contains(
				createQueryString("rowCount()"));
		}
	}

	@Test
	public void testValueAt() {
		TableCell c = TableCell.row(1).column(2);
		String s=componentFixture.valueAt(c);
		
		String y = componentFixture.getComponentContext().getAppletTestFixtureQueryString();		
		assertThat(s).contains(
				y+".createTableCell(1,2)").
				contains(createQueryString("valueAt(cell)")).
				contains("var cell=");
	}

	@Test
	public void testSelectCell() {
		TableCell c = TableCell.row(1).column(2);
		assertThatReturnsSelf(componentFixture.selectCell(c));
		String y = componentFixture.getComponentContext().getAppletTestFixtureQueryString();		
		assertThat(selenium.lastCommandResult()).contains(
				y+".createTableCell(1,2)").
				contains(createQueryString("selectCell(cell)")).
				contains("var cell=");
	}

	@Test
	public void testSelectCells() {
		TableCell c = TableCell.row(1).column(2);
		assertThatReturnsSelf(componentFixture.selectCells(new TableCell[]{c,c}));
		String y = componentFixture.getComponentContext().getAppletTestFixtureQueryString();		
		assertThat(selenium.lastCommandResult()).contains(
				y+".createTableCell(1,2)").
				contains(createQueryString("selectCells([cell1,cell2])")).
				contains("var cell1=").
				contains("var cell2=");
	}

	@Test
	public void testSelectRows() {
		assertThatReturnsSelf(componentFixture.selectRows(new int[]{1,2,3}));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("selectRows([1,2,3])"));
	}

	@Test
	public void testDrag() {
		TableCell c = TableCell.row(1).column(2);		
		assertThatReturnsSelf(componentFixture.drag(c));
		String y = componentFixture.getComponentContext().getAppletTestFixtureQueryString();		
		assertThat(selenium.lastCommandResult()).contains(
				y+".createTableCell(1,2)").
				contains(createQueryString("drag(cell)")).
				contains("var cell=");
	}

	@Test
	public void testDrop() {
		TableCell c = TableCell.row(1).column(2);		
		assertThatReturnsSelf(componentFixture.drop(c));
		String y = componentFixture.getComponentContext().getAppletTestFixtureQueryString();		
		assertThat(selenium.lastCommandResult()).contains(
				y+".createTableCell(1,2)").
				contains(createQueryString("drop(cell)")).
				contains("var cell=");
	}

	@Test
	public void testClickTableCellMouseButtonInt() {
		TableCell cell = TableCell.row(1).column(2);			
		MouseButton button = MouseButton.LEFT_BUTTON;
		assertThatReturnsSelf(componentFixture.click(cell, button, 11));

		String y = componentFixture.getComponentContext().getAppletTestFixtureQueryString();		
		assertThat(selenium.lastCommandResult()).contains(
				y+".createTableCell(1,2)").
				contains(createQueryString("click(cell,mouse,11)")).
				contains("var cell=").contains(
						y+".createMouseButton(16)").
						contains("var mouse=");
	}

	@Test
	public void testClickTableCellMouseButton() {
		TableCell cell = TableCell.row(1).column(2);			
		MouseButton button = MouseButton.LEFT_BUTTON;
		assertThatReturnsSelf(componentFixture.click(cell, button ));

		String y = componentFixture.getComponentContext().getAppletTestFixtureQueryString();		
		assertThat(selenium.lastCommandResult()).contains(
				y+".createTableCell(1,2)").
				contains(createQueryString("click(cell,mouse)")).
				contains("var cell=").contains(
						y+".createMouseButton(16)").
						contains("var mouse=");
	}

	@Test
	public void testEnterValue() {
		TableCell cell = TableCell.row(1).column(2);			
		assertThatReturnsSelf(componentFixture.enterValue(cell, "v"));
		String y = componentFixture.getComponentContext().getAppletTestFixtureQueryString();		
		assertThat(selenium.lastCommandResult()).contains(
				y+".createTableCell(1,2)").
				contains(createQueryString("enterValue(cell,\"v\")")).
				contains("var cell=");
	}

	@Test
	public void testRequireRowCount() {
		assertThatReturnsSelf(componentFixture.requireRowCount(1));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("requireRowCount(1)"));
	}

	@Test
	public void testRequireSelectedRows() {
		assertThatReturnsSelf(componentFixture.requireSelectedRows(new int[]{1,2}));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("requireSelectedRows([1,2])"));
	}

	@Test
	public void testRequireColumnCount() {
		assertThatReturnsSelf(componentFixture.requireColumnCount(1));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("requireColumnCount(1)"));
	}

	@Test
	public void testRequireEditable() {
		TableCell cell = TableCell.row(1).column(2);
		String y = componentFixture.getComponentContext().getAppletTestFixtureQueryString();
		assertThatReturnsSelf(componentFixture.requireEditable(cell));
		assertThat(selenium.lastCommandResult()).contains(
				y+".createTableCell(1,2)").
				contains(createQueryString("requireEditable(cell)")).
				contains("var cell=");
	}

	@Test
	public void testRequireNotEditable() {
		TableCell cell = TableCell.row(1).column(2);
		String y = componentFixture.getComponentContext().getAppletTestFixtureQueryString();
		assertThatReturnsSelf(componentFixture.requireNotEditable(cell));
		assertThat(selenium.lastCommandResult()).contains(
				y+".createTableCell(1,2)").
				contains(createQueryString("requireNotEditable(cell)")).
				contains("var cell=");
	}

	@Test
	public void testRequireNoSelection() {
		assertThatReturnsSelf(componentFixture.requireNoSelection());
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("requireNoSelection()"));
	}

	@Test
	public void testRequireCellValue() {
		TableCell cell = TableCell.row(1).column(2);			
		assertThatReturnsSelf(componentFixture.requireCellValue(cell, "A"));

		String y = componentFixture.getComponentContext().getAppletTestFixtureQueryString();
		assertThat(selenium.lastCommandResult()).contains(
				y+".createTableCell(1,2)").
				contains(createQueryString("requireCellValue(cell,\"A\")")).
				contains("var cell=");
	}

	@Test
	public void testShowPopupMenuAtTableCell() {
		TableCell cell = TableCell.row(1).column(2);			
		PopupMenuFixture p = componentFixture.showPopupMenuAt(cell);
		assertThat(p).isNotNull();
		String y = componentFixture.getComponentContext().getAppletTestFixtureQueryString();		
		assertThat(selenium.lastCommandResult()).contains(
				y+".createTableCell(1,2)").
				contains(createQueryString("showPopupMenuAt(cell)")).
				contains("var cell=");
	}

	@Override
	ComponentFixture<?> fixture() {
		return componentFixture;
	}

}
