package com.nemo.festselenium;

import static org.junit.Assert.*;
import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

import com.nemo.festselenium.fixture.AppletFixture;
import com.nemo.festselenium.fixture.ButtonFixture;
import com.nemo.festselenium.fixture.ListFixture;
import com.nemo.festselenium.fixture.TextComponentFixture;

public class ListIntegrationTest extends BaseIntegerationTest {

	 String LIST_APPLET_ID = "list_applet";
	@Test
	public void test() {
		AppletFixture af = selenium.applet(LIST_APPLET_ID);
		ListFixture list = af.list("employees");
		ButtonFixture fire = af.button("fire");
		ButtonFixture hir = af.button("hire");
		TextComponentFixture text = af.textBox();
//		list.selectItems(new int[]{1,2});
//		list.clickItem(1).requireSelectedItems("Debbie Scott");
		String[] items = new String[]{"Debbie Scott", "Scott Hommel"};
		list.selectItems(items);
//		list.requireSelectedItems(items);
		list.selectItem(1);
		assertThat(list.item(1).value()).isEqualTo("Scott Hommel");
		text.enterText("this is sample");
		hir.click();
		list.selectItem("Scott Hommel");
		fire.click();
		text.enterText("only you");
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
		return LIST_APPLET_ID+".html";
	}

}
