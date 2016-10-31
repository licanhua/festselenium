package com.nemo.festselenium.fixture;

import com.nemo.festselenium.core.MouseButton;
import com.nemo.festselenium.core.TableCell;

/**
 * Control the JTableFixture in selenium server side
 * 
 * @see org.fest.swing.fixture.JTableFixture
 * 
 * @author CanHua Li
 * 
 */
public class TableFixture  extends ComponentFixture<TableFixture> {
	public TableFixture(ComponentContext context) {
		super(context);
	}

	/**
	   * Returns a fixture that manages the table cell whose value matches the given one.
	   * @param value the value of the cell to look for. It can be a regular expression.
	   * @return a fixture that manages the table cell whose value matches the given one.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TableCell cell(String value) {
		String functionString =  getComponentContext().createSubComponetQueryString("cell", value);
		int x = Integer.parseInt(eval (functionString+".row"));
		int y = Integer.parseInt(eval (functionString+".column"));
		return TableCell.row(x).column(y);	    
	  }


	  /**
	   * Returns a fixture that manages the table cell specified by the given row and column.
	   * @param cell the cell of interest.
	   * @return a fixture that manages the table cell specified by the given row and column.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TableCellFixture cell(TableCell cell) {
		 String script = getFuncStringTableCellAsParameter("cell", cell);
		 ComponentContext c= this.getComponentContext().createContextByQueryString(script);
		 return new TableCellFixture(c);
	  }

	private String getFuncStringTableCellAsParameter(String functionName, TableCell cell) {
		String cellstring = createTableCellQueryString(cell.row, cell.column);
		 String functionString = getComponentContext().
				 createQueryStringComponentAsPrefix(functionName+"(cell)");
	    return String.format("var cell=%s;%s", cellstring, functionString);
	}

	  /**
	   * Returns a <code>{@link JTableHeaderFixture}</code> wrapping the <code>{@link JTableHeader}</code> in this fixture's
	   * <code>{@link JTable}</code>.
	   * @return a <code>JTableHeaderFixture</code> wrapping the <code>JTableHeader</code> in this fixture's
	   * {@code JTable}.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TableHeaderFixture tableHeader() {
		  ComponentContext c= this.getComponentContext().createSubComponentContext("tableHeader");
	    return new TableHeaderFixture(c);
	  }

	  /**
	   * Returns the {@code String} representation of the selected cell in this fixture's <code>{@link JTable}</code>,
	   * using this fixture's <code>{@link JTableCellReader}</code>. Returns {@code null} if one can not be obtained or
	   * if the <code>{@link JTable}</code> does not have any selected cell.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   * @see #cellReader(JTableCellReader)
	   */
	  public String selectionValue() {
		  return executeFunctionString("selectionValue()");
	  }


	  /**
	   * Returns the number of rows that can be shown in this fixture's <code>{@link JTable}</code>, given unlimited space.
	   * @return the number of rows shown in this fixture's {@code JTable}.
	   * @see JTable#getRowCount()
	   */
	  public int rowCount() {
		 String r = executeFunctionString("rowCount()");
	    return Integer.parseInt(r);
	  }

	  /**
	   * Returns the {@code String} representation of the value of a cell in this fixture's
	   * <code>{@link JTable}</code>, using this fixture's <code>{@link JTableCellReader}</code>.
	   * @param cell the given cell.
	   * @return the {@code String} representation of the value of a cell in this fixture's {@code JTable}.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   * @see #cellReader(JTableCellReader)
	   */
	  public String valueAt(TableCell cell) {
			 String script = getFuncStringTableCellAsParameter("valueAt", cell);
		    return eval(script);		    
	  }

