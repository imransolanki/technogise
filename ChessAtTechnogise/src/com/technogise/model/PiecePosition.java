package com.technogise.model;

public class PiecePosition {
	int row, column;

	public PiecePosition(int row, int column) {
		this.row = row;
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(String.valueOf(this.row)).append(",").append(String.valueOf(this.column));
		return stringBuilder.toString();
	}
}
