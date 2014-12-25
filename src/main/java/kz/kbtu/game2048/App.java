package kz.kbtu.game2048;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import kz.kbtu.game2048.model.GameTable;

/**
 *
 * @author Sanzhar
 */
public class App {

    public static void main(String[] args) {
        JFrame game = new JFrame();
        game.setTitle("2048 Game");
        game.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        game.setSize(370, 515);
//        game.setSize(340, 400);
        game.setResizable(false);

        game.add(new GameTable());

        game.setLocationRelativeTo(null);
        game.setVisible(true);
    }
}
