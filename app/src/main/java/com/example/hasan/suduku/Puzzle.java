
package com.example.hasan.suduku;

import java.util.ArrayList;
import java.util.Arrays;


public class Puzzle {
    int[][] board;
    
    public Puzzle(int[][] board){
        this.board = board;
  
    }

    // return the solution

    public int[][] printBoard()
    {
        return  board;
    }



    // find out get Empty node to put value

    public Node GetNextEmptyNode(Node node){

        int nextX = 0;
        int nextY = 0;
        if(node.getY_pos() < 8){
            nextX = node.getX_pos();
            nextY = node.getY_pos() + 1;
        } else if (node.getY_pos() == 8 && node.getX_pos() < 8){
            nextX = node.getX_pos() + 1;
            nextY = 0;
        } else if (node.getX_pos() == 8 && node.getY_pos() == 8){
            return null;
        }

        Node nextNode = new Node(nextX, nextY);
        if (board[nextX][nextY] != 0)
        {
            return GetNextEmptyNode(nextNode);
        }
        return nextNode;
    }

    //find out the possible value to put into puzzle

    public boolean PopulatePossibleValues(Node node){


        int x_pos = node.getX_pos();
        int y_pos = node.getY_pos();
        int[][] box = GetCurrentBox(node);
        
        ArrayList<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);
        values.add(6);
        values.add(7);
        values.add(8);
        values.add(9);
           // x-axis match
        for(int x=0; x < 9; x++){
            if(board[x][y_pos] != 0 && values.contains(board[x][y_pos])){
                values.remove((Integer)board[x][y_pos]);
            }                
        }
        //y-axis match
        for(int y=0; y < 9; y++){
            if(board[x_pos][y] != 0 && values.contains(board[x_pos][y])){
                values.remove((Integer)board[x_pos][y]);
            }                
        }
        //square box match
        for(int i=0; i < 3; i++){
            for(int j=0; j < 3; j++){
                if(box[i][j] != 0 && values.contains(box[i][j])){
                    values.remove((Integer)box[i][j]);
                }
            }
        }
        //AtLeast value on assign on possible value
        for(int value : values){
            node.addPossibleValue(value);
        }
        if(values.size()>0)
        {
            return true;
        }
        return false;
    }

    //Square boxes to help to find out current boxes

    private int[][] GetCurrentBox(Node node){

        int x0, x1, x2 = 0;
        int y0, y1, y2 = 0;
        if(node.getX_pos() <= 2){
            x0 = 0;
            x1 = 1;
            x2 = 2;
        }
        else if(node.getX_pos() > 2 && node.getX_pos() <= 5 ){
            x0 = 3;
            x1 = 4;
            x2 = 5;
        }
        else {
            x0 = 6;
            x1 = 7;
            x2 = 8;
        }
        
        if(node.getY_pos() <= 2){
            y0 = 0;
            y1 = 1;
            y2 = 2;
        }
        else if(node.getY_pos() > 2 && node.getY_pos() <= 5 ){
            y0 = 3;
            y1 = 4;
            y2 = 5;
        }
        else {
            y0 = 6;
            y1 = 7;
            y2 = 8;
        }        
        
        int[][] box = new int[3][3];
        box[0][0] = board[x0][y0];
        box[0][1] = board[x0][y1];
        box[0][2] = board[x0][y2];

        box[1][0] = board[x1][y0];
        box[1][1] = board[x1][y1];
        box[1][2] = board[x1][y2];
        
        box[2][0] = board[x2][y0];
        box[2][1] = board[x2][y1];
        box[2][2] = board[x2][y2];
        
        return box;
    }
        
    public void Solve()
    {
    	Node.counter ++;
        int x = 0;
        int y = 0;
        Node node = new Node(x, y);
        if( board[x][y] != 0) {
            node = GetNextEmptyNode(node);
        }
        Solve(node);
    }
    
    //DFS apply 
    
    public String Solve(Node node)
    {
    	

        if(PopulatePossibleValues(node))
        {
            Node next_node = GetNextEmptyNode(node);
            if(next_node != null) {
                    node.createChildNodes(next_node);
                for (Node child_node : node.getChildNodes())
                {
                    board[node.getX_pos()][node.getY_pos()] = child_node.getBranchValue();
                    String status = Solve(child_node);
                    if(status.equals("solved")) {
                        return "solved";
                    }
                    else if (status.equals("backTrack"))
                    {
                        board[node.getX_pos()][node.getY_pos()] = 0;
                        continue;
                    }
                }
                return "backTrack";
            }
            else
            {
                if(node.getPossibleValues().size() == 1){
                    board[node.getX_pos()][node.getY_pos()] = node.getPossibleValues().get(0);
                    return "solved";
                }
                else {
                    return "backTrack";
                }
            }
        }
        else
        {
            return "backTrack";
        }
    }
}
