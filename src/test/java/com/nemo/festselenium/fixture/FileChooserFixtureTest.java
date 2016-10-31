package com.nemo.festselenium.fixture;

import static org.fest.assertions.Assertions.assertThat;
import org.junit.Before;
import org.junit.Test;

import com.nemo.festselenium.fixture.ButtonFixture;
import com.nemo.festselenium.fixture.ComponentFixture;
import com.nemo.festselenium.fixture.FileChooserFixture;
import com.nemo.festselenium.fixture.TextComponentFixture;

public class FileChooserFixtureTest extends ComponentFixture_TestCaseBase {

	private FileChooserFixture componentFixture;

	@Before
	public void setUp() throws Exception {
		componentFixture = new FileChooserFixture(context);	
	}

	@Test
	public void testApprove() {
		componentFixture.approve();
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("approve()"));
	}

	@Test
	public void testApproveButton() {
		ButtonFixture b = componentFixture.approveButton();
		assertThat(b.getComponentContext().getComponentQueryString()).isEqualTo(
				createQueryString("approveButton()"));
	}

	@Test
	public void testCancel() {
		componentFixture.cancel();
		assertThat(selenium.lastCommandResult()).isEqualTo(
				createQueryString("cancel()"));
	}

	@Test
	public void testCancelButton() {
		ButtonFixture b = componentFixture.cancelButton();
		assertThat(b.getComponentContext().getComponentQueryString()).isEqualTo(
				createQueryString("cancelButton()"));
	}

	@Test
	public void testFileNameTextBox() {
		TextComponentFixture b=componentFixture.fileNameTextBox();
		assertThat(b.getComponentContext().getComponentQueryString()).isEqualTo(
				createQueryString("fileNameTextBox()"));
	}

	@Test
	public void testSelectFile() {
		assertThatReturnsSelf(componentFixture.selectFile("are"));
		assertThat(selenium.lastCommandResult()).contains(
				createQueryString("selectFile(file)")).
				contains("var file=").contains("createFile(\"are\"");
	}

	@Test
	public void testSelectFiles() {
		assertThatReturnsSelf(componentFixture.selectFiles(new String[]{"are","OK"}));
		assertThat(selenium.lastCommandResult()).contains(
				createQueryString("selectFiles(files)")).
				contains("var files=").contains("getTestFixture().createFiles([\"are\",\"OK\"]");
	}

	@Test
	public void testSetCurrentDirectory() {
		assertThatReturnsSelf(componentFixture.setCurrentDirectory("are"));
		assertThat(selenium.lastCommandResult()).contains(createQueryString("setCurrentDirectory(dir)")).
				contains("getTestFixture().createFile(\"are\")").
				contains("var dir=");
	}

	@Override
	ComponentFixture<?> fixture() {
		// TODO Auto-generated method stub
		return componentFixture;
	}

}
