package com.nemo.festselenium.fixture;

import static com.nemo.festselenium.utils.FunctionStringHelper.createFunctionString;

/**
 * Control the JButtonFixture in selenium server side
 * 
 * @see org.fest.swing.fixture.JButtonFixture
 * 
 * @author CanHua Li
 * 
 */
public class ButtonFixture extends ComponentFixture<ButtonFixture> implements TextDisplayFixture {

	public ButtonFixture(ComponentContext context) {
		super(context);
	}

	/* (non-Javadoc)
	 * @see com.nemo.seleniumfest.fixture.TextDisplayFixture#text()
	 */
	@Override
	public String text() {
		String functionString = createFunctionString("text");
		return executeFunctionString(functionString);
	}

	/* (non-Javadoc)
	 * @see com.nemo.seleniumfest.fixture.TextDisplayFixture#requireText(java.lang.String)
	 */
	@Override
	public ButtonFixture requireText(String expected) {
		return executeFunctionReturnSelf("requireText", expected);
	}

}
