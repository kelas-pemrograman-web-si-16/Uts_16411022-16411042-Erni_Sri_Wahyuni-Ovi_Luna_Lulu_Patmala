package com.example.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class daftar extends AppCompatActivity {
    @BindView(R.id.edNama)
    EditText ednama;
    @BindView(R.id.edemail)
    EditText edemail;
    @BindView(R.id.edpsw)
    EditText edpassword;
    @BindView(R.id.eduser)
    EditText eduser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnd)
    void Daftar() {

        String strnama, stremail, strpsw, struser;

        strnama = ednama.getText().toString();
        stremail = edemail.getText().toString();
        strpsw = edpassword.getText().toString();
        struser = eduser.getText().toString();

        if (strnama.isEmpty() && stremail.isEmpty() && strpsw.isEmpty() && struser.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Lengkapi Data", Toast.LENGTH_LONG).show();

        } else {
            Intent a = new Intent(daftar.this, MainActivity.class);
            a.putExtra("Full Name", strnama);
            a.putExtra("Email", stremail);
            a.putExtra("Password", strpsw);
            a.putExtra("User", struser);
            startActivity(a);
            finish();
        }
    }
}
