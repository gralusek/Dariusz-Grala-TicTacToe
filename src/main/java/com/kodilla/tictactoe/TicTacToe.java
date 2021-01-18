package com.kodilla.tictactoe;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.util.LinkedList;
import java.util.List;

import static com.kodilla.tictactoe.MakeMove.makeMove;

public class TicTacToe extends Application{

    private static Image backgroundImg = new Image("file:src/main/resources/base.png");

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        startGame(primaryStage);

    }

    public static void startGame(Stage primaryStage) {

        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(backgroundImg, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setGridLinesVisible(false);
        grid.setVgap(35);
        grid.setHgap(60);
        grid.setBackground(background);

        Font font = new Font(80);

        Buttons.createButtons(grid, primaryStage, font);

        Scene scene = new Scene(grid, 750, 750);
        primaryStage.setTitle("Tic Tac Toe game");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
