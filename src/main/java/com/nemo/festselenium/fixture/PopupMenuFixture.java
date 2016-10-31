package com.nemo.festselenium.fixture;

import static com.nemo.festselenium.utils.FunctionStringHelper.*;

/**
 * Control the JPopupMenuFixture in selenium server side
 * 
 * @see org.fest.swing.fixture.JPopupMenuFixture
 * 
 * @author CanHua Li
 * 
 */
public class PopupMenuFixture extends ComponentFixture<PopupMenuFixture> {
	 public PopupMenuFixture(ComponentContext popupContext) {
		super(popupContext);
	}

	/**
	   * Finds a <code>{@link JMenuItem}</code>, contained in this fixture's <code>{@link JPopupMenu}</code>,
	   * which name matches the specified one.
	   * @param name the name to match.
	   * @return a fixture that manages the <code>JMenuItem</code> found.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public MenuItemFixture menuItem(String name) {
		  String functionString = createFunctionString("menuItem", name);
		  ComponentContext c = this.getComponentContext().createContextByFunctionString(functionString);		  
	    return new MenuItemFixture(c);
	  }

	  /**
	   * Finds a <code>{@link JMenuItem}</code> in this fixture's <code>{@link JPopupMenu}</code>, which path matches
	   * the given one.
	   * <p>
	   * For example, if we are looking for the menu with text "New" contained under the menu with text "File", we can
	   * simply call
	   *
	   * <pre>
	   * JPopupMenuFixture popupMenu = tree.showPopupMenu();
	   * JMenuItemFixture menuItem = popupMenu.<strong>menuItemWithPath(&quot;File&quot;, &quot;Menu&quot;)</strong>;
	   * </pre>
	   *
	   * </p>
	   * @param path the path of the menu to find.
	   * @return a fixture that manages the <code>JMenuItem</code> found.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public MenuItemFixture menuItemWithPath(String... path) {
		  String functionString = createFunctionString("menuItemWithPath", path);
		  ComponentContext c = this.getComponentContext().createContextByFunctionString(functionString);		  
	    return new MenuItemFixture(c);
	  }

}
