package com.nemo.festselenium.fixture;

import java.awt.Point;

/**
 * Control the JComboBoxFixture in selenium server side
 * 
 * @see org.fest.swing.fixture.DialogFixture
 * 
 * @author CanHua Li
 * 
 */
public class DialogFixture extends ContainerFixture<DialogFixture> {
	public DialogFixture(ComponentContext context) {
		super(context);
	}

	/**
	 * Simulates a user moving this fixture's <code>{@link Dialog}</code> to the
	 * given point.
	 * 
	 * @param p
	 *            the point to move this fixture's <code>Dialog</code> to.
	 * @return this fixture.
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	public DialogFixture moveTo(Point p) {
		String pointQueryString = createPointQueryString(p.x, p.y);
		String invokeString = this.getComponentContext()
				.createQueryStringComponentAsPrefix("moveTo(point)");

		String script = String.format("var point=%s; %s", pointQueryString,
				invokeString);
		eval(script);
		return this;
	}

	/**
	 * If fixture's <code>{@link Dialog}</code> is visible, brings it to the
	 * front and may make it the focused one.
	 * 
	 * @return this fixture.
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	public DialogFixture moveToFront() {
		return executeFunctionReturnSelf("moveToFront");
	}

	/**
	 * If the given <code>{@link Dialog}</code> is visible, sends it to the back
	 * and may cause it to lose focus or activation if it is the focused or
	 * active.
	 * 
	 * @return this fixture.
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	public DialogFixture moveToBack() {
		return executeFunctionReturnSelf("moveToBack");
	}

	/**
	 * Asserts that this fixture's <code>{@link Dialog}</code> is modal.
	 * 
	 * @return this fixture.
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	public DialogFixture requireModal() {
		return executeFunctionReturnSelf("requireModal");
	}

	/**
	 * Simulates a user resizing vertically this fixture's
	 * <code>{@link Dialog}</code>.
	 * 
	 * @param height
	 *            the height that this fixture's <code>Dialog</code> should have
	 *            after being resized.
	 * @return this fixture.
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	public DialogFixture resizeHeightTo(int height) {
		return executeFunctionReturnSelf("resizeHeightTo", height);
	}

	/**
	 * Simulates a user resizing horizontally this fixture's
	 * <code>{@link Dialog}</code>.
	 * 
	 * @param width
	 *            the width that this fixture's <code>Dialog</code> should have
	 *            after being resized.
	 * @return this fixture.
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	public DialogFixture resizeWidthTo(int width) {
		return executeFunctionReturnSelf("resizeWidthTo", width);
	}

	/**
	 * Shows this fixture's <code>{@link Dialog}</code>.
	 * 
	 * @return this fixture.
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	public DialogFixture show() {
		return executeFunctionReturnSelf("show");
	}

	/**
	 * Simulates a user closing this fixture's <code>{@link Dialog}</code>. * @throws
	 * SeleniumException If selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	public void close() {
		executeFunctionReturnSelf("close");
	}
}
