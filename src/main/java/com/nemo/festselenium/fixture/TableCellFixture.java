package com.nemo.festselenium.fixture;

import static com.nemo.festselenium.utils.FunctionStringHelper.createFunctionString;

/**
 * Control the JTableCellFixture in selenium server side
 * 
 * @see org.fest.swing.fixture.JTableCellFixture
 * 
 * @author CanHua Li
 * 
 */
public class TableCellFixture extends ComponentFixture<TableCellFixture> {
	public TableCellFixture(ComponentContext context) {
		super(context);
	}


	 TableFixture table() { 
			return new TableFixture(this.getComponentContext().createSubComponentContext("table"));
	  }
/*	 
	  TableCell cell() { return cell; }
*/
	  /**
	   * Simulates a user selecting this fixture's table cell.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TableCellFixture select() {
		  return executeFunctionReturnSelf("select");
	  }

	
	  /**
	   * Starts editing this fixture's table cell. This method should be called <strong>before</strong> manipulating the
	   * <code>{@link Component}</code> returned by <code>{@link #editor()}</code>.
	   * <p>
	   * This method uses the <code>{@link JTableCellWriter}</code> from the <code>{@link JTableFixture}</code> that
	   * created this fixture.
	   * </p>
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   * @see #editor()
	   */
	  public TableCellFixture startEditing() {
		  return executeFunctionReturnSelf("startEditing");
	  }

	  /**
	   * Stops editing this fixture's table cell. This method should be called <strong>after</strong> manipulating the
	   * <code>{@link Component}</code> returned by <code>{@link #editor()}</code>.
	   * <p>
	   * This method uses the <code>{@link JTableCellWriter}</code> from the <code>{@link JTableFixture}</code> that
	   * created this fixture.
	   * </p>
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   * @see #editor()
	   */
	  public TableCellFixture stopEditing() {
		  return executeFunctionReturnSelf("stopEditing");
	  }

	  /**
	   * Cancels editing this fixture's table cell. This method should be called <strong>after</strong> manipulating the
	   * <code>{@link Component}</code> returned by <code>{@link #editor()}</code>.
	   * <p>
	   *
	   * <pre>
	   * TableCellFixture cell = table.cell(row(6).column(8));
	   * Component editor = cell.editor();
	   * // assume editor is a JTextField
	   * JTextComponentFixture editorFixture = new JTextComponentFixture(robot, (JTextField) editor);
	   * cell.{@link #startEditing()};
	   * editorFixture.enterText(&quot;Hello&quot;);
	   * // discard any entered value
	   * cell.cancelEditing();
	   * </pre>
	   *
	   * </p>
	   * <p>
	   * This method uses the <code>{@link JTableCellWriter}</code> from the <code>{@link JTableFixture}</code> that
	   * created this fixture.
	   * </p>
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   * @see #editor()
	   */
	  public TableCellFixture cancelEditing() {
		  return executeFunctionReturnSelf("cancelEditing");
	  }



	  /**
	   * Enters the given value to this fixture's table cell. This method starts cell edition, enters the given value and
	   * stops cell edition. To change the value of a cell, only a call to this method is necessary. If you need more
	   * flexibility, you can retrieve the cell editor with <code>{@link #editor()}</code>.
	   * <p>
	   * This method uses the <code>{@link JTableCellWriter}</code> from the <code>{@link JTableFixture}</code> that
	   * created this fixture.
	   * </p>
	   * @param value the value to enter in the cell.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TableCellFixture enterValue(String value) {
		  return executeFunctionReturnSelf("enterValue", value);
	  }


	  /**
	   * Asserts that the value of this fixture's table cell matches the given value.
	   * @param value the expected value of this fixture's table cell. It can be a regular expression.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TableCellFixture requireValue(String value) {
		  return executeFunctionReturnSelf("requireValue", value);
	  }

	  /**
	   * Returns the {@code String} representation of the value of this fixture's table cell. This method uses the
	   * <code>{@link JTableCellReader}</code> from the <code>{@link JTableFixture}</code> that created this fixture.
	   * @return the {@code String} representation of the value of this fixture's table cell.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public String value() {
			String functionString = createFunctionString("value");
			return executeFunctionString(functionString);
	  }

	  /**
	   * Simulates a user dragging this fixture's table cell.
	   * @return this fixture.
	   */
	  public TableCellFixture drag() {
		  return executeFunctionReturnSelf("drag");
	  }

	  /**
	   * Simulates a user dropping into this fixture's table cell.
	   * @return this fixture.
	   */
	  public TableCellFixture drop() {
		  return executeFunctionReturnSelf("drop");
	  }


	  /**
	   * Asserts that this fixture's table cell is editable.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TableCellFixture requireEditable() {
		  return executeFunctionReturnSelf("requireEditable");
	  }


	  /**
	   * Asserts that this fixture's table cell is not editable.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TableCellFixture requireNotEditable() {
		  return executeFunctionReturnSelf("requireNotEditable");
	  }

	  /**
	   * Returns the row index of this fixture's table cell.
	   * @return the row index of this fixture's table cell.
	   */
	  public int row() { 
			String functionString = createFunctionString("row");
			return Integer.parseInt(executeFunctionString(functionString));
	  }

	  /**
	   * Returns the column index of this fixture's table cell.
	   * @return the column index of this fixture's table cell.
	   */
	  public int column() {
			String functionString = createFunctionString("column");
			return Integer.parseInt(executeFunctionString(functionString));
	  }
}
