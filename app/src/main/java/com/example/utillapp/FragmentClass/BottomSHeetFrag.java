package com.example.utillapp.FragmentClass;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.utillapp.Adapter.ButtonAdapter;
import com.example.utillapp.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import org.jetbrains.annotations.NotNull;

public class BottomSHeetFrag extends BottomSheetDialogFragment{

   public GridView gridView ;

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView( @NotNull LayoutInflater inflater, @Nullable  ViewGroup container, @Nullable  Bundle savedInstanceState) {
        //TODO Patch our bottom up dailog xml here in this view to connect with this fragment

        View v = inflater.inflate(R.layout.bottom_sheet,container,false);
        gridView = (GridView) v.findViewById(R.id.greed_view1);
        gridView.setAdapter(new ButtonAdapter(getActivity()));

        return v;
    }


}
