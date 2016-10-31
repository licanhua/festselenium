package com.nemo.festselenium.fixture;

import static org.fest.assertions.Assertions.assertThat;
import java.awt.Point;

import org.junit.Before;
import org.junit.Test;

import com.nemo.festselenium.fixture.ComponentFixture;
import com.nemo.festselenium.fixture.DialogFixture;

public class DialogFixtureTest extends ComponentFixture_TestCaseBase {

	private DialogFixture componentFixture;

	@Before
	public void setUp() throws Exception {
		componentFixture = new DialogFixture(context);		
	}

	@Test
	public void testMoveTo() {
		Point p = new Point(12,2);
		assertThatReturnsSelf(componentFixture.moveTo(p));
		assertThat(selenium.lastCommandResult()).contains(
				createQueryString("moveTo(point)")).
				contains("var point=");
	}

	@Test
	public void testMoveToFront() {
		assertThatReturnsSelf(componentFixture.moveToFront());
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("moveToFront()"));
	}

	@Test
	public void testMoveToBack() {
		assertThatReturnsSelf(componentFixture.moveToBack());
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("moveToBack()"));
	}

	@Test
	public void testRequireModal() {
		assertThatReturnsSelf(componentFixture.requireModal());
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("requireModal()"));
	}

	@Test
	public void testResizeHeightTo() {
		assertThatReturnsSelf(componentFixture.resizeHeightTo(112));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("resizeHeightTo(112)"));
	}

	@Test
	public void testResizeWidthTo() {
		assertThatReturnsSelf(componentFixture.resizeWidthTo(112));
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("resizeWidthTo(112)"));
	}

	@Test
	public void testShow() {
		assertThatReturnsSelf(componentFixture.show());
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("show()"));
	}

	@Test
	public void testClose() {
		componentFixture.close();
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("close()"));
	}

	@Override
	ComponentFixture<?> fixture() {
		// TODO Auto-generated method stub
		return componentFixture;
	}

}
