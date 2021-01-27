package com.kodilla.tictactoe;

import com.kodilla.tictactoeJava.Board;
import com.kodilla.tictactoeJava.CheckIfWin;
import com.kodilla.tictactoeJava.Field;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import java.util.LinkedList;
import java.util.List;

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

        com.kodilla.tictactoeJava.CheckIfWin checkIfWin = new CheckIfWin();
        List<Field> fieldList = new LinkedList<>();
        Board board = new Board(fieldList, checkIfWin);

        Field field0 = new Field("");
        Field field1 = new Field("");
        Field field2 = new Field("");
        Field field3 = new Field("");
        Field field4 = new Field("");
        Field field5 = new Field("");
        Field field6 = new Field("");
        Field field7 = new Field("");
        Field field8 = new Field("");

        fieldList.add(field0);
        fieldList.add(field1);
        fieldList.add(field2);
        fieldList.add(field3);
        fieldList.add(field4);
        fieldList.add(field5);
        fieldList.add(field6);
        fieldList.add(field7);
        fieldList.add(field8);

        Buttons buttons = new Buttons(board);

        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(backgroundImg, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setGridLinesVisible(false);
        grid.setVgap(35);
        grid.setHgap(60);
        grid.setBackground(background);

        buttons.createButtons(grid, primaryStage);

        Scene scene = new Scene(grid, 750, 750);
        primaryStage.setTitle("Tic Tac Toe game");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
