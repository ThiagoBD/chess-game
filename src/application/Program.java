package application;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        Scanner sc = new Scanner(System.in);
        while(true){
            UI.printBoard(chessMatch.getPiece());
            System.out.println();
            System.out.print("Source: ");
            ChessPosition source = UI.redChessPosition(sc);
            System.out.println();
            System.out.print("Target: ");
            ChessPosition target = UI.redChessPosition(sc);

            ChessPiece capturedPiece = chessMatch.performChessMove(source,target);
        }

    }
}
