package com.nemo.festselenium.fixture;

import static com.nemo.festselenium.utils.FunctionStringHelper.createFunctionString;

/**
 * Control the JSpinnerFixture in selenium server side
 * 
 * @see org.fest.swing.fixture.JSpinnerFixture
 * 
 * @author CanHua Li
 * 
 */
public class SpinnerFixture extends ComponentFixture<SpinnerFixture> {
	public SpinnerFixture(ComponentContext context) {
		super(context);
	}

	 /**
	   * Simulates a user incrementing the value of this fixture's <code>{@link JSpinner}</code> the given number of times.
	   * @param times how many times the value of this fixture's <code>JSpinner</code> should be incremented.
	   * @return this fixture.
	   * @throws SeleniumException  If selenium communication failed
	   * @throws SeleniumException If fest side throw exception	
	   */
	  public SpinnerFixture increment(int times) {
			return executeFunctionReturnSelf("increment", times);
	  }

	  /**
	   * Simulates a user incrementing the value of this fixture's <code>{@link JSpinner}</code> one time.
	   * @return this fixture.
	   * @throws SeleniumException  If selenium communication failed
	   * @throws SeleniumException If fest side throw exception	
	   */
	  public SpinnerFixture increment() {
			return executeFunctionReturnSelf("increment");
	  }

	  /**
	   * Simulates a user decrementing the value of this fixture's <code>{@link JSpinner}</code> the given number of times.
	   * @param times how many times the value of this fixture's <code>JSpinner</code> should be decremented.
	   * @return this fixture.
	   * @throws SeleniumException  If selenium communication failed
	   * @throws SeleniumException If fest side throw exception	
	   */
	  public SpinnerFixture decrement(int times) {
			return executeFunctionReturnSelf("decrement", times);
	  }

	  /**
	   * Simulates a user decrementing the value of this fixture's <code>{@link JSpinner}</code> one time.
	   * @return this fixture.
	   * @throws SeleniumException  If selenium communication failed
	   * @throws SeleniumException If fest side throw exception	
	   */
	  public SpinnerFixture decrement() {
			return executeFunctionReturnSelf("decrement");
	  }

	  /**
	   * Simulates a user entering the given text in this fixture's <code>{@link JSpinner}</code> (assuming its editor has a
	   * <code>{@link JTextComponent}</code> under it.) This method does not commit the value to the <code>JSpinner</code>.
	   * @param text the text to enter.
	   * @return this fixture.
	   * @throws SeleniumException  If selenium communication failed
	   * @throws SeleniumException If fest side throw exception	
	   */
	  public SpinnerFixture enterText(String text) {
			return executeFunctionReturnSelf("enterText", text);
	  }

	  /**
	   * Simulates a user entering and committing the given text in this fixture's <code>{@link JSpinner}</code> (assuming
	   * its editor has a <code>{@link JTextComponent}</code> under it.)
	   * @param text the text to enter.
	   * @return this fixture.
	   * @throws SeleniumException  If selenium communication failed
	   * @throws SeleniumException If fest side throw exception	
	   */
	  public SpinnerFixture enterTextAndCommit(String text) {
		  return executeFunctionReturnSelf("enterTextAndCommit", text);
	  }

	

	  /**
	   * Returns the text displayed by this fixture's <code>{@link JSpinner}</code>. This method first tries to get the text
	   * displayed in the <code>JSpinner</code>'s editor, assuming it is a <code>{@link JTextComponent}</code>. If the
	   * text from the editor cannot be retrieved, it will return the {@code String} representation of the value
	   * in the <code>JSpinner</code>'s model.
	   * @return the text displayed by this fixture's <code>JSpinner</code>.
	   */
	  public String text() {
			String functionString = createFunctionString("text");
			return executeFunctionString(functionString);
	  }



}
