package com.nemo.festselenium.fixture;

import static com.nemo.festselenium.utils.FunctionStringHelper.createFunctionString;

import com.nemo.festselenium.core.MouseButton;

/**
 * Control the JListFixture in selenium server side
 * 
 * @see org.fest.swing.fixture.JListFixture
 * 
 * @author CanHua Li
 * 
 */
public class ListFixture extends ComponentFixture<ListFixture> {

	public ListFixture(ComponentContext context) {
		super(context);
	}

	/**
	 * Returns the {@code String} representation of the value of an item in this
	 * fixture's <code>{@link JList}</code>, using this fixture's
	 * <code>{@link JListCellReader}</code>.
	 * 
	 * @param index
	 *            the index of the item to return.
	 * @return the {@code String} representation of the value of an item in this
	 *         fixture's <code>JList</code>.
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	public String valueAt(int index) {
		String functionString = createFunctionString("valueAt", index);
		return executeFunctionString(functionString);
	}

	/**
	 * Returns a fixture that manages the list item specified by the given
	 * index.
	 * 
	 * @param index
	 *            of the item.
	 * @return a fixture that manages the list item specified by the given
	 *         index.
	 */
	public ListItemFixture item(int index) {
		ComponentContext c = getComponentContext().createSubComponentContext(
				"item", index);
		return new ListItemFixture(c);
	}

	/**
	 * Returns a fixture that manages the list item specified by the given text.
	 * 
	 * @param text
	 *            the text of the item. It can be a regular expression.
	 * @return a fixture that manages the list item specified by the given text.
	 */
	public ListItemFixture item(String text) {
		ComponentContext c = getComponentContext().createSubComponentContext(
				"item", text);
		return new ListItemFixture(c);
	}

	/**
	 * Returns a fixture that manages the list item whose text matches the given
	 * regular expression pattern.
	 * 
	 * @param pattern
	 *            the regular expression pattern to match.
	 * @return a fixture that manages the list item whose text matches the given
	 *         regular expression pattern.
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	/*
	 * public ListItemFixture item(Pattern pattern) { return new
	 * JListItemFixture(this, driver.indexOf(target, pattern)); }
	 */
	/**
	 * Clears the selection in this fixture's <code>{@link JList}</code>. Since
	 * this method does not simulate user input, it does not verifies that this
	 * fixture's <code>JList</code> is enabled and showing.
	 * 
	 * @return this fixture.
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	public ListFixture clearSelection() {
		return executeFunctionReturnSelf("clearSelection");
	}

	/**
	 * Simulates a user selecting the items (in the specified range) in this
	 * fixture's <code>{@link JList}</code>.
	 * 
	 * @param from
	 *            the starting point of the selection.
	 * @param to
	 *            the last item to select (inclusive.)
	 * @return this fixture.
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	public ListFixture selectItems(int from, int to) {
		String format = getComponentContext().getAppletQueryString()
				+ ".Packages.org.fest.swing.util.Range.from(%d);";
		String sFrom = String.format(format, from);
		
		format = getComponentContext().getAppletQueryString()
				+ ".Packages.org.fest.swing.util.Range.to(%d);";
		String sTo = String.format(format, to);
		String functionString = getComponentContext()
				.createQueryStringComponentAsPrefix("selectItems(from,to)");
		String script = "from=" + sFrom + "to=" + sTo + functionString;
		eval(script);
		return this;
	}

	/**
	 * Simulates a user selecting the specified items in this fixture's
	 * <code>{@link JList}</code>.
	 * 
	 * @param indices
	 *            the indices of the items to select.
	 * @return this fixture.
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	
//	I implement this method, but it doesn't work actually.
//	13:52:30.316 INFO - Command request: getEval[window.document.getElementById("lis
//			t_applet").getTestFixture().list("employees").selectItems([1,3,5]), ] on session
//			 a715f26523d2449d9714478c2617812a
//			13:52:30.457 INFO - Got result: ERROR: Threw an exception: java.lang.IllegalArgu
//			mentException: More than one method matching name selectItems and arguments [sun
//			.plugin2.main.client.MessagePassingJSObject]
//			  Method 1: public org.fest.swing.fixture.JListFixture org.fest.swing.fixture.JL
//			istFixture.selectItems(int[])
//			  Method 2: public org.fest.swing.fixture.JListFixture org.fest.swing.fixture.JL
//			istFixture.selectItems(java.lang.String[]) on session a715f26523d2449d9714478c26
//			17812a
	/*		
	public ListFixture selectItems(int... indices) {		
	//	throw new IllegalArgumentException("two selectItems([]) matched in server side");			
		return executeFunctionReturnSelf("selectItems", indices);
	}
	*/
	/**
	 * Simulates a user selecting the specified items in this fixture's
	 * <code>{@link JList}</code>. The items to select should match the given
	 * values.
	 * 
	 * @param items
	 *            the text of the items to select. Each {@code String} can be a
	 *            regular expression.
	 * @return this fixture.
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	public ListFixture selectItems(String... items) {
		return executeFunctionReturnSelf("selectItems", items);
	}

	/**
	 * Simulates a user selecting an item in this fixture's
	 * <code>{@link JList}</code>.
	 * 
	 * @param index
	 *            the index of the item to select.
	 * @return this fixture.
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 * @see #item(int)
	 * @see ListItemFixture#select()
	 */
	public ListFixture selectItem(int index) {
		return executeFunctionReturnSelf("selectItem", index);
	}

