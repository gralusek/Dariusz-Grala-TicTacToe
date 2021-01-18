package com.kodilla.tictactoe;

import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static com.kodilla.tictactoe.CheckIfWin.checkIfWin;

public class MakeMove {

    public static void makeMove(List<Button> buttonList, Stage primaryStage, Font font, Button button0) {

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
}
