package com.nemo.festselenium.fixture;

public interface TextDisplayFixture {

	/**
	 * Returns the text of this fixture's JComponent.
	 * 
	 * @return the text of this fixture's <code>JComponent</code>.
	 * @see org.fest.swing.fixture.TextDisplayFixture#text()
	 * 
	 * @throws SeleniumException
	 *             If selenium communication failed
	 * @throws SeleniumException
	 *             If fest side throw exception
	 */
	public abstract String text();

	/**
	 * Asserts that the text of this fixture's <code>{@link JComponent}</code>
	 * matches the specified value.
	 * 
	 * @param expected
	 *            the text to match. It can be a regular expression.
	 * @return this fixture.
	 * @see org.fest.swing.fixture.TextDisplayFixture#requireText(String expected)
	 * 
	 * @throws SeleniumException
	 *             If selenium communication failed
	 * @throws SeleniumException
	 *             If fest side throw exception
	 */
	public abstract TextDisplayFixture requireText(String expected);

}