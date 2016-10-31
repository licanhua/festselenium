package com.nemo.festselenium.fixture;

import java.awt.Point;

/**
 * Control the JToolBarFixture in selenium server side
 * 
 * @see org.fest.swing.fixture.JToolBarFixture
 * 
 * @author CanHua Li
 * 
 */
public class ToolBarFixture extends ComponentFixture<ToolBarFixture> {

	public ToolBarFixture(ComponentContext context) {
		super(context);
	}

	 /**
	   * Simulates a user dragging this fixture's <code>{@link JToolBar}</code> to the given location, causing it to float.
	   * @param point the point where the <code>JToolBar</code> will be floating to.
	   * @return this fixture.
	   * @throws ActionFailedException if the <code>JToolBar</code> is not floatable.
	   * @throws ActionFailedException if the <code>JToolBar</code> cannot be dragged.
	   */
	  public ToolBarFixture floatTo(Point point) {

			String pointQueryString = createPointQueryString(point.x, point.y);

			String script = String.format(
					"var point=%s;  %s.floatTo(point)",
					pointQueryString, 
					getComponentContext().getComponentQueryString());
			eval(script);
	    return this;
	  }

	  /**
	   * Simulates a user unfloating this fixture's <code>{@link JToolBar}</code>.
	   * @return this fixture.
	   * @throws ActionFailedException if the dock container cannot be found.
	   */
	  public ToolBarFixture unfloat() {
		  return executeFunctionReturnSelf("unfloat");
	  }

}
