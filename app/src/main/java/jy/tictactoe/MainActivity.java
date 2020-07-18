package jy.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

// The app displays other messages to the user as the game progresses
// such as (1) whose turn it is, (2) if a player wins, and (3) if the game ends in a tie.

// get references to widgets
//        gameGrid[0][0] = (Button) findViewById(R.id.btn1);
//        gameGrid[0][1] = (Button) findViewById(R.id.btn2);
//        gameGrid[0][2] = (Button) findViewById(R.id.btn3);
//        gameGrid[1][0] = (Button) findViewById(R.id.btn4);
//        gameGrid[1][1] = (Button) findViewById(R.id.btn5);
//        gameGrid[1][2] = (Button) findViewById(R.id.btn6);
//        gameGrid[2][0] = (Button) findViewById(R.id.btn7);
//        gameGrid[2][1] = (Button) findViewById(R.id.btn8);
//        gameGrid[2][2] = (Button) findViewById(R.id.btn9);

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, reset;
    TextView progressView;
    int chance = 0;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        reset = (Button) findViewById(R.id.playBtn);
        progressView = (TextView)findViewById(R.id.pregressView);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        reset.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                if (btn1.getText().toString().equals("")) {
                    if (chance == 0) {
                        chance = 1;
                        btn1.setText("O");
                        progressView.setText("Player X's turn");
                        result();
                    } else {
                        chance = 0;
                        btn1.setText("X");
                        progressView.setText("Player O's turn");
                        result();
                    }
                }
                break;

            case R.id.btn2:
                if (btn2.getText().toString().equals("")) {
                    if (chance == 0) {
                        chance = 1;
                        btn2.setText("O");
                        progressView.setText("Player X's turn");
                        result();
                    } else {
                        chance = 0;
                        btn2.setText("X");
                        progressView.setText("Player O's turn");
                        result();
                    }
                }
                break;

            case R.id.btn3:
                if (btn3.getText().toString().equals("")) {
                    if (chance == 0) {
                        chance = 1;
                        btn3.setText("O");
                        progressView.setText("Player X's turn");
                        result();
                    } else {
                        chance = 0;
                        btn3.setText("X");
                        progressView.setText("Player O's turn");
                        result();
                    }
                }
                break;

            case R.id.btn4:
                if (btn4.getText().toString().equals("")) {
                    if (chance == 0) {
                        chance = 1;
                        btn4.setText("O");
                        progressView.setText("Player X's turn");
                        result();
                    } else {
                        chance = 0;
                        btn4.setText("X");
                        progressView.setText("Player O's turn");
                        result();
                    }
                }
                break;

            case R.id.btn5:
                if (btn5.getText().toString().equals("")) {
                    if (chance == 0) {
                        chance = 1;
                        btn5.setText("O");
                        progressView.setText("Player X's turn");
                        result();
                    } else {
                        chance = 0;
                        btn5.setText("X");
                        progressView.setText("Player O's turn");
                        result();
                    }
                }
                break;

            case R.id.btn6:
                if (btn6.getText().toString().equals("")) {
                    if (chance == 0) {
                        chance = 1;
                        btn6.setText("O");
                        progressView.setText("Player X's turn");
                        result();
                    } else {
                        chance = 0;
                        btn6.setText("X");
                        progressView.setText("Player O's turn");
                        result();
                    }
                }
                break;

            case R.id.btn7:
                if (btn7.getText().toString().equals("")) {
                    if (chance == 0) {
                        chance = 1;
                        btn7.setText("O");
                        progressView.setText("Player X's turn");
                        result();
                    } else {
                        chance = 0;
                        btn7.setText("X");
                        progressView.setText("Player O's turn");
                        result();
                    }
                }
                break;

            case R.id.btn8:
                if (btn8.getText().toString().equals("")) {
                    if (chance == 0) {
                        chance = 1;
                        btn8.setText("O");
                        progressView.setText("Player X's turn");
                        result();
                    } else {
                        chance = 0;
                        btn8.setText("X");
                        progressView.setText("Player O's turn");
                        result();
                    }
                }
                break;

            case R.id.btn9:
                if (btn9.getText().toString().equals("")) {
                    if (chance == 0) {
                        chance = 1;
                        btn9.setText("O");
                        progressView.setText("Player X's turn");
                        result();
                    } else {
                        chance = 0;
                        btn9.setText("X");
                        progressView.setText("Player O's turn");
                        result();
                    }
                }
                break;

            case R.id.playBtn:
                btn1.setText("");
                btn2.setText("");
                btn3.setText("");
                btn4.setText("");
                btn5.setText("");
                btn6.setText("");
                btn7.setText("");
                btn8.setText("");
                btn9.setText("");
                progressView.setText("Let's play game!");
        }
    }


    public void result() {
        if (btn1.getText().toString().equals("X") && btn2.getText().toString().equals("X") && btn3.getText().toString().equals("X")) {
            progressView.setText("Player X wins");
        } else if (btn4.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn6.getText().toString().equals("X")) {
            progressView.setText("Player X wins");
        } else if (btn7.getText().toString().equals("X") && btn8.getText().toString().equals("X") && btn9.getText().toString().equals("X")) {
            progressView.setText("Player X wins");
        } else if (btn1.getText().toString().equals("O") && btn2.getText().toString().equals("O") && btn3.getText().toString().equals("O")) {
            progressView.setText("Player O wins");
        } else if (btn4.getText().toString().equals("O") && btn5.getText().toString().equals("O") && btn6.getText().toString().equals("O")) {
            progressView.setText("Player O wins");
        } else if (btn7.getText().toString().equals("O") && btn8.getText().toString().equals("O") && btn9.getText().toString().equals("O")) {
            progressView.setText("Player O wins");
        } else if (btn1.getText().toString().equals("X") && btn4.getText().toString().equals("X") && btn7.getText().toString().equals("X")) {
            progressView.setText("Player X wins");
        } else if (btn2.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn8.getText().toString().equals("X")) {
            progressView.setText("Player X wins");
        } else if (btn3.getText().toString().equals("X") && btn6.getText().toString().equals("X") && btn9.getText().toString().equals("X")) {
            progressView.setText("Player X wins");
        } else if (btn1.getText().toString().equals("O") && btn4.getText().toString().equals("O") && btn7.getText().toString().equals("O")) {
            progressView.setText("Player O wins");
        } else if (btn2.getText().toString().equals("O") && btn5.getText().toString().equals("O") && btn8.getText().toString().equals("O")) {
            progressView.setText("Player O wins");
        } else if (btn3.getText().toString().equals("O") && btn6.getText().toString().equals("O") && btn9.getText().toString().equals("O")) {
            progressView.setText("Player O wins");
        } else if (btn1.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn9.getText().toString().equals("X")) {
            progressView.setText("Player X wins");
        } else if (btn3.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn7.getText().toString().equals("X")) {
            progressView.setText("Player X wins");
        } else if (btn1.getText().toString().equals("O") && btn5.getText().toString().equals("O") && btn9.getText().toString().equals("O")) {
            progressView.setText("Player O wins");
        } else if (btn3.getText().toString().equals("O") && btn5.getText().toString().equals("O") && btn7.getText().toString().equals("O")) {
            progressView.setText("Player O wins");
        } else if (!btn1.getText().toString().equals("") && !btn2.getText().toString().equals("") && !btn3.getText().toString().equals("") && !btn4.getText().toString().equals("") && !btn5.getText().toString().equals("") && !btn6.getText().toString().equals("") && !btn7.getText().toString().equals("") && !btn8.getText().toString().equals("") && !btn9.getText().toString().equals("")){
            progressView.setText("No Winner!");
        }
    }
}
