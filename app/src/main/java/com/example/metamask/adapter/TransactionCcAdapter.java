package com.example.metamask.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.metamask.R;
import com.example.metamask.model.TransactionCC;

import java.util.List;

public class TransactionCcAdapter extends BaseAdapter {
    private Context context;
    private List<TransactionCC> list;

    public TransactionCcAdapter(Context context, List<TransactionCC> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        if(position<0)
            return null;

        return list.get(position);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null){
            view = LayoutInflater.from(context).inflate(R.layout.layout_transaction, null);
        }

        TextView txtDateTime = view.findViewById(R.id.txtDateTime);
        ImageView iviconTc= view.findViewById(R.id.ivIconTC);
        TextView txtnameTc= view.findViewById(R.id.txtnameTc);
        TextView txtnameStatus = view.findViewById(R.id.txtnameStatus);
        TextView txttotalEth = view.findViewById(R.id.txttotalEth);
        TextView txttotalUsd = view.findViewById(R.id.txttotalUsd);

        TransactionCC tc = list.get(i);

        txtDateTime.setText(tc.getDateTime());
        iviconTc.setImageResource(tc.getIconTransaction());
        txtnameTc.setText(tc.getNameTransaction());
        txtnameStatus.setText(tc.getNameStatus());
        txttotalEth.setText(tc.getTotalEth());
        txttotalUsd.setText(tc.getTotalUsd());

        if(tc.getIdStatus()==1){
            txtnameStatus.setTextColor(Color.parseColor("#09C400"));
        } else if(tc.getIdStatus()==2){
            txtnameStatus.setTextColor(Color.parseColor("#EA0000"));
        }

        return view;
    }
}
