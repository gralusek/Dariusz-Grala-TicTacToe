package com.kodilla.tictactoe;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ResultBox {

    public static void display(Stage primaryStage, String result) {
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Result");
        window.setMinWidth(300);

        Label label = new Label();
        Button resetButton = new Button("Start again");
        Button quitButton = new Button("Quit game");
        Button closeButton = new Button("Close this window");
        Button resultButton = new Button(result);
        quitButton.setOnAction(e -> System.exit(0));
        closeButton.setOnAction(e -> window.close());
        resetButton.setOnAction(e -> {
            TicTacToe.startGame(primaryStage);
            window.close();
        });

        VBox layout = new VBox(50);
        layout.getChildren().addAll(label, resultButton, resetButton, quitButton, closeButton);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();

    }
}
