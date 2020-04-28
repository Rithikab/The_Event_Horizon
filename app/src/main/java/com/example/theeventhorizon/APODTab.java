package com.example.theeventhorizon;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.widget.Button;
import android.view.View;


public class APODTab extends Fragment {

    private Button amodButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.apod_tab, container, false);

        amodButton = (Button) findViewById(R.id.amod_button);
        amodButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAMOD();
            }
        });

//        amodButton = (R.id.amod_button);
//        amodButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                openAMOD();
//
//            }
//        });
    }

    public void openAMOD() {
        Intent amodIntent = new Intent(this, AMODAct.class);
        startActivity(amodIntent);
    }
}
