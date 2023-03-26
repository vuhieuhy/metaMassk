package com.example.metamask;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.example.metamask.adapter.CryptoCurrencyAdapter;
import com.example.metamask.model.CryptoCurrency;

import java.util.ArrayList;
import java.util.List;

public class MainActivityHome extends AppCompatActivity {
    private CryptoCurrencyAdapter adapter;
    private List<CryptoCurrency> list;
    private DrawerLayout mDrawerLayout;


    public MainActivityHome() {
        list = new ArrayList<>();

        list.add(new CryptoCurrency(1, R.drawable.icon_eth, "0 ETH", "$0"));


        adapter = new CryptoCurrencyAdapter(this, list);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_home);
        //Đổi màu thanh status bar
        Window window = getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(Color.parseColor("#fafafa"));
        //Đổi màu chữ status bar
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        Toolbar toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        mDrawerLayout = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        mDrawerLayout.addDrawerListener(toggle);
        toggle.syncState();



        //ListView lv = findViewById(R.id.lvCC);
        //lv.setAdapter(adapter);


        /**
         lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        CryptoCurrency cc = list.get(i);
        if(cc.getIdCC()==1){
        Intent intent = new Intent(MainActivityHome.this, MainActivityEth.class);
        startActivity(intent);

        }
        }
        });**/

    }
}