	  /**
	   * Simulates a user selecting the given cell (row and column) of this fixture's <code>{@link JTable}</code>.
	   * @param cell the cell to select.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TableFixture selectCell(TableCell cell) {
			 String script = getFuncStringTableCellAsParameter("selectCell", cell);
		    eval(script);
	    return this;
	  }

	  /**
	   * Simulates a user selecting the given cells of this fixture's <code>{@link JTable}</code>.
	   * @param cells the cells to select.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TableFixture selectCells(TableCell... cells) {
		  if (cells == null || cells.length<=0) {
			  return this;
		  }
		  
		  StringBuffer script = new StringBuffer();
		  StringBuffer parameters = new StringBuffer();
		  int i = 0;
		  
		  for ( TableCell cell: cells) {
			  i++;
			 String cellstring = createTableCellQueryString(cell.row, cell.column);
			 script.append(String.format("var cell%d=%s;", i, cellstring));
			 parameters.append(String.format("cell%d,", i));
		  }
		  
		  // remove the last comma
		  String x = parameters.substring(0, parameters.length()-1);
		  
			 String functionString = getComponentContext().
					 createQueryStringComponentAsPrefix("selectCells([" + x + "])");
		    eval(script+functionString);
		    
	    return this;
	  }


	  /**
	   * Simulates a user selecting the given rows in this fixture's <code>{@link JTable}</code>.
	   * @param rows the indices of the row to select.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TableFixture selectRows(int... rows) {
		  return executeFunctionReturnSelf("selectRows", rows);
	  }

	  /**
	   * Simulates a user dragging an item from this fixture's <code>{@link JTable}</code>.
	   * @param cell the cell to drag.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TableFixture drag(TableCell cell) {
		  String script = getFuncStringTableCellAsParameter("drag", cell);
		  eval(script);
	    return this;
	  }

	  /**
	   * Simulates a user dropping an item to this fixture's <code>{@link JTable}</code>.
	   * @param cell the cell to drop the dragging item into.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TableFixture drop(TableCell cell) {
		  String script = getFuncStringTableCellAsParameter("drop", cell);
		  eval(script);
	    return this;
	  }


	  public TableFixture click(TableCell cell, MouseButton button, int times) {
			 String cellstring = createTableCellQueryString(cell.row, cell.column);
			 String mouseString = createMouseButtonQueryString(button.mask);
			 
			 String jsObjects = String.format("var cell=%s;var mouse=%s;", cellstring, mouseString);
			 
			 String functionString = getComponentContext().
					 createQueryStringComponentAsPrefix("click(cell,mouse," +times+ ")");
		    eval(jsObjects+functionString);
		    return this;
	  }

	  /**
	   * Simulates a user clicking a cell in this fixture's <code>{@link JTable}</code> once, using the specified mouse
	   * button.
	   * @param cell the cell to click.
	   * @param button the mouse button to use.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TableFixture click(TableCell cell, MouseButton button) {
			 String cellstring = createTableCellQueryString(cell.row, cell.column);
			 String mouseString = createMouseButtonQueryString(button.mask);
			 
			 String jsObjects = String.format("var cell=%s;var mouse=%s;", cellstring, mouseString);
			 
			 String functionString = getComponentContext().
					 createQueryStringComponentAsPrefix("click(cell,mouse)");
		    eval(jsObjects+functionString);
		    return this;
	  }

	  /**
	   * Enters the given value in the given cell of this fixture's <code>{@link JTable}</code>, using this fixture's
	   * <code>{@link JTableCellWriter}</code>. If you need more flexibility for editing cell, please see
	   * <code>{@link TableCellFixture#editor()}</code>.
	   * @param cell the given cell.
	   * @param value the given value.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TableFixture enterValue(TableCell cell, String value) {
			String cellstring = createTableCellQueryString(cell.row, cell.column);
			 String functionString = getComponentContext().
					 createQueryStringComponentAsPrefix("enterValue(cell,\""+value+ "\")");
			 
	    eval(String.format("var cell=%s;%s", cellstring, functionString));
	    return this;
	  }


	  /**
	   * Asserts that this fixture's <code>{@link JTable}</code> has the given number of rows.
	   * @param expected the expected number of rows.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TableFixture requireRowCount(int expected) {
		  return executeFunctionReturnSelf("requireRowCount", expected);
	  }

	  /**
	   * Asserts that the set of selected rows in this fixture's <code>{@link JTable}</code> contains to the given row
	   * indices. The given row indices can be a subset of all the selected rows in a {@code JTable}.
	   * @param rows the indices of the rows expected to be selected.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TableFixture requireSelectedRows(int... rows) {
		  return executeFunctionReturnSelf("requireSelectedRows", rows);
	  }

	  /**
	   * Asserts that this fixture's <code>{@link JTable}</code> has the given number of columns.
	   * @param expected the expected number of columns.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TableFixture requireColumnCount(int expected) {
		  return executeFunctionReturnSelf("requireColumnCount", expected);	    
	  }

	

	  /**
	   * Asserts that the given cell in this fixture's <code>{@link JTable}</code> is editable.
	   * @param cell the given cell.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TableFixture requireEditable(TableCell cell) {
		  String script = getFuncStringTableCellAsParameter("requireEditable", cell);
		  eval(script);
	    return this;
	  }

	  /**
	   * Asserts that the given cell in this fixture's <code>{@link JTable}</code> is not editable.
	   * @param cell the given cell.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TableFixture requireNotEditable(TableCell cell) {
		  String script = getFuncStringTableCellAsParameter("requireNotEditable", cell);
		  eval(script);
	    return this;
	  }

	  /**
	   * Verifies that this fixture's <code>{@link JTable}</code> does not have any selection.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TableFixture requireNoSelection() {
		  return executeFunctionReturnSelf("requireNoSelection");	    
	  }

		private String getFuncStringTableCellAsParameter(String functionName, TableCell cell, String value) {
			String cellstring = createTableCellQueryString(cell.row, cell.column);
			 String functionString = getComponentContext().
					 createQueryStringComponentAsPrefix(functionName+"(cell,\""+ value +"\")");
		    return String.format("var cell=%s;%s", cellstring, functionString);
		}
		
	  /**
	   * Asserts that the value of the given cell matches the given value.
	   * @param cell the given table cell.
	   * @param value the expected value. It can be a regular expression.
	   * @return this fixture.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public TableFixture requireCellValue(TableCell cell, String value) {
		  String script = getFuncStringTableCellAsParameter("requireCellValue", cell, value);
		  eval(script);
	    return this;
	  }

 
	
	  /**
	   * Shows a pop-up menu at the given cell.
	   * @param cell the table cell where to show the pop-up menu.
	   * @return a fixture that manages the displayed pop-up menu.
	 * @throws SeleniumException If selenium communication failed
	 * @throws SeleniumException If fest side throw exception
	   */
	  public PopupMenuFixture showPopupMenuAt(TableCell cell) {
			ComponentContext popupContext = new ComponentContext(
					getComponentContext().getSelenium(), getComponentContext()
							.getAppletQueryString(), POPUP_FIXTURE_QUERY_STRING);

			String cellQueryString = createTableCellQueryString(cell.row, cell.column);

			String script = String.format(
					"var cell=%s; %s = %s.showPopupMenuAt(cell)",
					cellQueryString, POPUP_FIXTURE_QUERY_STRING,
					getComponentContext().getComponentQueryString());
			eval(script);
			return new PopupMenuFixture(popupContext);			
	  }
}
