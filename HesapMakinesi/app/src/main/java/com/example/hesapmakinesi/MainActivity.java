package com.example.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnC,btnSonuc,btnTopla,btnCikar,btnCarp,btnBolme;
    EditText etxt;
    private float ilkdeger=0;
    private double sonuc=0;
    private String  islem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etxt =findViewById(R.id.etxt);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnSonuc = findViewById(R.id.btnSonuc);
        btnC = findViewById(R.id.btnC);
        btnTopla = findViewById(R.id.btnTopla);
        btnCikar = findViewById(R.id.btnCikar);
        btnCarp = findViewById(R.id.btnCarp);
        btnBolme = findViewById(R.id.btnBolme);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etxt.setText(etxt.getText() +  "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etxt.setText(etxt.getText() +  "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etxt.setText(etxt.getText() +  "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etxt.setText(etxt.getText() +  "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etxt.setText(etxt.getText() +  "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etxt.setText(etxt.getText() +  "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etxt.setText(etxt.getText() +  "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etxt.setText(etxt.getText() +  "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etxt.setText(etxt.getText() +  "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etxt.setText(etxt.getText() +  "9");
            }
        });

       /* btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnSonuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnTopla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etxt.setText(etxt.getText() +  "+");
            }
        });

        btnCikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etxt.setText(etxt.getText() +  "-");
            }
        });

        btnCarp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etxt.setText(etxt.getText() +  "*");
            }
        });

        btnBolme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etxt.setText(etxt.getText() +  "/");
            }
        });*/

       try {

           btnC.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {

                   ilkdeger=0;
                   sonuc=0;
                   etxt.setText("");
               }
           });
       }
       catch (Exception e){

           Toast.makeText(getApplicationContext(),"Değer Giriniz...",Toast.LENGTH_LONG).show();
       }
        try {

            btnTopla.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(!etxt.getText().toString().equals("")){
                        ilkdeger=Float.parseFloat(etxt.getText().toString());
                        etxt.setText("");
                        islem = "Toplama";

                    }
                }
            });
        }
        catch (Exception e){

            Toast.makeText(getApplicationContext(),"Değer Giriniz...",Toast.LENGTH_LONG).show();
        }
        try {

            btnCikar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(!etxt.getText().toString().equals("")){
                        ilkdeger=Float.parseFloat(etxt.getText().toString());
                        etxt.setText("");
                        islem = "Cikarma";

                    }
                }
            });
        }
        catch (Exception e){

            Toast.makeText(getApplicationContext(),"Değer Giriniz...",Toast.LENGTH_LONG).show();
        }
        try {

            btnCarp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(!etxt.getText().toString().equals("")){
                        ilkdeger=Float.parseFloat(etxt.getText().toString());
                        etxt.setText("");
                        islem = "Carpma";

                    }
                }
            });
        }
        catch (Exception e){

            Toast.makeText(getApplicationContext(),"Değer Giriniz...",Toast.LENGTH_LONG).show();
        }

        try {

            btnBolme.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(!etxt.getText().toString().equals("")){
                        ilkdeger=Float.parseFloat(etxt.getText().toString());
                        etxt.setText("");
                        islem = "Bolme";

                    }
                }
            });
        }
        catch (Exception e){

            Toast.makeText(getApplicationContext(),"Değer Giriniz...",Toast.LENGTH_LONG).show();
        }



            btnSonuc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (!etxt.getText().toString().equals("") && !String.valueOf(ilkdeger).equals("0")){

                        if (islem.equals("Toplama")){

                            sonuc = ilkdeger + Float.parseFloat(etxt.getText().toString());
                        }
                        else if (islem.equals("Cikarma")){

                            sonuc = ilkdeger - Float.parseFloat(etxt.getText().toString());
                        }
                        else if (islem.equals("Carpma")){

                            sonuc = ilkdeger * Float.parseFloat(etxt.getText().toString());
                        }
                        else if (islem.equals("Bolme")){

                            sonuc = ilkdeger / Float.parseFloat(etxt.getText().toString());
                        }

                    etxt.setText(String.valueOf(sonuc));
                    ilkdeger=0;
                    sonuc=0;
                    }
                    else{

                        Toast.makeText(getApplicationContext(),"Degerler Giriniz...",Toast.LENGTH_LONG).show();
                    }
                }
            });
    }
}
