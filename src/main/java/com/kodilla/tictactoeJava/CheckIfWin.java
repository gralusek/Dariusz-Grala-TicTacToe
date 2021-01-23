package com.kodilla.tictactoeJava;

import java.util.List;

public class CheckIfWin {

    public String checkIfWin(List<Field> fieldList) {

        if (fieldList.get(0).getSign().equals("X") && fieldList.get(1).getSign().equals("X") &&
                fieldList.get(2).getSign().equals("X")) {
            return "User win";
        } else if (fieldList.get(3).getSign().equals("X") && fieldList.get(4).getSign().equals("X") &&
                fieldList.get(5).getSign().equals("X")) {
            return "User win";
        } else if (fieldList.get(6).getSign().equals("X") && fieldList.get(7).getSign().equals("X") &&
                fieldList.get(8).getSign().equals("X")) {
            return "User win";
        } else if (fieldList.get(0).getSign().equals("X") && fieldList.get(3).getSign().equals("X") &&
                fieldList.get(6).getSign().equals("X")) {
            return "User win";
        } else if (fieldList.get(1).getSign().equals("X") && fieldList.get(4).getSign().equals("X") &&
                fieldList.get(7).getSign().equals("X")) {
            return "User win";
        } else if (fieldList.get(2).getSign().equals("X") && fieldList.get(5).getSign().equals("X") &&
                fieldList.get(8).getSign().equals("X")) {
            return "User win";
        } else if (fieldList.get(0).getSign().equals("X") && fieldList.get(4).getSign().equals("X") &&
                fieldList.get(8).getSign().equals("X")) {
            return "User win";
        } else if (fieldList.get(2).getSign().equals("X") && fieldList.get(4).getSign().equals("X") &&
                fieldList.get(6).getSign().equals("X")) {
            return "User win";
        } else if (fieldList.get(0).getSign().equals("O") && fieldList.get(1).getSign().equals("O") &&
                fieldList.get(2).getSign().equals("O")) {
            return "Computer win";
        } else if (fieldList.get(3).getSign().equals("O") && fieldList.get(4).getSign().equals("O") &&
                fieldList.get(5).getSign().equals("O")) {
            return "Computer win";
        } else if (fieldList.get(6).getSign().equals("O") && fieldList.get(7).getSign().equals("O") &&
                fieldList.get(8).getSign().equals("O")) {
            return "Computer win";
        } else if (fieldList.get(0).getSign().equals("O") && fieldList.get(3).getSign().equals("O") &&
                fieldList.get(6).getSign().equals("O")) {
            return "Computer win";
        } else if (fieldList.get(1).getSign().equals("O") && fieldList.get(4).getSign().equals("O") &&
                fieldList.get(7).getSign().equals("O")) {
            return "Computer win";
        } else if (fieldList.get(2).getSign().equals("O") && fieldList.get(5).getSign().equals("O") &&
                fieldList.get(8).getSign().equals("O")) {
            return "Computer win";
        } else if (fieldList.get(0).getSign().equals("O") && fieldList.get(4).getSign().equals("O") &&
                fieldList.get(8).getSign().equals("O")) {
            return "Computer win";
        } else if (fieldList.get(2).getSign().equals("O") && fieldList.get(4).getSign().equals("O") &&
                fieldList.get(6).getSign().equals("O")) {
            return "Computer win";
        } else {
            return "Draw";
        }
    }
}
