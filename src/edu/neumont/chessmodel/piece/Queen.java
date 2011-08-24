package edu.neumont.chessmodel.piece;

public class Queen extends ChessPiece{
	private static final int VALUE = 9;
	private static final PieceType TYPE = PieceType.QUEEN;
	
	public Queen() {
		super(TYPE, VALUE);
	}
}