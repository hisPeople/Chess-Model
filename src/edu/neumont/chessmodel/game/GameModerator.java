package edu.neumont.chessmodel.game;

import edu.neumont.chessmodel.finder.CheckFinder;
import edu.neumont.chessmodel.finder.CheckMateFinder;
import edu.neumont.chessmodel.finder.DestinationFinder;
import edu.neumont.chessmodel.finder.EnPassantFinder;

public class GameModerator implements ChessBoardListener {

	private Player player1;
	private Player player2;
	private DestinationFinder destinationFinder;
	private CheckFinder checkFinder;
	private EnPassantFinder enPassantFinder;
	private CheckMateFinder checkMateFinder;
	private ChessBoard board;
	
	private void initializeGame(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
		destinationFinder = new DestinationFinder();
		checkFinder = new CheckFinder();
		enPassantFinder = new EnPassantFinder();
		checkMateFinder = new CheckMateFinder();
		board = new ChessBoard();
		board.addChessBoardListener(this);
	}
	
	@Override
	public void pieceMoved(ChessBoard board) {
		findDestinationsInCheck();
		findAllDestinations();
		findEnPassantDestinations();
	}
	
	private void findDestinationsInCheck(){
		Destinations destinationsInCheck = checkFinder.find(board);
		// if the king is currently in check. ask the CheckMateFinder if the
		// player's king is in checkmate.
		
		// use the returned destinations to determine if the move is valid
	}
	
	private void findAllDestinations(){
		Destinations allValidMoves = destinationFinder.find(board);
		// use the returned destinations to determine if the move is valid
	}
	
	private void findEnPassantDestinations(){
		Destinations enPassantableLocations = enPassantFinder.find(board);
		// use the returned destinations to determine if the move is valid
	}
	
	private void findDestinationsInCheckMate(){
		Destinations movesInCheckMate = checkMateFinder.find(board);
	}
}
