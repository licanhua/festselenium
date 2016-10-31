package com.nemo.festselenium.fixture;

import static com.nemo.festselenium.utils.FunctionStringHelper.createFunctionString;

/**
 * Control the JProgressBarFixture in selenium server side
 * 
 * @see org.fest.swing.fixture.JProgressBarFixture
 * 
 * @author CanHua Li
 * 
 */
public class ProgressBarFixture  extends ComponentFixture<ProgressBarFixture> {
	public ProgressBarFixture(ComponentContext context) {
		super(context);
	}


	  /**
	   * Asserts that the value of this fixture's <code>{@link JProgressBar}</code> is equal to the given one.
	   * @param value the expected value.
	   * @return this fixture.
	   * @throws SeleniumException  If selenium communication failed
	   * @throws SeleniumException If fest side throw exception
	   */
	  public ProgressBarFixture requireValue(int value) {
			return executeFunctionReturnSelf("requireValue", value);
	  }

	  /**
	   * Asserts that this fixture's <code>{@link JProgressBar}</code> is in determinate mode.
	   * @return this fixture.
	   * @throws SeleniumException  If selenium communication failed
	   * @throws SeleniumException If fest side throw exception
	   */
	  public ProgressBarFixture requireDeterminate() {
		  return executeFunctionReturnSelf("requireDeterminate");
	  }

	  /**
	   * Asserts that this fixture's <code>{@link JProgressBar}</code> is in indeterminate mode.
	   * @return this fixture.
	   * @throws SeleniumException  If selenium communication failed
	   * @throws SeleniumException If fest side throw exception
	   */
	  public ProgressBarFixture requireIndeterminate() {
		  return executeFunctionReturnSelf("requireIndeterminate");
	  }

	  /**
	   * Returns the text of this fixture's <code>{@link JProgressBar}</code>.
	   * @return the text of this fixture's <code>JProgressBar</code>.
	   */
	  public String text() {
			String functionString = createFunctionString("text");
			return executeFunctionString(functionString);
	  }

	  /**
	   * Asserts that the text of this fixture's <code>{@link JProgressBar}</code> is equal to the specified
	   * {@code String}.
	   * @param expected the text to match.
	   * @return this fixture.
	   * @throws SeleniumException  If selenium communication failed
	   * @throws SeleniumException If fest side throw exception
	   */
	  public ProgressBarFixture requireText(String expected) {
		  return executeFunctionReturnSelf("requireText", expected);
	  }

	
	
	  /**
	   * Waits until the value of this fixture's <code>{@link JProgressBar}</code> is equal to the given value.
	   * @param value the expected value.
	   * @return this fixture.
	   * @throws SeleniumException  If selenium communication failed
	   * @throws SeleniumException If fest side throw exception
	   */
	  public ProgressBarFixture waitUntilValueIs(int value) {
		  return executeFunctionReturnSelf("waitUntilValueIs", value);
	  }


	  /**
	   * Waits until the value of this fixture's <code>{@link JProgressBar}</code> is in determinate mode.
	   * @return this fixture.
	   * @throws SeleniumException  If selenium communication failed
	   * @throws SeleniumException If fest side throw exception
	   */
	  public ProgressBarFixture waitUntilIsDeterminate() {
		  return executeFunctionReturnSelf("waitUntilIsDeterminate");
	  }

}
