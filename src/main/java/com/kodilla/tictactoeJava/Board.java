package com.kodilla.tictactoeJava;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Board {

    private List<Field> fieldList;

    public List<Field> getFieldList() {
        return fieldList;
    }

    private CheckIfWin checkIfWin;

    public Board(List<Field> fieldList, CheckIfWin checkIfWin) {
        this.fieldList = fieldList;
        this.checkIfWin = checkIfWin;
    }

    public String makeMove(int index) {

        Field field = fieldList.get(index);

        field.setSign("X");

        List<Integer> emptyIndexes = new LinkedList<>();
        for (int i = 0; i < fieldList.size(); i++) {
            if (fieldList.get(i).getSign().equals("")) {
                emptyIndexes.add(i);
            }
        }

        String result = checkIfWin.checkIfWin(fieldList);

        if (result.equals("User win") || result.equals("Computer win")) {
            return result;
        } else if (result.equals("Draw") && emptyIndexes.size() == 0) {
            return result;
        }

        Collections.shuffle(emptyIndexes);
        int compMove = emptyIndexes.get(0);
        Field compMoveField = fieldList.get(compMove);
        compMoveField.setSign("O");

        return "Continue";
    }
}
