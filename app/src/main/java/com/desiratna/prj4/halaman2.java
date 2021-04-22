package com.desiratna.prj4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class halaman2 extends AppCompatActivity {

    @BindView(R.id.txtNama)
    TextView txtNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman2);

        ButterKnife.bind(target:this);

        txtNama = (TextView) findViewById(R.id.txtNama);

        Intent i = getIntent();
        String nama = i.getStringExtra(name: "desi ratna");
        txtNama.setText(nama);
    }
}