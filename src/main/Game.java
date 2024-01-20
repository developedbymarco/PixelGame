package main;

public class Game {

    private GamePanel gamePanel;
    private GameWindow gameWindow;
    // Main Method
    public Game() {
        gamePanel = new GamePanel();
        gameWindow = new GameWindow(gamePanel);
        gamePanel.requestFocus();

    }

}
