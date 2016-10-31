package com.nemo.festselenium.fixture;

import static org.fest.assertions.Assertions.assertThat;
import static org.junit.Assert.*;

import java.awt.Point;

import org.junit.Before;
import org.junit.Test;

import com.nemo.festselenium.fixture.ComponentFixture;
import com.nemo.festselenium.fixture.ToolBarFixture;

public class ToolBarFixtureTest extends ComponentFixture_TestCaseBase {

	private ToolBarFixture componentFixture;

	@Before
	public void setUp() throws Exception {
		componentFixture = new ToolBarFixture(context);		
	}

	@Test
	public void testFloatTo() {
		Point p = new Point(1,2);
		assertThatReturnsSelf(componentFixture.floatTo(p));
		
		assertThat(selenium.lastCommandResult()).endsWith("floatTo(point)").
			startsWith("var point=").
			contains("Point(1,2)");
	}

	@Test
	public void testUnfloat() {
		assertThatReturnsSelf( componentFixture.unfloat());
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("unfloat()"));
	}

	@Override
	ComponentFixture<?> fixture() {
		return componentFixture;
	}

}
