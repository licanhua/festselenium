package com.nemo.festselenium;

import static org.junit.Assert.assertEquals;
import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

import com.nemo.festselenium.fixture.AppletFixture;
import com.nemo.festselenium.fixture.ComboBoxFixture;

public class ComboxIntegrationTest extends BaseIntegerationTest {

	private  String APPLET_ID = "combo_applet";
	   

	@Override
	String getAppletUrl() {
		return APPLET_ID+".html";
	}

	@Test
	public void test() {
		AppletFixture af = selenium.applet(APPLET_ID);
		ComboBoxFixture c = af.comboBox("pattern");
		
		//default select index is 0
		c.requireSelection(0);
		assertThat(0).isEqualTo(c.getSelectedIndex());
		
		// Need fest-swing1.3
		//	assertEquals(c.selectedItem(), "dd MMMMM yyyy");
		
		// select item
		c.selectItem("yyyy.MMMMM.dd GGG hh:mm aaa")
        .selectItem("K:mm a,z")
        .selectItem("H:mm:ss:SSS")
        .selectItem("h:mm a")
        .selectItem("EEE, MMM d, ''yy")
        .selectItem("yyy.MM.dd G 'at' hh:mm:ss z")
        .selectItem("MM/dd/yy");
		
		c.selectAllText().replaceText("Are you OK");
		assertThat(c.valueAt(1)).isEqualTo("dd.MM.yy");
		assertThat(c.selectItem(2).getSelectedIndex()).isEqualTo(2);
			c.selectItem(1).
			requireSelection(1).
			requireSelection("dd.MM.yy").
			requireEditable().
			requireVisible().
			focus();
			assertThat(c.getSelectedItem()).isEqualTo("dd.MM.yy");
			c.getItemCount();
			/*
			assertThat(c.getSelectedObjects()).isEqualTo("");
//			c.requireFocused();
			c.requireItemCount(9);
			c.clearSelection();
			c.requireNoSelection();
			*/
	}

	@Override
	void onSetUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void onTearDown() {
		// TODO Auto-generated method stub
		
	}
	
}
