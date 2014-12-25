/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kz.kbtu.game2048.model;

import java.awt.Graphics;
import junit.framework.TestCase;

/**
 *
 * @author Asset
 */
public class GameTableTest extends TestCase {
	
	public GameTableTest(String testName) {
		super(testName);
	}
	
	/**
	 * Test of resetGame method, of class GameTable.
	 */
	public void testResetGame() {
		System.out.println("resetGame");
		GameTable instance = new GameTable();
		instance.resetGame();
	}

	/**
	 * Test of left method, of class GameTable.
	 */
	public void testLeft() {
		System.out.println("left");
		GameTable instance = new GameTable();
		instance.left();
	}

	/**
	 * Test of right method, of class GameTable.
	 */
	public void testRight() {
		System.out.println("right");
		GameTable instance = new GameTable();
		instance.right();
	}

	/**
	 * Test of up method, of class GameTable.
	 */
	public void testUp() {
		System.out.println("up");
		GameTable instance = new GameTable();
		instance.up();
	}

	/**
	 * Test of down method, of class GameTable.
	 */
	public void testDown() {
		System.out.println("down");
		GameTable instance = new GameTable();
		instance.down();
	}

	/**
	 * Test of canMove method, of class GameTable.
	 */
	public void testCanMove() {
		System.out.println("canMove");
		GameTable instance = new GameTable();
		boolean expResult = false;
		boolean result = instance.canMove();
	}

}
