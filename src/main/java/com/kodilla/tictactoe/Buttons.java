package com.kodilla.tictactoe;

import com.kodilla.tictactoeJava.Board;
import com.kodilla.tictactoeJava.Field;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.LinkedList;
import java.util.List;

public class Buttons {

    private Board board;

    public Buttons(Board board) {
        this.board = board;
    }
    
    public void move(int index, Stage primaryStage, List <Button> buttonList) {
        String result = board.makeMove(index);
        draw(board.getFieldList(), buttonList);
        ResultBox.display(primaryStage, result);
    }

    public void draw(List <Field>fieldList, List <Button> buttonList) {

        int n = 0;
        while (n < 9) {
            String sign = fieldList.get(n).getSign();
            buttonList.get(n).setText(sign);
            if (!sign.equals("")) {
                buttonList.get(n).setDisable(true);
            }
            n++;
        }
    }

    public void createButtons(GridPane grid, Stage primaryStage) {

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

        buttonList.forEach(e -> e.setFont(font));

        button0.setOnMouseClicked(e -> move(0, primaryStage, buttonList));
        button1.setOnMouseClicked(e -> move(1, primaryStage, buttonList));
        button2.setOnMouseClicked(e -> move(2, primaryStage, buttonList));
        button3.setOnMouseClicked(e -> move(3, primaryStage, buttonList));
        button4.setOnMouseClicked(e -> move(4, primaryStage, buttonList));
        button5.setOnMouseClicked(e -> move(5, primaryStage, buttonList));
        button6.setOnMouseClicked(e -> move(6, primaryStage, buttonList));
        button7.setOnMouseClicked(e -> move(7, primaryStage, buttonList));
        button8.setOnMouseClicked(e -> move(8, primaryStage, buttonList));

/*        button0.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                makeMove.makeMove(buttonList, primaryStage,font, button0);
            }
        });

        button1.setOnMouseClicked(event -> makeMove.makeMove(buttonList, primaryStage,font, button1));
        button2.setOnMouseClicked(e -> makeMove.makeMove(buttonList, primaryStage,font, button2));
        button3.setOnMouseClicked(e -> makeMove.makeMove(buttonList, primaryStage,font, button3));
        button4.setOnMouseClicked(e -> makeMove.makeMove(buttonList, primaryStage,font, button4));
        button5.setOnMouseClicked(e -> makeMove.makeMove(buttonList, primaryStage,font, button5));
        button6.setOnMouseClicked(e -> makeMove.makeMove(buttonList, primaryStage,font, button6));
        button7.setOnMouseClicked(e -> makeMove.makeMove(buttonList, primaryStage,font, button7));
        button8.setOnMouseClicked(e -> makeMove.makeMove(buttonList, primaryStage,font, button8));*/

    }
}
