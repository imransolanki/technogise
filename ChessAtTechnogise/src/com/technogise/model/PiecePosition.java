package com.technogise.model;

import java.util.Objects;

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
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof PiecePosition)) {
			return false;
		}
		PiecePosition piecePosition = (PiecePosition) obj;
		return Objects.equals(row, piecePosition.row) && Objects.equals(column, piecePosition.column);
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(String.valueOf(this.row)).append(",").append(String.valueOf(this.column));
		return stringBuilder.toString();
	}
}
