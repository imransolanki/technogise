package com.technogise.main;

import com.technogise.model.Directions;
import com.technogise.model.Piece;
import com.technogise.model.PiecePosition;
import com.technogise.model.Rule;

public class Board {
	final int totalRows = 8;
	final int totalColumns = 8;
	final Integer[][] board = new Integer[totalRows][totalColumns];

	public PiecePosition[] getPossibleMoves(Piece piece) {

		PiecePosition currentPosition = piece.getCurrentPosition();
		Rule rule = piece.getRule();
		PiecePosition[] allowedPositions = getPossiblePositions(rule,currentPosition);
		
//		PiecePosition currentPosition = piece.getCurrentPosition();
//		Rule rule = piece.getRule();
//		Directions[] allowedDirections = rule.getDirections();
//		final int allowedSteps = rule.getNumberOfAllowedSteps();
//
//		for (Directions direction : allowedDirections) {
//
//		}

		return allowedPositions;
	}

	private PiecePosition[] getPossiblePositions(Rule rule, PiecePosition currentPosition) {
		// TODO Auto-generated method stub
		int allowedRow = currentPosition.getRow() + rule.getNumberOfAllowedSteps();
		int allowedColumn =currentPosition.getColumn() + rule.getNumberOfAllowedSteps();
		PiecePosition allowedPosition = new PiecePosition(allowedRow, allowedColumn);
		PiecePosition[] allAllowedPositions = new PiecePosition[1];
		allAllowedPositions[0] = allowedPosition;
		return allAllowedPositions;
	}

	public String getVERTICAL_Up_Direction(Directions directions, int currentRow, int numberOfAllowedSteps) {
		StringBuilder output = new StringBuilder();
		for (int index = currentRow; currentRow <= totalRows; index = index + numberOfAllowedSteps) {
			output.append(currentRow).append(",").append(index);
		}
		return output.toString();
	}

}
