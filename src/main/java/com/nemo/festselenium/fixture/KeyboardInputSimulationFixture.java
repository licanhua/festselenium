package com.nemo.festselenium.fixture;

import com.nemo.festselenium.core.KeyPressInfo;

public interface KeyboardInputSimulationFixture {

	/**
	 * Origine from KeyboardInputSimulationFixture in fest swing
	 * 
	 * Simulates a user pressing and releasing the given keys on this fixture's GUI component.
	 * @param keyCodes one or more codes of the keys to press.
	 * @return this fixture.
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 * @see java.awt.event.KeyEvent
	 */
	public abstract KeyboardInputSimulationFixture pressAndReleaseKeys(int... keyCodes);

	/**
	 * Origine from KeyboardInputSimulationFixture in fest swing
	 * 
	 * Simulates a user pressing given key on this fixture's GUI component.
	 * @param keyCode the code of the key to press.
	 * @return this fixture.
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 * @see java.awt.event.KeyEvent
	 */
	public abstract KeyboardInputSimulationFixture pressKey(int keyCode);

	/**
	 * Origine from KeyboardInputSimulationFixture in fest swing
	 * 
	 * Simulates a user pressing given key with the given modifiers on this fixture's GUI component.
	 * Modifiers is a mask from the available <code>{@link java.awt.event.InputEvent}</code> masks.
	 * <p>
	 * The following code listing shows how to press 'CTRL' + 'C' in a platform-safe way:
	 * <pre>
	 * JTextComponentFixture textBox = dialog.textBox(&quot;username&quot;);
	 * textBox.selectAll()
	 *        .pressAndReleaseKey(key(<code>{@link KeyEvent#VK_C VK_C}</code>).modifiers({@link Platform#controlOrCommandMask() controlOrCommandMask}()));
	 * </pre>
	 * </p>
	 * @param keyPressInfo specifies the key and modifiers to press.
	 * @return this fixture.
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 */
	public abstract KeyboardInputSimulationFixture pressAndReleaseKey(KeyPressInfo keyPressInfo);

	/**
	 * Origine from KeyboardInputSimulationFixture in fest swing
	 * 
	 * Simulates a user releasing the given key on this fixture's GUI component.
	 * @param keyCode the code of the key to release.
	 * @return this fixture.
	 * @throws SeleniumException thrown by Selemium framework if selenium communication failed
	 * @throws SeleniumException thrown by Selemium framework if fest side throw exception
	 * @see java.awt.event.KeyEvent
	 */
	public abstract KeyboardInputSimulationFixture releaseKey(int keyCode);

}