package com.nemo.festselenium.fixture;

import static org.fest.assertions.Assertions.assertThat;
import org.junit.Before;
import org.junit.Test;

import com.nemo.festselenium.fixture.ComponentFixture;
import com.nemo.festselenium.fixture.MenuItemFixture;
import com.nemo.festselenium.fixture.PopupMenuFixture;

public class PopupMenuFixtureTest extends ComponentFixture_TestCaseBase {

	private PopupMenuFixture componentFixture;

	@Before
	public void setUp() throws Exception {
		componentFixture = new PopupMenuFixture(context);			
	}

	@Test
	public void testMenuItem() {
		MenuItemFixture c = componentFixture.menuItem("11");
		assertThat(c.getComponentContext().getComponentQueryString()).isEqualTo(
				createQueryString("menuItem(\"11\")"));
	}

	@Test
	public void testMenuItemWithPath() {
		MenuItemFixture c = componentFixture.menuItemWithPath(new String[]{"11","OK"});
		assertThat(c.getComponentContext().getComponentQueryString()).isEqualTo(
				createQueryString("menuItemWithPath([\"11\",\"OK\"])"));
	}

	@Override
	ComponentFixture<?> fixture() {
		return componentFixture;
	}

}
