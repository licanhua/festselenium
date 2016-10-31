package com.nemo.festselenium.fixture;

import org.junit.Test;

import com.nemo.festselenium.fixture.ComponentContext;
import com.nemo.festselenium.fixture.ComponentFixture;
import com.nemo.festselenium.fixture.ContainerFixture;

import static org.fest.assertions.Assertions.assertThat;

public class ContainerFixtureTest {
	private final static String prefix = "ContainerFixtureTest";
	private final static ComponentContext parentContext = new  ComponentContext(null, prefix, prefix);
	private final static ContainerFixture<?> parent = new ContainerFixture<ContainerFixture<?>>(parentContext){};
	
	private void verifyComponentStringEqual(ComponentFixture<?> c, String functionString) {
		String newComponentString = parentContext.createQueryStringComponentAsPrefix(functionString);
		assertThat(c.getComponentContext().getComponentQueryString()).isEqualTo(newComponentString);
	}
	
	@Test
	public void testButton() {
		verifyComponentStringEqual(parent.button("name"), "button(\"name\")");		
		verifyComponentStringEqual(parent.button(), "button()");
	}

	@Test
	public void testCheckBox() {
		verifyComponentStringEqual(parent.checkBox(), "checkBox()");
		verifyComponentStringEqual(parent.checkBox("name"), "checkBox(\"name\")");		
	}

	@Test
	public void testTextBox() {
		verifyComponentStringEqual(parent.textBox(), "textBox()");
		verifyComponentStringEqual(parent.textBox("name"), "textBox(\"name\")");		
	}

	@Test
	public void testComboBox() {
		verifyComponentStringEqual(parent.comboBox(), "comboBox()");
		verifyComponentStringEqual(parent.comboBox("name"), "comboBox(\"name\")");
	}

	@Test
	public void testTable() {
		verifyComponentStringEqual(parent.table(), "table()");
		verifyComponentStringEqual(parent.table("name"), "table(\"name\")");
	}

	@Test
	public void testDialog() {
		verifyComponentStringEqual(parent.dialog(), "dialog()");
		verifyComponentStringEqual(parent.dialog("name"), "dialog(\"name\")");
	}

	@Test
	public void testFileChooser() {
		verifyComponentStringEqual(parent.fileChooser(), "fileChooser()");
		verifyComponentStringEqual(parent.fileChooser("name"), "fileChooser(\"name\")");
	}

	@Test
	public void testLabel() {
		verifyComponentStringEqual(parent.label(), "label()");
		verifyComponentStringEqual(parent.label("name"), "label(\"name\")");
	}


	@Test
	public void testList() {
		verifyComponentStringEqual(parent.list(), "list()");
		verifyComponentStringEqual(parent.list("name"), "list(\"name\")");
	}

	@Test
	public void testMenuItemWithPath() {
		String[] path = new String[] {"test1", "test2"};
		verifyComponentStringEqual(parent.menuItemWithPath(path), "menuItemWithPath([\"test1\",\"test2\"])");
	}

	@Test
	public void testMenuItem() {
		verifyComponentStringEqual(parent.menuItem("OK"), "menuItem(\"OK\")");
	}

	@Test
	public void testOptionPane() {
		verifyComponentStringEqual(parent.optionPane(), "optionPane()");
	}

	@Test
	public void testPanel() {
		verifyComponentStringEqual(parent.panel(), "panel()");
		verifyComponentStringEqual(parent.panel("name"), "panel(\"name\")");
	}

	@Test
	public void testProgressBar() {
		verifyComponentStringEqual(parent.progressBar(), "progressBar()");
		verifyComponentStringEqual(parent.progressBar("name"), "progressBar(\"name\")");
	}

	@Test
	public void testRadioButton() {
		verifyComponentStringEqual(parent.radioButton(), "radioButton()");
		verifyComponentStringEqual(parent.radioButton("name"), "radioButton(\"name\")");
	}

	@Test
	public void testScrollBar() {
		verifyComponentStringEqual(parent.scrollBar(), "scrollBar()");
		verifyComponentStringEqual(parent.scrollBar("name"), "scrollBar(\"name\")");
	}

	@Test
	public void testScrollPane() {
		verifyComponentStringEqual(parent.scrollPane(), "scrollPane()");
		verifyComponentStringEqual(parent.scrollPane("name"), "scrollPane(\"name\")");
	}

	@Test
	public void testSlider() {
		verifyComponentStringEqual(parent.slider(), "slider()");
		verifyComponentStringEqual(parent.slider("name"), "slider(\"name\")");
	}

	@Test
	public void testSpinner() {
		verifyComponentStringEqual(parent.spinner(), "spinner()");
		verifyComponentStringEqual(parent.spinner("name"), "spinner(\"name\")");
	}


	@Test
	public void testSplitPane() {
		verifyComponentStringEqual(parent.splitPane(), "splitPane()");
		verifyComponentStringEqual(parent.splitPane("name"), "splitPane(\"name\")");
	}

	@Test
	public void testTabbedPane() {
		verifyComponentStringEqual(parent.tabbedPane(), "tabbedPane()");
		verifyComponentStringEqual(parent.tabbedPane("name"), "tabbedPane(\"name\")");
	}

	@Test
	public void testToggleButton() {
		verifyComponentStringEqual(parent.toggleButton(), "toggleButton()");
		verifyComponentStringEqual(parent.toggleButton("name"), "toggleButton(\"name\")");
	}

	@Test
	public void testToolBar() {
		verifyComponentStringEqual(parent.toolBar(), "toolBar()");
		verifyComponentStringEqual(parent.toolBar("name"), "toolBar(\"name\")");
	}

	@Test
	public void testTree() {
		verifyComponentStringEqual(parent.tree(), "tree()");
		verifyComponentStringEqual(parent.tree("name"), "tree(\"name\")");
	}

}
