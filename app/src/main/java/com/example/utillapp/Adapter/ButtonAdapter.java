package com.example.utillapp.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.Toast;

import com.example.utillapp.R;

public class ButtonAdapter extends BaseAdapter {


    public interface ButtonClick { // create an interface
        void onClickAtOKButton(int position); // create callback function
    }

    private Context mContext;
    private int btn_id;
    private int total_btns = 9;

    public ButtonAdapter(Context context) {
        this.mContext = context;
    }

    @Override
    public int getCount() {
        return total_btns;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Button btn;

        if (view == null) {
            btn = new Button(mContext);
            btn.setText("Button " + (++btn_id));
            Log.e("TAG1","id"+ "\n" +btn_id);
        } else {
            btn = (Button) view;
        }

//        btn.setOnClickListener(new View.OnClickListener()
//        {
//            @Override
//            public void onClick(View v)
//            {
//                Toast.makeText(v.getContext(), "Button #" + (i + 1), Toast.LENGTH_SHORT).show();
//            }
//        });

        if(btn_id == 1){
            btn.setText("UPLOAD IMAGE");
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(), "Button One" , Toast.LENGTH_SHORT).show();
                }
            });
        }
        else if(btn_id == 2){
            btn.setText("CONTACTS");
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(), "Button Two" , Toast.LENGTH_SHORT).show();
                }
            });
        }




        return btn;
    }
}
