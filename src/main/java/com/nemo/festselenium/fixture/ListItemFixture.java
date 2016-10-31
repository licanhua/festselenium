package com.nemo.festselenium.fixture;

import static com.nemo.festselenium.utils.FunctionStringHelper.createFunctionString;

/**
 * Control the JListItemFixture in selenium server side
 * 
 * @see org.fest.swing.fixture.JListItemFixture
 * 
 * @author CanHua Li
 * 
 */
public class ListItemFixture  extends ComponentFixture<ListItemFixture> {
	public ListItemFixture(ComponentContext context) {
		super(context);
	}

	public final String value() {
		String functionString = createFunctionString("value");
		return executeFunctionString(functionString);
	}
	
	ListItemFixture drag() {
		return executeFunctionReturnSelf("drag");
		
	}
	
	ListItemFixture drop() {
		return executeFunctionReturnSelf("drop");		
	}
	
	public int index(){
		String functionString = createFunctionString("index");
		return Integer.parseInt(executeFunctionString(functionString));
	}
	
	public ListItemFixture select(){
		return executeFunctionReturnSelf("select");
	}
}
