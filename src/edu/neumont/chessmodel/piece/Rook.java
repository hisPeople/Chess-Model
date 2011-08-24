package edu.neumont.chessmodel.piece;

public class Rook extends ChessPiece{
	private static final int VALUE = 5;
	private static final PieceType TYPE = PieceType.ROOK;
	
	public Rook() {
		super(TYPE, VALUE);
	}
}