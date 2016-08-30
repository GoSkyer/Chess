package chinesechess.game;

import chinesechess.board.ChineseBoardMap;
import chinesechess.board.ChineseChess;
import chinesechess.board.Groups;
import chinesechess.piece.JuPiece;
import org.ddd.board.BoardPoint;
import org.ddd.piece.impl.IPiece;

/**
 * Created by ddd on 16/8/26.
 */
public class Game {

    public static void main(String[] args) {

        ChineseChess game = new ChineseChess();

//        // 车(JU)移动测试
//        game.putPiece(new BoardPoint(1, 0), game.getPiece(new BoardPoint(0,0)));
//        game.putPiece(new BoardPoint(1, 3), game.getPiece(new BoardPoint(1,0)));
//        game.putPiece(new BoardPoint(6, 3), game.getPiece(new BoardPoint(1,3)));
//        game.putPiece(new BoardPoint(6, 2), game.getPiece(new BoardPoint(6,3)));

//        game.putPiece(new BoardPoint(4,0),game.getPiece(new BoardPoint(3,0)));
//        game.putPiece(new BoardPoint(5,0),game.getPiece(new BoardPoint(6,0)));
//        game.putPiece(new BoardPoint(4,0),game.getPiece(new BoardPoint(5,0)));
//        game.putPiece(new BoardPoint(4,1),game.getPiece(new BoardPoint(4,0)));

//        game.putPiece(new BoardPoint(0,5),game.getPiece(new BoardPoint(0,4)));

        game.putPiece(new BoardPoint(2,4),game.getPiece(new BoardPoint(2,1)));
        game.putPiece(new BoardPoint(6,4),game.getPiece(new BoardPoint(2,4)));
        game.putPiece(new BoardPoint(7,4),game.getPiece(new BoardPoint(6,4)));

        game.view();

    }

}
