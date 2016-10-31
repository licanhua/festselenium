package com.nemo.festselenium.fixture;

import java.awt.Point;

import com.nemo.festselenium.core.MouseButton;
/**
 * 
* @author CanHua Li
* @see org.fest.swing.fixture#MouseInputSimulationFixture
*/
public interface MouseInputSimulationFixture {

	/**
	 * Origine from MouseInputSimulationFixture in fest swing
	 * 
	 * Simulates a user clicking this fixture's GUI component.
	 * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	 */
	public abstract MouseInputSimulationFixture click();

	/**
	 * Origine from MouseInputSimulationFixture in fest swing
	 * 
	 * Simulates a user clicking this fixture's GUI component.
	 * @param button the button to click.
	 * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	 */
	public abstract MouseInputSimulationFixture click(MouseButton button);

	/**
	 * Origine from MouseInputSimulationFixture in fest swing
	 * 
	 * Simulates a user double-clicking this fixture's GUI component.
	 * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	 */
	public abstract MouseInputSimulationFixture doubleClick();

	/**
	 * Origine from MouseInputSimulationFixture in fest swing
	 * 
	 * Simulates a user right-clicking this fixture's GUI component.
	 * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	 */
	public abstract MouseInputSimulationFixture rightClick();

	public abstract MouseInputSimulationFixture clickAt(Point p);

	public abstract MouseInputSimulationFixture clickAt(int x, int y);

}