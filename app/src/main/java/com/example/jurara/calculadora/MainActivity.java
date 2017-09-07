package com.example.jurara.calculadora;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edi;
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnmas,btnmenos,btnentre,btnpor,btnmasmenosn,btnigual,btncls,btnbac;
    String cad="",cad2="";
    float v1=0,v2=0;
    float r= (float) 0.0;
    int ref=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edi=(EditText)findViewById(R.id.editText2);
        btn0=(Button)findViewById(R.id.btn0);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        btnmas=(Button)findViewById(R.id.btnmas);
        btnmenos=(Button)findViewById(R.id.btnmen);
        btnentre=(Button)findViewById(R.id.btne);
        btnpor=(Button)findViewById(R.id.btnx);
        btnmasmenosn=(Button)findViewById(R.id.btnmasmenos);
        btnigual=(Button)findViewById(R.id.btnigu);
        btncls=(Button)findViewById(R.id.btncls);
        btnbac=(Button)findViewById(R.id.btnbac);

        btncls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cad="";

                v1=(float)0.0;
                v2= (float) 0.0;
                r= (float) 0.0;
                ref=0;
                edi.setText("");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cad=edi.getText().toString();
                cad+="0";
                edi.setText(cad);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cad=edi.getText().toString();
                cad+="1";
                edi.setText(cad);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cad=edi.getText().toString();
                cad+="2";
                edi.setText(cad);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cad=edi.getText().toString();
                cad+="3";
                edi.setText(cad);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cad=edi.getText().toString();
                cad+="4";
                edi.setText(cad);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cad=edi.getText().toString();
                cad+="5";
                edi.setText(cad);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cad=edi.getText().toString();
                cad+="6";
                edi.setText(cad);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cad=edi.getText().toString();
                cad+="7";
                edi.setText(cad);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cad=edi.getText().toString();
                cad+="8";
                edi.setText(cad);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cad=edi.getText().toString();
                cad+="9";
                edi.setText(cad);
            }
        });

        btnmas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1=Float.parseFloat(edi.getText().toString());
                edi.setText("");
                ref=1;
            }
        });



        btnmenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edi.getText().toString().equals("")){
                    edi.setText("-");
                }
                if(edi.getText().toString().equals("-")){

                }
                else {
                    v1 = Float.parseFloat(edi.getText().toString());
                    edi.setText("");
                    ref = 2;
                }
            }
        });

        btnpor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1=Float.parseFloat(edi.getText().toString());
                edi.setText("");
                ref=3;
            }
        });

        btnentre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1=Float.parseFloat(edi.getText().toString());
                edi.setText("");
                ref=4;
            }
        });

        btnmasmenosn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1=Float.parseFloat(edi.getText().toString());
                r=v1*-1;
                edi.setText(r+"");
            }
        });

        btnigual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v2=Float.parseFloat(edi.getText().toString());
                switch (ref){
                    case 1:
                        r=v1+v2;
                        edi.setText(r+"");
                        break;
                    case 2:
                        r=v1-v2;
                        edi.setText(r+"");
                        break;
                    case 3:
                        r=v1*v2;
                        edi.setText(r+"");
                        break;
                    case 4:
                        r=v1/v2;
                        edi.setText(r+"");
                        break;
                }
            }
        });

        btnbac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int c;
                c=cad.length();
                for(int i=0;i<c-1;i++){
                    cad2+=cad.charAt(i)+"";
                }
                cad=cad2;
                cad2="";
                edi.setText(cad);
            }
        });

    }
}
