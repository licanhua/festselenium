package com.nemo.festselenium.fixture;

/**
 * Understands support methods/members required to interact through LiveConnect.
 * Certain functions require references to created java objects to work. Client
 * side JavaScript code can then use these references with requests back to the
 * applet.
 *
 * @author CanHua Li
 *  @see org.fest.swing.fixture.LiveConnectSupport
 */
public interface LiveConnectSupport {

	/**
	 * query string to call JAppletFixture to create KeyPressInfo objects
	 * @param keyCode the ASCII code as an integer
	 * @param modifier the bit-mask modifier as an integer
	 * @return Query String to create: KeyPressInfo object which understands key chord presses (i.e. CTRL-A)
	 * @see org.fest.swing.fixture.LiveConnectSupport#createKeyPressInfo(int keyCode, int modifier) 
	 */
	public abstract String createKeyPressInfoQueryString(int keyCode,
			int modifier);

	/**
	 * query string to call JAppletFixture to create Point objects
	 * @param x the x coordinate
	 * @param y the y coordinate
	 * @return Query String to create: Point object which understands a Cartesian coordinate.
	 *  @see org.fest.swing.fixture.LiveConnectSupport#createPoint(int x, int y)
	 */
	public abstract String createPointQueryString(int x, int y);

	/**
	 * query string to call JAppletFixture to create MouseButton objects
	 * @param buttonMask the integer representation of the Button Mask
	 * @return a MouseButton object which understands mouse button semantics.
	 * @see org.fest.swing.fixture.LiveConnectSupport#createMouseButton(int buttonMask)
	 */
	public abstract String createMouseButtonQueryString(int buttonMask);

	/**
	 * query string to call JAppletFixture to create File objects
	 * @param name the name of the file
	 * @return a File object
	 * @see org.fest.swing.fixture.LiveConnectSupport#createFile(String name)
	 */
	public abstract String createFileQueryString(String name);

	/**
	 * query string to call JAppletFixture to create File objects
	 * @param fileNames the name of the files
	 * @return a File object
	 * @see org.fest.swing.fixture.LiveConnectSupport#createFiles(String[] fileNames)
	 */
	public abstract String createFileQueryString(String[] fileNames);

	/**
	 * query string to call JAppletFixture to create TableCell objects
	 * @param row the row for the cell
	 * @param column the column for the cell
	 * @return a TableCell object
	 * @see org.fest.swing.fixture.LiveConnectSupport#createTableCellQueryString(int, int)
	 */
	public abstract String createTableCellQueryString(int row, int column);

}