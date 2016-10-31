package com.nemo.festselenium.fixture;

import static com.nemo.festselenium.utils.FunctionStringHelper.createFunctionString;

/**
 * Control the JOptionPaneFixture in selenium server side
 * 
 * @see org.fest.swing.fixture.JOptionPaneFixture
 * 
 * @author CanHua Li
 * 
 */
public class OptionPaneFixture extends ComponentFixture<OptionPaneFixture> {
	public OptionPaneFixture(ComponentContext context) {
		super(context);
	}

	/**
	   * Returns the title of this fixture's <code>{@link JOptionPane}</code>.
	   * @return the title of this fixture's {@code JOptionPane}.
	   * @throws SeleniumException  If selenium communication failed
	   * @throws SeleniumException If fest side throw exception
	   */
	  public String title() {
			String functionString = createFunctionString("title");
			return executeFunctionString(functionString);
	  }

	  /**
	   * Returns a fixture wrapping the "OK" button in this fixture's <code>{@link JOptionPane}</code>. This method is
	   * locale-independent and platform-independent.
	   * @return a fixture wrapping the "OK" button.
	   */
	  public ButtonFixture okButton() {
	    return new ButtonFixture(getComponentContext().
	    		createSubComponentContext("okButton"));
	  }

	  /**
	   * Returns a fixture wrapping the "Cancel" button in this fixture's <code>{@link JOptionPane}</code>. This method is
	   * locale-independent and platform-independent.
	   * @return a fixture wrapping the "Cancel" button.
	   */
	  public ButtonFixture cancelButton() {
		    return new ButtonFixture(getComponentContext().
		    		createSubComponentContext("cancelButton"));
	  }

	  /**
	   * Returns a fixture wrapping the "Yes" button in this fixture's <code>{@link JOptionPane}</code>. This method is
	   * locale-independent and platform-independent.
	   * @return a fixture wrapping the "Yes" button.
	   */
	  public ButtonFixture yesButton() {
		    return new ButtonFixture(getComponentContext().
		    		createSubComponentContext("yesButton"));
	  }

	  /**
	   * Returns a fixture wrapping the "No" button in this fixture's <code>{@link JOptionPane}</code>. This method is
	   * locale-independent and platform-independent.
	   * @return a fixture wrapping the "No" button.
	   */
	  public ButtonFixture noButton() {
		    return new ButtonFixture(getComponentContext().
		    		createSubComponentContext("noButton"));
	  }

	  /**
	   * Finds and returns a fixture wrapping a button (this fixture's <code>{@link JOptionPane}</code>) matching the
	   * given text.
	   * @param text the text of the button to find. It can be a regular expression.
	   * @return a fixture wrapping a button matching the given text.
	   */
	  public ButtonFixture buttonWithText(String text) {
		    return new ButtonFixture(getComponentContext().
		    		createSubComponentContext("buttonWithText", text));
	  }


	  /**
	   * Asserts that this fixture's <code>{@link JOptionPane}</code> is displaying an error message.
	   * @return this fixture.
	   * @throws SeleniumException  If selenium communication failed
	   * @throws SeleniumException If fest side throw exception	   * 
	   */
	  public OptionPaneFixture requireErrorMessage() {
			return executeFunctionReturnSelf("requireErrorMessage");
	  }

	  /**
	   * Asserts that this fixture's <code>{@link JOptionPane}</code> is displaying an information
	   * message.
	   * @return this fixture.
	   * @throws SeleniumException  If selenium communication failed
	   * @throws SeleniumException If fest side throw exception	   * 
	   */
	  public OptionPaneFixture requireInformationMessage() {
			return executeFunctionReturnSelf("requireInformationMessage");
	  }

	  /**
	   * Asserts that this fixture's <code>{@link JOptionPane}</code> is displaying a warning message.
	   * @return this fixture.
	   * @throws SeleniumException  If selenium communication failed
	   * @throws SeleniumException If fest side throw exception	   * 
	   */
	  public OptionPaneFixture requireWarningMessage() {
			return executeFunctionReturnSelf("requireWarningMessage");
	  }

	  /**
	   * Asserts that this fixture's <code>{@link JOptionPane}</code> is displaying a question.
	   * @return this fixture.
	   * @throws SeleniumException  If selenium communication failed
	   * @throws SeleniumException If fest side throw exception	   * 
	   */
	  public OptionPaneFixture requireQuestionMessage() {
			return executeFunctionReturnSelf("requireQuestionMessage");
	  }

	  /**
	   * Asserts that this fixture's <code>{@link JOptionPane}</code> is displaying a plain message.
	   * @return this fixture.
	   * @throws SeleniumException  If selenium communication failed
	   * @throws SeleniumException If fest side throw exception	   * 
	   */
	  public OptionPaneFixture requirePlainMessage() {
			return executeFunctionReturnSelf("requirePlainMessage");
	  }

	  /**
	   * Asserts that the title of this fixture's <code>{@link JOptionPane}</code> matches the given value.
	   * @param title the title to match. It can be a regular expression.
	   * @return this fixture.
	   * @throws SeleniumException  If selenium communication failed
	   * @throws SeleniumException If fest side throw exception
	   */
	  public OptionPaneFixture requireTitle(String title) {
			return executeFunctionReturnSelf("requireTitle", title);
	  }
	
}
