/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kz.kbtu.game2048.model;

import java.awt.Color;
import junit.framework.TestCase;

/**
 *
 * @author Asset
 */
public class GameTileTest extends TestCase {
	
	public GameTileTest(String testName) {
		super(testName);
	}

	/**
	 * Test of isEmpty method, of class GameTile.
	 */
	public void testIsEmpty() {
		System.out.println("isEmpty");
		GameTile instance = new GameTile();
		boolean expResult = true;
		boolean result = instance.isEmpty();
		assertEquals(expResult, result);
	}

	/**
	 * Test of getForeground method, of class GameTile.
	 */
	public void testGetForeground() {
		System.out.println("getForeground");
		GameTile instance = new GameTile();
		instance.value = 15;
		Color expResult = new Color(0x776e65);
		Color result = instance.getForeground();
		assertEquals(expResult, result);
		
		instance = new GameTile();
		instance.value = 17;
		expResult = new Color(0xf9f6f2);
		result = instance.getForeground();
		assertEquals(expResult, result);
	}

	/**
	 * Test of getBackground method, of class GameTile.
	 */
	public void testGetBackground() {
		System.out.println("getBackground");
		GameTile instance = new GameTile();
		Color expResult = null;
		Color result = instance.getBackground();
		
		instance = new GameTile();
		instance.value = 2;
		expResult = new Color(0xeee4da);
		result = instance.getBackground();
		assertEquals(expResult, result);
		
		instance = new GameTile();
		instance.value = 4;
		expResult = new Color(0xede0c8);
		result = instance.getBackground();
		assertEquals(expResult, result);
		
		instance = new GameTile();
		instance.value = 8;
		expResult = new Color(0xf2b179);
		result = instance.getBackground();
		assertEquals(expResult, result);
		
		instance = new GameTile();
		instance.value = 16;
		expResult = new Color(0xf59563);
		result = instance.getBackground();
		assertEquals(expResult, result);
		
		instance = new GameTile();
		instance.value = 32;
		expResult = new Color(0xf67c5f);
		result = instance.getBackground();
		assertEquals(expResult, result);
		
		instance = new GameTile();
		instance.value = 64;
		expResult = new Color(0xf65e3b);
		result = instance.getBackground();
		assertEquals(expResult, result);
		
		instance = new GameTile();
		instance.value = 128;
		expResult = new Color(0xedcf72);
		result = instance.getBackground();
		assertEquals(expResult, result);
		
		instance = new GameTile();
		instance.value = 256;
		expResult = new Color(0xedcc61);
		result = instance.getBackground();
		assertEquals(expResult, result);
		
		instance = new GameTile();
		instance.value = 512;
		expResult = new Color(0xedc850);
		result = instance.getBackground();
		assertEquals(expResult, result);
		
		instance = new GameTile();
		instance.value = 1024;
		expResult = new Color(0xedc53f);
		result = instance.getBackground();
		assertEquals(expResult, result);
		
		instance = new GameTile();
		instance.value = 2048;
		expResult = new Color(0xedc22e);
		result = instance.getBackground();
		assertEquals(expResult, result);
	}
	
}
