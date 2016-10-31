package com.nemo.festselenium.fixture;

/**
 * @author CanHua Li
 * @since 2012/12/28
 * @param <T> subclass of ContainerFixture
 */
public abstract class ContainerFixture<T extends ContainerFixture<?>> extends
		ComponentFixture<T> implements ComponentContainerFixture {
	
	public ContainerFixture(ComponentContext context) {
		super(context);
	}

	public  ButtonFixture button(String name) {
		ComponentContext context = getComponentContext()
				.createSubComponentContext("button", name);
		return new ButtonFixture(context);
	}

	public ButtonFixture button() {
		ComponentContext context = getComponentContext()
				.createSubComponentContext("button");
		return new ButtonFixture(context);
	}

	public CheckBoxFixture checkBox(String name) {
		ComponentContext context = getComponentContext()
				.createSubComponentContext("checkBox", name);
		return new CheckBoxFixture(context);
	}

	public CheckBoxFixture checkBox() {
		ComponentContext context = getComponentContext()
				.createSubComponentContext("checkBox");
		return new CheckBoxFixture(context);
	}

	public TextComponentFixture textBox(String name) {
		ComponentContext context = getComponentContext()
				.createSubComponentContext("textBox", name);
		return new TextComponentFixture(context);
	}

	public TextComponentFixture textBox() {
		ComponentContext context = getComponentContext()
				.createSubComponentContext("textBox");
		return new TextComponentFixture(context);
	}

	public ComboBoxFixture comboBox() {
		ComponentContext context = getComponentContext()
				.createSubComponentContext("comboBox");
		return new ComboBoxFixture(context);
	}

	public ComboBoxFixture comboBox(String name) {
		ComponentContext context = getComponentContext()
				.createSubComponentContext("comboBox", name);
		return new ComboBoxFixture(context);
	}

	public TableFixture table() {
		ComponentContext context = getComponentContext()
				.createSubComponentContext("table");
		return new TableFixture(context);
	}

	public TableFixture table(String name) {
		ComponentContext context = getComponentContext()
				.createSubComponentContext("table", name);
		return new TableFixture(context);
	}

	public DialogFixture dialog() {
		ComponentContext context = getComponentContext()
				.createSubComponentContext("dialog");
		return new DialogFixture(context);
	}

	public DialogFixture dialog(String name) {
		ComponentContext context = getComponentContext()
				.createSubComponentContext("dialog", name);
		return new DialogFixture(context);
	}

	public FileChooserFixture fileChooser() {
		ComponentContext context = getComponentContext()
				.createSubComponentContext("fileChooser");
		return new FileChooserFixture(context);
	}

	public FileChooserFixture fileChooser(String name) {
		ComponentContext context = getComponentContext()
				.createSubComponentContext("fileChooser", name);
		return new FileChooserFixture(context);
	}

	public LabelFixture label() {
		ComponentContext context = getComponentContext()
				.createSubComponentContext("label");
		return new LabelFixture(context);

	}

	public LabelFixture label(String name) {
		ComponentContext context = getComponentContext()
				.createSubComponentContext("label", name);
		return new LabelFixture(context);

	}

	public ListFixture list() {
		ComponentContext context = getComponentContext()
				.createSubComponentContext("list");
		return new ListFixture(context);
	}

	public ListFixture list(String name) {
		ComponentContext context = getComponentContext()
				.createSubComponentContext("list", name);
		return new ListFixture(context);
	}

	public MenuItemFixture menuItemWithPath(String... path) {
		ComponentContext context = getComponentContext()
				.createSubComponentContext("menuItemWithPath", path);
		return new MenuItemFixture(context);
	}

	public MenuItemFixture menuItem(String name) {
		ComponentContext context = getComponentContext()
				.createSubComponentContext("menuItem", name);
		return new MenuItemFixture(context);
	}

	public OptionPaneFixture optionPane() {
		ComponentContext context = getComponentContext()
				.createSubComponentContext("optionPane");
		return new OptionPaneFixture(context);
	}

	public PanelFixture panel() {
		ComponentContext context = getComponentContext()
				.createSubComponentContext("panel");
		return new PanelFixture(context);
	}

	public PanelFixture panel(String name) {
		ComponentContext context = getComponentContext()
				.createSubComponentContext("panel", name);
		return new PanelFixture(context);
	}

	public ProgressBarFixture progressBar() {
		ComponentContext context = getComponentContext()
				.createSubComponentContext("progressBar");
		return new ProgressBarFixture(context);
	}

	public ProgressBarFixture progressBar(String name) {
		ComponentContext context = getComponentContext()
				.createSubComponentContext("progressBar", name);
		return new ProgressBarFixture(context);
	}

	public RadioButtonFixture radioButton() {
		ComponentContext context = getComponentContext()
				.createSubComponentContext("radioButton");
		return new RadioButtonFixture(context);
	}

	public RadioButtonFixture radioButton(String name) {
		ComponentContext context = getComponentContext()
				.createSubComponentContext("radioButton", name);
		return new RadioButtonFixture(context);

	}

	public ScrollBarFixture scrollBar() {
		ComponentContext context = getComponentContext()
				.createSubComponentContext("scrollBar");
		return new ScrollBarFixture(context);
	}

	public ScrollBarFixture scrollBar(String name) {
		ComponentContext context = getComponentContext()
				.createSubComponentContext("scrollBar", name);
		return new ScrollBarFixture(context);
	}

	public ScrollPaneFixture scrollPane() {
		ComponentContext context = getComponentContext()
				.createSubComponentContext("scrollPane");
		return new ScrollPaneFixture(context);
	}

	public ScrollPaneFixture scrollPane(String name) {
		ComponentContext context = getComponentContext()
				.createSubComponentContext("scrollPane", name);
		return new ScrollPaneFixture(context);
	}

	public SliderFixture slider() {
		ComponentContext context = getComponentContext()
				.createSubComponentContext("slider");
		return new SliderFixture(context);
	}

	public SliderFixture slider(String name) {
		ComponentContext context = getComponentContext()
				.createSubComponentContext("slider", name);
		return new SliderFixture(context);
	}

	public SpinnerFixture spinner() {
		ComponentContext context = getComponentContext()
				.createSubComponentContext("spinner");
		return new SpinnerFixture(context);
	}

	public SpinnerFixture spinner(String name) {
		ComponentContext context = getComponentContext()
				.createSubComponentContext("spinner", name);
		return new SpinnerFixture(context);
	}

	public SplitPaneFixture splitPane() {
		ComponentContext context = getComponentContext()
				.createSubComponentContext("splitPane");
		return new SplitPaneFixture(context);

	}

	public SplitPaneFixture splitPane(String name) {
		ComponentContext context = getComponentContext()
				.createSubComponentContext("splitPane", name);
		return new SplitPaneFixture(context);
	}

	public TabbedPaneFixture tabbedPane() {
		ComponentContext context = getComponentContext()
				.createSubComponentContext("tabbedPane");
		return new TabbedPaneFixture(context);
	}

	public TabbedPaneFixture tabbedPane(String name) {
		ComponentContext context = getComponentContext()
				.createSubComponentContext("tabbedPane", name);
		return new TabbedPaneFixture(context);
	}

	public ToggleButtonFixture toggleButton() {
		ComponentContext context = getComponentContext()
				.createSubComponentContext("toggleButton");
		return new ToggleButtonFixture(context);
	}

	public ToggleButtonFixture toggleButton(String name) {
		ComponentContext context = getComponentContext()
				.createSubComponentContext("toggleButton", name);
		return new ToggleButtonFixture(context);
	}

	public ToolBarFixture toolBar() {
		ComponentContext context = getComponentContext()
				.createSubComponentContext("toolBar");
		return new ToolBarFixture(context);
	}

	public ToolBarFixture toolBar(String name) {
		ComponentContext context = getComponentContext()
				.createSubComponentContext("toolBar", name);
		return new ToolBarFixture(context);
	}

	public TreeFixture tree() {
		ComponentContext context = getComponentContext()
				.createSubComponentContext("tree");
		return new TreeFixture(context);
	}

	public TreeFixture tree(String name) {
		ComponentContext context = getComponentContext()
				.createSubComponentContext("tree", name);
		return new TreeFixture(context);
	}
}
