package com.nemo.festselenium.fixture;

import com.nemo.festselenium.selenium.JavaSelenium;

import static com.nemo.festselenium.utils.FunctionStringHelper.createFunctionString;

/**
 * Include the component information. provide functions to help use construct the query string
 * 
 * @author CanHua Li
 * @since 2012/12/28
 */
public class ComponentContext {
	final private JavaSelenium selenium;

	/** Component query string used to identify the fest fixture in selenium, for example:
	 * <B>window.document.getElementById['checkbox_applet'].getTestFixture().button("test")</B>
	 */
	final private String componentQueryString;

	/** Component query string which identify the Applet in selenium, for example: 
	 * <B>window.document.getElementById['checkbox_applet']</B> */
	final private String appletQueryString;

	public final static String GET_APPLET_TEST_FIXTURE = "getTestFixture()";

	public ComponentContext(JavaSelenium selenium, String appletQueryString,
			String componentQueryString) {
		this.selenium = selenium;
		this.appletQueryString = appletQueryString;
		this.componentQueryString = componentQueryString;
	}

	public JavaSelenium getSelenium() {
		return selenium;
	}

	/**
	 * get the query string for component on server side. For example: <BR/>
	 * <B>
	 * window.document.getElementById['checkbox_applet'].getTestFixture().button("test")
	 * </B>
	 * 
	 * @return component query string
	 */
	public String getComponentQueryString() {
		return componentQueryString;
	}

	/**
	 * get the query string for the JApplet on server side. For example: <BR/>
	 * <B>window.document.getElementById['checkbox_applet']</B>
	 * 
	 * @return the applet query string
	 */
	public String getAppletQueryString() {
		return appletQueryString;
	}

	/**
	 * get the query string for the JAppletFixture on server side. For example: <BR/>
	 * <B>
	 * window.document.getElementById['checkbox_applet'].getTestFixture() 
	 * </B>
	 * 
	 * @return the applet test fixture query string
	 */
	public String getAppletTestFixtureQueryString() {
		return getAppletQueryString() + "." + GET_APPLET_TEST_FIXTURE;
	}

	/**
	 * Creates a new query string by insert the componentQueryString as the
	 * prefix. Here is a example for button("test") as functionString:
	 * <BR/>
	 * <B>window.document.getElementById['checkbox_applet'].getTestFixture().button("test").</B>
	 * @param functionString
	 *            includes function name and function parameters. for example:
	 *            <BR/><code>button("test")</code>
	 * @return a new query string
	 */
	public String createQueryStringComponentAsPrefix(String functionString) {
		return getComponentQueryString() + "." + functionString;
	}

	/**
	 * Creates a new query string by insert the applet Id as the prefix.
	 * Prefix for checkbox_applet applet: 
	 * <B>window.document.getElementById['checkbox_applet'].</B>
	 * @param functionString	  
	 *            includes function name and function parameters. for example:
	 *            <BR/><code>button("test")</code>
	 * @return a new query string
	 */
	public String createQueryStringAppletIdAsPrefix(String functionString) {
		return getAppletQueryString() + "." + functionString;
	}

	/**
	 * Creates a new query string by insert the applet Id as the prefix.
	 * Prefix for checkbox_applet applet: 
	 * <B>window.document.getElementById['checkbox_applet'].getTestFixture().</B>
	 * @param functionString
	 *            includes function name and function parameters. for example:
	 *            <BR/><code>button("test")</code>
	 * @return a new query string
	 */
	public String createQueryStringTestFixtureAsPrefix(String functionString) {
		return getAppletTestFixtureQueryString() + "." + functionString;
	}
	
	/**
	 * Creates a new sub componenContext with the sub component query string
	 * AppletQueryString and Selenium are the same with old one.
	 * @param queryString
	 *            the new component query string
	 * @return a new <code>{@link ComponentContext}</code>
	 */		
	public ComponentContext createContextByQueryString(String queryString) {
		return new ComponentContext(getSelenium(), getAppletQueryString(),
				queryString);	
	}
	/**
	 * Creates a new sub componenContext with the functionString
	 * It first insert the component query string before functionString.
	 * AppletQueryString and Selenium are the same with old context.
	 * @param functionString
	 *            includes function name and function parameters. for example:
	 *            <BR/><code>button("test")</code>
	 * @return a new <code>{@link ComponentContext}</code>
	 */	
	public ComponentContext createContextByFunctionString(String functionString) {
		String subComponentString = createQueryStringComponentAsPrefix(functionString);
		return new ComponentContext(getSelenium(), getAppletQueryString(),
				subComponentString);
	}

