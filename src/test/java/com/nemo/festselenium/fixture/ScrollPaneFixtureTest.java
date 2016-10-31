package com.nemo.festselenium.fixture;

import static org.fest.assertions.Assertions.assertThat;
import org.junit.Before;
import org.junit.Test;

import com.nemo.festselenium.fixture.ComponentFixture;
import com.nemo.festselenium.fixture.ScrollBarFixture;
import com.nemo.festselenium.fixture.ScrollPaneFixture;

public class ScrollPaneFixtureTest extends ComponentFixture_TestCaseBase {

	private ScrollPaneFixture componentFixture;

	@Before
	public void setUp() throws Exception {
		componentFixture = new ScrollPaneFixture(context);	
	}

	@Test
	public void testHorizontalScrollBar() {
		ScrollBarFixture c = componentFixture.horizontalScrollBar();
		assertThat(c.getComponentContext().getComponentQueryString()).isEqualTo(
				createQueryString("horizontalScrollBar()"));
	}

	@Test
	public void testVerticalScrollBar() {
		ScrollBarFixture c = componentFixture.verticalScrollBar();
		assertThat(c.getComponentContext().getComponentQueryString()).isEqualTo(
				createQueryString("verticalScrollBar()"));
	}

	@Override
	ComponentFixture<?> fixture() {
		return componentFixture;
	}

}
