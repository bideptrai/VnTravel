package com.example.vntravel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;


public class ManHinhCungCapThongTin extends AppCompatActivity {
    Spinner spnGT, spnNS, spnNghe, spnThuNhap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_cung_cap_thong_tin);
        this.getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        //get the spinner from the xml.
        spnGT = findViewById(R.id.spnGT);
    //create a list of items for the spinner.
        String[] items = new String[]{"Giới tính của bạn là", "Nam", "Nữ", "Khác"};
    //create an adapter to describe how the items are displayed, adapters are used in several places in android.
    //There are multiple variations of this, but this is the basic variant.
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
    //set the spinners adapter to the previously created one.
        spnGT.setAdapter(adapter);

        //get the spinner from the xml.
        spnNghe = findViewById(R.id.spnNghe);
        //create a list of items for the spinner.
        String[] items_nghe = new String[]{"Nghề của bạn là", "Học sinh/Sinh viên", "Lao động tự do", "Công nhân", "Kinh doanh", "Khác"};
        //create an adapter to describe how the items are displayed, adapters are used in several places in android.
        //There are multiple variations of this, but this is the basic variant.
        ArrayAdapter<String> adapter_nghe = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items_nghe);
        //set the spinners adapter to the previously created one.
        spnNghe.setAdapter(adapter_nghe);

        //get the spinner from the xml.
        spnThuNhap = findViewById(R.id.spnThuNhap);
        //create a list of items for the spinner.
        String[] items_thunhap = new String[]{"Thu nhập hàng năm", "Dưới 80tr", "80tr - 100tr", "100tr - 150tr", "150tr - 200tr", "8200tr trở lên"};
        //create an adapter to describe how the items are displayed, adapters are used in several places in android.
        //There are multiple variations of this, but this is the basic variant.
        ArrayAdapter<String> adapter_thunhap = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items_thunhap);
        //set the spinners adapter to the previously created one.
        spnThuNhap.setAdapter(adapter_thunhap);

        //get the spinner from the xml.
        spnNS = findViewById(R.id.spnNS);
        //create a list of items for the spinner.
        String[] items_ns = new String[]{"Ngày sinh của bạn"};
        //create an adapter to describe how the items are displayed, adapters are used in several places in android.
        //There are multiple variations of this, but this is the basic variant.
        ArrayAdapter<String> adapter_ns = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items_ns);
        //set the spinners adapter to the previously created one.
        spnNS.setAdapter(adapter_ns);

        Button btnTiep;
        btnTiep = (Button) findViewById(R.id.btnTiep);
        btnTiep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh1 = new Intent(ManHinhCungCapThongTin.this, TrangChu.class);
                startActivity(mh1);
            }
        });
    }
}
