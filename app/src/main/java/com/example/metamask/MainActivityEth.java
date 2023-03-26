package com.example.metamask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.metamask.adapter.TransactionCcAdapter;
import com.example.metamask.model.TransactionCC;

import java.util.ArrayList;
import java.util.List;

public class MainActivityEth extends AppCompatActivity {
    private TransactionCcAdapter adapter;
    private List<TransactionCC> list;
    private TextView txtLsEth;

    public MainActivityEth(){
        list = new ArrayList<>();
        list.add(new TransactionCC(1, R.drawable.successful, 1, "Tháng 9 8 tại 11:49 pm", "Đã gửi DAI","Đã xác nhận", "99999 ETH", "-$999"));
        list.add(new TransactionCC(2, R.drawable.fail, 2, "#1 - Tháng 9 8 tại 11:49 pm từ thiết bị này", "Đã gửi DAI","Đã thất bại", "99999 ETH", "-$999"));

        list.add(new TransactionCC(1, R.drawable.successful, 1, "Tháng 9 8 tại 11:49 pm", "Đã gửi DAI","Đã xác nhận", "99999 ETH", "-$999"));
        adapter = new TransactionCcAdapter(this, list);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_eth);
        //Đổi màu thanh status bar
        Window window = getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(Color.parseColor("#fafafa"));
        //Đổi màu chữ status bar
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        ListView listView = findViewById(R.id.lvTransactionCC);

        listView.setAdapter(adapter);

        txtLsEth = findViewById(R.id.txtLsEth);
        txtLsEth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivityEth.this, MainActivityTest.class);
                startActivity(intent);
            }
        });
    }
}