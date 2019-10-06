package com.ahmetoguzdavarci.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvSonuc;
    Button  btnTemizle, btnSolParantez, btnSagParantez, btnBol, btnCarp, btnTopla, btnCikar,
            btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnEsittir, btnYuzde, btnVirgul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvSonuc =findViewById(R.id.sonuc);
        btnTemizle =findViewById(R.id.hepsini_sil);
        btnSolParantez =findViewById(R.id.sol_parantez);
        btnSagParantez =findViewById(R.id.sag_parantez);
        btnBol =findViewById(R.id.bolme);
        btnCarp =findViewById(R.id.carpma);
        btnTopla =findViewById(R.id.toplama);
        btnCikar =findViewById(R.id.cikarma);
        btn0 =findViewById(R.id.sifir);
        btn1 =findViewById(R.id.bir);
        btn2 =findViewById(R.id.iki);
        btn3 =findViewById(R.id.uc);
        btn4 =findViewById(R.id.dort);
        btn5 =findViewById(R.id.bes);
        btn6 =findViewById(R.id.alti);
        btn7 =findViewById(R.id.yedi);
        btn8 =findViewById(R.id.sekiz);
        btn9 =findViewById(R.id.dokuz);
        btnEsittir =findViewById(R.id.esittir);
        btnYuzde =findViewById(R.id.yüzde);
        btnVirgul =findViewById(R.id.virgül);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {tvSonuc.setText(tvSonuc.getText().toString()+"0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {tvSonuc.setText(tvSonuc.getText().toString()+"1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {tvSonuc.setText(tvSonuc.getText().toString()+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {tvSonuc.setText(tvSonuc.getText().toString()+"3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {tvSonuc.setText(tvSonuc.getText().toString()+"4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {tvSonuc.setText(tvSonuc.getText().toString()+"5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {tvSonuc.setText(tvSonuc.getText().toString()+"6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {tvSonuc.setText(tvSonuc.getText().toString()+"7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {tvSonuc.setText(tvSonuc.getText().toString()+"8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {tvSonuc.setText(tvSonuc.getText().toString()+"9");
            }
        });

        btnBol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {tvSonuc.setText(tvSonuc.getText()+"/");
            }
        });

        btnCarp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {tvSonuc.setText(tvSonuc.getText()+"*");
            }
        });

        btnCikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {tvSonuc.setText(tvSonuc.getText()+"-");
            }
        });

        btnTopla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {tvSonuc.setText(tvSonuc.getText()+"+");
            }
        });

        btnSolParantez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {tvSonuc.setText(tvSonuc.getText()+"(");
            }
        });

        btnSagParantez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {tvSonuc.setText(tvSonuc.getText()+")");
            }
        });

        btnVirgul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {tvSonuc.setText(tvSonuc.getText()+",");
            }
        });

        btnTemizle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvSonuc.setText(tvSonuc.getHint());
            }
        });

    }
}
