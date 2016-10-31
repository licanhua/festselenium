package com.nemo.festselenium.fixture;

import static com.nemo.festselenium.utils.FunctionStringHelper.createFunctionString;

/**
 * Control the JToggleButtonFixture in selenium server side
 * 
 * @see org.fest.swing.fixture.JToggleButtonFixture
 * 
 * @author CanHua Li
 * 
 */
public class ToggleButtonFixture extends ComponentFixture<ToggleButtonFixture> {
	public ToggleButtonFixture(ComponentContext context) {
		super(context);
	}

	/**
	   * Returns the text of this fixture's <code>{@link JToggleButton}</code>.
	   * @return the text of this fixture's <code>JToggleButton</code>.
	   */
	  public String text() {
			String functionString = createFunctionString("text");
			return executeFunctionString(functionString);
	  }

	  /**
	   * Checks (or selects) this fixture's <code>{@link JToggleButton}</code> only it is not already checked.
	   * @return this fixture.
	   * @throws IllegalStateException if this fixture's <code>JToggleButton</code> is disabled.
	   * @throws IllegalStateException if this fixture's <code>JToggleButton</code> is not showing on the screen.
	   */
	  public ToggleButtonFixture check() {
		  return executeFunctionReturnSelf("check");
	  }

	  /**
	   * Unchecks this fixture's <code>{@link JToggleButton}</code> only if it is checked.
	   * @return this fixture.
	   * @throws IllegalStateException if this fixture's <code>JToggleButton</code> is disabled.
	   * @throws IllegalStateException if this fixture's <code>JToggleButton</code> is not showing on the screen.
	   */
	  public ToggleButtonFixture uncheck() {
		  return executeFunctionReturnSelf("uncheck");
	  }

	  /**
	   * Verifies that this fixture's <code>{@link JToggleButton}</code> is selected.
	   * @return this fixture.
	   * @throws AssertionError if this fixture's <code>JToggleButton</code> is not selected.
	   */
	  public ToggleButtonFixture requireSelected() {
		  return executeFunctionReturnSelf("requireSelected");
	  }

	  /**
	   * Verifies that this fixture's <code>{@link JToggleButton}</code> is not selected.
	   * @return this fixture.
	   * @throws AssertionError if this fixture's <code>JToggleButton</code> is selected.
	   */
	  public ToggleButtonFixture requireNotSelected() {
		  return executeFunctionReturnSelf("requireNotSelected");
	  }

	  /**
	   * Asserts that the text of this fixture's <code>{@link JToggleButton}</code> matches the specified value.
	   * @param expected the text to match. It can be a regular expression.
	   * @return this fixture.
	   * @throws AssertionError if the text of the target JToggleButton does not match the given one.
	   */
	  public ToggleButtonFixture requireText(String expected) {
		  return executeFunctionReturnSelf("requireText", expected);
	  }
	
}
