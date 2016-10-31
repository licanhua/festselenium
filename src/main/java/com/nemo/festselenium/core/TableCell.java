package com.nemo.festselenium.core;

/**
 * 
* @author Can Hua Li
* @see org.fest.swing.core.TableCell
*/
public class TableCell {
	/**
	 * A cell in a <code>{@link JTable}</code>.
	 *
	 */
	  /** The row of the cell. */
	  public final int row;

	  /** The column of the cell. */
	  public final int column;

	  /**
	   * Starting point for the creation of a <code>{@link TableCell}</code>.
	   * <p>
	   * Example:
	   * <pre>
	   * // import static org.fest.swing.data.TableCell.row;
	   * TableCell cell = row(5).column(3);
	   * </pre>
	   * </p>
	   * @param row the row index of the table cell to create.
	   * @return the created builder.
	   */
	  public static TableCellBuilder row(int row) { return new TableCellBuilder(row); }

	  /**
	   * Understands creation of <code>{@link TableCell}</code>s.
	   *
	   * @author Alex Ruiz
	   */
	  public static class TableCellBuilder {
	    private final int row;

	    TableCellBuilder(int row) { this.row = row; }

	    /**
	     * Creates a new table cell using the row index specified in <code>{@link TableCellBuilder#row(int)}</code> and the
	     * column index specified as the argument in this method.
	     * @param column the column index of the table cell to create.
	     * @return the created table cell.
	     */
	    public TableCell column(int column) { return new TableCell(row, column); }
	  }

	  /**
	   * Creates a new </code>{@link TableCell}</code>.
	   * @param row the row of the cell.
	   * @param column the column of the cell.
	   */
	  protected TableCell(int row, int column) {
	    this.row = row;
	    this.column = column;
	  }
}
