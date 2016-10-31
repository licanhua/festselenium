package com.nemo.festselenium.fixture;

import static com.nemo.festselenium.utils.FunctionStringHelper.createFunctionString;

/**
 * Control the JRadioButtonFixture in selenium server side
 * 
 * @see org.fest.swing.fixture.JRadioButtonFixture
 * 
 * @author CanHua Li
 * 
 */

public class RadioButtonFixture extends ComponentFixture<RadioButtonFixture> {

	public RadioButtonFixture(ComponentContext context) {
		super(context);
	}

	/**
	   * Returns the text of this fixture's <code>{@link JRadioButton}</code>.
	   * @return the text of this fixture's <code>JRadioButton</code>.
	   */
	  public String text() {
			String functionString = createFunctionString("text");
			return executeFunctionString(functionString);
	  }

	  /**
	   * Checks (or selects) this fixture's <code>{@link JRadioButton}</code> only it is not already checked.
	   * @return this fixture.
	   * @throws SeleniumException  If selenium communication failed
	   * @throws SeleniumException If fest side throw exception	
	   */
	  public RadioButtonFixture check() {
			return executeFunctionReturnSelf("check");
	  }

	  /**
	   * Unchecks this fixture's <code>{@link JRadioButton}</code> only if it is checked.
	   * @return this fixture.
	   * @throws SeleniumException  If selenium communication failed
	   * @throws SeleniumException If fest side throw exception	
	   */
	  public RadioButtonFixture uncheck() {
			return executeFunctionReturnSelf("uncheck");
	  }

	  /**
	   * Simulates a user clicking this fixture's <code>{@link JRadioButton}</code>.
	   * @return this fixture.
	   * @throws SeleniumException  If selenium communication failed
	   * @throws SeleniumException If fest side throw exception	
	   */
	  /**
	   * Verifies that this fixture's <code>{@link JRadioButton}</code> is selected.
	   * @return this fixture.
	   * @throws SeleniumException  If selenium communication failed
	   * @throws SeleniumException If fest side throw exception	
	   */
	  public RadioButtonFixture requireSelected() {
			return executeFunctionReturnSelf("requireSelected");
	  }

	  /**
	   * Verifies that this fixture's <code>{@link JRadioButton}</code> is not selected.
	   * @return this fixture.
	   * @throws SeleniumException  If selenium communication failed
	   * @throws SeleniumException If fest side throw exception	
	   */
	  public RadioButtonFixture requireNotSelected() {
			return executeFunctionReturnSelf("requireNotSelected");
	  }


	  /**
	   * Asserts that the text of this fixture's <code>{@link JRadioButton}</code> matches the specified value.
	   * @param expected the text to match. It can be a regular expression.
	   * @return this fixture.
	   * @throws AssertionError if the text of the target JRadioButton does not match the given one.
	   */
	  public RadioButtonFixture requireText(String expected) {
			return executeFunctionReturnSelf("requireText", expected);
	  }

}
