package com.example.navdrawerexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class EmptyActivity extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_main, container, false);
    }

    public void EmptyActivity(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View view = getView();

        final TextView tv_bolo = view.findViewById(R.id.tv_bolo);
        final Button button_switch = view.findViewById(R.id.button_switch);


        button_switch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_bolo.setText("Eu gosto de bolo de cenoura!");
            }
        });

    }


}
