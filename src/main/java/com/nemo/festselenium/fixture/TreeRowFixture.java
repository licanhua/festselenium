package com.nemo.festselenium.fixture;

import static com.nemo.festselenium.utils.FunctionStringHelper.createFunctionString;

/**
 * Control the JTreeRowFixture in selenium server side
 * 
 * @see org.fest.swing.fixture.JTreeRowFixture
 * 
 * @author CanHua Li
 * 
 */
public class TreeRowFixture extends ComponentFixture<TreeRowFixture> implements TreeNodeFixture {
	public TreeRowFixture(ComponentContext context) {
		super(context);
	}
	  /**
	   * Simulates a user expanding this fixture's tree node.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TreeRowFixture expand() {
		  return executeFunctionReturnSelf("expand");
	  }

	  /**
	   * Simulates a user collapsing this fixture's tree node.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TreeRowFixture collapse() {
		  return executeFunctionReturnSelf("collapse");
	  }

	  /**
	   * Selects the this fixture's tree node, expanding parent nodes if necessary. This method will not click the node if
	   * it is already selected.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TreeRowFixture select() {
		  return executeFunctionReturnSelf("select");
	  }

	
	  /**
	   * Simulates a user dragging this fixture's tree node.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TreeRowFixture drag() {
		  return executeFunctionReturnSelf("drag");
	  }

	  /**
	   * Simulates a user dropping relative to this fixture's tree node.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TreeRowFixture drop() {
		  return executeFunctionReturnSelf("drop");
	  }

	
	  /**
	   * Returns the {@code String} representation of this fixture's tree node.
	   * @return the {@code String} representation of this fixture's tree node.
	   */
	  public String value() {
			String functionString = createFunctionString("value");
			return executeFunctionString(functionString);
	  }

	  /**
	   * Returns the row index of the node.
	   * @return the row index of the node.
	   */
	  public int index() {
			String functionString = createFunctionString("index");
			return Integer.parseInt(executeFunctionString(functionString));
	  }
}
