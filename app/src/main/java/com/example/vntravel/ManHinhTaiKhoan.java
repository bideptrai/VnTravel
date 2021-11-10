package com.example.vntravel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ManHinhTaiKhoan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_tai_khoan);
        this.getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        ImageButton btnTrangChu;
        btnTrangChu = (ImageButton) findViewById(R.id.btnTrangchu);
        btnTrangChu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh8 = new Intent(ManHinhTaiKhoan.this, TrangChu.class);
                startActivity(mh8);
            }
        });

        ImageButton btnTinNhan;
        btnTinNhan = (ImageButton) findViewById(R.id.btnTinNhan);
        btnTinNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh8 = new Intent(ManHinhTaiKhoan.this, ManHinhTinNhan.class);
                startActivity(mh8);
            }
        });

        ImageButton btnLichTrinh;
        btnLichTrinh = (ImageButton) findViewById(R.id.btnLichTrinh);
        btnLichTrinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh8 = new Intent(ManHinhTaiKhoan.this, ManHinhLichTrinh.class);
                startActivity(mh8);
            }
        });

        ImageButton btnThayDoiThongTin, btnDanhGia, btnVoucher, btnCaiDat;
        btnThayDoiThongTin = (ImageButton) findViewById(R.id.btnThayDoiThongTin);
        btnThayDoiThongTin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh8 = new Intent(ManHinhTaiKhoan.this, ManHinhThongTinNguoiDung.class);
                startActivity(mh8);
            }
        });
        btnDanhGia = (ImageButton) findViewById(R.id.btnDanhGia);
        btnDanhGia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh8 = new Intent(ManHinhTaiKhoan.this, ManHinhDanhGia.class);
                startActivity(mh8);
            }
        });
        btnCaiDat = (ImageButton) findViewById(R.id.btnCaiDat);
        btnCaiDat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh8 = new Intent(ManHinhTaiKhoan.this, ManHinhCaiDat.class);
                startActivity(mh8);
            }
        });
        btnVoucher = (ImageButton) findViewById(R.id.btnVoucher);
        btnVoucher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh8 = new Intent(ManHinhTaiKhoan.this, ManHinhVoucher.class);
                startActivity(mh8);
            }
        });
    }
}