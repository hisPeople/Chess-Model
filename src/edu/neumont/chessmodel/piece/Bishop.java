package edu.neumont.chessmodel.piece;

public class Bishop extends ChessPiece{
	private static final int VALUE = 3;
	private static final PieceType TYPE = PieceType.BISHOP;
	
	public Bishop() {
		super(TYPE, VALUE);
	}
}
