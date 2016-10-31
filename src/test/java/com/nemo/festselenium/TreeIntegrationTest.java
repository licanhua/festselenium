package com.nemo.festselenium;

import static org.junit.Assert.*;

import org.junit.Test;

import com.nemo.festselenium.fixture.AppletFixture;
import com.nemo.festselenium.fixture.TreeFixture;
import com.nemo.festselenium.fixture.TreeRowFixture;

public class TreeIntegrationTest extends BaseIntegerationTest {
	 String TREE_APPLET_ID = "tree_applet";
	@Test
	public void test() {
		AppletFixture af = selenium.applet(TREE_APPLET_ID);
		TreeFixture tree = af.tree("tree");
		tree.selectPaths(new String[]{"root/attribute1","root/attribute2"}).click();
		tree.selectPath("root").click();
		tree.selectPath("root/attribute1/attribute1.3/leaf1.3.1").click();
		tree.selectRow(1);
		tree.collapsePath("root").expandPath("root");
	//	tree.clickRow(2);
	//	TreeRowFixture x = tree.node(1);
//		selenium.eval("var x=window.document.getElementById(\"tree_applet\").getTestFixture().tree(\"tree\").node(1);x.index();");
//		x.click();
	//	x.index();
	//	x.collapse().expand();
	//	x = tree.node("root");
	//	x.select().collapse().expand();
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
		return TREE_APPLET_ID+".html";
	}

}
