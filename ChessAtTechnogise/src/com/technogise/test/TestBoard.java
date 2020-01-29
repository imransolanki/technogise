package com.technogise.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.technogise.main.Board;
import com.technogise.model.Piece;
import com.technogise.model.PiecePosition;
import com.technogise.model.PieceType;

public class TestBoard {

	@Test
	public void testKingMoves() {
		Board board = new Board();
		PiecePosition[] actual = board.getPossibleMoves(new Piece(PieceType.KING, new PiecePosition(4, 4)));
		PiecePosition expected = new PiecePosition(5, 5);
		assertEquals(expected.getRow(), actual[0].getRow());
		assertEquals(expected.getColumn(), actual[0].getColumn());
	}
}
