package com.example.hasan.suduku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    //Start initialization

    private EditText a1,a2,a3,a4,a5,a6,a7,a8,a9,
            b1,b2,b3,b4,b5,b6,b7,b8,b9,
            c1,c2,c3,c4,c5,c6,c7,c8,c9,
            d1,d2,d3,d4,d5,d6,d7,d8,d9,
            e1,e2,e3,e4,e5,e6,e7,e8,e9,
            f1,f2,f3,f4,f5,f6,f7,f8,f9,
            g1,g2,g3,g4,g5,g6,g7,g8,g9,
            h1,h2,h3,h4,h5,h6,h7,h8,h9,
            i1,i2,i3,i4,i5,i6,i7,i8,i9;

    private Button click,reStart;
    private String aa1,aa2,aa3,aa4,aa5,aa6,aa7,aa8,aa9,
            bb1,bb2,bb3,bb4,bb5,bb6,bb7,bb8,bb9,
            cc1,cc2,cc3,cc4,cc5,cc6,cc7,cc8,cc9,
            dd1,dd2,dd3,dd4,dd5,dd6,dd7,dd8,dd9,
            ee1,ee2,ee3,ee4,ee5,ee6,ee7,ee8,ee9,
            ff1,ff2,ff3,ff4,ff5,ff6,ff7,ff8,ff9,
            gg1,gg2,gg3,gg4,gg5,gg6,gg7,gg8,gg9,
            hh1,hh2,hh3,hh4,hh5,hh6,hh7,hh8,hh9,
            ii1,ii2,ii3,ii4,ii5,ii6,ii7,ii8,ii9;


    int[][] board = new int[][] {
            {0,2,0,6,0,8,0,0,0},
            {5,8,0,0,0,9,7,0,0},
            {0,0,0,0,4,0,0,0,0},
            {3,7,0,0,0,0,5,0,0},
            {6,0,0,0,0,0,0,0,4},
            {0,0,8,0,0,0,0,1,3},
            {0,0,0,0,2,0,0,0,0},
            {0,0,9,8,0,0,0,3,6},
            {0,0,0,3,0,6,0,9,0}};

    int[][] input = new int[][] {
            {0,2,0,6,0,8,0,0,0},
            {5,8,0,0,0,9,7,0,0},
            {0,0,0,0,4,0,0,0,0},
            {3,7,0,0,0,0,5,0,0},
            {6,0,0,0,0,0,0,0,4},
            {0,0,8,0,0,0,0,1,3},
            {0,0,0,0,2,0,0,0,0},
            {0,0,9,8,0,0,0,3,6},
            {0,0,0,3,0,6,0,9,0}};

    Puzzle puzzle = new Puzzle(board);
    SolvedPuzzle solvedPuzzleConstructor;
    SolvedPuzzle getCheck;



    //end of initialization

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initial();
        puzzle.Solve();


    }
    public int[][] getBoard()
    {
        return puzzle.printBoard();
    }


    private void initial()
    {
        a1=findViewById(R.id.a1);
        a2=findViewById(R.id.a2);
        a3=findViewById(R.id.a3);
        a4=findViewById(R.id.a4);
        a5=findViewById(R.id.a5);
        a6=findViewById(R.id.a6);
        a7=findViewById(R.id.a7);
        a8=findViewById(R.id.a8);
        a9=findViewById(R.id.a9);

        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);


        c1=findViewById(R.id.c1);
        c2=findViewById(R.id.c2);
        c3=findViewById(R.id.c3);
        c4=findViewById(R.id.c4);
        c5=findViewById(R.id.c5);
        c6=findViewById(R.id.c6);
        c7=findViewById(R.id.c7);
        c8=findViewById(R.id.c8);
        c9=findViewById(R.id.c9);

        d1=findViewById(R.id.d1);
        d2=findViewById(R.id.d2);
        d3=findViewById(R.id.d3);
        d4=findViewById(R.id.d4);
        d5=findViewById(R.id.d5);
        d6=findViewById(R.id.d6);
        d7=findViewById(R.id.d7);
        d8=findViewById(R.id.d8);
        d9=findViewById(R.id.d9);

        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        e3=findViewById(R.id.e3);
        e4=findViewById(R.id.e4);
        e5=findViewById(R.id.e5);
        e6=findViewById(R.id.e6);
        e7=findViewById(R.id.e7);
        e8=findViewById(R.id.e8);
        e9=findViewById(R.id.e9);

        f1=findViewById(R.id.f1);
        f2=findViewById(R.id.f2);
        f3=findViewById(R.id.f3);
        f4=findViewById(R.id.f4);
        f5=findViewById(R.id.f5);
        f6=findViewById(R.id.f6);
        f7=findViewById(R.id.f7);
        f8=findViewById(R.id.f8);
        f9=findViewById(R.id.f9);

        g1=findViewById(R.id.g1);
        g2=findViewById(R.id.g2);
        g3=findViewById(R.id.g3);
        g4=findViewById(R.id.g4);
        g5=findViewById(R.id.g5);
        g6=findViewById(R.id.g6);
        g7=findViewById(R.id.g7);
        g8=findViewById(R.id.g8);
        g9=findViewById(R.id.g9);

        h1=findViewById(R.id.h1);
        h2=findViewById(R.id.h2);
        h3=findViewById(R.id.h3);
        h4=findViewById(R.id.h4);
        h5=findViewById(R.id.h5);
        h6=findViewById(R.id.h6);
        h7=findViewById(R.id.h7);
        h8=findViewById(R.id.h8);
        h9=findViewById(R.id.h9);

        i1=findViewById(R.id.i1);
        i2=findViewById(R.id.i2);
        i3=findViewById(R.id.i3);
        i4=findViewById(R.id.i4);
        i5=findViewById(R.id.i5);
        i6=findViewById(R.id.i6);
        i7=findViewById(R.id.i7);
        i8=findViewById(R.id.i8);
        i9=findViewById(R.id.i9);
        click = findViewById(R.id.button);
        reStart = findViewById(R.id.button2);
        click.setOnClickListener(this);
        reStart.setOnClickListener(this);

    }

  private void setError() {

      setValues();

      //a column
      try {
          if (aa1.length() != 1 || aa2.length() != 1 || aa3.length() != 1 ||
                  aa4.length() != 1 || aa5.length() != 1 || aa6.length() != 1 ||
                  aa7.length() != 1 || aa8.length() != 1 || aa9.length() != 1 ||
                  aa1.isEmpty() || aa2.isEmpty() || aa3.isEmpty() || aa4.isEmpty() ||
                  aa5.isEmpty() || aa6.isEmpty() || aa7.isEmpty() || aa8.isEmpty() || aa9.isEmpty()) {
              if (aa1.length() != 1 || aa1.isEmpty()) {
                  a1.requestFocus();
                  a1.setError("Invalid Number");
              } else {

                     input[0][0] = Integer.parseInt(aa1);
              }
              if (aa2.length() != 1 || aa2.isEmpty()) {
                  a2.requestFocus();
                  a2.setError("Invalid Number");
              } else {
                  input[1][0] = Integer.parseInt(aa2);
              }
              if (aa3.length() != 1 || aa3.isEmpty()) {
                  a3.requestFocus();
                  a3.setError("Invalid Number");
              } else {
                  input[2][0] = Integer.parseInt(aa3);
              }
              if (aa4.length() != 1 || aa4.isEmpty()) {
                  a4.requestFocus();
                  a4.setError("Invalid Number");
              } else {
                  input[3][0] = Integer.parseInt(aa4);
              }
              if (aa5.length() != 1 || aa5.isEmpty()) {
                  a5.requestFocus();
                  a5.setError("Invalid Number");
              } else {
                  input[4][0] = Integer.parseInt(aa5);
              }
              if (aa6.length() != 1 || aa6.isEmpty()) {
                  a6.requestFocus();
                  a6.setError("Invalid Number");
              } else {
                  input[5][0] = Integer.parseInt(aa6);
              }
              if (aa7.length() != 1 || aa7.isEmpty()) {
                  a7.requestFocus();
                  a7.setError("Invalid Number");
              } else {
                  input[6][0] = Integer.parseInt(aa7);
              }
              if (aa8.length() != 1 || aa8.isEmpty()) {
                  a8.requestFocus();
                  a8.setError("Invalid Number");
              } else {
                  input[7][0] = Integer.parseInt(aa8);
              }

              if (aa9.length() != 1 || aa9.isEmpty()) {
                  a9.requestFocus();
                  a9.setError("Invalid Number");
              } else {
                  input[8][0] = Integer.parseInt(aa9);
              }

          }
          else
          {
              input[0][0] = Integer.parseInt(aa1);
              input[1][0] = Integer.parseInt(aa2);
              input[2][0] = Integer.parseInt(aa3);
              input[3][0] = Integer.parseInt(aa4);
              input[4][0] = Integer.parseInt(aa5);
              input[5][0] = Integer.parseInt(aa6);
              input[6][0] = Integer.parseInt(aa7);
              input[7][0] = Integer.parseInt(aa8);
              input[8][0] = Integer.parseInt(aa9);


          }

      } catch (Exception e) {
          Log.d("Nazmus Sakib", e.toString());
      }
      //b column

      try {
          if (bb1.length() != 1 || bb2.length() != 1 || bb3.length() != 1 ||
                  bb4.length() != 1 || bb5.length() != 1 || bb6.length() != 1 ||
                  bb7.length() != 1 || bb8.length() != 1 || bb9.length() != 1 ||
                  bb1.isEmpty() || bb2.isEmpty() || bb3.isEmpty() || bb4.isEmpty() ||
                  bb5.isEmpty() || bb6.isEmpty() || bb7.isEmpty() || bb8.isEmpty() || bb9.isEmpty()) {
              if (bb1.length() != 1 || bb1.isEmpty()) {
                  b1.requestFocus();
                  b1.setError("Invalid Number");
              } else {
                  input[0][1] = Integer.parseInt(bb1);
              }
              if (bb2.length() != 1 | bb2.isEmpty()) {
                  b2.requestFocus();
                  b2.setError("Invalid Number");
              } else {
                  input[1][1] = Integer.parseInt(bb2);
              }
              if (bb3.length() != 1 || bb3.isEmpty()) {
                  b3.requestFocus();
                  b3.setError("Invalid Number");
              } else {
                  input[2][1] = Integer.parseInt(bb3);
              }
              if (bb4.length() != 1 || bb4.isEmpty()) {
                  b4.requestFocus();
                  b4.setError("Invalid Number");
              } else {
                  input[3][1] = Integer.parseInt(bb4);
              }
              if (bb5.length() != 1 || bb5.isEmpty()) {
                  b5.requestFocus();
                  b5.setError("Invalid Number");
              } else {
                  input[4][1] = Integer.parseInt(bb5);
              }
              if (bb6.length() != 1 || bb6.isEmpty()) {
                  b6.requestFocus();
                  b6.setError("Invalid Number");
              } else {
                  input[5][1] = Integer.parseInt(bb6);
              }
              if (bb7.length() != 1 || bb7.isEmpty()) {
                  b7.requestFocus();
                  b7.setError("Invalid Number");
              } else {
                  input[6][1] = Integer.parseInt(bb7);
              }
              if (bb8.length() != 1 || bb8.isEmpty()) {
                  b8.requestFocus();
                  b8.setError("Invalid Number");
              } else {
                  input[7][1] = Integer.parseInt(bb8);
              }

              if (bb9.length() != 1 || bb9.isEmpty()) {
                  b9.requestFocus();
                  b9.setError("Invalid Number");
              } else {
                  input[8][1] = Integer.parseInt(bb9);
              }

          }
          else
          {
              input[0][1] = Integer.parseInt(bb1);
              input[1][1] = Integer.parseInt(bb2);
              input[2][1] = Integer.parseInt(bb3);
              input[3][1] = Integer.parseInt(bb4);
              input[4][1] = Integer.parseInt(bb5);
              input[5][1] = Integer.parseInt(bb6);
              input[6][1] = Integer.parseInt(bb7);
              input[7][1] = Integer.parseInt(bb8);
              input[8][1] = Integer.parseInt(bb9);

          }

      } catch (Exception e) {
          Log.d("Nazmus Sakib", e.toString());
      }
      //    c column

      try {
          if (cc1.length() != 1 || cc2.length() != 1 || cc3.length() != 1 ||
                  cc4.length() != 1 || cc5.length() != 1 || cc6.length() != 1 ||
                  cc7.length() != 1 || cc8.length() != 1 || cc9.length() != 1 ||
                  cc1.isEmpty() || cc2.isEmpty() || cc3.isEmpty() || cc4.isEmpty() ||
                  cc5.isEmpty() || cc6.isEmpty() || cc7.isEmpty() || cc8.isEmpty() || cc9.isEmpty())

          {
              if (cc1.length() != 1 || cc1.isEmpty()) {
                  c1.requestFocus();
                  c1.setError("Invalid Number");
              } else {
                  input[0][2] = Integer.parseInt(cc1);
              }
              if (cc2.length() != 1 || cc2.isEmpty()) {
                  c2.requestFocus();
                  c2.setError("Invalid Number");
              } else {
                  input[1][2] = Integer.parseInt(cc2);
              }
              if (cc3.length() != 1 || cc4.isEmpty()) {
                  c3.requestFocus();
                  c3.setError("Invalid Number");
              } else {
                  input[2][2] = Integer.parseInt(cc3);
              }
              if (cc4.length() != 1 || cc4.isEmpty()) {
                  c4.requestFocus();
                  c4.setError("Invalid Number");
              } else {
                  input[3][2] = Integer.parseInt(cc4);
              }
              if (cc5.length() != 1 || cc5.isEmpty()) {
                  c5.requestFocus();
                  c5.setError("Invalid Number");
              } else {
                  input[4][2] = Integer.parseInt(cc5);
              }
              if (cc6.length() != 1 || cc6.isEmpty()) {
                  c6.requestFocus();
                  c6.setError("Invalid Number");
              } else {
                  input[5][2] = Integer.parseInt(cc6);
              }
              if (cc7.length() != 1 || cc7.isEmpty()) {
                  c7.requestFocus();
                  c7.setError("Invalid Number");
              } else {
                  input[6][2] = Integer.parseInt(cc7);
              }
              if (cc8.length() != 1 || cc8.isEmpty()) {
                  c8.requestFocus();
                  c8.setError("Invalid Number");
              } else {
                  input[7][2] = Integer.parseInt(cc8);
              }

              if (cc9.length() != 1 || cc9.isEmpty()) {
                  c9.requestFocus();
                  c9.setError("Invalid Number");
              } else {
                  input[8][2] = Integer.parseInt(cc9);
              }

          }
          else
          {
              input[0][2] = Integer.parseInt(cc1);
              input[1][2] = Integer.parseInt(cc2);
              input[2][2] = Integer.parseInt(cc3);
              input[3][2] = Integer.parseInt(cc4);
              input[4][2] = Integer.parseInt(cc5);
              input[5][2] = Integer.parseInt(cc6);
              input[6][2] = Integer.parseInt(cc7);
              input[7][2] = Integer.parseInt(cc8);
              input[8][2] = Integer.parseInt(cc9);

          }

      } catch (Exception e) {
          Log.d("Nazmus Sakib", e.toString());
      }
      // d column
      try {
          if (dd1.length() != 1 || dd2.length() != 1 || dd3.length() != 1 ||
                  dd4.length() != 1 || dd5.length() != 1 || dd6.length() != 1 ||
                  dd7.length() != 1 || dd8.length() != 1 || dd9.length() != 1 ||
                  dd1.isEmpty() || dd2.isEmpty() || dd3.isEmpty() || dd4.isEmpty() ||
                  dd5.isEmpty() || dd6.isEmpty() || dd7.isEmpty() || dd8.isEmpty() || dd9.isEmpty()) {
              if (dd1.length() != 1 || dd1.isEmpty()) {
                  d1.requestFocus();
                  d1.setError("Invalid Number");
              } else {
                  input[0][3] = Integer.parseInt(dd1);
              }
              if (dd2.length() != 1 || dd2.isEmpty()) {
                  d2.requestFocus();
                  d2.setError("Invalid Number");
              } else {
                  input[1][3] = Integer.parseInt(dd2);
              }
              if (dd3.length() != 1 || dd3.isEmpty()) {
                  d3.requestFocus();
                  d3.setError("Invalid Number");
              } else {
                  input[2][3] = Integer.parseInt(dd3);
              }
              if (dd4.length() != 1 || dd4.isEmpty()) {
                  d4.requestFocus();
                  d4.setError("Invalid Number");
              } else {
                  input[3][3] = Integer.parseInt(dd4);
              }
              if (dd5.length() != 1 || dd5.isEmpty()) {
                  d5.requestFocus();
                  d5.setError("Invalid Number");
              } else {
                  input[4][3] = Integer.parseInt(dd5);
              }
              if (dd6.length() != 1 || dd6.isEmpty()) {
                  d6.requestFocus();
                  d6.setError("Invalid Number");
              } else {
                  input[5][3] = Integer.parseInt(dd6);
              }
              if (dd7.length() != 1 || dd7.isEmpty()) {
                  d7.requestFocus();
                  d7.setError("Invalid Number");
              } else {
                  input[6][3] = Integer.parseInt(dd7);
              }
              if (dd8.length() != 1 || dd8.isEmpty()) {
                  d8.requestFocus();
                  d8.setError("Invalid Number");
              } else {
                  input[7][3] = Integer.parseInt(dd8);
              }

              if (dd9.length() != 1 || dd9.isEmpty()) {
                  d9.requestFocus();
                  d9.setError("Invalid Number");
              } else {
                  input[8][3] = Integer.parseInt(dd9);
              }
          }
          else
          {
              input[0][3] = Integer.parseInt(dd1);
              input[1][3] = Integer.parseInt(dd2);
              input[2][3] = Integer.parseInt(dd3);
              input[3][3] = Integer.parseInt(dd4);
              input[4][3] = Integer.parseInt(dd5);
              input[5][3] = Integer.parseInt(dd6);
              input[6][3] = Integer.parseInt(dd7);
              input[7][3] = Integer.parseInt(dd8);
              input[8][3] = Integer.parseInt(dd9);
          }
      } catch (Exception e) {
          Log.d("Nazmus Sakib", e.toString());
      }
      //e column

      try {

          if (ee1.length() != 1 || ee2.length() != 1 || ee3.length() != 1 ||
                  ee4.length() != 1 || ee5.length() != 1 || ee6.length() != 1 ||
                  ee7.length() != 1 || ee8.length() != 1 || ee9.length() != 1 ||
                  ee1.isEmpty() || ee2.isEmpty() || ee3.isEmpty() || ee4.isEmpty() ||
                  ee5.isEmpty() || ee6.isEmpty() || ee7.isEmpty() || ee8.isEmpty() || ee9.isEmpty()) {
              if (ee1.length() != 1 || ee1.isEmpty()) {
                  e1.requestFocus();
                  e1.setError("Invalid Number");
              } else {
                  input[0][4] = Integer.parseInt(ee1);
              }
              if (ee2.length() != 1 || ee2.isEmpty()) {
                  e2.requestFocus();
                  e2.setError("Invalid Number");
              } else {
                  input[1][4] = Integer.parseInt(ee2);
              }
              if (ee3.length() != 1 || ee3.isEmpty()) {
                  e3.requestFocus();
                  e3.setError("Invalid Number");
              } else {
                  input[2][4] = Integer.parseInt(ee3);
              }
              if (ee4.length() != 1 || ee4.isEmpty()) {
                  e4.requestFocus();
                  e4.setError("Invalid Number");
              } else {
                  input[3][4] = Integer.parseInt(ee4);
              }
              if (ee5.length() != 1 || ee5.isEmpty()) {
                  e5.requestFocus();
                  e5.setError("Invalid Number");
              } else {
                  input[4][4] = Integer.parseInt(ee5);
              }
              if (ee6.length() != 1 || ee6.isEmpty()) {
                  e6.requestFocus();
                  e6.setError("Invalid Number");
              } else {
                  input[5][4] = Integer.parseInt(ee6);
              }
              if (ee7.length() != 1 || ee7.isEmpty()) {
                  e7.requestFocus();
                  e7.setError("Invalid Number");
              } else {
                  input[6][4] = Integer.parseInt(ee7);
              }
              if (ee8.length() != 1 || ee8.isEmpty()) {
                  e8.requestFocus();
                  e8.setError("Invalid Number");
              } else {
                  input[7][4] = Integer.parseInt(ee8);
              }

              if (ee9.length() != 1 || ee9.isEmpty()) {
                  e9.requestFocus();
                  e9.setError("Invalid Number");
              } else {
                  input[8][4] = Integer.parseInt(ee9);
              }

          }
          else
          {
              input[0][4] = Integer.parseInt(ee1);
              input[1][4] = Integer.parseInt(ee2);
              input[2][4] = Integer.parseInt(ee3);
              input[3][4] = Integer.parseInt(ee4);
              input[4][4] = Integer.parseInt(ee5);
              input[5][4] = Integer.parseInt(ee6);
              input[6][4] = Integer.parseInt(ee7);
              input[7][4] = Integer.parseInt(ee8);
              input[8][4] = Integer.parseInt(ee9);

          }
      } catch (Exception e) {
          Log.d("Nazmus Sakib", e.toString());
      }
      // f column

      try {
          if (ff1.length() != 1 || ff2.length() != 1 || ff3.length() != 1 ||
                  ff4.length() != 1 || ff5.length() != 1 || ff6.length() != 1 ||
                  ff7.length() != 1 || ff8.length() != 1 || ff9.length() != 1 ||
                  ff1.isEmpty() || ff2.isEmpty() || ff3.isEmpty() || ff4.isEmpty() ||
                  ff5.isEmpty() || ff6.isEmpty() || ff7.isEmpty() || ff8.isEmpty() || ff9.isEmpty()) {
              if (ff1.length() != 1 || ff1.isEmpty()) {
                  f1.requestFocus();
                  f1.setError("Invalid Number");
              } else {
                  input[0][5] = Integer.parseInt(ff1);
              }
              if (ff2.length() != 1 || ff2.isEmpty()) {
                  f2.requestFocus();
                  f2.setError("Invalid Number");
              } else {
                  input[1][5] = Integer.parseInt(ff2);
              }
              if (ff3.length() != 1 || ff3.isEmpty()) {
                  f3.requestFocus();
                  f3.setError("Invalid Number");
              } else {
                  input[2][5] = Integer.parseInt(ff3);
              }
              if (ff4.length() != 1 || ff4.isEmpty()) {
                  f4.requestFocus();
                  f4.setError("Invalid Number");
              } else {
                  input[3][5] = Integer.parseInt(ff4);
              }
              if (ff5.length() != 1 || ff5.isEmpty()) {
                  f5.requestFocus();
                  f5.setError("Invalid Number");
              } else {
                  input[4][5] = Integer.parseInt(ff5);
              }
              if (ff6.length() != 1 || ff6.isEmpty()) {
                  f6.requestFocus();
                  f6.setError("Invalid Number");
              } else {
                  input[5][5] = Integer.parseInt(ff6);
              }
              if (ff7.length() != 1 || ff7.isEmpty()) {
                  f7.requestFocus();
                  f7.setError("Invalid Number");
              } else {
                  input[6][5] = Integer.parseInt(ff7);
              }
              if (ff8.length() != 1 || ff8.isEmpty()) {
                  f8.requestFocus();
                  f8.setError("Invalid Number");
              } else {
                  input[7][5] = Integer.parseInt(ff8);
              }

              if (ff9.length() != 1 || ff9.isEmpty()) {
                  f9.requestFocus();
                  f9.setError("Invalid Number");
              } else {
                  input[8][5] = Integer.parseInt(ff9);
              }

          }
          else
          {
              input[0][5] = Integer.parseInt(ff1);
              input[1][5] = Integer.parseInt(ff2);
              input[2][5] = Integer.parseInt(ff3);
              input[3][5] = Integer.parseInt(ff4);
              input[4][5] = Integer.parseInt(ff5);
              input[5][5] = Integer.parseInt(ff6);
              input[6][5] = Integer.parseInt(ff7);
              input[7][5] = Integer.parseInt(ff8);
              input[8][5] = Integer.parseInt(ff9);
          }
      } catch (Exception e) {
          Log.d("Nazmus Sakib", e.toString());
      }
      // g column

      try {
          if (gg1.length() != 1 || gg2.length() != 1 || gg3.length() != 1 ||
                  gg4.length() != 1 || gg5.length() != 1 || gg6.length() != 1 ||
                  gg7.length() != 1 || gg8.length() != 1 || gg9.length() != 1 ||
                  gg1.isEmpty() || gg2.isEmpty() || gg3.isEmpty() || gg4.isEmpty() ||
                  gg5.isEmpty() || gg6.isEmpty() || gg7.isEmpty() || gg8.isEmpty() || gg9.isEmpty()) {
              if (gg1.length() != 1 || gg1.isEmpty()) {
                  g1.requestFocus();
                  g1.setError("Invalid Number");
              } else {
                  input[0][6] = Integer.parseInt(gg1);
              }
              if (gg2.length() != 1 || gg2.isEmpty()) {
                  g2.requestFocus();
                  g2.setError("Invalid Number");
              } else {
                  input[1][6] = Integer.parseInt(gg2);
              }
              if (gg3.length() != 1 || gg2.isEmpty()) {
                  g3.requestFocus();
                  g3.setError("Invalid Number");
              } else {
                  input[2][6] = Integer.parseInt(gg3);
              }
              if (gg4.length() != 1 || gg4.isEmpty()) {
                  g4.requestFocus();
                  g4.setError("Invalid Number");
              } else {
                  input[3][6] = Integer.parseInt(gg4);
              }
              if (gg5.length() != 1 || gg5.isEmpty()) {
                  g5.requestFocus();
                  g5.setError("Invalid Number");
              } else {
                  input[4][6] = Integer.parseInt(gg5);
              }
              if (gg6.length() != 1 || gg6.isEmpty()) {
                  g6.requestFocus();
                  g6.setError("Invalid Number");
              } else {
                  input[5][6] = Integer.parseInt(gg6);
              }
              if (gg7.length() != 1 || gg7.isEmpty()) {
                  g7.requestFocus();
                  g7.setError("Invalid Number");
              } else {
                  input[6][6] = Integer.parseInt(gg7);
              }
              if (gg8.length() != 1 || gg8.isEmpty()) {
                  g8.requestFocus();
                  g8.setError("Invalid Number");
              } else {
                  input[7][6] = Integer.parseInt(gg8);
              }

              if (gg9.length() != 1 || gg9.isEmpty()) {
                  g9.requestFocus();
                  g9.setError("Invalid Number");
              } else {
                  input[8][6] = Integer.parseInt(gg9);
              }

          }
          else
          {
              input[0][6] = Integer.parseInt(gg1);
              input[1][6] = Integer.parseInt(gg2);
              input[2][6] = Integer.parseInt(gg3);
              input[3][6] = Integer.parseInt(gg4);
              input[4][6] = Integer.parseInt(gg5);
              input[5][6] = Integer.parseInt(gg6);
              input[6][6] = Integer.parseInt(gg7);
              input[7][6] = Integer.parseInt(gg8);
              input[8][6] = Integer.parseInt(gg9);
          }
      } catch (Exception e) {
          Log.d("Nazmus Sakib", e.toString());
      }
      // h column

      try {
          if (hh1.length() != 1 || hh2.length() != 1 || hh3.length() != 1 ||
                  hh4.length() != 1 || hh5.length() != 1 || hh6.length() != 1 ||
                  hh7.length() != 1 || hh8.length() != 1 || hh9.length() != 1 ||
                  hh1.isEmpty() || hh2.isEmpty() || hh3.isEmpty() || hh4.isEmpty() ||
                  hh5.isEmpty() || hh6.isEmpty() || hh7.isEmpty() || hh8.isEmpty() || hh9.isEmpty()) {
              if (hh1.length() != 1 || hh1.isEmpty()) {
                  h1.requestFocus();
                  h1.setError("Invalid Number");
              } else {
                  input[0][7] = Integer.parseInt(hh1);
              }
              if (hh2.length() != 1 || hh2.isEmpty()) {
                  h2.requestFocus();
                  h2.setError("Invalid Number");
              } else {
                  input[1][7] = Integer.parseInt(hh2);
              }
              if (hh3.length() != 1 || hh3.isEmpty()) {
                  h3.requestFocus();
                  h3.setError("Invalid Number");
              } else {
                  input[2][7] = Integer.parseInt(hh3);
              }
              if (hh4.length() != 1 || hh4.isEmpty()) {
                  h4.requestFocus();
                  h4.setError("Invalid Number");
              } else {
                  input[3][7] = Integer.parseInt(hh4);
              }
              if (hh5.length() != 1 || hh5.isEmpty()) {
                  h5.requestFocus();
                  h5.setError("Invalid Number");
              } else {
                  input[4][7] = Integer.parseInt(hh5);
              }
              if (hh6.length() != 1 || hh6.isEmpty()) {
                  h6.requestFocus();
                  h6.setError("Invalid Number");
              } else {
                  input[5][7] = Integer.parseInt(hh6);
              }
              if (hh7.length() != 1 || hh7.isEmpty()) {
                  h7.requestFocus();
                  h7.setError("Invalid Number");
              } else {
                  input[6][7] = Integer.parseInt(hh7);
              }
              if (hh8.length() != 1 || hh8.isEmpty()) {
                  h8.requestFocus();
                  h8.setError("Invalid Number");
              } else {
                  input[7][7] = Integer.parseInt(hh8);
              }

              if (hh9.length() != 1 || hh9.isEmpty()) {
                  h9.requestFocus();
                  h9.setError("Invalid Number");
              } else {
                  input[8][7] = Integer.parseInt(hh9);

              }

          }
          else
          {
              input[0][7] = Integer.parseInt(hh1);
              input[1][7] = Integer.parseInt(hh2);
              input[2][7] = Integer.parseInt(hh3);
              input[3][7] = Integer.parseInt(hh4);
              input[4][7] = Integer.parseInt(hh5);
              input[5][7] = Integer.parseInt(hh6);
              input[6][7] = Integer.parseInt(hh7);
              input[7][7] = Integer.parseInt(hh8);
              input[8][7] = Integer.parseInt(hh9);
          }
      } catch (Exception e) {
          Log.d("Nazmus Sakib", e.toString());
      }
      try {
          // i column

          if (ii1.length() != 1 || ii2.length() != 1 || ii3.length() != 1 ||
                  ii4.length() != 1 || ii5.length() != 1 || ii6.length() != 1 ||
                  ii7.length() != 1 || ii8.length() != 1 || ii9.length() != 1 ||
                  ii1.isEmpty() || ii2.isEmpty() || ii3.isEmpty() || ii4.isEmpty() ||
                  ii5.isEmpty() || ii6.isEmpty() || ii7.isEmpty() || ii8.isEmpty() || ii9.isEmpty()) {
              if (ii1.length() != 1 || ii1.isEmpty()) {
                  i1.requestFocus();
                  i1.setError("Invalid Number");
              } else {
                  input[0][8] = Integer.parseInt(ii1);
              }
              if (ii2.length() != 1 || ii2.isEmpty()) {
                  i2.requestFocus();
                  i2.setError("Invalid Number");
              } else {
                  input[1][8] = Integer.parseInt(ii2);
              }
              if (ii3.length() != 1 || ii3.isEmpty()) {
                  i3.requestFocus();
                  i3.setError("Invalid Number");
              } else {
                  input[2][8] = Integer.parseInt(ii3);
              }
              if (ii4.length() != 1 || ii4.isEmpty()) {
                  i4.requestFocus();
                  i4.setError("Invalid Number");
              } else {
                  input[3][8] = Integer.parseInt(ii4);
              }
              if (ii5.length() != 1 || ii5.isEmpty()) {
                  i5.requestFocus();
                  i5.setError("Invalid Number");
              } else {
                  input[4][8] = Integer.parseInt(ii5);
              }
              if (ii6.length() != 1 || ii6.isEmpty()) {
                  i6.requestFocus();
                  i6.setError("Invalid Number");
              } else {
                  input[5][8] = Integer.parseInt(ii6);
              }
              if (ii7.length() != 1 || ii7.isEmpty()) {
                  i7.requestFocus();
                  i7.setError("Invalid Number");
              } else {
                  input[6][8] = Integer.parseInt(ii7);
              }
              if (ii8.length() != 1 || ii8.isEmpty()) {
                  i8.requestFocus();
                  i8.setError("Invalid Number");
              } else {
                  input[7][8] = Integer.parseInt(ii8);
              }

              if (ii9.length() != 1 || ii9.isEmpty()) {
                  i9.requestFocus();
                  i9.setError("Invalid Number");
              } else {
                  input[8][8] = Integer.parseInt(ii9);
              }

          }
          else
          {
              input[0][8] = Integer.parseInt(ii1);
              input[1][8] = Integer.parseInt(ii2);
              input[2][8] = Integer.parseInt(ii3);
              input[3][8] = Integer.parseInt(ii4);
              input[4][8] = Integer.parseInt(ii5);
              input[5][8] = Integer.parseInt(ii6);
              input[6][8] = Integer.parseInt(ii7);
              input[7][8] = Integer.parseInt(ii8);
              input[8][8] = Integer.parseInt(ii9);

          }

      }
      catch (Exception e)
      {
          Log.d("Namzus Sakib",e.toString());
      }

  }



  private void setValues()
  {


      try {


          aa1 = a1.getText().toString().trim();
          aa2 = a2.getText().toString().trim();
          aa3 = a3.getText().toString().trim();
          aa4 = a4.getText().toString().trim();
          aa5 = a5.getText().toString().trim();
          aa6 = a6.getText().toString().trim();
          aa7 = a7.getText().toString().trim();
          aa8 = a8.getText().toString().trim();
          aa9 = a9.getText().toString().trim();

          bb1 = b1.getText().toString().trim();
          bb2 = b2.getText().toString().trim();
          bb3 = b3.getText().toString().trim();
          bb4 = b4.getText().toString().trim();
          bb5 = b5.getText().toString().trim();
          bb6 = b6.getText().toString().trim();
          bb7 = b7.getText().toString().trim();
          bb8 = b8.getText().toString().trim();
          bb9 = b9.getText().toString().trim();

          cc1 = c1.getText().toString().trim();
          cc2 = c2.getText().toString().trim();
          cc3 = c3.getText().toString().trim();
          cc4 = c4.getText().toString().trim();
          cc5 = c5.getText().toString().trim();
          cc6 = c6.getText().toString().trim();
          cc7 = c7.getText().toString().trim();
          cc8 = c8.getText().toString().trim();
          cc9 = c9.getText().toString().trim();


          dd1 = d1.getText().toString().trim();
          dd2 = d2.getText().toString().trim();
          dd3 = d3.getText().toString().trim();
          dd4 = d4.getText().toString().trim();
          dd5 = d5.getText().toString().trim();
          dd6 = d6.getText().toString().trim();
          dd7 = d7.getText().toString().trim();
          dd8 = d8.getText().toString().trim();
          dd9 = d9.getText().toString().trim();


          ee1 = e1.getText().toString().trim();
          ee2 = e2.getText().toString().trim();
          ee3 = e3.getText().toString().trim();
          ee4 = e4.getText().toString().trim();
          ee5 = e5.getText().toString().trim();
          ee6 = e6.getText().toString().trim();
          ee7 = e7.getText().toString().trim();
          ee8 = e8.getText().toString().trim();
          ee9 = e9.getText().toString().trim();

          ff1 = f1.getText().toString().trim();
          ff2 = f2.getText().toString().trim();
          ff3 = f3.getText().toString().trim();
          ff4 = f4.getText().toString().trim();
          ff5 = f5.getText().toString().trim();
          ff6 = f6.getText().toString().trim();
          ff7 = f7.getText().toString().trim();
          ff8 = f8.getText().toString().trim();
          ff9 = f9.getText().toString().trim();

          gg1 = g1.getText().toString().trim();
          gg2 = g2.getText().toString().trim();
          gg3 = g3.getText().toString().trim();
          gg4 = g4.getText().toString().trim();
          gg5 = g5.getText().toString().trim();
          gg6 = g6.getText().toString().trim();
          gg7 = g7.getText().toString().trim();
          gg8 = g8.getText().toString().trim();
          gg9 = g9.getText().toString().trim();

          hh1 = h1.getText().toString().trim();
          hh2 = h2.getText().toString().trim();
          hh3 = h3.getText().toString().trim();
          hh4 = h4.getText().toString().trim();
          hh5 = h5.getText().toString().trim();
          hh6 = h6.getText().toString().trim();
          hh7 = h7.getText().toString().trim();
          hh8 = h8.getText().toString().trim();
          hh9 = h9.getText().toString().trim();


          ii1 = i1.getText().toString().trim();
          ii2 = i2.getText().toString().trim();
          ii3 = i3.getText().toString().trim();
          ii4 = i4.getText().toString().trim();
          ii5 = i5.getText().toString().trim();
          ii6 = i6.getText().toString().trim();
          ii7 = i7.getText().toString().trim();
          ii8 = i8.getText().toString().trim();
          ii9 = i9.getText().toString().trim();
      }
      catch (Exception e)
      {
          Log.d("Nazmus Sakib",e.toString());
      }
      /*solvedPuzzleConstructor = new SolvedPuzzle(aa1,aa2,aa3,aa4,aa5,aa6,aa7,aa8,aa9,
                                         bb1,bb2,bb3,bb4,bb5,bb6,bb7,bb8,bb9,
                                         cc1,cc2,cc3,cc4,cc5,cc6,cc7,cc8,cc9,
                                         dd1,dd2,dd3,dd4,dd5,dd6,dd7,dd8,dd9,
                                         ee1,ee2,ee3,ee4,ee5,ee6,ee7,ee8,ee9,
                                         ff1,ff2,ff3,ff4,ff5,ff6,ff7,ff8,ff9,
                                         gg1,gg2,gg3,gg4,gg5,gg6,gg7,gg8,gg9,
                                         hh1,hh2,hh3,hh4,hh5,hh6,hh7,hh8,hh9,
                                         ii1,ii2,ii3,ii4,ii5,ii6,ii7,ii8,ii9);*/



  }

  public int[][] getInputValue()
  {
      return input;
  }

    public void problemSolve()
    {
       if(getCheck.solvePuzzle())
       {
           Toast.makeText(this,"Puzzle Solved",Toast.LENGTH_SHORT).show();
       }
       else
       {
           Toast.makeText(this,"Puzzle Unsolved",Toast.LENGTH_SHORT).show();
       }

    }

    @Override
    public void onClick(View view) {


        switch (view.getId())
        {
            case R.id.button :
            {
                setError();
                getCheck = new SolvedPuzzle(getBoard(),getInputValue());
                problemSolve();
                break;
            }
            case R.id.button2 :
            {
                setText();
                break;
            }
            default:
                Toast.makeText(this,"Invalid key",Toast.LENGTH_SHORT).show();
        }


    }

    public void setText()
    {
        a1.setText("");
        b1.setText("2");
        c1.setText("");
        d1.setText("6");
        e1.setText("");
        f1.setText("8");
        g1.setText("");
        h1.setText("");
        i1.setText("");

        a2.setText("5");
        b2.setText("8");
        c2.setText("");
        d2.setText("");
        e2.setText("");
        f2.setText("9");
        g2.setText("7");
        h2.setText("");
        i2.setText("");

        a3.setText("");
        b3.setText("");
        c3.setText("");
        d3.setText("");
        e3.setText("4");
        f3.setText("");
        g3.setText("");
        h3.setText("");
        i3.setText("");

        a4.setText("3");
        b4.setText("7");
        c4.setText("");
        d4.setText("");
        e4.setText("");
        f4.setText("");
        g4.setText("5");
        h4.setText("");
        i4.setText("");

        a5.setText("6");
        b5.setText("");
        c5.setText("");
        d5.setText("");
        e5.setText("");
        f5.setText("");
        g5.setText("");
        h5.setText("");
        i5.setText("4");

        a6.setText("");
        b6.setText("");
        c6.setText("8");
        d6.setText("");
        e6.setText("");
        f6.setText("");
        g6.setText("");
        h6.setText("1");
        i6.setText("3");

        a7.setText("");
        b7.setText("");
        c7.setText("");
        d7.setText("");
        e7.setText("2");
        f7.setText("");
        g7.setText("");
        h7.setText("");
        i7.setText("");

        a8.setText("");
        b8.setText("");
        c8.setText("9");
        d8.setText("8");
        e8.setText("");
        f8.setText("");
        g8.setText("");
        h8.setText("3");
        i8.setText("6");

        a9.setText("");
        b9.setText("");
        c9.setText("");
        d9.setText("3");
        e9.setText("");
        f9.setText("6");
        g9.setText("");
        h9.setText("9");
        i9.setText("");

    }
}
