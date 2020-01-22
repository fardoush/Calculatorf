package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TextView result;
    private Button clear,memory_plus,persent,del,one,two,three,four,five,six,seven,eight,nine,zero,add,sub,mul,div,point,equal;
    Boolean first_input= false;
    Boolean first_action= false;
    Boolean val_1 = false;
    Boolean val_2 = false;
    double value_1 = 0.0;
    double value_2 = 0.0;

String process;
String sign= "";
//    boolean checkbracket = false;

    ArrayList<Double> tempfigure = new ArrayList<Double>();
    double tempfigure1;
    double memory1 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

result.setText("0");
first_input= true;

clear.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        result.setText("0");
        first_input= true;
        first_action=true;
    }
});

one.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
//        result.setText("1");

        if (first_input){
            result.setText("1");
            first_input=false;


        }
        else {
            result.setText(String.format("%s%s",result.getText().toString(),"1"));
        }

        first_action= true;
    }
});

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//        result.setText("1");

                if (first_input){
                    result.setText("2");
                    first_input=false;


                }
                else {
                    result.setText(String.format("%s%s",result.getText().toString(),"2"));
                }

                first_action=true;
            }
        });


        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//        result.setText("1");

                if (first_input){
                    result.setText("3");
                    first_input=false;


                }
                else {
                    result.setText(String.format("%s%s",result.getText().toString(),"3"));
                }
                first_action= true;

            }
        });


        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//        result.setText("1");

                if (first_input){
                    result.setText("4");
                    first_input=false;


                }
                else {
                    result.setText(String.format("%s%s",result.getText().toString(),"4"));
                }
                first_action= true;

            }
        });


        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//        result.setText("1");

                if (first_input){
                    result.setText("5");
                    first_input=false;


                }
                else {
                    result.setText(String.format("%s%s",result.getText().toString(),"5"));
                }
                first_action= true;

            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//        result.setText("1");

                if (first_input){
                    result.setText("6");
                    first_input=false;


                }
                else {
                    result.setText(String.format("%s%s",result.getText().toString(),"6"));
                }
                first_action= true;

            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//        result.setText("1");

                if (first_input){
                    result.setText("7");
                    first_input=false;


                }
                else {
                    result.setText(String.format("%s%s",result.getText().toString(),"7"));
                }
                first_action= true;

            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//        result.setText("8");

                if (first_input){
                    result.setText("8");
                    first_input=false;


                }
                else {
                    result.setText(String.format("%s%s",result.getText().toString(),"8"));
                }
                first_action= true;

            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//        result.setText("1");

                if (first_input){
                    result.setText("9");
                    first_input=false;


                }
                else {
                    result.setText(String.format("%s%s",result.getText().toString(),"9"));
                }
                first_action= true;

            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//        result.setText("1");

                if (first_input){
                    result.setText("0");
                    first_input=false;


                }
                else {
                    result.setText(String.format("%s%s",result.getText().toString(),"0"));
                }
                first_action= true;

            }
        });

        add.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                sign="+";
                if(first_action){
                    if(!val_1){
                        value_1= Double.valueOf( result.getText().toString());
                        val_1=true;

                    }
                    else{
                        value_2=Double.valueOf(result.getText().toString());
                    }
                    first_action = false ;
                }
                result.setText("+ ");
                first_input = true;
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign="-";

                if(first_action){
                    if(!val_1){
                        value_1 = Double.valueOf(result.getText().toString());
                        val_1=true;
                    }
                    else {
                        value_2= Double.valueOf(result.getText().toString());

                    }
                    first_action=false;
                }
                result.setText("-");
                first_input=true;

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign="*";

                if(first_action){
                    if(!val_1){
                        value_1 = Double.valueOf(result.getText().toString());
                        val_1=true;
                    }
                    else {
                        value_2= Double.valueOf(result.getText().toString());

                    }
                    first_action=false;
                }
                result.setText("*");
                first_input=true;

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign="/";

                if(first_action){
                    if(!val_1){
                        value_1 = Double.valueOf(result.getText().toString());
                        val_1=true;
                    }
                    else {
                        value_2= Double.valueOf(result.getText().toString());

                    }
                    first_action=false;
                }
                result.setText("/");
                first_input=true;

            }
        });

        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=result.getText().toString();
                s=s.substring(0,result.length()-1);
                result.setText(s);
            }
        });




//        del.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//
//                if (result.length()>0){
//
//                    for (int i=1;i<=result.length();i--){
//
//
//                        if (first_input){
//                            result.setText("");
//                            first_input=false;
//
//
//                        }
//                        else {
//                            result.setText(String.format("%s%s",result.getText().toString()," "));
//                        }
//                        first_action= true;
//
//                    }
//                }
//
//
//
//            }
//        });

        memory_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tempfigure.add(Double.parseDouble(result.getText().toString()));
                memory1=memory1+tempfigure.get(0);
                tempfigure1=0;
                tempfigure.removeAll(tempfigure);
                result.setText("0");
                if (memory1 >0) { result.setText("Memory saved");}
            }
        });
 persent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


//
//                process = result.getText().toString();
//            result.setText(process+"%");
//

                sign="%";

                if(first_action){
                    if(!val_1){
                        value_1 = Double.valueOf(result.getText().toString());
                        val_1=true;
                    }
                    else {
                        value_2= Double.valueOf(result.getText().toString());

                    }
                    first_action=false;
                }
                result.setText("%");
                first_input=true;



            }
        });







        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (first_action){
                    if (!val_1){
                        value_1= Double.valueOf(result.getText().toString());
                        val_1=false;
                    }
                    else {
                        value_2=Double.valueOf(result.getText().toString());
                    }
                    if (sign.equals("+")){

                        double sum= value_1+ value_2;
                        result.setText(String.valueOf(sum));
                    }
                    else if(sign.equals("-")){
                        double sum = value_1 - value_2;
                        result.setText(String.valueOf(sum));
                    }

                    else if(sign.equals("*")){
                        double sum = value_1 * value_2;
                        result.setText(String.valueOf(sum));
                    }

                    else if(sign.equals("/")){
                        double sum = value_1 / value_2;
                        result.setText(String.valueOf(sum));
                    }
                     else if(sign.equals("%")){
                        double sum = (value_1 * value_2)/100;
                        result.setText(String.valueOf(sum));
                    }


                    else {
                        result.setText(result.getText());
                    }

                }
                else {
                    result.setText("Error");
                }
                value_1=0;
                value_2=0;
                val_1=false;
                first_action=true;
                first_input=true;
            }
        });


    }

    private void initView() {
        result = findViewById(R.id.result);



        clear= findViewById(R.id.clearId);
        memory_plus = findViewById(R.id.mplasId);
        persent = findViewById(R.id.mId);
        del= findViewById(R.id.delId);
        seven= findViewById(R.id.sevenId);
        eight = findViewById(R.id.eightId);
        nine =  findViewById(R.id.nineId);
        div= findViewById(R.id.divId);
        four =  findViewById(R.id.fourId);
        five=  findViewById(R.id.fiveId);
        six= findViewById(R.id.sixId);
        mul =  findViewById(R.id.mulId);
        one= findViewById(R.id.oneId);
        two =  findViewById(R.id.twoId);
        three = findViewById(R.id.threeId);
        sub= findViewById(R.id.subId);
        zero =  findViewById(R.id.zeroId);
        point= findViewById(R.id.pointId);
        equal = findViewById(R.id.equalId);
        add =  findViewById(R.id.addId);

    }
}
