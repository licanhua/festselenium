package com.nemo.festselenium.fixture;

import static org.fest.assertions.Assertions.assertThat;

import java.awt.Point;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.nemo.festselenium.core.KeyPressInfo;
import com.nemo.festselenium.core.MouseButton;
import com.nemo.festselenium.fixture.ComponentContext;
import com.nemo.festselenium.fixture.ComponentFixture;
import com.nemo.festselenium.fixture.PopupMenuFixture;

public class ComponentFixtureTest extends ComponentFixture_TestCaseBase {
	private String prefix = "ComponetFixtureTest.test()";
	private ComponentContext context;
	
	private ComponentFixtureTestSupport componentFixture;	

	@Override
	ComponentFixture<?> fixture() {
		// TODO Auto-generated method stub
		return componentFixture;
	}
	
	@Before
	public void setUp() throws Exception {
		  EchoSelenium selenium = new EchoSelenium();
		  context = new  ComponentContext(selenium, prefix, prefix);
		  componentFixture = new ComponentFixtureTestSupport(context){};		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testExecuteFunctionReturnSelfString() {
		this.assertThatReturnsSelf(componentFixture.executeFunctionReturnSelf("test"));
		assertThat(componentFixture.lastResult()).isEqualTo("test()");
	}

	@Test
	public void testExecuteFunctionReturnSelfStringString() {
		this.assertThatReturnsSelf(componentFixture.executeFunctionReturnSelf("test", "test"));
		assertThat(componentFixture.lastResult()).isEqualTo("test(\"test\")");
	}

	@Test
	public void testExecuteFunctionReturnSelfStringInt() {
		this.assertThatReturnsSelf(componentFixture.executeFunctionReturnSelf("test", 1));
		assertThat(componentFixture.lastResult()).isEqualTo("test(1)");
	}

	@Test
	public void testExecuteFunctionReturnSelfStringIntInt() {
		this.assertThatReturnsSelf(componentFixture.executeFunctionReturnSelf("test", 1,2));
		assertThat(componentFixture.lastResult()).isEqualTo("test(1,2)");
	}

	@Test
	public void testExecuteFunctionReturnSelfStringIntArray() {
		this.assertThatReturnsSelf(componentFixture.executeFunctionReturnSelf("test", new int[]{1,2}));
		assertThat(componentFixture.lastResult()).isEqualTo("test([1,2])");
	}

	@Test
	public void testExecuteFunctionReturnSelfStringStringArray() {
		this.assertThatReturnsSelf(componentFixture.executeFunctionReturnSelf("test", new String[]{"11","A"}));
		assertThat(componentFixture.lastResult()).endsWith(createQueryString("test(stringarray)")).
		contains("createStringArray([\"11\",\"A\"])");;
	}

	@Test
	public void testEval() {
		ComponentFixture<ComponentFixture<?>> c = new ComponentFixture<ComponentFixture<?>>(context){};	
		assertThat(c.eval("test")).isEqualTo("test");
	}

	@Test
	public void testExecuteFunction() {
		ComponentFixture<ComponentFixture<?>> c = new ComponentFixture<ComponentFixture<?>>(context){};	
		c.executeFunctionString("test(OK)");
		assertThat(c.executeFunctionString("test(OK)")).
			isEqualTo(c.getComponentContext().getComponentQueryString()+"."+"test(OK)");
	}

	@Test
	public void testFocus() {
		assertThatReturnsSelf(componentFixture.focus());
		assertThat(componentFixture.lastResult()).isEqualTo("focus()");
	}

	@Test
	public void testRequireFocused() {
		assertThatReturnsSelf(componentFixture.requireFocused());
		assertThat(componentFixture.lastResult()).isEqualTo("requireFocused()");
	}

	@Test
	public void testPressAndReleaseKey() {
		KeyPressInfo key = new KeyPressInfo(10,12);
		int[] keys = new int[]{1,2,3};
		assertThatReturnsSelf(componentFixture.pressAndReleaseKey(key));
		assertThat(componentFixture.lastResult()).contains("pressAndReleaseKey(javaObject)");
		assertThat(componentFixture.lastResult()).startsWith("var javaObject=");
		assertThatReturnsSelf(componentFixture.pressAndReleaseKeys(keys));
		assertThat(componentFixture.lastResult()).isEqualTo("pressAndReleaseKeys([1,2,3])");
	}

	@Test
	public void testPressKey() {
		assertThatReturnsSelf(componentFixture.pressKey(11));
		assertThat(componentFixture.lastResult()).isEqualTo("pressKey(11)");
	}

	@Test
	public void testReleaseKey() {
		assertThatReturnsSelf(componentFixture.releaseKey(12));
		assertThat(componentFixture.lastResult()).isEqualTo("releaseKey(12)");
	}

	@Test
	public void testClick() {
		MouseButton m = MouseButton.LEFT_BUTTON;
		
		assertThatReturnsSelf(componentFixture.click());
		assertThat(componentFixture.lastResult()).isEqualTo("click()");
		assertThatReturnsSelf(componentFixture.click(m));
		assertThat(componentFixture.lastResult()).startsWith("var mousebutton=");
		assertThat(componentFixture.lastResult()).contains("click(mousebutton)");		
	}

	@Test
	public void testDoubleClick() {
		assertThatReturnsSelf(componentFixture.doubleClick());
		assertThat(componentFixture.lastResult()).isEqualTo("doubleClick()");
	}

	@Test
	public void testRequireToolTip() {
		assertThatReturnsSelf(componentFixture.requireToolTip("OK"));
		assertThat(componentFixture.lastResult()).isEqualTo("requireToolTip(\"OK\")");
	}
	@Test
	public void testRightClick() {
		assertThatReturnsSelf(componentFixture.rightClick());
		assertThat(componentFixture.lastResult()).isEqualTo("rightClick()");
	}

	@Test
	public void testRequireDisabled() {
		assertThatReturnsSelf(componentFixture.requireDisabled());
		assertThat(componentFixture.lastResult()).isEqualTo("requireDisabled()");
	}

	@Test
	public void testRequireEnabled() {
		assertThatReturnsSelf(componentFixture.requireEnabled());
		assertThat(componentFixture.lastResult()).isEqualTo("requireEnabled()");
	}

	@Test
	public void testRequireNotVisible() {
		assertThatReturnsSelf(componentFixture.requireNotVisible());
		assertThat(componentFixture.lastResult()).isEqualTo("requireNotVisible()");
	}

	@Test
	public void testRequireVisible() {
		assertThatReturnsSelf(componentFixture.requireVisible());
		assertThat(componentFixture.lastResult()).isEqualTo("requireVisible()");
	}

	@Test
	public void testCreateKeyPressInfoQueryString() {
		String s = componentFixture.createKeyPressInfoQueryString(0, 12);
		String appletFixutre = componentFixture.getComponentContext().getAppletTestFixtureQueryString();
		assertThat(s).isEqualTo(appletFixutre+".createKeyPressInfo(0,12)");
	}

	@Test
	public void testCreatePointQueryString() {
		String s = componentFixture.createPointQueryString(0, 12);
		String appletFixutre = componentFixture.getComponentContext().getAppletTestFixtureQueryString();
		assertThat(s).isEqualTo(appletFixutre+".createPoint(0,12)");
	}

	@Test
	public void testCreateMouseButtonQueryString() {
	
		String s = componentFixture.createMouseButtonQueryString(111);

		String appletFixutre = componentFixture.getComponentContext().getAppletTestFixtureQueryString();
		assertThat(s).isEqualTo(appletFixutre+".createMouseButton(111)");
			
	}

	@Test
	public void testCreateFileQueryStringString() {
		String s = componentFixture.createFileQueryString("ok");
		String appletFixutre = componentFixture.getComponentContext().getAppletTestFixtureQueryString();
		assertThat(s).isEqualTo(appletFixutre+".createFile(\"ok\")");		
	}

	@Test
	public void testCreateFileQueryStringStringArray() {
		String s = componentFixture.createFileQueryString(new String[]{"ok","No"});
		String appletFixutre = componentFixture.getComponentContext().getAppletTestFixtureQueryString();
		assertThat(s).isEqualTo(appletFixutre+".createFiles([\"ok\",\"No\"])");	
	}

	@Test
	public void testCreateTableCellQueryString() {
		String s = componentFixture.createTableCellQueryString(10, 12);
		String appletFixutre = componentFixture.getComponentContext().getAppletTestFixtureQueryString();
		assertThat(s).isEqualTo(appletFixutre+".createTableCell(10,12)");	
	}

	@Test
	public void testShowPopupMenu() {
		PopupMenuFixture popup = componentFixture.showPopupMenu();
		String expected =componentFixture.getComponentContext().
				getComponentQueryString() +
				".showPopupMenu()";
		assertThat(componentFixture.lastResult()).endsWith(expected);
		assertThat(popup).isNotNull();
		assertThat(popup.getComponentContext().getComponentQueryString()).startsWith(componentFixture.POPUP_FIXTURE_QUERY_STRING);
	}

	@Test
	public void testShowPopupMenuAt() {
		Point p = new Point(1,2);
		PopupMenuFixture popup = componentFixture.showPopupMenuAt(p);
		
		String expected =componentFixture.getComponentContext().
				getComponentQueryString() +
				".showPopupMenuAt(point)";
		assertThat(componentFixture.lastResult()).endsWith(expected);
		assertThat(popup).isNotNull();
		assertThat(popup.getComponentContext().getComponentQueryString()).startsWith(componentFixture.POPUP_FIXTURE_QUERY_STRING);		
	}

	@Test
	public void testClickAtPoint() {
		Point p = new Point(1,2);
		assertThatReturnsSelf(componentFixture.clickAt(p));
		
		assertThat(componentFixture.lastResult()).endsWith("pressMouse(point, mousebutton)");
		assertThat(componentFixture.lastResult()).startsWith("var point=");
		assertThat(componentFixture.lastResult()).contains("Point(1,2)");
	}

	@Test
	public void testClickAtIntInt() {
		Point p = new Point(1,2);
		assertThatReturnsSelf(componentFixture.clickAt(p));
		
		assertThat(componentFixture.lastResult()).endsWith("pressMouse(point, mousebutton)");
		assertThat(componentFixture.lastResult()).startsWith("var point=");
		assertThat(componentFixture.lastResult()).contains("Point(1,2)");		
	}



}
