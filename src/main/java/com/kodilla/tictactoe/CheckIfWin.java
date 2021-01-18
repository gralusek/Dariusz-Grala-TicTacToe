package com.kodilla.tictactoe;

import javafx.scene.control.Button;

import java.util.List;

public class CheckIfWin {

    public static String checkIfWin(List<Button> buttonList) {

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
}
