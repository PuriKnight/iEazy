package com.puri_knight.ieazy.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment; // should get fragment by Thian
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.puri_knight.ieazy.R;

import java.util.zip.Inflater;

/**
 * Created by Puri.knight379 on 10/7/2017.
 */

public class MainFragment extends Fragment{
    //Explicit
    private ImageView imageView;
    private Button decButton, incButton;
// My Constant


    private int[] imageInts = new int[]{
            R.drawable.iconluv1,
            R.drawable.iconluv2,
            R.drawable.iconluv3,
    };

    private int indexInt = 0;


    @Nullable


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main,container,false);
        //container get all container
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

         // Initial Veiw
                 initialView();

        // Increase Controller
        increaseController();
        // Decrease Controller


        decreaseController();



    }

    private void decreaseController() {
        decButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (indexInt <= 0) {
                    indexInt = imageInts.length -1;

                } else {
                    indexInt -= 1;
                }
                imageView.setImageResource(imageInts[indexInt]);
            }
        });
    }

    private void increaseController() {

        final String tag = "8OctV1";

        incButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(tag, "Length of Array ==> " + imageInts.length);
                if (indexInt < imageInts.length-1) {

                // ImageInt.length is parameter of Image

                //Todo
                    indexInt += 1;

                } else {
                    indexInt = 0;
                }
                Log.d(tag, "Current index ==> " + indexInt);
                imageView.setImageResource(imageInts[indexInt]);

            } // OnClick
        });
    }

    private void initialView() {
        imageView = (ImageView) getView().findViewById(R.id.imvImage);
        decButton = (Button) getView().findViewById(R.id.btnDecrease);
        incButton = (Button) getView().findViewById(R.id.btnIncrease);
    }
}// Main Class