	/**
	 * Creates a new sub componenContext with the functionName and parameters
	 * It first insert the component query string before functionName and parameters.
	 * 
	 * @param functionName
	 *            function name to get the new component
	 * @return a new <code>{@link ComponentContext}</code>
	 */
	public ComponentContext createSubComponentContext(String functionName) {
		String functionString = createFunctionString(functionName);
		return createContextByFunctionString(functionString);
	}

	/**
	 * Creates a new sub componenContext with the functionName and parameters
	 * It first insert the component query string before functionName and parameters.
	 * 
	 * @param functionName
	 *            function name to get the new component
	 * @param para
	 *            a String parameter.
	 * @return a new <code>{@link ComponentContext}</code>
	 */
	public ComponentContext createSubComponentContext(String functionName,
			String parameter) {
		String functionString = createFunctionString(functionName, parameter);
		return createContextByFunctionString(functionString);
	}

	/**
	 * Creates a new sub componenContext with the functionName and parameters
	 * It first insert the component query string before functionName and parameters.
	 * 
	 * @param functionName
	 *            function name to get the new component
	 * @param para
	 *            a int parameter.
	 * @return a new <code>{@link ComponentContext}</code>
	 */
	public ComponentContext createSubComponentContext(String functionName,
			int parameter) {
		String functionString = createFunctionString(functionName, parameter);
		return createContextByFunctionString(functionString);
	}
	
	/**
	 * Creates a new sub componenContext with the functionName and parameters
	 * It first insert the component query string before functionName and parameters.
	 * 
	 * @param functionName
	 *            the name of the function.
	 * @param objects
	 *            String or Integer array
	 * @return a new <code>{@link ComponentContext}</code>
	 */
	public ComponentContext createSubComponentContext(String functionName,
			Object[] objects) {
		String functionString = createFunctionString(functionName, objects);
		return createContextByFunctionString(functionString);
	}

	/**
	 * Creates a new query string by insert the componentQueryString as the
	 * prefix and parameters.
	 * 
	 * @param functionName
	 *            the name of the function.
	 * @param parameter
	 *            The name the component
	 * @return a new query string
	 */
	public String createSubComponetQueryString(String functionName,
			String parameter) {
		String functionString = createFunctionString(functionName, parameter);
		return createQueryStringComponentAsPrefix(functionString);
	}

	/**
	 * Creates a new query string by insert the componentQueryString as the
	 * prefix and parameters.
	 * 
	 * @param functionName
	 *            the name of the function.
	 * @return a new query string
	 */
	public String createSubComponetQueryString(String functionName) {
		String functionString = createFunctionString(functionName);
		return createQueryStringComponentAsPrefix(functionString);
	}

	/**
	 * Creates a new query string by insert the componentQueryString as the
	 * prefix and parameters.
	 * 
	 * @param functionName
	 *            the name of the function.
	 * @param parameter
	 *            Parameter: the int parameter
	 * @returna new query string
	 */
	public String createSubComponetQueryString(String functionName,
			int parameter) {
		String functionString = createFunctionString(functionName, parameter);
		return createQueryStringComponentAsPrefix(functionString);
	}

	/**
	 * Creates a new query string by insert the componentQueryString as the
	 * prefix and parameters.
	 * 
	 * @param functionName
	 *            the name of the function.
	 * @param p1
	 *            Parameter: the int parameter
	 * @param p2
	 *            Parameter: the int parameter
	 * @return a new query string
	 */
	public String createSubComponetQueryString(String functionName, int p1,
			int p2) {
		String functionString = createFunctionString(functionName, p1, p2);
		return createQueryStringComponentAsPrefix(functionString);
	}

	/**
	 * Creates a new query string by insert the componentQueryString as the
	 * prefix and parameters.
	 * 
	 * @param functionName
	 *            the name of the function.
	 * @param objects
	 *            Parameter: String or Integer array
	 * @return a new query string
	 */
	public String createSubComponetQueryString(String functionName,
			Object[] objects) {
		String functionString = createFunctionString(functionName, objects);
		return createQueryStringComponentAsPrefix(functionString);
	}
}
