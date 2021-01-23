package com.kodilla.tictactoeJava;

public class Field {

    private String sign;

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public Field(String sign) {
        this.sign = sign;
    }

    @Override
    public String toString() {
        return "Field{" +
                "sign='" + sign + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Field field = (Field) o;

        return sign.equals(field.sign);
    }

    @Override
    public int hashCode() {
        return sign.hashCode();
    }
}
