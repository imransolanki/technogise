package com.technogise.model;

public class Piece {
	PieceType type;
	PiecePosition currentPosition;
	Rule rule;
	
	public Piece(PieceType type, PiecePosition currentPosition) {
		super();
		this.type = type;
		this.currentPosition = currentPosition;
		calculateRule();
	}

	public PieceType getType() {
		return type;
	}

	public PiecePosition getCurrentPosition() {
		return currentPosition;
	}
	
	public Rule getRule() {
		return rule;
	}
	
	private void calculateRule() {
		switch (type) {
		case KING:
			rule = getRuleFor(type);
			break;
		case BISHOP:
			break;
		case HORSE:
			break;
		case PAWN:
			break;
		case QUEEN:
			break;
		case ROOK:
			break;
		default:// Raise exception
			break;
		}
	}

	private Rule getRuleFor(PieceType pieceType) {
		//TODO - re factor and move it to factory(maybe)
		Rule rule = null;
		switch (pieceType) {
		case KING:
			rule = new Rule(1,
					new Directions[] { 
							Directions.DIAGONAL_DOWN, Directions.DIAGONAL_UP,
							Directions.HORIZONTAL, Directions.HORIZONTAL_LEFT, Directions.HORIZONTAL_RIGHT,
							Directions.VERTICAL, Directions.VERTICAL_LEFT,Directions.VERTICAL_RIGHT });
		}
		return rule;
	}

	
}
