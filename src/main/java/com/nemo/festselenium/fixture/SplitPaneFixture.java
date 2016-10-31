package com.nemo.festselenium.fixture;

/**
 * Control the JSplitPaneFixture in selenium server side
 * 
 * @see org.fest.swing.fixture.JSplitPaneFixture
 * 
 * @author CanHua Li
 * 
 */
public class SplitPaneFixture extends ComponentFixture<SplitPaneFixture> {

	public SplitPaneFixture(ComponentContext context) {
		super(context);
	}

	/**
	   * Simulates a user moving the divider of this fixture's <code>{@link JSplitPane}</code>.
	   * <p>
	   * Since 1.2, this method respects the minimum and maximum values of the left and right components inside this
	   * fixture's {@code JSplitPane}.
	   * </p>
	   * @param location the location to move the divider to.
	   * @return this fixture.
	   * @throws SeleniumException  If selenium communication failed
	   * @throws SeleniumException If fest side throw exception	
	   */
	  public SplitPaneFixture moveDividerTo(int location) {
			return executeFunctionReturnSelf("moveDividerTo", location);
	  }

	
}
