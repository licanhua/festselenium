package com.nemo.festselenium.fixture;

public interface ToolTipDisplayFixture {

	/**
	 * Asserts that the toolTip in this fixture's <code>{@link JComboBox}</code>
	 * matches the given value.
	 * 
	 * @param expected
	 *            the given value. It can be a regular expression.
	 * @return this fixture.
	 * @see org.fest.swing.fixture.ToolTipDisplayFixture#requireToolTip(String
	 *      expected)
	 * 
	 * @throws SeleniumException
	 *             If selenium communication failed
	 * @throws SeleniumException
	 *             If fest side throw exception
	 */
	public abstract ToolTipDisplayFixture requireToolTip(String expected);

}