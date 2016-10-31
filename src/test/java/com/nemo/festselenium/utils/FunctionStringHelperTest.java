package com.nemo.festselenium.utils;

import static org.junit.Assert.*;

import org.junit.Test;

import com.nemo.festselenium.utils.FunctionStringHelper;

import static org.fest.assertions.Assertions.assertThat;

public class FunctionStringHelperTest extends FunctionStringHelper {

	@Test
	public void testJoin() {
		try {
			join(null);
			fail ("we expect NullPointerException");
		} catch (NullPointerException e) {}
		try {		
			join(new String[]{"",null});
			fail ("we expect NullPointerException");
		}catch (NullPointerException e) {}
		try {
			join(new Object[]{"", new FunctionStringHelperTest(), new Integer(10)});
		} catch (IllegalArgumentException e){};
		
		assertThat(join(new Object[] {new Integer(12)})).isEqualTo("12");
		assertThat(join(new Object[] {"12"})).isEqualTo("\"12\"");
		assertThat(join(new Object[] {"12", new Integer(12)})).isEqualTo("\"12\",12");
		assertThat(join(new Object[] {"12", "bc", new Integer(12)})).isEqualTo("\"12\",\"bc\",12");
	}

	@Test
	public void testCreateFunctionStringStringString() {
		assertThat(createFunctionString("button","OK")).isEqualTo("button(\"OK\")");
	}

	@Test
	public void testCreateFunctionStringStringStringString() {
		assertThat(createFunctionString("button","OK","FAIL")).isEqualTo("button(\"OK\",\"FAIL\")");
	}

	@Test
	public void testCreateFunctionStringString() {
		assertThat(createFunctionString("button")).isEqualTo("button()");

	}

	@Test
	public void testCreateFunctionStringStringInt() {
		assertThat(createFunctionString("button", 12)).isEqualTo("button(12)");
	}

	@Test
	public void testCreateFunctionStringStringIntInt() {
		assertThat(createFunctionString("button",13,14)).isEqualTo("button(13,14)");
	}

	@Test
	public void testCreateFunctionStringStringObjectArray() {
		assertThat(createFunctionString("button",
				new Object[] {"12", "bc", new Integer(12)})).
				isEqualTo("button([\"12\",\"bc\",12])");
	}

}
