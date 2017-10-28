package com.IntelligentSystems.nitish;
public class QueenObject {
	
    int row=0;
    int column=0;

    //Constructor for the Queen object
    QueenObject(int row, int column) {
        this.row = row;
        this.column = column;
    }

    //Check if the current object conflicts with the argument
    public boolean conflicts(QueenObject q){
        //  Check horizontally and vertically
        if(row == q.getRow() || column == q.getColumn())
            return true;
        //  Check diagonally
        else if(Math.abs(column-q.getColumn()) == Math.abs(row-q.getRow()))
            return true;
        else
        	return false;
    }
    
    //Move the queen down
    void goDown () {
        row++;
    }

    //Row ID
    int getRow() {
        return row;
    }

    //Column ID
    int getColumn() {
        return column;
    }
}