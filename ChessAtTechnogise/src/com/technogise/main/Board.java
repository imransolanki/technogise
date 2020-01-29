package com.technogise.main;

import com.technogise.model.Directions;
import com.technogise.model.Piece;
import com.technogise.model.PiecePosition;
import com.technogise.model.Rule;

public class Board {
	final int totalRows = 8;
	final int totalColumns = 8;
	final Integer[][] board = new Integer[totalRows][totalColumns];

	PiecePosition[] getPossibleMoves(Piece piece) {

		PiecePosition currentPosition = piece.getCurrentPosition();
		Rule rule = piece.getRule();
		Directions[] allowedDirections = rule.getDirections();
		final int allowedSteps = rule.getNumberOfAllowedSteps();

		for (Directions direction : allowedDirections) {

		}

		return null;
	}

	public String getVERTICAL_Up_Direction(Directions directions, int currentRow, int numberOfAllowedSteps) {
		StringBuilder output = new StringBuilder();
		for (int index = currentRow; currentRow <= totalRows; index = index + numberOfAllowedSteps) {
			output.append(currentRow).append(",").append(index);
		}
		return output.toString();
	}

}
