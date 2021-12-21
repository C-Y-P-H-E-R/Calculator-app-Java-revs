package com.example.calculator_rev;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {

    ImageView btn_0, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9;
    ImageView btn_plus, btn_minus, btn_multiplication, btn_divide, btn_ac, btn_dot, btn_equal, btn_start_bracket, btn_end_bracket;

    TextView Inputtxt, Outputtxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_0 = findViewById(R.id.btn_0);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);
        btn_plus = findViewById(R.id.btn_plus);
        btn_minus = findViewById(R.id.btn_minus);
        btn_multiplication = findViewById(R.id.btn_multiplication);
        btn_divide = findViewById(R.id.btn_divide);
        btn_ac = findViewById(R.id.btn_ac);
        btn_dot = findViewById(R.id.btn_dot);
        btn_start_bracket = findViewById(R.id.btn_start_bracket);
        btn_end_bracket = findViewById(R.id.btn_end_bracket);
        btn_equal = findViewById(R.id.btn_equal);

        Inputtxt = findViewById(R.id.Inputtxt);
        Outputtxt = findViewById(R.id.Outputtxt);

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = Inputtxt.getText().toString();
                Inputtxt.setText(data + "0");
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = Inputtxt.getText().toString();
                Inputtxt.setText(data + "1");
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = Inputtxt.getText().toString();
                Inputtxt.setText(data + "2");
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = Inputtxt.getText().toString();
                Inputtxt.setText(data + "3");
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = Inputtxt.getText().toString();
                Inputtxt.setText(data + "4");
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = Inputtxt.getText().toString();
                Inputtxt.setText(data + "5");
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = Inputtxt.getText().toString();
                Inputtxt.setText(data + "6");
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = Inputtxt.getText().toString();
                Inputtxt.setText(data + "7");
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = Inputtxt.getText().toString();
                Inputtxt.setText(data + "8");
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = Inputtxt.getText().toString();
                Inputtxt.setText(data + "9");
            }
        });

        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = Inputtxt.getText().toString();
                Inputtxt.setText(data + "+");
            }
        });

        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = Inputtxt.getText().toString();
                Inputtxt.setText(data + "-");
            }
        });

        btn_multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = Inputtxt.getText().toString();
                Inputtxt.setText(data + "x");
            }
        });

        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = Inputtxt.getText().toString();
                Inputtxt.setText(data + "/");
            }
        });

        btn_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Inputtxt.setText("");
                Outputtxt.setText("");
            }
        });

        btn_start_bracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = Inputtxt.getText().toString();
                Inputtxt.setText(data + "(");
            }
        });

        btn_end_bracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = Inputtxt.getText().toString();
                Inputtxt.setText(data + ")");
            }
        });

        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = Inputtxt.getText().toString();
                Inputtxt.setText(data + ".");
            }
        });

        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = Inputtxt.getText().toString();
                data=data.replaceAll("x", "*");

                Context rhinoContext = Context.enter();
                rhinoContext.setOptimizationLevel(-1);

                String finalResult = "";
                Scriptable scriptable = rhinoContext.initStandardObjects();
                finalResult = rhinoContext.evaluateString(scriptable, data, "Javascript", 1, null).toString();

                Outputtxt.setText(finalResult);
            }
        });
    }
}