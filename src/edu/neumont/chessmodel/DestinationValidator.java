package edu.neumont.chessmodel;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class DestinationValidator implements Validator, ChessBoardListener {

	private ChessBoard board;

	/**
	 * Determines the valid destinations for a given piece.
	 * @param ChessPiece piece
	 * @return ValidDestinations
	 */
	public ValidDestinations getValidDestinations(ChessPiece piece){
		throw new NotImplementedException();
	}

	@Override
	public void pieceMoved(ChessBoard board) {
		this.board = board;
	}

	@Override
	public void validate(ChessBoard board) {
		// TODO Auto-generated method stub
		
	}
}
