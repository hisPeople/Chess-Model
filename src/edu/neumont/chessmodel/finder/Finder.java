package edu.neumont.chessmodel.finder;

import edu.neumont.chessmodel.game.ChessBoard;
import edu.neumont.chessmodel.game.Destinations;

public interface Finder {
	Destinations find(ChessBoard board);
}
