package com.example.chessforandroid;

public class Integer {

    public int column;
    public int row;

    public Integer(int column, int row) {
        this.column = column;
        this.row = row;
    }


    @Override
    public String toString() {
        return "Column = " + column +
                "\nRow = " + row;
    }
    public static Integer oneDtoTwoD(int i){
        int temp = 0;
        for (int c = 0; c < 8; c++){
            for (int r = 0; r < 8; r++){
                if (i == temp) {
                    return new Integer(c, r);
                }
                temp++;
            }
        }
        return new Integer(0, 0);
    }

    public static int twoDtoOneD(Integer position){
        return position.row*position.column+position.row;
    }
}
