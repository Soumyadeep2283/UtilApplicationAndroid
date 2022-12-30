package com.example.utillapp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.example.utillapp.Adapter.ButtonAdapter;
import com.example.utillapp.FragmentClass.BottomSHeetFrag;
import com.example.utillapp.R;
import com.google.android.material.snackbar.Snackbar;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class UtillActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView menu_img ;
    public PopupWindow mypopupWindow;
    Button modelBottomButton ;
    public GridView gridView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utill);
        setUiComponent();
    }

    private void setUiComponent() {

        menu_img = findViewById(R.id.menu_img);
        modelBottomButton = findViewById(R.id.btn_showSheet);
        menu_img.setOnClickListener(this);
        modelBottomButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v == menu_img){
            openMenu();
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                mypopupWindow.showAsDropDown(v,0 ,0, Gravity.NO_GRAVITY); //new Added 14-10-2022
            }
        }
        if(v == modelBottomButton){
            //TODO bottom Model button Sheet Work will be done Here....
//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {}
            Toast.makeText(this,"Botton",Toast.LENGTH_LONG).show();
            BottomSHeetFrag bottomSHeetFrag = new BottomSHeetFrag();
            bottomSHeetFrag.show(getSupportFragmentManager(),"ExampleofBottomsheet");
        }

    }

    private void openMenu() {


        View view ;
        LayoutInflater inflater = (LayoutInflater)
                getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.menu_layout_dashboard, null);

        TextView Call, HealthDetails,Others,Logout;
        Call = view.findViewById(R.id.call_emergency);
        HealthDetails = view.findViewById(R.id.healthdetails);
        Others = view.findViewById(R.id.others_func);
        Logout = view.findViewById(R.id.logout);


        Call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    String number="8918400643";  //Todo this number will be replace after it works
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:"+number));
                    startActivity(callIntent);
                }catch (Exception ex){
                    ex.printStackTrace();
                    Log.e("TAG1","Error" +ex.toString());
                }


            }
        });


        HealthDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        Others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        Logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

//        mypopupWindow = new PopupWindow(view,480, 460, true);  //Closed due to test 14-10-2022
        mypopupWindow = new PopupWindow(view, ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT,true);




    }
}