package com.puri_knight.ieazy.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment; // should get fragment by Thian
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.puri_knight.ieazy.R;

import java.util.zip.Inflater;

/**
 * Created by Puri.knight379 on 10/7/2017.
 */

public class MainFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main,container,false);
        //container get all container
        return view;
    }
}// Main Class
