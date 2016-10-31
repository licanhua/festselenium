package com.nemo.festselenium.core;
/**
 * 
* @author Can Hua Li
* @see org.fest.swing.core.KeyPressInfo
*/
public final class KeyPressInfo {

	  private final int keyCode;
	  private int modifier;

	  /**
	   * Specifies the code of the key to press, and the modifier 
	   * @param keyCode the code of the key to press.
	   * @return the created <code>KeyPressInfo</code>.
	   */
	  public KeyPressInfo (int keyCode, int modifier) {
	    this.keyCode = keyCode;
	    this.modifier = modifier;
	  }


	  /**
	   * Returns the code of the key to press.
	   * @return the code of the key to press.
	   */
	  public int keyCode() { return keyCode; }

	  /**
	   * Returns the modifier to use when pressing. 
	   * @return the modifier to use.
	   */
	  public int modifier() {
	    return modifier;
	  }


	}