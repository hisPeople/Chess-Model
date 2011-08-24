package edu.neumont.chessmodel;

public class GameModerator implements ChessBoardListener {

	private Player player1;
	private Player player2;
	private DestinationValidator destinationValidator;
	private CheckValidator specialCaseValidator;
	private ChessBoard board;
	
	private void initializeGame(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
		destinationValidator = new DestinationValidator();
		specialCaseValidator = new CheckValidator();
		board = new ChessBoard();
		board.addChessBoardListener(this);
		board.addChessBoardListener(destinationValidator);
		board.addChessBoardListener(specialCaseValidator);
	}
	
	@Override
	public void pieceMoved(ChessBoard board) {
		// TODO Auto-generated method stub
	}
}
