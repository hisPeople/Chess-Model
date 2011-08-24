package edu.neumont.chessmodel.piece;

public abstract class ChessPiece {

	private PieceType type;
	private int value;
	
	public ChessPiece(PieceType type, int value) {
		this.type = type;
		this.value = value;
	}
	
	public PieceType getType() {
		return type;
	}
	
	public int getValue() {
		return value;
	}
}