	/**
	 * Simulates a user selecting an item in this fixture's
	 * <code>{@link JList}</code>.
	 * 
	 * @param text
	 *            the text of the item to select. It can be a regular
	 *            expression.
	 * @return this fixture.
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 * @see #item(String)
	 * @see ListItemFixture#select()
	 */
	public ListFixture selectItem(String text) {
		return executeFunctionReturnSelf("selectItem", text);
	}

	/**
	 * Simulates a user clicking an item in this fixture's
	 * <code>{@link JList}</code>.
	 * 
	 * @param index
	 *            the index of the item to clicking.
	 * @return this fixture.
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 * @see #item(int)
	 * @see ListItemFixture#click()
	 */
	public ListFixture clickItem(int index) {
		return executeFunctionReturnSelf("clickItem", index);
	}

	/**
	 * Simulates a user clicking an item in this fixture's
	 * <code>{@link JList}</code>.
	 * 
	 * @param text
	 *            the text of the item to select. It can be a regular
	 *            expression.
	 * @return this fixture.
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 * @see #item(String)
	 * @see ListItemFixture#select()
	 */
	public ListFixture clickItem(String text) {
		return executeFunctionReturnSelf("clickItem", text);
	}

	/**
	 * Simulates a user clicking an item in this fixture's
	 * <code>{@link JList}</code>. The value of the item to select must match
	 * the given regular expression pattern.
	 * 
	 * @param pattern
	 *            the regular expression pattern to match.
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 * @see #item(Pattern)
	 * @see JListItemFixture#select()
	 */
	/*
	 * public JListFixture clickItem(Pattern pattern) { driver.clickItem(target,
	 * pattern, LEFT_BUTTON, 1); return this; }
	 */
	/**
	 * Simulates a user double-clicking an item in this fixture's
	 * <code>{@link JList}</code>.
	 * 
	 * @param index
	 *            the index of the item to double-click.
	 * @return this fixture.
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 * @deprecated to be removed in version 2.0. Use
	 *             <code>{@link #item(int)}</code> and
	 *             <code>{@link ListItemFixture#doubleClick()}</code> instead.
	 */
	@Deprecated
	public ListFixture doubleClickItem(int index) {
		return executeFunctionReturnSelf("doubleClickItem", index);
	}

	/**
	 * Simulates a user double-clicking an item in this fixture's
	 * <code>{@link JList}</code>.
	 * 
	 * @param text
	 *            the text of the item to double-click.
	 * @return this fixture.
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 * @deprecated to be removed in version 2.0. Use
	 *             <code>{@link #item(String)}</code> and
	 *             <code>{@link ListItemFixture#doubleClick()}</code> instead.
	 */
	@Deprecated
	public ListFixture doubleClickItem(String text) {
		return executeFunctionReturnSelf("doubleClickItem", text);
	}

