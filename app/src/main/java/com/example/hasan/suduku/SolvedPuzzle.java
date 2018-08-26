package com.example.hasan.suduku;

import android.util.Log;
import android.widget.EditText;



public class SolvedPuzzle {

    private int[][] board;
    private int [][] input;




    private EditText aa1,aa2,aa3,aa4,aa5,aa6,aa7,aa8,aa9,
            bb1,bb2,bb3,bb4,bb5,bb6,bb7,bb8,bb9,
            cc1,cc2,cc3,cc4,cc5,cc6,cc7,cc8,cc9,
            dd1,dd2,dd3,dd4,dd5,dd6,dd7,dd8,dd9,
            ee1,ee2,ee3,ee4,ee5,ee6,ee7,ee8,ee9,
            ff1,ff2,ff3,ff4,ff5,ff6,ff7,ff8,ff9,
            gg1,gg2,gg3,gg4,gg5,gg6,gg7,gg8,gg9,
            hh1,hh2,hh3,hh4,hh5,hh6,hh7,hh8,hh9,
            ii1,ii2,ii3,ii4,ii5,ii6,ii7,ii8,ii9;

    /*public SolvedPuzzle(EditText aa1, EditText aa2, EditText aa3, EditText aa4, EditText aa5, EditText aa6, EditText aa7, EditText aa8, String aa9,
                        String bb1, String bb2, String bb3, String bb4, String bb5, String bb6, String bb7, String bb8, String bb9,
                        String cc1, String cc2, String cc3, String cc4, String cc5, String cc6, String cc7, String cc8, String cc9,
                        String dd1, String dd2, String dd3, String dd4, String dd5, String dd6, String dd7, String dd8, String dd9,
                        String ee1, String ee2, String ee3, String ee4, String ee5, String ee6, String ee7, String ee8, String ee9,
                        String ff1, String ff2, String ff3, String ff4, String ff5, String ff6, String ff7, String ff8, String ff9,
                        String gg1, String gg2, String gg3, String gg4, String gg5, String gg6, String gg7, String gg8, String gg9,
                        String hh1, String hh2, String hh3, String hh4, String hh5, String hh6, String hh7, String hh8, String hh9,
                        String ii1, String ii2, String ii3, String ii4, String ii5, String ii6, String ii7, String ii8, String ii9
    )
    {
        this.aa1 = aa1;
        this.aa2 = aa2;
        this.aa3 = aa3;
        this.aa4 = aa4;
        this.aa5 = aa5;
        this.aa6 = aa6;
        this.aa7 = aa7;
        this.aa8 = aa8;
        this.aa9 = aa9;

        this.bb1 = bb1;
        this.bb2 = bb2;
        this.bb3 = bb3;
        this.bb4 = bb4;
        this.bb5 = bb5;
        this.bb6 = bb6;
        this.bb7 = bb7;
        this.bb8 = bb8;
        this.bb9 = bb9;

        this.cc1 = cc1;
        this.cc2 = cc2;
        this.cc3 = cc3;
        this.cc4 = cc4;
        this.cc5 = cc5;
        this.cc6 = cc6;
        this.cc7 = cc7;
        this.cc8 = cc8;
        this.cc9 = cc9;

        this.dd1 = dd1;
        this.dd2 = dd2;
        this.dd3 = dd3;
        this.dd4 = dd4;
        this.dd5 = dd5;
        this.dd6 = dd6;
        this.dd7 = dd7;
        this.dd8 = dd8;
        this.dd9 = dd9;

        this.ee1 = ee1;
        this.ee2 = ee2;
        this.ee3 = ee3;
        this.ee4 = ee4;
        this.ee5 = ee5;
        this.ee6 = ee6;
        this.ee7 = ee7;
        this.ee8 = ee8;
        this.ee9 = ee9;

        this.ff1 = ff1;
        this.ff2 = ff2;
        this.ff3 = ff3;
        this.ff4 = ff4;
        this.ff5 = ff5;
        this.ff6 = ff6;
        this.ff7 = ff7;
        this.ff8 = ff8;
        this.ff9 = ff9;

        this.gg1 = gg1;
        this.gg2 = gg2;
        this.gg3 = gg3;
        this.gg4 = gg4;
        this.gg5 = gg5;
        this.gg6 = gg6;
        this.gg7 = gg7;
        this.gg8 = gg8;
        this.gg9 = gg9;

        this.hh1 = hh1;
        this.hh2 = hh2;
        this.hh3 = hh3;
        this.hh4 = hh4;
        this.hh5 = hh5;
        this.hh6 = hh6;
        this.hh7 = hh7;
        this.hh8 = hh8;
        this.hh9 = hh9;

        this.ii1 = ii1;
        this.ii2 = ii2;
        this.ii3 = ii3;
        this.ii4 = ii4;
        this.ii5 = ii5;
        this.ii6 = ii6;
        this.ii7 = ii7;
        this.ii8 = ii8;
        this.ii9 = ii8;


    }*/




    public SolvedPuzzle(int[][] board, int[][] input)
    {
        this.board=board;
        this.input = input;
    }

    public boolean solvePuzzle()
    {
        int counter =0,counter2,count=0;
        for(int i=0;i<9;i++)
        {
            counter2=0;
            for(int j=0;j<9;j++)
            {
                if(board[i][j]==input[counter][counter2])
                {

                    count++;
                }

                counter2++;
            }
            counter++;
        }
        Log.e("Nazmus Sakib   ssss" ,String.valueOf(count));
        if(count==81)
        {
            return true;
        }
        else
        {
            return false;
        }

    }


}
