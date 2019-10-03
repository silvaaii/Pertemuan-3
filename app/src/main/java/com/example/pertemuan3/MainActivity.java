package com.example.pertemuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    Button btJumlah;
    EditText etNilai1, etNilai2; etNama;
    RadioButton rbKali, rbBagi, rbTambah, rbKurang;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btJumlah = findViewById(R.id.bt_jumlah);
        etNilai1 = findViewById(R.id.et_nilai1);
        etNilai2 = findViewById(R.id.et_nilai2);
        rbTambah = findViewById(R.id.rb_jumlah);
        rbKurang = findViewById(R.id.rb_kurang);
        rbKali = findViewById(R.id.rb_kali);
        rbBagi = findViewById(R.id.rb_bagi);
        etNama = findViewById(R.id.et_nama);

        btJumlah.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (rbTambah.isChecked()){
                    nilai1 = etNilai1.getText().toString();
                    nilai2 = etNilai2.getText().toString();
                    jumlah = Double.valueOf(etNilai1) + Double.valueOf(etNilai2);
                }
                else if (rbKurang.isChecked()){
                    nilai1 = etNilai1.getText().toString();
                    nilai2 = etNilai2.getText().toString();
                    jumlah = Double.valueOf(etNilai1) - Double.valueOf(etNilai2);
                }

                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("jumlah", jumlah.toString());
                i.putExtra("nama", nama);
                startActivity(i);
            }
        });

    }
}
