package com.example.vntravel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ManHinhDangKy extends AppCompatActivity {
    Button btnDangNhap, btnQMK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_dang_ky);
        this.getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        btnDangNhap = (Button) findViewById(R.id.buttonDangNhap);
        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh1 = new Intent(ManHinhDangKy.this, LoginScreen.class);
                startActivity(mh1);
            }
        });
        btnQMK = (Button) findViewById(R.id.btnQuenMK);
        btnQMK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh2 = new Intent (ManHinhDangKy.this, ManHinhLayLaiMatKhau.class);
                startActivity(mh2);
            }
        });
        Button btnDangKy;
        btnDangKy = (Button) findViewById(R.id.btnDangKy);
        btnDangKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh4 = new Intent (ManHinhDangKy.this, ManHinhCungCapThongTin.class);
                startActivity(mh4);
            }
        });
    }
}