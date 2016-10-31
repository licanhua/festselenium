package com.nemo.festselenium.fixture;

import static org.fest.assertions.Assertions.assertThat;
import org.junit.Before;
import org.junit.Test;

import com.nemo.festselenium.fixture.ComponentFixture;
import com.nemo.festselenium.fixture.ListFixture;
import com.nemo.festselenium.fixture.ListItemFixture;

public class ListFixtureTest extends ComponentFixture_TestCaseBase {
	private ListFixture componentFixture;
	@Before
	public void setUp() throws Exception {
		componentFixture = new ListFixture(context);		
	}

	@Test
	public void testValueAt() {
		String s=componentFixture.valueAt(11);
		assertThat(s).isEqualTo(
				createQueryString("valueAt(11)"));
	}

	@Test
	public void testItemInt() {
		ListItemFixture c = componentFixture.item(11);
		assertThat(c.getComponentContext().getComponentQueryString()).isEqualTo(
				createQueryString("item(11)"));
	}

	@Test
	public void testItemString() {
		ListItemFixture c = componentFixture.item("11");
		assertThat(c.getComponentContext().getComponentQueryString()).isEqualTo(
				createQueryString("item(\"11\")"));
	}

	@Test
	public void testClearSelection() {
		assertThatReturnsSelf(componentFixture.clearSelection());
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("clearSelection()"));
	}

	@Test
	public void testSelectItemsIntInt() {
		assertThatReturnsSelf(componentFixture.selectItems(11,12));
		assertThat(selenium.lastCommandResult()).
			contains("from=").contains("to=").
			contains("from(11)").contains("to(12)").
			contains(createQueryString("selectItems(from,to)"));
	}

	/*
	@Test
	public void testSelectItemsIntArray() {
		assertThatReturnsSelf(componentFixture.selectItems(new int[]{11,12,13}));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("selectItems([11,12,13])"));
	}
*/
	
	@Test
	public void testSelectItemsStringArray() {
		assertThatReturnsSelf(componentFixture.selectItems(new String[]{"11","12","13"}));
		assertThat(selenium.lastCommandResult())
						.endsWith(createQueryString("selectItems(stringarray)")).
				contains("createStringArray([\"11\",\"12\",\"13\"])");
	}

	@Test
	public void testSelectItemInt() {
		assertThatReturnsSelf(componentFixture.selectItem(11));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("selectItem(11)"));
	}

	@Test
	public void testSelectItemString() {
		assertThatReturnsSelf(componentFixture.selectItem("11"));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("selectItem(\"11\")"));
	}

	@Test
	public void testDragString() {
		assertThatReturnsSelf(componentFixture.drag("OK"));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("drag(\"OK\")"));
	}

	@Test
	public void testDropString() {
		assertThatReturnsSelf(componentFixture.drop("OK"));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("drop(\"OK\")"));
	}

	@Test
	public void testDrop() {
		assertThatReturnsSelf(componentFixture.drop());
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("drop()"));
	}

	@Test
	public void testDragInt() {
		assertThatReturnsSelf(componentFixture.drag(11));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("drag(11)"));
	}

	@Test
	public void testDropInt() {
		assertThatReturnsSelf(componentFixture.drop(11));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("drop(11)"));
	}

	@Test
	public void testRequireSelectionString() {
		assertThatReturnsSelf(componentFixture.requireSelection("OK"));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("requireSelection(\"OK\")"));
	}

	@Test
	public void testRequireSelectionInt() {
		assertThatReturnsSelf(componentFixture.requireSelection(11));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("requireSelection(11)"));
	}

	@Test
	public void testRequireSelectedItemsStringArray() {
		assertThatReturnsSelf(componentFixture.requireSelectedItems(new String[]{"11","12","13"}));
		assertThat(selenium.lastCommandResult()).endsWith(
				createQueryString("requireSelectedItems(stringarray)")).
				contains("createStringArray([\"11\",\"12\",\"13\"])");
	}

	/*
	@Test
	public void testRequireSelectedItemsIntArray() {
		assertThatReturnsSelf(componentFixture.requireSelectedItems(new int[]{11,12,13}));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("requireSelectedItems([11,12,13])"));
	}
*/
	@Test
	public void testRequireNoSelection() {
		assertThatReturnsSelf(componentFixture.requireNoSelection());
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("requireNoSelection()"));
	}

	@Test
	public void testRequireItemCount() {
		assertThatReturnsSelf(componentFixture.requireItemCount(11));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("requireItemCount(11)"));
	}

	@Override
	ComponentFixture<?> fixture() {
		return componentFixture;
	}

}
