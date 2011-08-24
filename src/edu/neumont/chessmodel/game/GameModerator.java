package edu.neumont.chessmodel.game;

import edu.neumont.chessmodel.finder.CheckFinder;
import edu.neumont.chessmodel.finder.DestinationFinder;
import edu.neumont.chessmodel.finder.EnPassantFinder;

public class GameModerator implements ChessBoardListener {

	private Player player1;
	private Player player2;
	private DestinationFinder destinationFinder;
	private CheckFinder checkFinder;
	private EnPassantFinder enPassantFinder;
	private ChessBoard board;
	
	private void initializeGame(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
		destinationFinder = new DestinationFinder();
		checkFinder = new CheckFinder();
		enPassantFinder = new EnPassantFinder();
		board = new ChessBoard();
		board.addChessBoardListener(this);
	}
	
	@Override
	public void pieceMoved(ChessBoard board) {
		validateCheck();
		validateAllDestinations();
		validateEnPassant();
	}
	
	private void validateCheck(){
		Destinations destinationsInCheck = checkFinder.find(board);
		// if the king is currently in check. ask the CheckMateFinder if the
		// player's king is in checkmate.
		
		// use the returned destinations to determine if the move is valid
	}
	
	private void validateAllDestinations(){
		Destinations allValidMoves = destinationFinder.find(board);
		// use the returned destinations to determine if the move is valid
	}
	
	private void validateEnPassant(){
		Destinations enPassantableLocations = enPassantFinder.find(board);
		// use the returned destinations to determine if the move is valid
	}
}
