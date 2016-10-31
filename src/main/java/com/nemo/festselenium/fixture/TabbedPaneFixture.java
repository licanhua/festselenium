package com.nemo.festselenium.fixture;

/**
 * Control the JTabbedPaneFixture in selenium server side
 * 
 * @see org.fest.swing.fixture.JTabbedPaneFixture
 * 
 * @author CanHua Li
 * 
 */
public class TabbedPaneFixture extends ComponentFixture<TabbedPaneFixture> {
	public TabbedPaneFixture(ComponentContext context) {
		super(context);
	}


	  /**
	   * Returns the titles of all the tabs in this fixture's <code>{@link JTabbedPane}</code>.
	   * @return the titles of all the tabs.
	   */
	/*
	  public String[] tabTitles() {
	    return driver.tabTitles(target);
	  }
*/
	  /**
	   * Simulates a user selecting the tab located at the given index.
	   * @param index the index of the tab to select.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TabbedPaneFixture selectTab(int index) {
			return executeFunctionReturnSelf("selectTab", index);
	  }

	  /**
	   * Simulates a user selecting the tab whose title matches the given value.
	   * @param title the title to match. It can be a regular expression.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TabbedPaneFixture selectTab(String title) {
			return executeFunctionReturnSelf("selectTab", title);
	  }


	
	  /**
	   * Returns the currently selected component for this fixture's <code>{@link JTabbedPane}</code>.
	   * @return the currently selected component for this fixture's <code>JTabbedPane</code>.
	   */
	  /*
	  public Component selectedComponent() {
	    return driver.selectedComponentOf(target);
	  }
*/
	  /**
	   * Asserts that the title of the tab at the given index matches the given value.
	   * @param title the expected title. It can be a regular expression.
	   * @param index the index of the tab.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TabbedPaneFixture requireTitle(String title, int index) {
		 String createIndexString= this.getComponentContext().getAppletQueryString()+".Packages.org.fest.swing.data.Index.atIndex("+index+")";
		 String script = String.format("var index=%s;%s.requireTitle(\"%s\",index)", createIndexString,
				 this.getComponentContext().getComponentQueryString(), title);
		 eval(script);
	    return this;
	  }


	  /**
	   * Asserts that the tabs of this fixture's <code>{@link JTabbedPane}</code> have the given titles. The tab titles are
	   * evaluated by index order, for example, the first tab is expected to have the first title in the given array, and so
	   * on.
	   * @param titles the expected titles.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TabbedPaneFixture requireTabTitles(String... titles) {
			return executeFunctionReturnSelf("requireTabTitles", titles);
	  }

		
}
