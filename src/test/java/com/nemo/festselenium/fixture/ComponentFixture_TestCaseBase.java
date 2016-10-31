package com.nemo.festselenium.fixture;

import static org.fest.assertions.Assertions.assertThat;

import com.nemo.festselenium.fixture.ComponentContext;
import com.nemo.festselenium.fixture.ComponentFixture;

public abstract class ComponentFixture_TestCaseBase {
	  String prefix = "window.document.getElementById('checkbox_applet')";
	  EchoSelenium selenium = new EchoSelenium();
	  ComponentContext context = new  ComponentContext(selenium, prefix, prefix+".getTestFixture().component()");
	  final void assertThatReturnsSelf(Object result) {
		    assertThat(result).isSameAs(fixture());
	  }
	  
	  final String createQueryString (String functionString) {
		  return fixture().getComponentContext().createQueryStringComponentAsPrefix(functionString);
	  }
	  abstract ComponentFixture<?> fixture ();
}
