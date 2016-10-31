package com.nemo.festselenium.fixture;

public interface StateVerificationFixture {

	/**
	 * Origine from StateVerificationFixture in fest swing
	 * 
	 * Asserts that this fixture's GUI component is disabled.
	 * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	 */
	public abstract StateVerificationFixture requireDisabled();

	/**
	 *  Origine from StateVerificationFixture in fest swing
	 *  
	 * Asserts that this fixture's GUI component is enabled.
	 * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	 */
	public abstract StateVerificationFixture requireEnabled();

	/**
	 *  Origine from StateVerificationFixture in fest swing
	 *  
	 * Asserts that this fixture's GUI component is not visible.
	 * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	 */
	public abstract StateVerificationFixture requireNotVisible();

	/**
	 *  Origine from StateVerificationFixture in fest swing
	 *  
	 * Asserts that this fixture's GUI component is visible.
	 * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	 */
	public abstract StateVerificationFixture requireVisible();

}