	void clickItem(int index, MouseButton button, int times) {
		executeFunctionReturnSelf("doubleClickItem", index);
	}

	/**
	 * Simulates a drag operation at the location of the first item in this
	 * fixture's <code>{@link JList}</code> matching the given value.
	 * 
	 * @param text
	 *            the text of the item to drag. It can be a regular expression.
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 * @return this fixture.
	 */
	public ListFixture drag(String text) {
		return executeFunctionReturnSelf("drag", text);
	}

	/**
	 * Ends a drag operation at the location of the first item matching the
	 * given value.
	 * 
	 * @param text
	 *            the text of the item to drop. It can be a regular expression.
	 * @return this fixture.
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	public ListFixture drop(String text) {
		return executeFunctionReturnSelf("drop", text);
	}

	/**
	 * Simulates a user dropping an item at the center of this fixture's
	 * <code>{@link JList}</code>.
	 * 
	 * @return this fixture.
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	public ListFixture drop() {
		return executeFunctionReturnSelf("drop");
	}

	/**
	 * Simulates a user dragging an item from this fixture's
	 * <code>{@link JList}</code>.
	 * 
	 * @param index
	 *            the index of the item to drag.
	 * @return this fixture.
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	public ListFixture drag(int index) {
		return executeFunctionReturnSelf("drag", index);
	}

	/**
	 * Simulates a user dropping an item to this fixture's
	 * <code>{@link JList}</code>.
	 * 
	 * @param index
	 *            the index of the item to drop.
	 * @return this fixture.
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	public ListFixture drop(int index) {
		return executeFunctionReturnSelf("drop", index);
	}

	/**
	 * Verifies that the {@code String} representation of the selected item in
	 * this fixture's <code>{@link JList}</code> matches the given text.
	 * 
	 * @param text
	 *            the text to match. It can be a regular expression pattern.
	 * @return this fixture.
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	public ListFixture requireSelection(String text) {
		return executeFunctionReturnSelf("requireSelection", text);
	}

	/**
	 * Verifies that the {@code String} representation of the selected item in
	 * this fixture's <code>{@link JList}</code> matches the given regular
	 * expression pattern.
	 * 
	 * @param pattern
	 *            the regular expression pattern to match.
	 * @return this fixture.
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	/*
	 * public JListFixture requireSelection(Pattern pattern) {
	 * driver.requireSelection(target, pattern); return this; }
	 */
	/**
	 * Verifies that the index of the selected item in this fixture's
	 * <code>{@link JList}</code> is equal to the given value.
	 * 
	 * @param index
	 *            the expected selection index.
	 * @return this fixture.
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	public ListFixture requireSelection(int index) {
		return executeFunctionReturnSelf("requireSelection", index);
	}

	/**
	 * Verifies that the {@code String} representations of the selected items in
	 * this fixture's <code>{@link JList}</code> match the given text items.
	 * 
	 * @param items
	 *            text items to match. Each {@code String} can be a regular
	 *            expression.
	 * @return this fixture.
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	public ListFixture requireSelectedItems(String... items) {
		return executeFunctionReturnSelf("requireSelectedItems", items);
	}

	/**
	 * Verifies that the given item indices are selected in this fixture's
	 * <code>{@link JList}</code>.
	 * 
	 * @param indices
	 *            the expected indices of the selected items.
	 * @return this fixture.
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	/*
	public ListFixture requireSelectedItems(int... indices) {
//		throw new IllegalArgumentException("Not supported, two requireSelectedItems([]) matched in server side");	
		 return executeFunctionReturnSelf("requireSelectedItems", indices);
	}
*/
	/**
	 * Verifies that this fixture's <code>{@link JList}</code> does not have any
	 * selection.
	 * 
	 * @return this fixture.
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	public ListFixture requireNoSelection() {
		return executeFunctionReturnSelf("requireNoSelection");
	}

	/**
	 * Verifies that this fixture's <code>{@link JList}</code> has the expected
	 * number of items
	 * 
	 * @param expected
	 *            the expected number of items.
	 * @return this fixture.
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	public ListFixture requireItemCount(int expected) {
		return executeFunctionReturnSelf("requireItemCount", expected);
	}

}
