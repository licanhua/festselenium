package com.nemo.festselenium.fixture;

import static com.nemo.festselenium.utils.FunctionStringHelper.createFunctionString;

/**
 * Control the JLabelFixture in selenium server side
 * 
 * @see org.fest.swing.fixture.JLabelFixture
 * 
 * @author CanHua Li
 * 
 */
public class LabelFixture extends ComponentFixture<LabelFixture> implements TextDisplayFixture {
	public LabelFixture(ComponentContext context) {
		super(context);
	}

	/**
	 * Returns the text of this fixture's <code>{@link JLabel}</code>.
	 * 
	 * @return the text of this fixture's <code>JLabel</code>.
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	@Override
	public String text() {
		String functionString = createFunctionString("text");
		return executeFunctionString(functionString);
	}

	/**
	 * Asserts that the text of this fixture's <code>{@link JLabel}</code> is
	 * equal to the specified {@code String}.
	 * 
	 * @param expected
	 *            the text to match.
	 * @return this fixture.
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	@Override	
	public LabelFixture requireText(String expected) {
		return executeFunctionReturnSelf("requireText", expected);
	}

}
