package com.technogise.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.technogise.model.Board;
import com.technogise.model.Piece;
import com.technogise.model.PiecePosition;
import com.technogise.model.PieceType;

public class TestBoard {

	@Test
	public void testKingMovesAtBoundry_D1_0R_0C() {
		Board board = new Board();
		PiecePosition[] actual = board.getPossibleMoves(new Piece(PieceType.KING, new PiecePosition(0, 0)));
//		0,0
//		0,1
//		1,0
//		1,1

		PiecePosition[] expected = new PiecePosition[4];
		expected[0] = new PiecePosition(0, 0);
		expected[1] = new PiecePosition(0, 1);
		expected[2] = new PiecePosition(1, 0);
		expected[3] = new PiecePosition(1, 1);
		assertArrayEquals(expected, actual);
	}

	@Test
	public void testKingMovesAtD5_4R_3C() {
		Board board = new Board();
		PiecePosition[] actual = board.getPossibleMoves(new Piece(PieceType.KING, new PiecePosition(4, 3)));
//		3,2
//		3,3
//		3,4
//		4,2
//		4,3
//		4,4
//		5,2
//		5,3
//		5,4

		PiecePosition[] expected = new PiecePosition[9];
		expected[0] = new PiecePosition(3, 2);
		expected[1] = new PiecePosition(3, 3);
		expected[2] = new PiecePosition(3, 4);
		expected[3] = new PiecePosition(4, 2);
		expected[4] = new PiecePosition(4, 3);
		expected[5] = new PiecePosition(4, 4);
		expected[6] = new PiecePosition(5, 2);
		expected[7] = new PiecePosition(5, 3);
		expected[8] = new PiecePosition(5, 4);
		
		assertArrayEquals(expected, actual);
	}

}
