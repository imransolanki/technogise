package com.technogise.main;

import com.technogise.model.Board;
import com.technogise.model.Piece;
import com.technogise.model.PiecePosition;
import com.technogise.model.PieceType;

public class MainApplication {
	public static void main(String[] args) {
		Board board = new Board();
		PiecePosition[] moves = board.getPossibleMoves(new Piece(PieceType.KING, new PiecePosition(4, 3)));
		for (PiecePosition position : moves) {
			System.out.println(position);
		}
	}
}
