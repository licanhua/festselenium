package com.nemo.festselenium.fixture;

/**
 * Control the JTableHeaderFixture in selenium server side
 * 
 * @see org.fest.swing.fixture.JTableHeaderFixture
 * 
 * @author CanHua Li
 * 
 */
public class TableHeaderFixture extends ComponentFixture<TableHeaderFixture> {

	public TableHeaderFixture(ComponentContext c) {
		super(c);
	}

	/**
	   * Simulates a user clicking the column under the given index, in this fixture's <code>{@link JTableHeader}</code>.
	   * @param index the index of the column to click.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TableHeaderFixture clickColumn(int index) {
		  return executeFunctionReturnSelf("clickColumn", index);
	  }



	  /**
	   * Simulates a user clicking the column which name matches the given value, in this fixture's
	   * <code>{@link JTableHeader}</code>.
	   * @param columnName the column name to match. It can be a regular expression.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TableHeaderFixture clickColumn(String columnName) {
		  return executeFunctionReturnSelf("clickColumn", columnName);
	  }


}
