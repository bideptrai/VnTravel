package com.example.vntravel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class TrangChu extends AppCompatActivity {
    Button btnSearch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trang_chu);
        this.getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        btnSearch = (Button) findViewById(R.id.btnSearch);
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh1 = new Intent(TrangChu.this, ManHinhTimKiem.class);
                startActivity(mh1);
            }
        });
        Button btnXemTatCa4;
        btnXemTatCa4 = (Button) findViewById(R.id.btnXemTatCa4);
        btnXemTatCa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh2 = new Intent(TrangChu.this, ManHinhDiNhieu.class);
                startActivity(mh2);
            }
        });

        Button btnXemTatCa3;
        btnXemTatCa3 = (Button) findViewById(R.id.btnXemTatCa3);
        btnXemTatCa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh3 = new Intent(TrangChu.this, ManHinhTinhThanh.class);
                startActivity(mh3);
            }
        });

        Button btnXemTatCa1;
        btnXemTatCa1 = (Button) findViewById(R.id.btnXemTatCa1);
        btnXemTatCa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh4 = new Intent(TrangChu.this, ManHinhTourNoiBat.class);
                startActivity(mh4);
            }
        });

        Button btnXemTatCa;
        btnXemTatCa = (Button) findViewById(R.id.btnXemTatCa);
        btnXemTatCa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh5 = new Intent(TrangChu.this, ManHinhGoiY.class);
                startActivity(mh5);
            }
        });
        LinearLayout btnChiTiet;
        btnChiTiet = (LinearLayout) findViewById(R.id.btnChiTietDiaDiem3);
        btnChiTiet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh6 = new Intent(TrangChu.this, ManHinhChiTietDiaDiem.class);
                startActivity(mh6);
            }
        });

        ImageButton btnTinh;
        btnTinh = (ImageButton) findViewById(R.id.btnTinh);
        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh7 = new Intent(TrangChu.this, ManHinhChiTietTinhThanh.class);
                startActivity(mh7);
            }
        });

        ImageButton btnLichTrinh;
        btnLichTrinh = (ImageButton) findViewById(R.id.btnLichTrinh);
        btnLichTrinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh8 = new Intent(TrangChu.this, ManHinhLichTrinh.class);
                startActivity(mh8);
            }
        });

        ImageButton btnTinNhan;
        btnTinNhan = (ImageButton) findViewById(R.id.btnTinNhan);
        btnTinNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh8 = new Intent(TrangChu.this, ManHinhTinNhan.class);
                startActivity(mh8);
            }
        });

        ImageButton btnTaiKhoan;
        btnTaiKhoan = (ImageButton) findViewById(R.id.btnTaiKhoan);
        btnTaiKhoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh8 = new Intent(TrangChu.this, ManHinhTaiKhoan.class);
                startActivity(mh8);
            }
        });
    }
}