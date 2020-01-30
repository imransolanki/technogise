package com.technogise.model;

import java.util.ArrayList;

import com.technogise.model.Piece;
import com.technogise.model.PiecePosition;
import com.technogise.model.Rule;

public class Board {
	static final int TOTAL_ROWS = 8;
	static final int TOTAL_COLUMNS = 8;
	final Integer[][] board = new Integer[TOTAL_ROWS][TOTAL_COLUMNS];

	public PiecePosition[] getPossibleMoves(Piece piece) {

		PiecePosition currentPosition = piece.getCurrentPosition();
		Rule rule = piece.getRule();
		PiecePosition[] allowedPositions = getPossiblePositionsForKing1(rule, currentPosition);

		return allowedPositions;
	}

	private PiecePosition[] getPossiblePositionsForKing1(Rule rule, PiecePosition currentPosition) {
		int distanceAway = rule.getNumberOfAllowedSteps();
		int currentRowOfKing = currentPosition.getRow();
		int currentColumnOfKing = currentPosition.getColumn();

		ArrayList<PiecePosition> list = new ArrayList<>();

		for (int row = 0; row < TOTAL_ROWS; row++) {
			for (int column = 0; column < TOTAL_COLUMNS; column++) {
				// Check if position (i, j) is
				// at a distance <= distanceAway units
				// from king's current position
				if (Math.max(Math.abs(row - currentRowOfKing), Math.abs(column - currentColumnOfKing)) <= distanceAway)
					list.add(new PiecePosition(row, column));
			}
		}
		return list.toArray(new PiecePosition[list.size()]);
	}

}
