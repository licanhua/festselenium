package com.nemo.festselenium.fixture;

import java.awt.Point;

import org.apache.commons.lang.ArrayUtils;

import com.nemo.festselenium.core.KeyPressInfo;
import com.nemo.festselenium.core.MouseButton;

import static com.nemo.festselenium.utils.FunctionStringHelper.*;

public abstract class ComponentFixture<T extends ComponentFixture<?>>
		implements LiveConnectSupport, MouseInputSimulationFixture,
		KeyboardInputSimulationFixture, StateVerificationFixture,
		FocusableComponentFixture, PopupMenuInvokerFixture, ToolTipDisplayFixture {
	private final ComponentContext context;
	protected final String POPUP_FIXTURE_QUERY_STRING = "window.fixturePopupMenu123";

	final static String ARRAY_TO_STRING_FUNC = "function arrayToString(arr) {" +
            "var ret = \"[ \";" +
            "for (i = 0; i < arr.length; i++) {" +
               " if (i > 0) {" +
                    "ret += \", \";" +
                "}" +
                "ret += arr[i];" +
            "}" +
            "ret += \" ]\";"+
            "return ret;" +
        "};";	
	
	public ComponentFixture(ComponentContext context) {
		this.context = context;
	}

	protected ComponentContext getComponentContext() {
		return context;
	}

	@SuppressWarnings("unchecked")
	private T _executeFunctionReturnSelf(String functionString) {
		executeFunctionString(functionString);
		return (T) this;
	}

	protected final T executeFunctionReturnSelf(String actionName) {
		String functionString = createFunctionString(actionName);
		return _executeFunctionReturnSelf(functionString);
	}

	protected final T executeFunctionReturnSelf(String actionName,
			String parameter) {
		String functionString = createFunctionString(actionName, parameter);
		return _executeFunctionReturnSelf(functionString);
	}

	protected final T executeFunctionReturnSelf(String actionName, int parameter) {
		String functionString = createFunctionString(actionName, parameter);
		return _executeFunctionReturnSelf(functionString);
	}

	protected final T executeFunctionReturnSelf(String actionName,
			int parameter1, int parameter2) {
		String functionString = createFunctionString(actionName, parameter1,
				parameter2);
		return _executeFunctionReturnSelf(functionString);
	}

	protected final T executeFunctionReturnSelf(String actionName, int[] objects) {
		String functionString = createFunctionString(actionName,
				ArrayUtils.toObject(objects));
		return _executeFunctionReturnSelf(functionString);
	}

	@SuppressWarnings("unchecked")
	protected final T executeFunctionReturnSelf(String actionName,
			String[] objects) {
		/*
		String functionString = createFunctionString(actionName, objects);
		return _executeFunctionReturnSelf(functionString);
		*/
		// We first convert the Array into Applet internal String[]
		String functionString = createFunctionString("createStringArray", objects);
		String prefix = this.getComponentContext().getComponentQueryString();
		String script = String.format("var stringarray=%s;%s.%s(stringarray)",
				getComponentContext().createQueryStringTestFixtureAsPrefix(functionString),
				prefix,
				actionName
				);
		eval(script);
		return (T) this;
	}

	String eval(String script) {
		return getComponentContext().getSelenium().eval(script);
	}

	String executeFunctionString(String functionString) {
		String script = getComponentContext()
				.createQueryStringComponentAsPrefix(functionString);
		return eval(script);
	}

	/*********** From FocusableComponentFixture *********************/
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.nemo.seleniumfest.fixture.FocusableComponentFixture#focus()
	 */
	@Override
	public final T focus() {
		return executeFunctionReturnSelf("focus");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.nemo.seleniumfest.fixture.StateVerificationFixture#requireFocused()
	 */
	@Override
	public final T requireFocused() {
		return executeFunctionReturnSelf("requireFocused");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.nemo.seleniumfest.fixture.KeyboardInputSimulationFixture#
	 * pressAndReleaseKeys(int)
	 */
	@Override
	public final T pressAndReleaseKeys(int... keyCodes) {
		return executeFunctionReturnSelf("pressAndReleaseKeys", keyCodes);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.nemo.seleniumfest.fixture.KeyboardInputSimulationFixture#pressKey
	 * (int)
	 */
	@Override
	public final T pressKey(int keyCode) {
		return executeFunctionReturnSelf("pressKey", keyCode);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.nemo.seleniumfest.fixture.KeyboardInputSimulationFixture#
	 * pressAndReleaseKey(com.nemo.seleniumfest.core.KeyPressInfo)
	 */
	@Override
	@SuppressWarnings("unchecked")
	public final T pressAndReleaseKey(KeyPressInfo keyPressInfo) {
		String keyPressInfoString = createKeyPressInfoQueryString(
				keyPressInfo.keyCode(), keyPressInfo.modifier());
		String clickString = getComponentContext()
				.createQueryStringComponentAsPrefix(
						"pressAndReleaseKey(javaObject)");
		String script = String.format("var javaObject=%s;%s",
				keyPressInfoString, clickString);
		eval(script);

		return (T) this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.nemo.seleniumfest.fixture.KeyboardInputSimulationFixture#releaseKey
	 * (int)
	 */
	@Override
	public final T releaseKey(int keyCode) {
		return executeFunctionReturnSelf("releaseKey", keyCode);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.nemo.seleniumfest.fixture.MouseInputSimulationFixture#click()
	 */
	@Override
	public final T click() {
		return executeFunctionReturnSelf("click");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.nemo.seleniumfest.fixture.MouseInputSimulationFixture#click(com.nemo
	 * .seleniumfest.core.MouseButton)
	 */
	@Override
	@SuppressWarnings("unchecked")
	public final T click(MouseButton button) {
		String mouseButtonString = createMouseButtonQueryString(button.mask);
		String clickString = getComponentContext()
				.createQueryStringComponentAsPrefix(
						"click(mousebutton)");
		String script = String.format("var mousebutton=%s;%s",
				mouseButtonString, clickString);
		eval(script);
		return (T) this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.nemo.seleniumfest.fixture.MouseInputSimulationFixture#doubleClick()
	 */
	@Override
	public final T doubleClick() {
		return executeFunctionReturnSelf("doubleClick");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.nemo.seleniumfest.fixture.MouseInputSimulationFixture#rightClick()
	 */
	@Override
	public final T rightClick() {
		return executeFunctionReturnSelf("rightClick");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.nemo.seleniumfest.fixture.StateVerificationFixture#requireDisabled()
	 */
	@Override
	public final T requireDisabled() {
		return executeFunctionReturnSelf("requireDisabled");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.nemo.seleniumfest.fixture.StateVerificationFixture#requireEnabled()
	 */
	@Override
	public final T requireEnabled() {
		return executeFunctionReturnSelf("requireEnabled");
	}

	/**
	 * Origine from StateVerificationFixture in fest swing
	 * 
	 * Asserts that this fixture's GUI component is enabled.
	 * 
	 * @param timeout
	 *            the time this fixture will wait for the component to be
	 *            enabled.
	 * @return this fixture.
	 * @throws WaitTimedOutError
	 *             if this fixture's GUI component is never enabled.
	 */
	/*
	 * @SuppressWarnings("unchecked") public T requireEnabled(Timeout timeout) {
	 * throw new RuntimeException(
	 * "I'm sorry,  requireEnabled(Timeout timeout) is not implemented"); //
	 * return (T) this; }
	 */

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.nemo.seleniumfest.fixture.StateVerificationFixture#requireNotVisible
	 * ()
	 */
	@Override
	public final T requireNotVisible() {
		return executeFunctionReturnSelf("requireNotVisible");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.nemo.seleniumfest.fixture.StateVerificationFixture#requireVisible()
	 */
	@Override
	public final T requireVisible() {
		return executeFunctionReturnSelf("requireVisible");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.nemo.seleniumfest.fixture.LiveConnectSupport#
	 * createKeyPressInfoQueryString(int, int)
	 */
	@Override
	public final String createKeyPressInfoQueryString(int keyCode, int modifier) {
		String functionString = createFunctionString("createKeyPressInfo",
				keyCode, modifier);
		return getComponentContext().createQueryStringTestFixtureAsPrefix(
				functionString);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.nemo.seleniumfest.fixture.LiveConnectSupport#createPointQueryString
	 * (int, int)
	 */
	@Override
	public final String createPointQueryString(int x, int y) {
		String functionString = createFunctionString("createPoint", x, y);
		return getComponentContext().createQueryStringTestFixtureAsPrefix(
				functionString);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.nemo.seleniumfest.fixture.LiveConnectSupport#createMouseButtonQueryString
	 * (int)
	 */
	@Override
	public final String createMouseButtonQueryString(int buttonMask) {
		String functionString = createFunctionString("createMouseButton",
				buttonMask);
		return getComponentContext().createQueryStringTestFixtureAsPrefix(
				functionString);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.nemo.seleniumfest.fixture.LiveConnectSupport#createFileQueryString
	 * (java.lang.String)
	 */
	@Override
	public final String createFileQueryString(String name) {
		String functionString = createFunctionString("createFile", name);
		return getComponentContext().createQueryStringTestFixtureAsPrefix(
				functionString);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.nemo.seleniumfest.fixture.LiveConnectSupport#createFileQueryString
	 * (java.lang.String[])
	 */
	@Override
	public final String createFileQueryString(String[] fileNames) {
		String functionString = createFunctionString("createFiles", fileNames);
		return getComponentContext().createQueryStringTestFixtureAsPrefix(
				functionString);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.nemo.seleniumfest.fixture.LiveConnectSupport#createTableCellQueryString
	 * (int, int)
	 */
	@Override
	public final String createTableCellQueryString(int row, int column) {
		String functionString = createFunctionString("createTableCell", row,
				column);
		return getComponentContext().createQueryStringTestFixtureAsPrefix(
				functionString);
	}

	/* (non-Javadoc)
	 * @see com.nemo.seleniumfest.fixture.PopupMenuInvokerFixture#showPopupMenu()
	 */
	@Override
	public final PopupMenuFixture showPopupMenu() {

		ComponentContext popupContext = new ComponentContext(
				getComponentContext().getSelenium(), getComponentContext()
						.getAppletQueryString(), POPUP_FIXTURE_QUERY_STRING);

		String functionString = createFunctionString("showPopupMenu");
		String invokeString = getComponentContext()
				.createQueryStringComponentAsPrefix(functionString);
		String script = String.format("%s=%s", POPUP_FIXTURE_QUERY_STRING,
				invokeString);
		eval(script);

		return new PopupMenuFixture(popupContext);

	}

	/* (non-Javadoc)
	 * @see com.nemo.seleniumfest.fixture.PopupMenuInvokerFixture#showPopupMenuAt(java.awt.Point)
	 */
	@Override
	public final PopupMenuFixture showPopupMenuAt(Point p) {
		ComponentContext popupContext = new ComponentContext(
				getComponentContext().getSelenium(), getComponentContext()
						.getAppletQueryString(), POPUP_FIXTURE_QUERY_STRING);

		String pointQueryString = createPointQueryString(p.x, p.y);

		String script = String.format(
				"var point=%s; %s = %s.showPopupMenuAt(point)",
				pointQueryString, POPUP_FIXTURE_QUERY_STRING,
				getComponentContext().getComponentQueryString());
		eval(script);
		return new PopupMenuFixture(popupContext);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.nemo.seleniumfest.fixture.MouseInputSimulationFixture#clickAt(java
	 * .awt.Point)
	 */
	@Override
	public final T clickAt(Point p) {
		return clickAt(p.x, p.y);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.nemo.seleniumfest.fixture.MouseInputSimulationFixture#clickAt(int,
	 * int)
	 */
	@Override
	@SuppressWarnings("unchecked")
	public final T clickAt(int x, int y) {
		String point = createPointQueryString(x, y);
		String mousebutton = createMouseButtonQueryString(MouseButton.LEFT_BUTTON.mask);
		String script = String
				.format("var point=%s; var mouse=%s; %s.robot.pressMouse(point, mousebutton)",
						point, mousebutton, this.getComponentContext()
								.getComponentQueryString());

		eval(script);
		return (T) this;
	}
	
	
	/* (non-Javadoc)
	 * @see com.nemo.seleniumfest.fixture.ToolTipDisplayFixture#requireToolTip(java.lang.String)
	 */
	@Override
	public final T requireToolTip(String expected) {
		return executeFunctionReturnSelf("requireToolTip", expected);
	}

}
