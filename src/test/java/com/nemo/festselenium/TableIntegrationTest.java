package com.nemo.festselenium;

import static org.junit.Assert.*;

import org.junit.Test;

import com.nemo.festselenium.core.KeyPressInfo;
import com.nemo.festselenium.core.MouseButton;
import com.nemo.festselenium.core.TableCell;
import com.nemo.festselenium.fixture.AppletFixture;
import com.nemo.festselenium.fixture.DialogFixture;
import com.nemo.festselenium.fixture.PanelFixture;
import com.nemo.festselenium.fixture.TabbedPaneFixture;
import com.nemo.festselenium.fixture.TableCellFixture;
import com.nemo.festselenium.fixture.TableFixture;

import static org.fest.assertions.Assertions.assertThat;

public class TableIntegrationTest extends BaseIntegerationTest {
	private  String TABLE_APPLET_ID = "table_applet";
	
	@Test
	public void test() {
		AppletFixture af = selenium.applet(TABLE_APPLET_ID);
//		sleep(10000);
		
		TableFixture table = af.table("table");
		
		TableCell cell1 = TableCell.row(1).column(4);

		TableCell cell2 = TableCell.row(2).column(3);
		table.selectCells(new TableCell[]{cell1,cell2});
		assertThat(table.cell("Kathy")).isNotNull();
		TableCell cell = TableCell.row(1).column(2);
		TableCellFixture f = table.cell(cell);
		assertThat(f.value()).isEqualTo("Rowing");
		f.startEditing();
		f.enterValue("Pool");
		f.stopEditing();
		cell = TableCell.row(1).column(3);
		f= table.cell(cell);
	//	f.startEditing();
		//f.enterValue("8");
		//f.startEditing();
		cell = TableCell.row(2).column(4);
		f= table.cell(cell);
		f.select().click();
		
		cell = TableCell.row(1).column(1);		
		f= table.cell(cell);
		/*
		f.click();
		DialogFixture dialog = af.dialog("dialog");
		TabbedPaneFixture pane = dialog.tabbedPane("ColorChooser.tabPane");
		pane.focus().selectTab(1).click().selectTab(2).click();
		*/
	//	table.selectRows(new int[]{1,2});
		
		
	}

	@Override
	void onSetUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void onTearDown() {
		// TODO Auto-generated method stub
		
	}

	@Override
	String getAppletUrl() {
		// TODO Auto-generated method stub
		return TABLE_APPLET_ID+".html";
	}

}
