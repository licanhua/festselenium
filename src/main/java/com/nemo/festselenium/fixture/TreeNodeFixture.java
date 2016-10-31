package com.nemo.festselenium.fixture;

public interface TreeNodeFixture  {
	 /**
	   * Simulates a user expanding this fixture's tree node.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  TreeNodeFixture expand();

	  /**
	   * Simulates a user collapsing this fixture's tree node.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  TreeNodeFixture collapse();
}
