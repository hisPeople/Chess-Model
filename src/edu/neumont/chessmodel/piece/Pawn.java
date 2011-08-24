package edu.neumont.chessmodel.piece;

public class Pawn extends ChessPiece{
	private static final int VALUE = 1;
	private static final PieceType TYPE = PieceType.PAWN;
	
	public Pawn(){
		super(TYPE, VALUE);
	}
}
