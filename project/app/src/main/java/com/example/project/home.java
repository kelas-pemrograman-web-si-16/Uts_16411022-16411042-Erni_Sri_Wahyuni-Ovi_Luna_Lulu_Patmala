package com.example.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class home extends AppCompatActivity {

    @BindView(R.id.btnChat)
    Button btnChat;
    @BindView(R.id.btnStatus)
    Button btnStatus;
    @BindView(R.id.btnPanggilan)
    Button btnPanggilan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnChat)
    void Chat() {
        Intent a = new Intent(home.this, chat.class);
        startActivity(a);
        finish();
    }

    @OnClick(R.id.btnStatus)
    void Status() {
        Intent a = new Intent(home.this, status.class);
        startActivity(a);
        finish();
    }

    @OnClick(R.id.btnPanggilan)
    void Panggilan() {
        Intent a = new Intent(home.this, panggilan.class);
        startActivity(a);
        finish();

    }
}
