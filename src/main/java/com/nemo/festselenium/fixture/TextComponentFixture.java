package com.nemo.festselenium.fixture;

import static com.nemo.festselenium.utils.FunctionStringHelper.createFunctionString;

/**
 * Control the JTextComponentFixture in selenium server side
 * 
 * @see org.fest.swing.fixture.JTextComponentFixture
 * 
 * @author CanHua Li
 * 
 */
public class TextComponentFixture extends
		ContainerFixture<TextComponentFixture> {
	public TextComponentFixture(ComponentContext context) {
		super(context);
	}

	/**
	 * Returns the text of this fixture's <code>{@link JTextComponent}</code>.
	 * 
	 * @return the text of this fixture's <code>JTextComponent</code>.
	 */
	public String text() {
		String functionString = createFunctionString("text");
		return executeFunctionString(functionString);
	}

	/**
	 * Simulates a user selecting the given text contained in this fixture's
	 * <code>{@link JTextComponent}</code>.
	 * 
	 * @param text
	 *            the text to select.
	 * @return this fixture.
	 * @throws SeleniumException
	 *             If selenium communication failed
	 * @throws SeleniumException
	 *             If fest side throw exception
	 */
	public TextComponentFixture select(String text) {
		return executeFunctionReturnSelf("select", text);
	}

	/**
	 * Simulates a user selecting a portion of the text contained in this
	 * fixture's <code>{@link JTextComponent}</code>.
	 * 
	 * @param start
	 *            index where selection should start.
	 * @param end
	 *            index where selection should end.
	 * @return this fixture.
	 * @throws SeleniumException
	 *             If selenium communication failed
	 * @throws SeleniumException
	 *             If fest side throw exception
	 */
	public TextComponentFixture selectText(int start, int end) {
		return executeFunctionReturnSelf("selectText", start, end);
	}

	/**
	 * Simulates a user selecting all the text contained in this fixture's
	 * <code>{@link JTextComponent}</code>.
	 * 
	 * @return this fixture.
	 * @throws SeleniumException
	 *             If selenium communication failed
	 * @throws SeleniumException
	 *             If fest side throw exception
	 */
	public TextComponentFixture selectAll() {
		return executeFunctionReturnSelf("selectAll");
	}

	/**
	 * Simulates a user deleting all the text in this fixture's
	 * <code>{@link JTextComponent}</code>.
	 * 
	 * @return this fixture.
	 * @throws SeleniumException
	 *             If selenium communication failed
	 * @throws SeleniumException
	 *             If fest side throw exception
	 */
	public TextComponentFixture deleteText() {
		return executeFunctionReturnSelf("deleteText");
	}

	/**
	 * Simulates a user entering the given text in this fixture's
	 * <code>{@link JTextComponent}</code>.
	 * 
	 * @param text
	 *            the text to enter.
	 * @return this fixture.
	 * @throws SeleniumException
	 *             If selenium communication failed
	 * @throws SeleniumException
	 *             If fest side throw exception
	 */
	public TextComponentFixture enterText(String text) {
		return executeFunctionReturnSelf("enterText", text);
	}

	/**
	 * Sets the text in this fixture's <code>{@link JTextComponent}</code>.
	 * Unlike <code>{@link #enterText(String)}</code>, this method bypasses the
	 * event system and allows immediate updating on the underlying document
	 * model.
	 * <p>
	 * Primarily desired for speeding up tests when precise user event fidelity
	 * isn't necessary.
	 * </p>
	 * 
	 * @param text
	 *            the text to set.
	 * @return this fixture.
	 * @throws SeleniumException
	 *             If selenium communication failed
	 * @throws SeleniumException
	 *             If fest side throw exception
	 */
	public TextComponentFixture setText(String text) {
		return executeFunctionReturnSelf("setText", text);
	}

	/**
	 * Asserts that the text of this fixture's
	 * <code>{@link JTextComponent}</code> is equal to the specified value.
	 * 
	 * @param expected
	 *            the text to match. It can be a regular expression pattern.
	 * @return this fixture.
	 * @throws SeleniumException
	 *             If selenium communication failed
	 * @throws SeleniumException
	 *             If fest side throw exception
	 */
	public TextComponentFixture requireText(String expected) {
		return executeFunctionReturnSelf("requireText", expected);
	}

	/**
	 * Asserts that the target text component does not contain any text.
	 * 
	 * @return this fixture.
	 * @throws SeleniumException
	 *             If selenium communication failed
	 * @throws SeleniumException
	 *             If fest side throw exception
	 */
	public TextComponentFixture requireEmpty() {
		return executeFunctionReturnSelf("requireEmpty");
	}

	/**
	 * Asserts that this fixture's <code>{@link JTextComponent}</code> is
	 * editable.
	 * 
	 * @throws SeleniumException
	 *             If selenium communication failed
	 * @throws SeleniumException
	 *             If fest side throw exception
	 */
	public TextComponentFixture requireEditable() {
		return executeFunctionReturnSelf("requireEditable");
	}

	/**
	 * Asserts that this fixture's <code>{@link JTextComponent}</code> is not
	 * editable.
	 * 
	 * @throws SeleniumException
	 *             If selenium communication failed
	 * @throws SeleniumException
	 *             If fest side throw exception
	 * @return this fixture.
	 */
	public TextComponentFixture requireNotEditable() {
		return executeFunctionReturnSelf("requireNotEditable");
	}

}
