package com.example.vntravel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ManHinhXacNhanDi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_xac_nhan_di);
        this.getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        ImageButton btnMucDaTao;
        btnMucDaTao = (ImageButton) findViewById(R.id.btnMucDaTao);
        btnMucDaTao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh9 = new Intent(ManHinhXacNhanDi.this, ManHinhLichTrinh.class);
                startActivity(mh9);
            }
        });
        ImageButton btnThongTinLichTrinh;
        btnThongTinLichTrinh = (ImageButton) findViewById(R.id.btnThongTinLichTrinh);
        btnThongTinLichTrinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh9 = new Intent(ManHinhXacNhanDi.this, ManHinhChiTietXacNhanDi.class);
                startActivity(mh9);
            }
        });

        ImageButton btnDaDi;
        btnDaDi = (ImageButton) findViewById(R.id.btnDaDi);
        btnDaDi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh10 = new Intent(ManHinhXacNhanDi.this, ManHinhDaDi.class);
                startActivity(mh10);
            }
        });
    }
}