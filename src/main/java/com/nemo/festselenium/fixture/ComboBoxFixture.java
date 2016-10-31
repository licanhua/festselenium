package com.nemo.festselenium.fixture;

import static com.nemo.festselenium.utils.FunctionStringHelper.*;

/**
 * Control the JComboBoxFixture in selenium server side
 * 
 * @see org.fest.swing.fixture.JComboBoxFixture
 * 
 * @author CanHua Li
 * 
 */
public class ComboBoxFixture extends ComponentFixture<ComboBoxFixture> {
	public ComboBoxFixture(ComponentContext context) {
		super(context);
	}

	/**
	 * Simulates a user entering the specified text in the
	 * <code>{@link JComboBox}</code>, replacing any text. This action is
	 * executed only if the <code>{@link JComboBox}</code> is editable.
	 * 
	 * @param text
	 *            the text to enter.
	 * @return this fixture.
	 * @see org.fest.swing.fixture.JComboBoxFixture#replaceText(String text)
	 * 
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	public ComboBoxFixture replaceText(String text) {
		return executeFunctionReturnSelf("replaceText", text);
	}

	/**
	 * Simulates a user selecting the text in the <code>{@link JComboBox}</code>
	 * . This action is executed only if the <code>{@link JComboBox}</code> is
	 * editable.
	 * 
	 * @return this fixture.
	 * @see org.fest.swing.fixture.JComboBoxFixture#selectAllText()
	 * 
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	public ComboBoxFixture selectAllText() {
		return executeFunctionReturnSelf("selectAllText");
	}

	/**
	 * Simulates a user entering the specified text in this fixture's
	 * <code>{@link JComboBox}</code>. This action is executed only if the
	 * <code>{@link JComboBox}</code> is editable.
	 * 
	 * @param text
	 *            the text to enter.
	 * @return this fixture.
	 * @see org.fest.swing.fixture.JComboBoxFixture#enterText(String text)
	 * 
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	public ComboBoxFixture enterText(String text) {
		return executeFunctionReturnSelf("enterText", text);
	}

	/**
	 * Clears the selection in this fixture's <code>{@link JComboBox}</code>.
	 * Since this method does not simulate user input, it does not verifies that
	 * this fixture's {@code JComboBox} is enabled and showing.
	 * 
	 * @return this fixture.
	 * @see org.fest.swing.fixture.JComboBoxFixture#clearSelection()
	 * 
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	public ComboBoxFixture clearSelection() {
		return executeFunctionReturnSelf("clearSelection");
	}

	/**
	 * Simulates a user selecting an item in this fixture's
	 * <code>{@link JComboBox}</code>.
	 * 
	 * @param index
	 *            the index of the item to select.
	 * @return this fixture.
	 * @see org.fest.swing.fixture.JComboBoxFixture#selectItem(int index)
	 * 
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	public ComboBoxFixture selectItem(int index) {
		return executeFunctionReturnSelf("selectItem", index);
	}

	/**
	 * Simulates a user selecting an item in this fixture's
	 * <code>{@link JComboBox}</code>. The text of the item to select must match
	 * the given {@code String}. Such text is retrieved by this fixture's
	 * <code>{@link JComboBoxCellReader}</code>.
	 * 
	 * @param text
	 *            the text of the item to select. It can be a regular
	 *            expression.
	 * @return this fixture.
	 * @see org.fest.swing.fixture.JComboBoxFixture#selectItem(String text)
	 * 
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	public ComboBoxFixture selectItem(String text) {
		return executeFunctionReturnSelf("selectItem", text);
	}

	/**
	 * Returns the {@code String} representation of the value of an item in this
	 * fixture's <code>{@link JComboBox}</code>, using this fixture's
	 * <code>{@link JComboBoxCellReader}</code>.
	 * 
	 * @param index
	 *            the index of the item to return.
	 * @return the {@code String} representation of the value of an item in this
	 *         fixture's {@code JComboBox}.
	 * @see org.fest.swing.fixture.JComboBoxFixture#valueAt(int index)
	 * 
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	public String valueAt(int index) {
		String functionString = createFunctionString("valueAt", index);
		return executeFunctionString(functionString);
	}

	/**
	 * Asserts that this fixture's <code>{@link JComboBox}</code> is editable.
	 * 
	 * @throws AssertionError
	 *             if this fixture's {@code JComboBox} is not editable.
	 * @return this fixture.
	 * @see org.fest.swing.fixture.JComboBoxFixture#requireEditable()
	 * 
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	public ComboBoxFixture requireEditable() {
		return executeFunctionReturnSelf("requireEditable");
	}

	/**
	 * Asserts that this fixture's <code>{@link JComboBox}</code> is not
	 * editable.
	 * 
	 * @throws AssertionError
	 *             if this fixture's {@code JComboBox} is editable.
	 * @return this fixture.
	 * @see org.fest.swing.fixture.JComboBoxFixture#requireNotEditable()
	 * 
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	public ComboBoxFixture requireNotEditable() {
		return executeFunctionReturnSelf("requireNotEditable");
	}

	/**
	 * Verifies that the {@code String} representation of the selected item in
	 * this fixture's <code>{@link JComboBox}</code> matches the given text.
	 * 
	 * @param value
	 *            the text to match. It can be a regular expression.
	 * @return this fixture.
	 * @see org.fest.swing.fixture.JComboBoxFixture#requireSelection(String
	 *      value)
	 * 
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	public ComboBoxFixture requireSelection(String value) {
		return executeFunctionReturnSelf("requireSelection", value);
	}

	/**
	 * Verifies that this fixture's <code>{@link JComboBox}</code> has the
	 * expected number of items
	 * 
	 * @param expected
	 *            the expected number of items.
	 * @return this fixture.
	 * @see org.fest.swing.fixture.JComboBoxFixture#requireItemCount(int
	 *      expected)
	 * 
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	public ComboBoxFixture requireItemCount(int expected) {
		return executeFunctionReturnSelf("requireItemCount", expected);
	}

	/**
	 * Verifies that the index of the selected item in this fixture's
	 * <code>{@link JComboBox}</code> is equal to the given value.
	 * 
	 * @param index
	 *            the expected selection index.
	 * @return this fixture.
	 * @see org.fest.swing.fixture.JComboBoxFixture#requireSelection(int index)
	 * 
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	public ComboBoxFixture requireSelection(int index) {
		return executeFunctionReturnSelf("requireSelection", index);
	}

	/**
	 * Verifies that this fixture's <code>{@link JComboBox}</code> does not have
	 * any selection.
	 * 
	 * @return this fixture.
	 * @see org.fest.swing.fixture.JComboBoxFixture#requireNoSelection()
	 * 
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	public ComboBoxFixture requireNoSelection() {
		return executeFunctionReturnSelf("requireNoSelection");
	}



	/**
	 * Returns the selected value of this fixture's
	 * <code>{@link JComboBox}</code> as plain text. This method returns
	 * {@code null} if the {code JComboBox} does not have any selection.
	 * 
	 * @return the selected value of this fixture's {code JComboBox} as plain
	 *         text, or {@code null} if the {code JComboBox} does not have any
	 *         selection.
	 * @see org.fest.swing.fixture.JComboBoxFixture#selectedItem()
	 * 
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	public String selectedItem() {
		String functionString = createFunctionString("selectedItem");
		return executeFunctionString(functionString);

	}

	public int getSelectedIndex() {
		String functionString = createFunctionString("target.getSelectedIndex");
		return Integer.parseInt(executeFunctionString(functionString));
	}

	public int getItemCount() {
		String functionString = createFunctionString("target.getItemCount");
		return Integer.parseInt(executeFunctionString(functionString));
	}
	
	public String getSelectedItem() {
		String functionString = createFunctionString("target.getSelectedItem");
		return executeFunctionString(functionString);
	}
	
	private String executeFunctionStringReturnArrays (String functionString) {
		String functionQueryString = getComponentContext()
				.createQueryStringComponentAsPrefix(functionString);
		String script = String.format(ARRAY_TO_STRING_FUNC+"var tmpObj=%s;arrayToString(tmpObj);", functionQueryString);
		return eval(script);
	}
	public String getSelectedObjects() {
		return executeFunctionStringReturnArrays("target.getSelectedObjects");
	}
}
