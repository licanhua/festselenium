package com.nemo.festselenium.fixture;

/**
 * Control the JSliderFixture in selenium server side
 * 
 * @see org.fest.swing.fixture.JSliderFixture
 * 
 * @author CanHua Li
 * 
 */
public class SliderFixture extends ComponentFixture<SliderFixture> {

	public SliderFixture(ComponentContext context) {
		super(context);
	}

	 /**
	   * Simulates a user sliding this fixture's <code>{@link JSlider}</code> to the given value.
	   * @param value the value to slide the <code>JSlider</code> to.
	   * @return this fixture.
	   * @throws SeleniumException  If selenium communication failed
	   * @throws SeleniumException If fest side throw exception	
	   */
	  public SliderFixture slideTo(int value) {
			return executeFunctionReturnSelf("slideTo", value);
	  }

	  /**
	   * Simulates a user sliding this fixture's <code>{@link JSlider}</code> to its maximum value.
	   * @return this fixture.
	   * @throws SeleniumException  If selenium communication failed
	   * @throws SeleniumException If fest side throw exception	
	   */
	  public SliderFixture slideToMaximum() {
			return executeFunctionReturnSelf("slideToMaximum");
	  }

	  /**
	   * Simulates a user sliding this fixture's <code>{@link JSlider}</code> to its minimum value.
	   * @return this fixture.
	   * @throws SeleniumException  If selenium communication failed
	   * @throws SeleniumException If fest side throw exception	
	   */
	  public SliderFixture slideToMinimum() {
			return executeFunctionReturnSelf("slideToMinimum");
	  }	
}
