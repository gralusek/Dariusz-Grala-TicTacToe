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
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TicTacToe extends Application {

    private static Image backgroundImg = new Image("file:src/main/resources/base.png");

    public static void main(String[] args) {
        launch(args);
    }

    public static String checkIfWin(List <Button> buttonList) {

        if (buttonList.get(0).getText().equals("X") && buttonList.get(1).getText().equals("X") &&
                buttonList.get(2).getText().equals("X")) {
            return "User win";
        } else if (buttonList.get(3).getText().equals("X") && buttonList.get(4).getText().equals("X") &&
                buttonList.get(5).getText().equals("X")) {
            return "User win";
        } else if (buttonList.get(6).getText().equals("X") && buttonList.get(7).getText().equals("X") &&
                buttonList.get(8).getText().equals("X")) {
            return "User win";
        } else if (buttonList.get(0).getText().equals("X") && buttonList.get(3).getText().equals("X") &&
                buttonList.get(6).getText().equals("X")) {
            return "User win";
        } else if (buttonList.get(1).getText().equals("X") && buttonList.get(4).getText().equals("X") &&
                buttonList.get(7).getText().equals("X")) {
            return "User win";
        } else if (buttonList.get(2).getText().equals("X") && buttonList.get(5).getText().equals("X") &&
                buttonList.get(8).getText().equals("X")) {
            return "User win";
        } else if (buttonList.get(0).getText().equals("X") && buttonList.get(4).getText().equals("X") &&
                buttonList.get(8).getText().equals("X")) {
            return "User win";
        } else if (buttonList.get(2).getText().equals("X") && buttonList.get(4).getText().equals("X") &&
                buttonList.get(6).getText().equals("X")) {
            return "User win";
        } else if (buttonList.get(0).getText().equals("O") && buttonList.get(1).getText().equals("O") &&
                buttonList.get(2).getText().equals("O")) {
            return "Computer win";
        } else if (buttonList.get(3).getText().equals("O") && buttonList.get(4).getText().equals("O") &&
                buttonList.get(5).getText().equals("O")) {
            return "Computer win";
        } else if (buttonList.get(6).getText().equals("O") && buttonList.get(7).getText().equals("O") &&
                buttonList.get(8).getText().equals("O")) {
            return "Computer win";
        } else if (buttonList.get(0).getText().equals("O") && buttonList.get(3).getText().equals("O") &&
                buttonList.get(6).getText().equals("O")) {
            return "Computer win";
        } else if (buttonList.get(1).getText().equals("O") && buttonList.get(4).getText().equals("O") &&
                buttonList.get(7).getText().equals("O")) {
            return "Computer win";
        } else if (buttonList.get(2).getText().equals("O") && buttonList.get(5).getText().equals("O") &&
                buttonList.get(8).getText().equals("O")) {
            return "Computer win";
        } else if (buttonList.get(0).getText().equals("O") && buttonList.get(4).getText().equals("O") &&
                buttonList.get(8).getText().equals("O")) {
            return "Computer win";
        } else if (buttonList.get(2).getText().equals("O") && buttonList.get(4).getText().equals("O") &&
                buttonList.get(6).getText().equals("O")) {
            return "Computer win";
        } else {
            return "Draw";
        }
    }

    public static void makeMove(List <Button> buttonList, Stage primaryStage,Font font, Button button0) {

        button0.setText("X");
        button0.setFont(font);

        List<Integer> emptyIndexes = new LinkedList<>();
        for (int i = 0; i < buttonList.size(); i++) {
            if (buttonList.get(i).getText().equals("")) {
                emptyIndexes.add(i);
            }
        }

        String result = checkIfWin(buttonList);
        System.out.println(result);

        if (result.equals("User win") || result.equals("Computer win")) {
            ResultBox.display(primaryStage, result);
        } else if (result.equals("Draw") && emptyIndexes.size() == 0) {
            ResultBox.display(primaryStage, result);
        }

        Collections.shuffle(emptyIndexes);
        int compMove = emptyIndexes.get(0);
        Button compMoveButton = buttonList.get(compMove);
        compMoveButton.setFont(font);
        compMoveButton.setText("O");
        button0.setDisable(true);
        compMoveButton.setDisable(true);
        System.out.println(compMoveButton);

    }

    @Override
    public void start(Stage primaryStage) {

        startGame(primaryStage);

    }

    public static void startGame(Stage primaryStage) {
        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true,true, false);
        BackgroundImage backgroundImage = new BackgroundImage(backgroundImg, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,backgroundSize);
        Background background = new Background(backgroundImage);

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setGridLinesVisible(false);
        grid.setVgap(35);
        grid.setHgap(60);
        grid.setBackground(background);

        Button button0 = new Button();
        Button button1 = new Button();
        Button button2 = new Button();
        Button button3 = new Button();
        Button button4 = new Button();
        Button button5 = new Button();
        Button button6 = new Button();
        Button button7 = new Button();
        Button button8 = new Button();

        button0.setMinSize(200, 200);
        button1.setMinSize(200, 200);
        button2.setMinSize(200, 200);
        button3.setMinSize(200, 200);
        button4.setMinSize(200, 200);
        button5.setMinSize(200, 200);
        button6.setMinSize(200, 200);
        button7.setMinSize(200, 200);
        button8.setMinSize(200, 200);

        GridPane.setConstraints(button1, 1, 0);
        GridPane.setConstraints(button2, 2, 0);
        GridPane.setConstraints(button3, 0, 1);
        GridPane.setConstraints(button4, 1, 1);
        GridPane.setConstraints(button5, 2, 1);
        GridPane.setConstraints(button6, 0, 2);
        GridPane.setConstraints(button7, 1, 2);
        GridPane.setConstraints(button8, 2, 2);
        grid.getChildren().addAll(button0, button1, button2, button3, button4, button5, button6,button7,button8);

        List<Button> buttonList= new LinkedList<>();
        buttonList.add(button0);
        buttonList.add(button1);
        buttonList.add(button2);
        buttonList.add(button3);
        buttonList.add(button4);
        buttonList.add(button5);
        buttonList.add(button6);
        buttonList.add(button7);
        buttonList.add(button8);

        Font font = new Font(80);

        button0.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                makeMove(buttonList, primaryStage,font, button0);
            }
        });

        button1.setOnMouseClicked(event -> makeMove(buttonList, primaryStage,font, button1));
        button2.setOnMouseClicked(e -> makeMove(buttonList, primaryStage,font, button2));
        button3.setOnMouseClicked(e -> makeMove(buttonList, primaryStage,font, button3));
        button4.setOnMouseClicked(e -> makeMove(buttonList, primaryStage,font, button4));
        button5.setOnMouseClicked(e -> makeMove(buttonList, primaryStage,font, button5));
        button6.setOnMouseClicked(e -> makeMove(buttonList, primaryStage,font, button6));
        button7.setOnMouseClicked(e -> makeMove(buttonList, primaryStage,font, button7));
        button8.setOnMouseClicked(e -> makeMove(buttonList, primaryStage,font, button8));

        Scene scene = new Scene(grid, 750, 750);
        primaryStage.setTitle("Tic Tac Toe game");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
