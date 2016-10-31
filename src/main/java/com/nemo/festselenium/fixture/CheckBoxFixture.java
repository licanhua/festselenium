package com.nemo.festselenium.fixture;

import static com.nemo.festselenium.utils.FunctionStringHelper.createFunctionString;

/**
 * Control the JCheckBoxFixture in selenium server side
 * 
 * @see org.fest.swing.fixture.JCheckBoxFixture
 * 
 * @author CanHua Li
 * 
 */
public class CheckBoxFixture extends ComponentFixture<CheckBoxFixture> implements TextDisplayFixture {

	public CheckBoxFixture(ComponentContext context) {
		super(context);
	}

	/**
	 * Returns the text of this fixture's <code>{@link JCheckBox}</code>.
	 * 
	 * @return the text of this fixture's <code>JCheckBox</code>.
	 * @see org.fest.swing.fixture.JCheckBoxFixture#text()
	 * 
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	@Override
	public String text() {
		String functionString = createFunctionString("text");
		return executeFunctionString(functionString);
	}

	/**
	 * Checks (or selects) this fixture's <code>{@link JCheckBox}</code> only it
	 * is not already checked.
	 * 
	 * @return this fixture.
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	public CheckBoxFixture check() {
		return executeFunctionReturnSelf("check");
	}

	/**
	 * Unchecks this fixture's <code>{@link JCheckBox}</code> only if it is
	 * checked.
	 * 
	 * @return this fixture.
	 * @see org.fest.swing.fixture.JCheckBoxFixture#uncheck()
	 * 
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	public CheckBoxFixture uncheck() {
		return executeFunctionReturnSelf("uncheck");
	}

	/**
	 * Asserts that the text of this fixture's <code>{@link JCheckBox}</code> is
	 * equal to or matches the specified {@code String}.
	 * 
	 * @param expected
	 *            the text to match. It can be a regular expression.
	 * @return this fixture.
	 * 
	 * @see org.fest.swing.fixture.JCheckBoxFixture#requireText(String expected)
	 * 
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	@Override
	public CheckBoxFixture requireText(String expected) {
		return executeFunctionReturnSelf("requireText", expected);
	}

	/**
	 * Verifies that this fixture's <code>{@link JCheckBox}</code> is selected.
	 * 
	 * @return this fixture.
	 * @see org.fest.swing.fixture.JCheckBoxFixture#requireSelected()
	 * 
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */

	public CheckBoxFixture requireSelected() {
		return executeFunctionReturnSelf("requireSelected");
	}

	/**
	 * Verifies that this fixture's <code>{@link JCheckBox}</code> is not
	 * selected.
	 * 
	 * @return this fixture.
	 * @see org.fest.swing.fixture.JCheckBoxFixture#requireNotSelected()
	 * 
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	public CheckBoxFixture requireNotSelected() {
		return executeFunctionReturnSelf("requireNotSelected");
	}
}
