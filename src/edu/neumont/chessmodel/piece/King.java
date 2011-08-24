package edu.neumont.chessmodel.piece;

public class King extends ChessPiece{
	private static final int VALUE = 10000;
	private static final PieceType TYPE = PieceType.KING;
	
	public King() {
		super(TYPE, VALUE);
	}
}