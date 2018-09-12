package com.example.m.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_0,btn_Add,btn_Sub,btn_Mul,btn_Div,btn_Eql,btn_back,btn_clear,btn_Dot;
    EditText editText_Uinput;
    TextView textView_result;



    float Value1, Value2;
    boolean mAddition, mSubtract, mMultiplication, mDivision ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calUI();

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText_Uinput.setText(editText_Uinput.getText()+"0");
                if (editText_Uinput.getText().toString().equals("0")) {
                    editText_Uinput.setText(null);
                    textView_result.setText(null);
                }
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText_Uinput.setText(editText_Uinput.getText()+"1");
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText_Uinput.setText(editText_Uinput.getText()+"2");
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText_Uinput.setText(editText_Uinput.getText()+"3");
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText_Uinput.setText(editText_Uinput.getText()+"4");
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText_Uinput.setText(editText_Uinput.getText()+"5");
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText_Uinput.setText(editText_Uinput.getText()+"6");
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText_Uinput.setText(editText_Uinput.getText()+"7");
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText_Uinput.setText(editText_Uinput.getText()+"8");
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText_Uinput.setText(editText_Uinput.getText()+"9");
            }
        });

        btn_Dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             if (editText_Uinput.getText().toString().contains(".")) {
                    btn_Dot.clearComposingText();
                } else {
                    editText_Uinput.setText(editText_Uinput.getText().toString() + ".");

                }
            }
        });

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                back_button();

            }
        });

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
            }
        });

        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText_Uinput.getText().toString().equalsIgnoreCase("")) {
                    Value1 = 0;
                }else {
                    Value1 = Float.parseFloat(editText_Uinput.getText() + "");

                    mAddition = true;
                    mDivision = false;
                    mSubtract = false;
                    mMultiplication = false;
                    textView_result.setText(editText_Uinput.getText());

                    textView_result.setText(editText_Uinput.getText().toString() + "+");
                    editText_Uinput.setText(null);
                }
            }
        });

        btn_Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText_Uinput.getText().toString().equalsIgnoreCase("")) {
                    Value1 = 0;
                }else {
                    Value1 = Float.parseFloat(editText_Uinput.getText() + "");
                    mSubtract = true;
                    mAddition = false;
                    mDivision = false;
                    mMultiplication = false;
                    textView_result.setText(editText_Uinput.getText());

                    textView_result.setText(editText_Uinput.getText().toString() + "-");
                    editText_Uinput.setText(null);
                }
            }
        });

        btn_Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText_Uinput.getText().toString().equalsIgnoreCase("")) {
                    Value1 = 0;
                } else {
                    Value1 = Float.parseFloat(editText_Uinput.getText() + "");
                    mDivision = true;
                    mAddition = false;
                    mSubtract = false;
                    mMultiplication = false;
                    textView_result.setText(editText_Uinput.getText());

                    textView_result.setText(editText_Uinput.getText().toString() + "/");
                    editText_Uinput.setText(null);
                }
            }
        });

        btn_Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText_Uinput.getText().toString().equalsIgnoreCase("")) {
                    Value1 = 0;
                }else {
                    Value1 = Float.parseFloat(editText_Uinput.getText() + "");
                    mMultiplication = true;
                    mAddition=false;
                    mDivision=false;
                    mSubtract=false;
                    textView_result.setText(editText_Uinput.getText());

                    textView_result.setText(editText_Uinput.getText().toString() + "x");
                    editText_Uinput.setText(null);
                }

            }
        });

        btn_Eql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText_Uinput.getText().toString().equalsIgnoreCase("")) {
                    Value1 = 0;
                }
                else {
                    Value2 = Float.parseFloat(editText_Uinput.getText() + "");

                    if (mAddition == true){

                        editText_Uinput.setText(Value1 + Value2 +"");
                        mAddition=false;

                    }


                    if (mSubtract == true){
                        editText_Uinput.setText(Value1 - Value2 +"");
                        mSubtract=false;
                    }

                    if (mMultiplication == true){
                        editText_Uinput.setText(Value1 * Value2 + "");
                        mMultiplication=false;
                    }

                    if (mDivision == true){
                        editText_Uinput.setText(Value1 / Value2+"");
                        mDivision=false;
                    }
                }


            }
        });







    }

    private void calUI()
    {
        btn_0 = (Button) findViewById(R.id.btn_zero);
        btn_1 = (Button) findViewById(R.id.btn_one);
        btn_2 = (Button) findViewById(R.id.btn_two);
        btn_3 = (Button) findViewById(R.id.btn_three);
        btn_4 = (Button) findViewById(R.id.btn_four);
        btn_5 = (Button) findViewById(R.id.btn_five);
        btn_6 = (Button) findViewById(R.id.btn_six);
        btn_7 = (Button) findViewById(R.id.btn_seven);
        btn_8 = (Button) findViewById(R.id.btn_eight);
        btn_9 = (Button) findViewById(R.id.btn_nine);
        btn_Dot = (Button) findViewById(R.id.btn_dot);
        btn_Add = (Button) findViewById(R.id.btn_add);
        btn_Div = (Button) findViewById(R.id.btn_divide);
        btn_Sub = (Button) findViewById(R.id.btn_sub);
        btn_Mul = (Button) findViewById(R.id.btn_multiply);
        btn_Eql = (Button) findViewById(R.id.btn_eql);
        btn_back = (Button) findViewById(R.id.btn_back);
        btn_clear = (Button) findViewById(R.id.btn_clr);
        editText_Uinput = (EditText) findViewById(R.id.editText_userinput);
        textView_result = (TextView) findViewById(R.id.textview_result);
    }

    private void clear()
    {
        editText_Uinput.setText("");
        textView_result.setText("");

        mAddition=false;
        mDivision=false;
        mSubtract=false;
        mMultiplication=false;
    }

    private void back_button()
    {
        if(editText_Uinput.getText().length() > 0) {
            CharSequence currentText = editText_Uinput.getText();
            editText_Uinput.setText(currentText.subSequence(0, currentText.length()-1));
        }
        else {
            clear();
        }
    }


}
