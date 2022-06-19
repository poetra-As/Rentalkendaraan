package com.example.rentalkendaraan;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import static android.R.layout.*;

public class PenyewaActivity extends AppCompatActivity  {
    String[] daftar;
    int[] id;
    ListView ListView1;
    Menu menu;
    protected Cursor cursor;
    com.example.rentalkendaraan.helper.DataHelper dbcenter;
    public static PenyewaActivity m;
}
