package com.nemo.festselenium.fixture;

/**
 * Understands lookup of Components contained in a
 * <code>{@link JAppletFixture}</code>.
 * 
 * @see org.fest.swing.fixture#ComponentContainerFixture
 * 
 * @author Canhua Li
 */
public interface ComponentContainerFixture {

/**
   * To find <code>{@link org.fest.swing.fixture.JButtonFixture</code> on selenium server side.
   * @return a fixture that manages the <code>org.fest.swing.fixture.JButtonFixture</code>
   * @throws SeleniumException If selenium communication failed 
   * @throws SeleniumException If fest side throw exception 
   */
	TextDisplayFixture button();

/**
   * To find <code>{@link org.fest.swing.fixture.JButtonFixture</code> on fest side.
   * @param name the name to match.
   * @return a fixture that manages the <code>org.fest.swing.fixture.JButtonFixture</code> found.
   * @throws SeleniumException If selenium communication failed 
   * @throws SeleniumException If fest side throw exception 
   */
	TextDisplayFixture button(String name);

/**
   * To find <code>{@link org.fest.swing.fixture.JCheckBoxFixture</code> on fest side.
   * @return a fixture that manages the <code>org.fest.swing.fixture.JCheckBoxFixture</code> found.
   * @throws SeleniumException If selenium communication failed 
   * @throws SeleniumException If fest side throw exception 
   */
	CheckBoxFixture checkBox();

/**
   * To find <code>{@link org.fest.swing.fixture.JCheckBoxFixture</code> on fest side.
   * @param name the name to match.
   * @return a fixture that manages the <code>org.fest.swing.fixture.JCheckBoxFixture</code> found.
   * @throws SeleniumException If selenium communication failed 
   * @throws SeleniumException If fest side throw exception 
   */
	CheckBoxFixture checkBox(String name);

/**
   * To find <code>{@link org.fest.swing.fixture.JComboBoxFixture</code> on fest side.
   * @return a fixture that manages the <code>org.fest.swing.fixture.JComboBoxFixture</code> found.
   * @throws SeleniumException If selenium communication failed 
   * @throws SeleniumException If fest side throw exception 
   */
	ComboBoxFixture comboBox();

/**
   * To find <code>{@link org.fest.swing.fixture.JComboBoxFixture</code> on fest side.
   * @param name the name to match.
   * @return a fixture that manages the <code>org.fest.swing.fixture.JComboBoxFixture</code> found.
   * @throws SeleniumException If selenium communication failed 
   * @throws SeleniumException If fest side throw exception 
   */
	ComboBoxFixture comboBox(String name);

/**
   * To find <code>{@link org.fest.swing.fixture.DialogFixture</code> on fest side.
   * @return a fixture that manages the <code>org.fest.swing.fixture.DialogFixture</code> found.
   * @throws SeleniumException If selenium communication failed 
   * @throws SeleniumException If fest side throw exception 
   * @see #dialog(int)
   */
	DialogFixture dialog();

/**
   * To find <code>{@link org.fest.swing.fixture.DialogFixture</code> on fest side.
   * @param name the name to match.
   * @return a fixture that manages the <code>org.fest.swing.fixture.DialogFixture</code> found.
   * @throws SeleniumException If selenium communication failed 
   * @throws SeleniumException If fest side throw exception 
   * @see #dialog(String, int)
   */
	DialogFixture dialog(String name);

/**
   * To find <code>{@link org.fest.swing.fixture.JFileChooserFixture</code> on fest side.
   * @return a fixture that manages the <code>org.fest.swing.fixture.JFileChooserFixture</code> found.
   * @throws SeleniumException If selenium communication failed 
   * @throws SeleniumException If fest side throw exception 
   * @see #fileChooser(int)
   */
	FileChooserFixture fileChooser();

/**
   * To find <code>{@link org.fest.swing.fixture.JFileChooserFixture</code> on fest side.
   * @param name the name to match.
   * @return a fixture that manages the <code>org.fest.swing.fixture.JFileChooserFixture</code> found.
   * @throws SeleniumException If selenium communication failed 
   * @throws SeleniumException If fest side throw exception 
   * @see #fileChooser(int)
   */
	FileChooserFixture fileChooser(String name);

/**
   * To find <code>{@link org.fest.swing.fixture.JLabelFixture</code> on fest side.
   * @return a fixture that manages the <code>org.fest.swing.fixture.JLabelFixture</code> found.
   * @throws SeleniumException If selenium communication failed 
   * @throws SeleniumException If fest side throw exception 
   */
	LabelFixture label();

/**
   * To find <code>{@link org.fest.swing.fixture.JLabelFixture</code> on fest side.
   * @param name the name to match.
   * @return a fixture that manages the <code>org.fest.swing.fixture.JLabelFixture</code> found.
   * @throws SeleniumException If selenium communication failed 
   * @throws SeleniumException If fest side throw exception 
   */
	LabelFixture label(String name);

/**
   * To find <code>{@link org.fest.swing.fixture.JListFixture</code> on fest side.
   * @return a fixture that manages the <code>org.fest.swing.fixture.JListFixture</code> found.
   * @throws SeleniumException If selenium communication failed 
   * @throws SeleniumException If fest side throw exception 
   */
	ListFixture list();

/**
   * To find <code>{@link org.fest.swing.fixture.JListFixture</code> on fest side.
   * @param name the name to match.
   * @return a fixture that manages the <code>org.fest.swing.fixture.JListFixture</code> found.
   * @throws SeleniumException If selenium communication failed 
   * @throws SeleniumException If fest side throw exception 
   */
	ListFixture list(String name);

/**
   * To find <code>{@link org.fest.swing.fixture.JMenuItemFixture</code> on fest side.
   * @param path the menu path to match.
   * @return a fixture that manages the <code>org.fest.swing.fixture.JMenuItemFixture</code> found.
   * @throws SeleniumException If selenium communication failed 
   * @throws SeleniumException If fest side throw exception 
   */
	MenuItemFixture menuItemWithPath(String... path);

/**
   * To find <code>{@link org.fest.swing.fixture.JMenuItemFixture</code> on fest side.
   * @param name the menu name to match.
   * @return a fixture that manages the <code>org.fest.swing.fixture.JMenuItemFixture</code> found.
   * @throws SeleniumException If selenium communication failed 
   * @throws SeleniumException If fest side throw exception 
   */
	MenuItemFixture menuItem(String name);

/**
   * To find <code>{@link org.fest.swing.fixture.JOptionPaneFixture</code> on fest side.
   * @return a fixture that manages the <code>org.fest.swing.fixture.JOptionPaneFixture</code> found.
   * @throws SeleniumException If selenium communication failed 
   * @throws SeleniumException If fest side throw exception 
   */
	OptionPaneFixture optionPane();

/**
   * To find <code>{@link org.fest.swing.fixture.JPanelFixture</code> on fest side.
   * @return a fixture that manages the <code>org.fest.swing.fixture.JPanelFixture</code> found.
   * @throws SeleniumException If selenium communication failed 
   * @throws SeleniumException If fest side throw exception 
   */
	PanelFixture panel();

/**
   * To find <code>{@link org.fest.swing.fixture.JPanelFixture</code> on fest side.
   * @param name the name to match.
   * @return a fixture that manages the <code>org.fest.swing.fixture.JPanelFixture</code> found.
   * @throws SeleniumException If selenium communication failed 
   * @throws SeleniumException If fest side throw exception 
   */
	PanelFixture panel(String name);

/**
   * To find <code>{@link org.fest.swing.fixture.JProgressBarFixture</code> on fest side.
   * @param name the name to match.
   * @return a fixture that manages the <code>org.fest.swing.fixture.JProgressBarFixture</code> found.
   * @throws SeleniumException If selenium communication failed 
   * @throws SeleniumException If fest side throw exception 
   */
	ProgressBarFixture progressBar();

/**
   * To find <code>{@link org.fest.swing.fixture.JProgressBarFixture</code> on fest side.
   * @param name the name to match.
   * @return a fixture that manages the <code>org.fest.swing.fixture.JProgressBarFixture</code> found.
   * @throws SeleniumException If selenium communication failed 
   * @throws SeleniumException If fest side throw exception 
   */
	ProgressBarFixture progressBar(String name);

/**
   * To find <code>{@link org.fest.swing.fixture.JRadioButtonFixture</code> on fest side.
   * @return a fixture that manages the <code>org.fest.swing.fixture.JRadioButtonFixture</code> found.
   * @throws SeleniumException If selenium communication failed 
   * @throws SeleniumException If fest side throw exception 
   */
	RadioButtonFixture radioButton();

/**
   * To find <code>{@link org.fest.swing.fixture.JRadioButtonFixture</code> on fest side.
   * @param name the name to match.
   * @return a fixture that manages the <code>org.fest.swing.fixture.JRadioButtonFixture</code> found.
   * @throws SeleniumException If selenium communication failed 
   * @throws SeleniumException If fest side throw exception 
   */
	RadioButtonFixture radioButton(String name);

/**
   * To find <code>{@link org.fest.swing.fixture.JScrollBarFixture</code> on fest side.
   * @return a fixture that manages the <code>org.fest.swing.fixture.JScrollBarFixture</code> found.
   * @throws SeleniumException If selenium communication failed 
   * @throws SeleniumException If fest side throw exception 
   */
	ScrollBarFixture scrollBar();

/**
   * To find <code>{@link org.fest.swing.fixture.JScrollBarFixture</code> on fest side.
   * @param name the name to match.
   * @return a fixture that manages the <code>org.fest.swing.fixture.JScrollBarFixture</code> found.
   * @throws SeleniumException If selenium communication failed 
   * @throws SeleniumException If fest side throw exception 
   */
	ScrollBarFixture scrollBar(String name);

/**
   * To find <code>{@link org.fest.swing.fixture.JScrollPaneFixture</code> on fest side.
   * @return a fixture that manages the <code>org.fest.swing.fixture.JScrollPaneFixture</code> found.
   * @throws SeleniumException If selenium communication failed 
   * @throws SeleniumException If fest side throw exception 
   */
	ScrollPaneFixture scrollPane();

/**
   * To find <code>{@link org.fest.swing.fixture.JScrollPaneFixture</code> on fest side.
   * @param name the name to match.
   * @return a fixture that manages the <code>org.fest.swing.fixture.JScrollPaneFixture</code> found.
   * @throws SeleniumException If selenium communication failed 
   * @throws SeleniumException If fest side throw exception 
   */
	ScrollPaneFixture scrollPane(String name);

/**
   * To find <code>{@link org.fest.swing.fixture.JSliderFixture</code> on fest side.
   * @param name the name to match.
   * @return a fixture that manages the <code>org.fest.swing.fixture.JSliderFixture</code> found.
   * @throws SeleniumException If selenium communication failed 
   * @throws SeleniumException If fest side throw exception 
   */
	SliderFixture slider();

/**
   * To find <code>{@link org.fest.swing.fixture.JSliderFixture</code> on fest side.
   * @param name the name to match.
   * @return a fixture that manages the <code>org.fest.swing.fixture.JSliderFixture</code> found.
   * @throws SeleniumException If selenium communication failed 
   * @throws SeleniumException If fest side throw exception 
   */
	SliderFixture slider(String name);

/**
   * To find <code>{@link org.fest.swing.fixture.JSpinnerFixture</code> on fest side.
   * @return a fixture that manages the <code>org.fest.swing.fixture.JSpinnerFixture</code> found.
   * @throws SeleniumException If selenium communication failed 
   * @throws SeleniumException If fest side throw exception 
   */
	SpinnerFixture spinner();

/**
   * To find <code>{@link org.fest.swing.fixture.JSpinnerFixture</code> on fest side.
   * @param name the name to match.
   * @return a fixture that manages the <code>org.fest.swing.fixture.JSpinnerFixture</code> found.
   * @throws SeleniumException If selenium communication failed 
   * @throws SeleniumException If fest side throw exception 
   */
	SpinnerFixture spinner(String name);

/**
   * To find <code>{@link org.fest.swing.fixture.JSplitPaneFixture</code> on fest side.
   * @return a fixture that manages the <code>org.fest.swing.fixture.JSplitPaneFixture</code> found.
   * @throws SeleniumException If selenium communication failed 
   * @throws SeleniumException If fest side throw exception 
   */
	SplitPaneFixture splitPane();

/**
   * To find <code>{@link org.fest.swing.fixture.JSplitPaneFixture</code> on fest side.
   * @param name the name to match.
   * @return a fixture that manages the <code>org.fest.swing.fixture.JSplitPaneFixture</code> found.
   * @throws SeleniumException If selenium communication failed 
   * @throws SeleniumException If fest side throw exception 
   */
	SplitPaneFixture splitPane(String name);

/**
   * To find <code>{@link org.fest.swing.fixture.JTabbedPaneFixture</code> on fest side.
   * @return a fixture that manages the <code>org.fest.swing.fixture.JTabbedPaneFixture</code> found.
   * @throws SeleniumException If selenium communication failed 
   * @throws SeleniumException If fest side throw exception 
   */
	TabbedPaneFixture tabbedPane();

/**
   * To find <code>{@link org.fest.swing.fixture.JTabbedPaneFixture</code> on fest side.
   * @param name the name to match.
   * @return a fixture that manages the <code>org.fest.swing.fixture.JTabbedPaneFixture</code> found.
   * @throws SeleniumException If selenium communication failed 
   * @throws SeleniumException If fest side throw exception 
   */
	TabbedPaneFixture tabbedPane(String name);

/**
   * To find <code>{@link org.fest.swing.fixture.JTextComponentFixture</code> on fest side.
   * @return a fixture that manages the <code>org.fest.swing.fixture.JTextComponentFixture</code> found.
   * @throws SeleniumException If selenium communication failed 
   * @throws SeleniumException If fest side throw exception 
   */
	TableFixture table();

/**
   * To find <code>{@link org.fest.swing.fixture.JTextComponentFixture</code> on fest side.
   * @param name the name to match.
   * @return a fixture that manages the <code>org.fest.swing.fixture.JTextComponentFixture</code> found.
   * @throws SeleniumException If selenium communication failed 
   * @throws SeleniumException If fest side throw exception 
   */
	TableFixture table(String name);

/**
   * To find <code>{@link org.fest.swing.fixture.JTextComponentFixture</code> on fest side.
   * @return a fixture that manages the <code>org.fest.swing.fixture.JTextComponentFixture</code> found.
   * @throws SeleniumException If selenium communication failed 
   * @throws SeleniumException If fest side throw exception 
   */
	TextComponentFixture textBox();

/**
   * To find <code>{@link org.fest.swing.fixture.JTextComponentFixture</code> on fest side.
   * @param name the name to match.
   * @return a fixture that manages the <code>org.fest.swing.fixture.JTextComponentFixture</code> found.
   * @throws SeleniumException If selenium communication failed 
   * @throws SeleniumException If fest side throw exception 
   */
	TextComponentFixture textBox(String name);

/**
   * To find <code>{@link org.fest.swing.fixture.JToggleButtonFixture</code> on fest side.
   * @param name the name to match.
   * @return a fixture that manages the <code>org.fest.swing.fixture.JToggleButtonFixture</code> found.
   * @throws SeleniumException If selenium communication failed 
   * @throws SeleniumException If fest side throw exception 
   */
	ToggleButtonFixture toggleButton();

/**
   * To find <code>{@link org.fest.swing.fixture.JToggleButtonFixture</code> on fest side.
   * @param name the name to match.
   * @return a fixture that manages the <code>org.fest.swing.fixture.JToggleButtonFixture</code> found.
   * @throws SeleniumException If selenium communication failed 
   * @throws SeleniumException If fest side throw exception 
   */
	ToggleButtonFixture toggleButton(String name);

/**
   * To find <code>{@link org.fest.swing.fixture.JToolBarFixture</code> on fest side.
   * @return a fixture that manages the <code>org.fest.swing.fixture.JToolBarFixture</code> found.
   * @throws SeleniumException If selenium communication failed 
   * @throws SeleniumException If fest side throw exception 
   */
	ToolBarFixture toolBar();

/**
   * To find <code>{@link org.fest.swing.fixture.JToolBarFixture</code> on fest side.
   * @param name the name to match.
   * @return a fixture that manages the <code>org.fest.swing.fixture.JToolBarFixture</code> found.
   * @throws SeleniumException If selenium communication failed 
   * @throws SeleniumException If fest side throw exception 
   */
	ToolBarFixture toolBar(String name);

/**
   * To find <code>{@link org.fest.swing.fixture.JTreeFixture</code> on fest side.
   * @return a fixture that manages the <code>org.fest.swing.fixture.JTreeFixture</code> found.
   * @throws SeleniumException If selenium communication failed 
   * @throws SeleniumException If fest side throw exception 
   */
	TreeFixture tree();

/**
   * To find <code>{@link org.fest.swing.fixture.JTreeFixture</code> on fest side.
   * @param name the name to match.
   * @return a fixture that manages the <code>org.fest.swing.fixture.JTreeFixture</code> found.
   * @throws SeleniumException If selenium communication failed 
   * @throws SeleniumException If fest side throw exception 
   */
	TreeFixture tree(String name);

}