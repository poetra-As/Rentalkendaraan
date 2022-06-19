package com.example.rentalkendaraan;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.rentalkendaraan.helper.DataHelper;

public class DetailPenyewaActivity extends AppCompatActivity {

    String sNama, sAlamat, sHP, sMerk, sHarga;
    int iLama, iPromo, iTotal;
    double dTotal;

    protected Cursor cursor;
    com.example.rentalkendaraan.helper.DataHelper dbHelper;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_penyewa);

        dbHelper = new DataHelper(this);

        SQLiteDatabase db = dbHelper.getReadableDatabase();
        cursor = db.rawQuery("select * from penyewa, mobil, sewa where penyewa.nama = sewa.nama AND mobil.merk = sewa.merk AND penyewa.nama = '" + getIntent().getStringExtra("nama") + "'", null);
        cursor.moveToFirst();
        if (cursor.getCount() > 0) {
            cursor.moveToPosition(0);
            sNama = cursor.getString(0);
            sAlamat = cursor.getString(1);
            sHP = cursor.getString(2);
            sMerk = cursor.getString(3);
            sHarga = cursor.getString(4);
            iPromo = cursor.getInt(7);
            iLama = cursor.getInt(8);
            dTotal = cursor.getDouble(9);
        }
    }
}