package com.example.raghunat.ineedsum1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void enter(View view) {
        Button button = (Button)view;
        CalcController.insert("" + button.getText());
        System.out.println(CalcController._equation);
        TextView editView = (TextView) findViewById(R.id.equation);
        editView.setText(CalcController._equation);
    }

    protected void calculate(View view) {
        double result = CalcController.calculate();
        TextView equationView = (TextView)findViewById(R.id.equation);
        equationView.setText("" + result);
        CalcController._equation = "";
    }

    protected void clear(View view) {
        CalcController._equation = "";
        TextView equationView = (TextView)findViewById(R.id.equation);
        equationView.setText("");
    }
}
