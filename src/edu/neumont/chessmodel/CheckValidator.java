package edu.neumont.chessmodel;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class CheckValidator implements Validator, ChessBoardListener {

	@Override
	public void pieceMoved(ChessBoard board) {
		throw new NotImplementedException();
	}

	@Override
	public void validate(ChessBoard board) {
		throw new NotImplementedException();
	}
}
