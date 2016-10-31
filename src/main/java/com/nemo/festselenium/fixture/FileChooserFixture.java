package com.nemo.festselenium.fixture;

/**
 * Control the JFileChooserFixture in selenium server side
 * 
 * @see org.fest.swing.fixture.JFileChooserFixture
 * 
 * @author CanHua Li
 * 
 */
public class FileChooserFixture extends ComponentFixture<FileChooserFixture> {
	public FileChooserFixture(ComponentContext context) {
		super(context);
	}

	/**
	 * Simulates a user pressing the "Approve" button in this fixture's
	 * <code>{@link JFileChooser}</code>.
	 * 
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	public void approve() {
		executeFunctionReturnSelf("approve");
	}

	/**
	 * Finds the "Approve" button in this fixture's
	 * <code>{@link JFileChooser}</code>.
	 * 
	 * @return the found "Approve" button.
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	public ButtonFixture approveButton() {
		ComponentContext c = getComponentContext().createSubComponentContext(
				"approveButton");
		return new ButtonFixture(c);
	}

	/**
	 * Simulates a user pressing the "Cancel" button in this fixture's
	 * <code>{@link JFileChooser}</code>.
	 * 
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	public void cancel() {
		executeFunctionReturnSelf("cancel");
	}

	/**
	 * Finds the "Cancel" button in this fixture's
	 * <code>{@link JFileChooser}</code>.
	 * 
	 * @return the found "Cancel" button.
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	public ButtonFixture cancelButton() {
		ComponentContext c = getComponentContext().createSubComponentContext(
				"cancelButton");
		return new ButtonFixture(c);
	}

	/**
	 * Returns a fixture that manages the field where the user can enter the
	 * name of the file to select in this fixture's
	 * <code>{@link JFileChooser}</code>.
	 * 
	 * @return the created fixture.
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	public TextComponentFixture fileNameTextBox() {
		ComponentContext c = getComponentContext().createSubComponentContext(
				"fileNameTextBox");
		return new TextComponentFixture(c);
	}

	/**
	 * Selects the given file in this fixture's
	 * <code>{@link JFileChooser}</code>.
	 * 
	 * @param file
	 *            the file to select.
	 * @return this fixture.
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	public FileChooserFixture selectFile(String fileName) {
		String fileQueryString = createFileQueryString(fileName);
		String invokeString = getComponentContext()
				.createQueryStringComponentAsPrefix("selectFile(file)");

		String script = String.format("var file=%s; %s", fileQueryString,
				invokeString);
		eval(script);
		return this;
	}

	/**
	 * Selects the given files in this fixture's
	 * <code>{@link JFileChooser}</code>.
	 * 
	 * @param files
	 *            the files to select.
	 * @return this fixture.
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	public FileChooserFixture selectFiles(String... fileNames) {
		String fileQueryString = createFileQueryString(fileNames);
		String invokeString = getComponentContext()
				.createQueryStringComponentAsPrefix("selectFiles(files)");

		String script = String.format("var files=%s; %s", fileQueryString,
				invokeString);
		eval(script);
		return this;
	}

	/**
	 * Sets the current directory of this fixture's
	 * <code>{@link JFileChooser}</code> to the given one.
	 * 
	 * @param dir
	 *            the directory to set as current.
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	public FileChooserFixture setCurrentDirectory(final String dir) {
		String fileQueryString = createFileQueryString(dir);
		String invokeString = getComponentContext()
				.createQueryStringComponentAsPrefix("setCurrentDirectory(dir)");

		String script = String.format("var dir=%s; %s", fileQueryString,
				invokeString);
		eval(script);
		return this;
	}

}
