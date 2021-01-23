package com.kodilla.tictactoeJava;

import org.junit.jupiter.api.*;
import java.util.LinkedList;
import java.util.List;

@DisplayName ("Board Test Suite")
class BoardTestSuite {

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("The tests are finished");
    }

    @Nested
    @DisplayName("User win tests")
    class UserWinTests {
        @Test
        public void TestMakeMove1() {

            //Given
            CheckIfWin checkIfWin = new CheckIfWin();
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

            //When

            board.makeMove(1);
            board.makeMove(2);
            String result = board.makeMove(0);

            //Then
            System.out.println(board.getFieldList());
            System.out.println(result);
            Assertions.assertEquals(result, "User win");
        }

        @Test
        public void TestMakeMove2() {

            //Given
            CheckIfWin checkIfWin = new CheckIfWin();
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

            //When

            board.makeMove(3);
            board.makeMove(4);
            String result = board.makeMove(5);

            //Then
            System.out.println(board.getFieldList());
            System.out.println(result);
            Assertions.assertEquals(result, "User win");
        }

        @Test
        public void TestMakeMove3() {

            //Given
            CheckIfWin checkIfWin = new CheckIfWin();
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

            //When

            board.makeMove(6);
            board.makeMove(7);
            String result = board.makeMove(8);

            //Then
            System.out.println(board.getFieldList());
            System.out.println(result);
            Assertions.assertEquals(result, "User win");
        }

        @Test
        public void TestMakeMove4() {

            //Given
            CheckIfWin checkIfWin = new CheckIfWin();
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

            //When

            board.makeMove(0);
            board.makeMove(3);
            String result = board.makeMove(6);

            //Then
            System.out.println(board.getFieldList());
            System.out.println(result);
            Assertions.assertEquals(result, "User win");
        }

        @Test
        public void TestMakeMove5() {

            //Given
            CheckIfWin checkIfWin = new CheckIfWin();
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

            //When

            board.makeMove(1);
            board.makeMove(4);
            String result = board.makeMove(7);

            //Then
            System.out.println(board.getFieldList());
            System.out.println(result);
            Assertions.assertEquals(result, "User win");
        }

        @Test
        public void TestMakeMove6() {

            //Given
            CheckIfWin checkIfWin = new CheckIfWin();
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

            //When

            board.makeMove(2);
            board.makeMove(5);
            String result = board.makeMove(8);

            //Then
            System.out.println(board.getFieldList());
            System.out.println(result);
            Assertions.assertEquals(result, "User win");
        }

        @Test
        public void TestMakeMove7() {

            //Given
            CheckIfWin checkIfWin = new CheckIfWin();
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

            //When

            board.makeMove(0);
            board.makeMove(4);
            String result = board.makeMove(8);

            //Then
            System.out.println(board.getFieldList());
            System.out.println(result);
            Assertions.assertEquals(result, "User win");
        }

        @Test
        public void TestMakeMove8() {

            //Given
            CheckIfWin checkIfWin = new CheckIfWin();
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

            //When

            board.makeMove(2);
            board.makeMove(4);
            String result = board.makeMove(6);

            //Then
            System.out.println(board.getFieldList());
            System.out.println(result);
            Assertions.assertEquals(result, "User win");
        }
    }

    @Nested
    @DisplayName("Computer win tests")
    class CompWinTests {
        @Test
        public void TestMakeMove1() {

            //Given
            CheckIfWin checkIfWin = new CheckIfWin();
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

            //When
            field0.setSign("O");
            field1.setSign("O");
            field2.setSign("O");
            String result = board.makeMove(6);

            //Then
            System.out.println(board.getFieldList());
            System.out.println(result);
            Assertions.assertEquals(result, "Computer win");
        }
        @Test
        public void TestMakeMove2() {

            //Given
            CheckIfWin checkIfWin = new CheckIfWin();
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

            //When
            field3.setSign("O");
            field4.setSign("O");
            field5.setSign("O");
            String result = board.makeMove(8);

            //Then
            System.out.println(board.getFieldList());
            System.out.println(result);
            Assertions.assertEquals(result, "Computer win");
        }
        @Test
        public void TestMakeMove3() {

            //Given
            CheckIfWin checkIfWin = new CheckIfWin();
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

            //When
            field6.setSign("O");
            field7.setSign("O");
            field8.setSign("O");
            String result = board.makeMove(1);

            //Then
            System.out.println(board.getFieldList());
            System.out.println(result);
            Assertions.assertEquals(result, "Computer win");
        }
        @Test
        public void TestMakeMove4() {

            //Given
            CheckIfWin checkIfWin = new CheckIfWin();
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

            //When
            field0.setSign("O");
            field3.setSign("O");
            field6.setSign("O");
            String result = board.makeMove(7);

            //Then
            System.out.println(board.getFieldList());
            System.out.println(result);
            Assertions.assertEquals(result, "Computer win");
        }
        @Test
        public void TestMakeMove5() {

            //Given
            CheckIfWin checkIfWin = new CheckIfWin();
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

            //When
            field1.setSign("O");
            field4.setSign("O");
            field7.setSign("O");
            String result = board.makeMove(6);

            //Then
            System.out.println(board.getFieldList());
            System.out.println(result);
            Assertions.assertEquals(result, "Computer win");
        }
        @Test
        public void TestMakeMove6() {

            //Given
            CheckIfWin checkIfWin = new CheckIfWin();
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

            //When
            field2.setSign("O");
            field5.setSign("O");
            field8.setSign("O");
            String result = board.makeMove(6);

            //Then
            System.out.println(board.getFieldList());
            System.out.println(result);
            Assertions.assertEquals(result, "Computer win");
        }
        @Test
        public void TestMakeMove7() {

            //Given
            CheckIfWin checkIfWin = new CheckIfWin();
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

            //When
            field0.setSign("O");
            field4.setSign("O");
            field8.setSign("O");
            String result = board.makeMove(6);

            //Then
            System.out.println(board.getFieldList());
            System.out.println(result);
            Assertions.assertEquals(result, "Computer win");
        }
        @Test
        public void TestMakeMove8() {

            //Given
            CheckIfWin checkIfWin = new CheckIfWin();
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

            //When
            field2.setSign("O");
            field4.setSign("O");
            field6.setSign("O");
            String result = board.makeMove(5);

            //Then
            System.out.println(board.getFieldList());
            System.out.println(result);
            Assertions.assertEquals(result, "Computer win");
        }
    }

    @Test
    public void drawTest() {
        //Given
        CheckIfWin checkIfWin = new CheckIfWin();
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

        //When
        field0.setSign("X");
        field1.setSign("X");
        field2.setSign("O");
        field3.setSign("O");
        field4.setSign("O");
        field5.setSign("X");
        field6.setSign("X");
        field7.setSign("O");
        String result = board.makeMove(8);

        //Then
        System.out.println(board.getFieldList());
        System.out.println(result);
        Assertions.assertEquals(result, "Draw");


    }
}