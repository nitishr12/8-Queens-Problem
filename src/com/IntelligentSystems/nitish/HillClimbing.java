package com.IntelligentSystems.nitish;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class HillClimbing {
	static int heuristic = Integer.MAX_VALUE;
    static int neighbours = 0;
    static int resetTime = 0;
    static int states = 0;
    static int n=0;
    
  //The function to create a new Chess board with queens. Queens are denoted as 1
    QueenObject[] createChessBoard(int n) {
    	//Make one's on each random rows denoting the Queen and this is the start state
    	Random random = new Random();
        QueenObject[] start = new QueenObject[n];
        for(int i=0; i<n; i++){
            start[i] = new QueenObject(random.nextInt(n), i);
        }
        return start;
    }
    
    //The function to check heuristics for each of the state
    int checkHeuristics (QueenObject[] chessBoard) {
    	//The heuristic here is to calculate the number of conflicts between the queens.
        int heuristic = 0;

        for (int i = 0; i< chessBoard.length; i++) {
            for (int j=i+1; j<chessBoard.length; j++ ) {
                if (chessBoard[i].conflicts(chessBoard[j])) {
                    heuristic++;
                }
            }
        }
        return heuristic;
    }

    //The function to print the chess board 
    void printChessBoard (QueenObject[] actualState, int n, int heuristic) {
    	//We only store the places where there are queens and not the empty slots for efficiency. 
    	//Hence we create a 2D array with blanks and add Q's in the places where a queen exists
        String[][] newBoard = new String[n][n];

        //An array with 0's
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                newBoard[i][j]="_";
            }
        }
        
        //Set the index with queens as 1
        for (int i=0; i<n; i++) {
            newBoard[actualState[i].getRow()][actualState[i].getColumn()]="Q";
        }

        System.out.println("The heuristic value for this state is " + heuristic);
        
        for (int i=0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(newBoard[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    
    public static void main(String[]args) throws NumberFormatException, IOException{
    	QueenObject[] chessBoard;
        int temporaryHeuristic=0, numberOfNeighbors = 0, bestHeuristic=0, currentHeuristic = 0;
        
        System.out.println("Enter the size of the Chess Board");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        QueenObject[] bestOfAllBoards = new QueenObject[n];
        QueenObject[] temporaryBoards = new QueenObject[n];
        
        QueenObject[] initialBoard = new HillClimbing().createChessBoard(n);
        chessBoard = Arrays.copyOf(initialBoard,n);
         
        currentHeuristic = new HillClimbing().checkHeuristics(initialBoard);

        //Test other generated new states and pick the one with the least heuristic.
        //If the least heuristic generated is same as the previous least heuristic state, then are stuck in a local maxima
        //Hence we do a random restart by resetting the board in the hope of finding the global maxima
        while (currentHeuristic != 0) {
            bestHeuristic = currentHeuristic;
            numberOfNeighbors = 0;
            //To copy the board pieces
            for (int i=0; i<n; i++) {   
            	temporaryBoards[i] = new QueenObject(chessBoard[i].getRow(), chessBoard[i].getColumn());
            }

            for (int i=0; i<n; i++) {
            	//Resetting
                if (i>0){  
                    temporaryBoards[i-1] = new QueenObject (chessBoard[i-1].getRow(), chessBoard[i-1].getColumn());
                }
                temporaryBoards[i] = new QueenObject (0, temporaryBoards[i].getColumn());
                for (int j=0; j<n; j++) {
                	//Store a temporary heuristic
                    temporaryHeuristic = new HillClimbing().checkHeuristics(temporaryBoards);  
                    //Trying to find a lower heuristic on iterating over all the boards
                    if (temporaryHeuristic < bestHeuristic) {    
                        bestHeuristic = temporaryHeuristic;
                        numberOfNeighbors++; 
                        //Store the best board as the one with the least heuristic
                        for (int k=0; k<n; k++)   
                            bestOfAllBoards[k] = new QueenObject(temporaryBoards[k].getRow(), temporaryBoards[k].getColumn());
                    }
                    //Go to the next row below
                    if (temporaryBoards[i].getRow()!=n-1)   {
                        temporaryBoards[i].goDown();
                    }
                }
            }
            System.out.print("\n");
            //Print the least heuristic state
            new HillClimbing().printChessBoard(chessBoard, n, currentHeuristic);   
            
            if (bestHeuristic == currentHeuristic) {
                System.out.println("There are no better states. We are stuck in a local maxima. Hence its time to do a random restart");
                bestOfAllBoards = new HillClimbing().createChessBoard(n);
                heuristic = new HillClimbing().checkHeuristics(bestOfAllBoards);
                //Increase the reset counter
                resetTime++;
            } 
            //We have a better state
            else{
            	System.out.println("There is a better state since "+bestHeuristic+" < "+heuristic);
                heuristic = bestHeuristic;
            }
            states++;
            chessBoard=bestOfAllBoards;
            currentHeuristic = heuristic;
        }
        System.out.print("\n");
        //Print the latest state
        new HillClimbing().printChessBoard(chessBoard, n, currentHeuristic);
        System.out.println("Global Maxima reached after "+(states-1)+" changes with "+resetTime+" random restarts");

    }
    
}
