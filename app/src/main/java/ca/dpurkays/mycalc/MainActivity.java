package ca.dpurkays.mycalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText input;
    private Button zero, one, two, three, four, five, six, seven, eight, nine;
    private Button plus, minus, divide, multiply, decimal, clear, equals;
    private float val1, val2;
    private float result;
    private String op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (EditText) findViewById(R.id.userInput);

        zero = (Button) findViewById(R.id.btn0);
        one = (Button) findViewById(R.id.btn1);
        two = (Button) findViewById(R.id.btn2);
        three = (Button) findViewById(R.id.btn3);
        four = (Button) findViewById(R.id.btn4);
        five = (Button) findViewById(R.id.btn5);
        six = (Button) findViewById(R.id.btn6);
        seven = (Button) findViewById(R.id.btn7);
        eight = (Button) findViewById(R.id.btn8);
        nine = (Button) findViewById(R.id.btn9);

        plus = (Button) findViewById(R.id.btnPlus);
        minus = (Button) findViewById(R.id.btnMinus);
        multiply = (Button) findViewById(R.id.btnMultiply);
        divide = (Button) findViewById(R.id.btnDivide);

        decimal = (Button) findViewById(R.id.btnDecimal);
        clear = (Button) findViewById(R.id.btnClear);
        equals = (Button) findViewById(R.id.btnEquals);

        zero.setOnClickListener(this);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        multiply.setOnClickListener(this);
        divide.setOnClickListener(this);
        decimal.setOnClickListener(this);
        equals.setOnClickListener(this);
        clear.setOnClickListener(this);


    }

    private float calculate() {
        val2 = Float.parseFloat(input.getText().toString());

        if (op.equals("+")) {
            return val1 + val2;
        } else if (op.equals("-")) {
            return val1 - val2;
        } else if (op.toLowerCase().equals("x")) {
            return val1 * val2;
        } else if (op.equals("/")) {
            return val1 / val2;
        }
        return 0;
    }

    @Override
    public void onClick(View view) {
        Editable str = input.getText();
        switch (view.getId()) {
            case R.id.btn1:
                if (val2 != 0) {
                    val2 = 0;
                    input.setText("");
                }
                str = str.append(one.getText());
                input.setText(str);
                break;
            case R.id.btn2:
                if (val2 != 0) {
                    val2 = 0;
                    input.setText("");
                }
                str = str.append(two.getText());
                input.setText(str);
                break;
            case R.id.btn3:
                if (val2 != 0) {
                    val2 = 0;
                    input.setText("");
                }
                str = str.append(three.getText());
                input.setText(str);
                break;
            case R.id.btn4:
                if (val2 != 0) {
                    val2 = 0;
                    input.setText("");
                }
                str = str.append(four.getText());
                input.setText(str);
                break;
            case R.id.btn5:
                if (val2 != 0) {
                    val2 = 0;
                    input.setText("");
                }
                str = str.append(five.getText());
                input.setText(str);
                break;
            case R.id.btn6:
                if (val2 != 0) {
                    val2 = 0;
                    input.setText("");
                }
                str = str.append(six.getText());
                input.setText(str);
                break;
            case R.id.btn7:
                if (val2 != 0) {
                    val2 = 0;
                    input.setText("");
                }
                str = str.append(seven.getText());
                input.setText(str);
                break;
            case R.id.btn8:
                if (val2 != 0) {
                    val2 = 0;
                    input.setText("");
                }
                str = str.append(eight.getText());
                input.setText(str);

                break;
            case R.id.btn9:
                if (val2 != 0) {
                    val2 = 0;
                    input.setText("");
                }
                str = str.append(nine.getText());
                input.setText(str);

                break;
            case R.id.btnClear:
                val1 = 0;
                val2 = 0;
                input.setText("");
                input.setHint("Enter number ");

                break;
            case R.id.btnPlus:
                op = "+";
                if (val1 == 0) {
                    val1 = Float.parseFloat(input.getText().toString());
                    input.setText("");
                } else if (val2 != 0) {
                    val2 = 0;
                    input.setText("");
                } else {
                    val2 = Float.parseFloat(input.getText().toString());
                    input.setText("");
                    result = val1 + val2;
                    input.setText(Float.toString(result));
                }
                break;
            case R.id.btnMinus:
                op = "-";
                if (val1 == 0) {
                    val1 = Float.parseFloat(input.getText().toString());
                    input.setText("");
                } else if (val2 != 0) {
                    val2 = 0;
                    input.setText("");
                } else {
                    val2 = Float.parseFloat(input.getText().toString());
                    input.setText("");
                    result = val1 - val2;
                    input.setText(Float.toString(result));
                }
                break;
            case R.id.btnMultiply:
                op = "x";
                if (val1 == 0) {
                    val1 = Float.parseFloat(input.getText().toString());
                    input.setText("");
                } else if (val2 != 0) {
                    val2 = 0;
                    input.setText("");
                } else {
                    val2 = Float.parseFloat(input.getText().toString());
                    input.setText("");
                    result = val1 * val2;
                    input.setText(Float.toString(result));
                }
                break;
            case R.id.btnDivide:
                op = "/";
                if (val1 == 0) {
                    val1 = Float.parseFloat(input.getText().toString());
                    input.setText("");
                } else if (val2 != 0) {
                    val2 = 0;
                    input.setText("");
                } else {
                    val2 = Float.parseFloat(input.getText().toString());
                    input.setText("");
                    result = val1 / val2;
                    input.setText(Float.toString(result));
                }
                break;
            case R.id.btnDecimal:
                if (val2 != 0) {
                    val2 = 0;
                    input.setText("");
                }
                str = str.append(decimal.getText());
                input.setText(str);
                break;
            case R.id.btnEquals:
                Log.d("TAG", "Are we here yet?");
                if (!op.equals(null)) {
                    result = calculate();
                    Log.d("TAG", "ANS:" + result);
                    input.setText(Float.toString(result));

                }
                break;
        }
    }
}