package com.nemo.festselenium.fixture;

import static com.nemo.festselenium.utils.FunctionStringHelper.createFunctionString;

import com.nemo.festselenium.core.MouseButton;

/**
 * Control the JTreeFixture in selenium server side
 * 
 * @see org.fest.swing.fixture.JTreeFixture
 * 
 * @author CanHua Li
 * 
 */
public class TreeFixture  extends ComponentFixture<TreeFixture> {

	public TreeFixture(ComponentContext context) {
		super(context);
	}

	/**
	   * Clicks the given row.
	   * @param row the given row.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TreeFixture clickRow(int row) {
		  return executeFunctionReturnSelf("clickRow", row);
	  }


	  /**
	   * Clicks the given row.
	   * @param row the given row.
	   * @param button the mouse button to use.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TreeFixture clickRow(int row, MouseButton button) {

			String mouseButtonString = createMouseButtonQueryString(button.mask);
			String clickString = getComponentContext()
					.createQueryStringComponentAsPrefix(
							"clickRow("+row+",mousebutton)");
			String script = String.format("var mousebutton=%s;%s",
					mouseButtonString, clickString);
			eval(script);
	    return this;
	  }


	  /**
	   * Clicks the given path, expanding parent nodes if necessary.
	   * @param path the given path.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TreeFixture clickPath(String path) {
		  return executeFunctionReturnSelf("clickPath", path);
	  }

	  /**
	   * Clicks the given path, expanding parent nodes if necessary.
	   * @param path the given path.
	   * @param button the mouse button to use.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   * @since 1.2
	   */
	  public TreeFixture clickPath(String path, MouseButton button) {
			String mouseButtonString = createMouseButtonQueryString(button.mask);
			String clickString = getComponentContext()
					.createQueryStringComponentAsPrefix(
							"clickPath(\""+path+"\",mousebutton)");
			String script = String.format("var mousebutton=%s;%s",
					mouseButtonString, clickString);
			eval(script);
	    return this;
	  }

