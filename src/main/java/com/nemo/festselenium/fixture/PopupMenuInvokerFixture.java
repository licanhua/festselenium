package com.nemo.festselenium.fixture;

import java.awt.Point;

public interface PopupMenuInvokerFixture {

	/**
	 * Shows a pop-up menu using this fixture's <code>{@link JButton}</code> as
	 * the invoker of the pop-up menu.
	 * 
	 * @return a fixture that manages the displayed pop-up menu.
	 * @throws SeleniumException
	 *             If selenium communication failed
	 * @throws SeleniumException
	 *             If fest side throw exception
	 */
	public abstract PopupMenuFixture showPopupMenu();

	/**
	 * Shows a pop-up menu at the given point using this fixture's
	 * <code>{@link JButton}</code> as the invoker of the pop-up menu.
	 * 
	 * @param p
	 *            the given point where to show the pop-up menu.
	 * @return a fixture that manages the displayed pop-up menu.
	 * @throws SeleniumException
	 *             If selenium communication failed
	 * @throws SeleniumException
	 *             If fest side throw exception
	 * */
	public abstract PopupMenuFixture showPopupMenuAt(Point p);

}