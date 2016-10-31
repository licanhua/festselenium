package com.nemo.festselenium.fixture;

/**
 * Control the JScrollBarFixture in selenium server side
 * 
 * @see org.fest.swing.fixture.JScrollBarFixture
 * 
 * @author CanHua Li
 * 
 */
public class ScrollBarFixture extends ComponentFixture<ScrollBarFixture> {

	public ScrollBarFixture(ComponentContext context) {
		super(context);
	}


	  /**
	   * Simulates a user scrolling down one block (usually a page.)
	   * @return this fixture.
	   * @throws SeleniumException  If selenium communication failed
	   * @throws SeleniumException If fest side throw exception	
	   */
	  public ScrollBarFixture scrollBlockDown() {
			return executeFunctionReturnSelf("scrollBlockDown");
	  }

	  /**
	   * Simulates a user scrolling down one block (usually a page,) the given number of times.
	   * @param times the number of times to scroll down one block.
	   * @return this fixture.
	   * @throws SeleniumException  If selenium communication failed
	   * @throws SeleniumException If fest side throw exception	
	   */
	  public ScrollBarFixture scrollBlockDown(int times) {
			return executeFunctionReturnSelf("scrollBlockDown", times);
	  }

	  /**
	   * Simulates a user scrolling up one block (usually a page.)
	   * @return this fixture.
	   * @throws SeleniumException  If selenium communication failed
	   * @throws SeleniumException If fest side throw exception	
	   */
	  public ScrollBarFixture scrollBlockUp() {
			return executeFunctionReturnSelf("scrollBlockUp");
	  }

	  /**
	   * Simulates a user scrolling up one block (usually a page,) the given number of times.
	   * @param times the number of times to scroll up one block.
	   * @return this fixture.
	   * @throws SeleniumException  If selenium communication failed
	   * @throws SeleniumException If fest side throw exception	
	   */
	  public ScrollBarFixture scrollBlockUp(int times) {
			return executeFunctionReturnSelf("scrollBlockUp", times);
	  }

	  /**
	   * Simulates a user scrolling to the given position.
	   * @param position the position to scroll to.
	   * @return this fixture.
	   * @throws SeleniumException  If selenium communication failed
	   * @throws SeleniumException If fest side throw exception	
	   */
	  public ScrollBarFixture scrollTo(int position) {
			return executeFunctionReturnSelf("scrollTo", position);
	  }

	  /**
	   * Simulates a user scrolling to the maximum position of this fixture's <code>{@link JScrollBar}</code>.
	   * @return this fixture.
	   * @throws SeleniumException  If selenium communication failed
	   * @throws SeleniumException If fest side throw exception	
	   */
	  public ScrollBarFixture scrollToMaximum() {
			return executeFunctionReturnSelf("scrollToMaximum");
	  }

	  /**
	   * Simulates a user scrolling to the minimum position of this fixture's <code>{@link JScrollBar}</code>.
	   * @return this fixture.
	   * @throws SeleniumException  If selenium communication failed
	   * @throws SeleniumException If fest side throw exception	
	   */
	  public ScrollBarFixture scrollToMinimum() {
			return executeFunctionReturnSelf("scrollToMinimum");
	  }

	  /**
	   * Simulates a user scrolling down one unit (usually a line.)
	   * @return this fixture.
	   * @throws SeleniumException  If selenium communication failed
	   * @throws SeleniumException If fest side throw exception	
	   */
	  public ScrollBarFixture scrollUnitDown() {
			return executeFunctionReturnSelf("scrollUnitDown");
	  }

	  /**
	   * Simulates a user scrolling down one unit (usually a line,) the given number of times.
	   * @param times the number of times to scroll down one unit.
	   * @return this fixture.
	   * @throws SeleniumException  If selenium communication failed
	   * @throws SeleniumException If fest side throw exception	
	   */
	  public ScrollBarFixture scrollUnitDown(int times) {
			return executeFunctionReturnSelf("scrollUnitDown", times);
	  }

	  /**
	   * Simulates a user scrolling up one unit (usually a line.)
	   * @return this fixture.
	   * @throws SeleniumException  If selenium communication failed
	   * @throws SeleniumException If fest side throw exception	
	   */
	  public ScrollBarFixture scrollUnitUp() {
			return executeFunctionReturnSelf("scrollUnitUp");
	  }

	  /**
	   * Simulates a user scrolling up one unit (usually a line,) the given number of times.
	   * @param times the number of times to scroll up one unit.
	   * @return this fixture.
	   * @throws SeleniumException  If selenium communication failed
	   * @throws SeleniumException If fest side throw exception	
	   */
	  public ScrollBarFixture scrollUnitUp(int times) {
			return executeFunctionReturnSelf("scrollUnitUp", times);
	  }	
}
