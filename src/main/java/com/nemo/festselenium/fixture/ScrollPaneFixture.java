package com.nemo.festselenium.fixture;

/**
 * Control the JScrollPaneFixture in selenium server side
 * 
 * @see org.fest.swing.fixture.JScrollPaneFixture
 * 
 * @author CanHua Li
 * 
 */
public class ScrollPaneFixture extends ComponentFixture<ScrollPaneFixture> {

	public ScrollPaneFixture(ComponentContext context) {
		super(context);
	}

	/**
	   * Returns a <code>{@link JScrollBarFixture}</code> managing the horizontal <code>{@link JScrollBar}</code> of this
	   * target's <code>{@link JScrollPane}</code>.
	   * @return a fixture managing the horizontal <code>JScrollBar</code> of this target's <code>JScrollPane</code>.
	   */
	  public ScrollBarFixture horizontalScrollBar() {
	    return new ScrollBarFixture(
	    		getComponentContext().createSubComponentContext("horizontalScrollBar"));
	  }

	  /**
	   * Returns a <code>{@link JScrollBarFixture}</code> managing the vertical <code>{@link JScrollBar}</code> of this
	   * target's <code>{@link JScrollPane}</code>.
	   * @return a fixture managing the vertical <code>JScrollBar</code> of this target's <code>JScrollPane</code>.
	   */
	  public ScrollBarFixture verticalScrollBar() {
		    return new ScrollBarFixture(
		    		getComponentContext().createSubComponentContext("verticalScrollBar"));
	  }

}
