package com.example.navdrawerexample.ui.help;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.navdrawerexample.R;


public class HelpFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View root = inflater.inflate(R.layout.fragment_help, container, false);
        final TextView textView = root.findViewById(R.id.text_help);
        final Button bSurprise = root.findViewById(R.id.bSurprise);



        bSurprise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("BATATA");
            }
        });
        return root;
    }
}