	  /**
	   * Double-clicks the given row.
	   * @param row the given row.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TreeFixture doubleClickRow(int row) {
		  return executeFunctionReturnSelf("doubleClickRow", row);
	  }

	  /**
	   * Double-clicks the given path.
	   * @param path the given path.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TreeFixture doubleClickPath(String path) {
		  return executeFunctionReturnSelf("doubleClickPath", path);
	  }

	  /**
	   * Right-clicks the given row.
	   * @param row the given row.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TreeFixture rightClickRow(int row) {
		  return executeFunctionReturnSelf("rightClickRow", row);
	  }

	  /**
	   * Right-clicks the given path, expanding parent nodes if necessary.
	   * @param path the given path.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TreeFixture rightClickPath(String path) {
		  return executeFunctionReturnSelf("rightClickPath", path);
	  }

	

	  /**
	   * Simulates a user dragging a row from this fixture's <code>{@link JTree}</code>.
	   * @param row the index of the row to drag.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TreeFixture drag(int row) {
		  return executeFunctionReturnSelf("drag", row);
	  }

	  /**
	   * Simulates a user dragging an item from this fixture's <code>{@link JTree}</code>.
	   * @param path the path corresponding to the item to drag.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TreeFixture drag(String path) {
		  return executeFunctionReturnSelf("drag", path);
	  }

	  /**
	   * Simulates a user dropping an item into this fixture's <code>{@link JTree}</code>.
	   * @param row the row to drop the item to.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TreeFixture drop(int row) {
		  return executeFunctionReturnSelf("drop", row);
	  }

	  /**
	   * Simulates a user dropping an item into this fixture's <code>{@link JTree}</code>.
	   * @param path the path corresponding to the item relative to the drop point.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TreeFixture drop(String path) {
		  return executeFunctionReturnSelf("drop", path);
	  }

	  /**
	   * Selects the given path, expanding parent nodes if necessary. Unlike <code>{@link #clickPath(String)}</code>,
	   * this method will not click the path if it is already selected.
	   * @param path the path to select.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TreeFixture selectPath(String path) {
		  return executeFunctionReturnSelf("selectPath", path);
	  }

	  /**
	   * Select the given paths, expanding parent nodes if necessary.
	   * @param paths the paths to select.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TreeFixture selectPaths(String... paths) {
		  return executeFunctionReturnSelf("selectPaths", paths);
	  }

	  /**
	   * Simulates a user selecting the tree node at the given row.
	   * @param row the index of the row to select.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TreeFixture selectRow(int row) {
		  return executeFunctionReturnSelf("selectRow", row);
	  }

	  /**
	   * Simulates a user selecting the tree nodes at the given rows.
	   * @param rows the indices of the rows to select.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TreeFixture selectRows(int... rows) {
		  return executeFunctionReturnSelf("selectRows", rows);
	  }

	  /**
	   * Simulates a user toggling the open/closed state of the tree node at the given row.
	   * @param row the index of the row to toggle.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TreeFixture toggleRow(int row) {
		  return executeFunctionReturnSelf("toggleRow", row);
	  }

	  /**
	   * Simulates a user expanding the tree node at the given row.
	   * @param row the index of the row to expand.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TreeFixture expandRow(int row) {
		  return executeFunctionReturnSelf("expandRow", row);
	  }

	  /**
	   * Simulates a user collapsing the tree node at the given row.
	   * @param row the index of the row to collapse.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TreeFixture collapseRow(int row) {
		  return executeFunctionReturnSelf("collapseRow", row);
	  }

	  /**
	   * Simulates a user expanding the tree node at the given path.
	   * @param path the path of the row to expand.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TreeFixture expandPath(String path) {
		  return executeFunctionReturnSelf("expandPath", path);
	  }

	  /**
	   * Simulates a user collapsing the tree node at the given path.
	   * @param path the path of the row to collapse.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TreeFixture collapsePath(String path) {
		  return executeFunctionReturnSelf("collapsePath", path);
	  }

	

	  /**
	   * Asserts that this fixture's <code>{@link JTree}</code> is editable.
	   * @throws AssertionError if this fixture's {@code JTree} is not editable.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TreeFixture requireEditable() {
		  return executeFunctionReturnSelf("requireEditable");
	  }

	  /**
	   * Asserts that this fixture's <code>{@link JTree}</code> is not editable.
	   * @throws AssertionError if this fixture's {@code JTree} is editable.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TreeFixture requireNotEditable() {
		  return executeFunctionReturnSelf("requireNotEditable");
	  }

	  /**
	   * Asserts that this fixture's <code>{@link JTree}</code> selection is equal to the given paths.
	   * @param paths the given paths, expected to be selected.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TreeFixture requireSelection(String... paths) {
		  return executeFunctionReturnSelf("requireSelection", paths);
	  }

	  /**
	   * Asserts that this fixture's <code>{@link JTree}</code>'s selected rows are equal to the given one.
	   * @param rows the indices of the rows, expected to be selected.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   * @return this fixture.
	   */
	  public TreeFixture requireSelection(int... rows) {
		  return executeFunctionReturnSelf("requireSelection", rows);
	  }

	  /**
	   * Asserts that this fixture's <code>{@link JTree}</code>'s does not have any selection.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TreeFixture requireNoSelection() {
		  return executeFunctionReturnSelf("requireNoSelection");
	  }

	

	  /**
	   * Returns the separator to use when converting <code>{@link TreePath}</code>s to {@code String}s.
	   * @return the separator to use when converting <code>{@link TreePath}</code>s to {@code String}s.
	   */
	  public String separator() {
			String functionString = createFunctionString("separator");
			return executeFunctionString(functionString);
	  }

	  /**
	   * Updates the separator to use when converting <code>{@link TreePath}</code>s to {@code String}s. The default
	   * value is "/".
	   * @param separator the new separator.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TreeFixture separator(String separator) {
		  return executeFunctionReturnSelf("separator", separator);
	  }

	
	  /**
	   * Returns a fixture that manages the node specified by the given row.
	   * @param row the given row.
	   * @return a fixture that manages the node specified by the given row.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TreeRowFixture node(int row) {
	    return new TreeRowFixture(getComponentContext().createSubComponentContext("node", row));
	  }

	  /**
	   * Returns a fixture that manages the node specified by the given path.
	   * @param path the given path.
	   * @return a fixture that manages the node specified by the given path.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TreeRowFixture node(String path) {
		    return new TreeRowFixture(getComponentContext().createSubComponentContext("node", path));
	  }

	  /**
	   * Returns the {@code String} representation of the node at the given path.
	   * @param path the given path.
	   * @return the {@code String} representation of the node at the given path.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public String valueAt(String path) {
			String functionString = createFunctionString("valueAt", path);
			return executeFunctionString(functionString);
	  }

	  /**
	   * Returns the {@code String} representation of the given row.
	   * @param row the given row.
	   * @return the {@code String} representation of the node at the given path.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public String valueAt(int row) {
			String functionString = createFunctionString("valueAt", row);
			return executeFunctionString(functionString);
	  }
}
