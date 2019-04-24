package com.example.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class chat extends AppCompatActivity {

    @BindView(R.id.btnRahma)
    Button btnRahma;
    @BindView(R.id.btnWina)
    Button btnWina;
    @BindView(R.id.btnIrma)
    Button btnIrma;
    @BindView(R.id.btnKembali)
    Button btnKembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        ButterKnife.bind(this);

    }

    @OnClick(R.id.btnRahma)
    void Rahma() {
        Intent a = new Intent(chat.this, chat.class);
        startActivity(a);
        finish();
    }

    @OnClick(R.id.btnWina)
    void Wina() {
        Intent a = new Intent(chat.this, status.class);
        startActivity(a);
        finish();
    }

    @OnClick(R.id.btnIrma)
    void Irma() {
        Intent a = new Intent(chat.this, panggilan.class);
        startActivity(a);
        finish();
    }

    @OnClick(R.id.btnKembali)
    void Kembali() {
        Intent a = new Intent(chat.this, home.class);
        startActivity(a);
        finish();
    }
}


