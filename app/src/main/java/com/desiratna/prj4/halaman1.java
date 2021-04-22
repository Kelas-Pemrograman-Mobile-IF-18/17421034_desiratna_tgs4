package com.desiratna.prj4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class halaman1 extends AppCompatActivity {


    @BindView(R.id.edtNama)
    EditText edtNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman1);
        ButterKnife.bind(target: this);

    }
    @OnClick(R.id.btnPindah)
    void pindah(){
        String nama = edtNama.getText().toString();
        Intent i = new Intent( packageContext: Halaman1.this, Halaman2.class);
        i.putExtra(name: "nama", nama);
        startActivity(i);
        finish();
    }
}