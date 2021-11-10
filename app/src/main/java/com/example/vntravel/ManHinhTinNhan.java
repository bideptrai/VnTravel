package com.example.vntravel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class ManHinhTinNhan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_tin_nhan);
        this.getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        ImageButton btnLichTrinh;
        btnLichTrinh = (ImageButton) findViewById(R.id.btnLichTrinh);
        btnLichTrinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh8 = new Intent(ManHinhTinNhan.this, ManHinhLichTrinh.class);
                startActivity(mh8);
            }
        });
        ImageButton btnTrangChu;
        btnTrangChu = (ImageButton) findViewById(R.id.btnTrangchu);
        btnTrangChu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh8 = new Intent(ManHinhTinNhan.this, TrangChu.class);
                startActivity(mh8);
            }
        });

        ImageView btnChat;
        btnChat = (ImageView) findViewById(R.id.chat1);
        btnChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh8 = new Intent(ManHinhTinNhan.this, ManHinhChiTietTinNhan.class);
                startActivity(mh8);
            }
        });
        ImageView btnThongBao;
        btnThongBao = (ImageView) findViewById(R.id.btnThongBao);
        btnThongBao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh8 = new Intent(ManHinhTinNhan.this, ManHinhThongBao.class);
                startActivity(mh8);
            }
        });
        ImageButton btnTaiKhoan;
        btnTaiKhoan = (ImageButton) findViewById(R.id.btnTaiKhoan);
        btnTaiKhoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh8 = new Intent(ManHinhTinNhan.this, ManHinhTaiKhoan.class);
                startActivity(mh8);
            }
        });
    }
}