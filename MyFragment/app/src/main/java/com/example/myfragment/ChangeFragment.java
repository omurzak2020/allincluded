package com.example.myfragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class ChangeFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private String mParam1;
    private EditText etText;
    private Button btnSend;
    private Button btnreplace;
    private IFragment iFragment;

    public ChangeFragment() {

    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        iFragment = (IFragment) context;
    }

    public static ChangeFragment newInstance(String param1,String param2){
        ChangeFragment fragment = new ChangeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1,param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_change,container,false);
        etText =view.findViewById(R.id.editText);
        btnSend =view.findViewById(R.id.btnSend);
        btnreplace =view.findViewById(R.id.btnReplace);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity activity = (MainActivity) getActivity();
                activity.onSendMessage(etText.getText().toString());
            }
        });

        btnreplace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity activity = (MainActivity) getActivity();
                activity.onReplace();
            }
        });
        return view;
    }

}