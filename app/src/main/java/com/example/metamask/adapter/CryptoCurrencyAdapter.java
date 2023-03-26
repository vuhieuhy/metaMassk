package com.example.metamask.adapter;

import android.content.Context;
import android.graphics.Color;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.metamask.R;
import com.example.metamask.model.CryptoCurrency;

import java.util.List;

public class CryptoCurrencyAdapter extends BaseAdapter {
    private Context context;
    private List<CryptoCurrency> list;

    public CryptoCurrencyAdapter(Context context, List<CryptoCurrency> list) {
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
            view = LayoutInflater.from(context).inflate(R.layout.layout_listview_crypto_currency, null);
        }

        ImageView iviconcc = view.findViewById(R.id.ivIconCC);
        TextView txtnamecc  = view.findViewById(R.id.txtnameCC);
        TextView txttotalcc = view.findViewById(R.id.txttotalCc);

        CryptoCurrency cc = list.get(i);
        iviconcc.setImageResource(cc.getIconCC());
        txtnamecc.setText(cc.getNameCC());
        txttotalcc.setText(cc.getTotalCC());



        return view;
    }
}
