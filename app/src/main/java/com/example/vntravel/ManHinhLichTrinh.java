package com.example.vntravel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ManHinhLichTrinh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_lich_trinh);
        this.getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        ImageButton btnLichTrinh;
        btnLichTrinh = (ImageButton) findViewById(R.id.btnTrangchu);
        btnLichTrinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh8 = new Intent(ManHinhLichTrinh.this, TrangChu.class);
                startActivity(mh8);
            }
        });
        Button btnTaoLichTrinh;
        btnTaoLichTrinh = (Button) findViewById(R.id.btnTaoLichTrinh);
        btnTaoLichTrinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh8 = new Intent(ManHinhLichTrinh.this, TaoLichTrinh.class);
                startActivity(mh8);
            }
        });

        ImageButton btnThongTinLichTrinh;
        btnThongTinLichTrinh = (ImageButton) findViewById(R.id.btnThongTinLichTrinh);
        btnThongTinLichTrinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh9 = new Intent(ManHinhLichTrinh.this, ManHinhThongTinLichTrinh.class);
                startActivity(mh9);
            }
        });
        ImageButton btnXacNhanDi;
        btnXacNhanDi = (ImageButton) findViewById(R.id.btnXacNhanDi);
        btnXacNhanDi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh10 = new Intent(ManHinhLichTrinh.this, ManHinhXacNhanDi.class);
                startActivity(mh10);
            }
        });

        ImageButton btnDaDi;
        btnDaDi = (ImageButton) findViewById(R.id.btnDaDi);
        btnDaDi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh9 = new Intent(ManHinhLichTrinh.this, ManHinhDaDi.class);
                startActivity(mh9);
            }
        });

        ImageButton btnTrangChu;
        btnTrangChu = (ImageButton) findViewById(R.id.btnTrangchu);
        btnTrangChu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh8 = new Intent(ManHinhLichTrinh.this, TrangChu.class);
                startActivity(mh8);
            }
        });

        ImageButton btnTinNhan;
        btnTinNhan = (ImageButton) findViewById(R.id.btnTinNhan);
        btnTinNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh8 = new Intent(ManHinhLichTrinh.this, ManHinhTinNhan.class);
                startActivity(mh8);
            }
        });
        ImageButton btnTaiKhoan;
        btnTaiKhoan = (ImageButton) findViewById(R.id.btnTaiKhoan);
        btnTaiKhoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh8 = new Intent(ManHinhLichTrinh.this, ManHinhTaiKhoan.class);
                startActivity(mh8);
            }
        });
    }
}