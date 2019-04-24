package com.example.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class status extends AppCompatActivity {

    @BindView(R.id.txtRahma)
    TextView txtRahma;
    @BindView(R.id.txtWina)
    TextView txtWina;
    @BindView(R.id.txtIrma)
    TextView txtIrma;
    @BindView(R.id.btnKembali)
    Button btnKembali;

    String strRahma, strWina, strIrma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);

        ButterKnife.bind(this);

    }

    @OnClick(R.id.btnKembali)
    void Kembali (){
    Intent a = new Intent(status.this, home.class);
    startActivity(a);
    finish();

    Intent getData = getIntent();
        strRahma = getData.getStringExtra("Rahma");
        strWina = getData.getStringExtra("Wina");
        strIrma = getData.getStringExtra("Irma");

        txtRahma.setText(strRahma);
        txtWina.setText(strWina);
        txtIrma.setText(strIrma);

    }
}

