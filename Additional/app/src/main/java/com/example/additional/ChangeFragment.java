package com.example.additional;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ChangeFragment extends Fragment implements IFragment {

    private RecyclerView recyclerView;
    private RecyclerAdapter adapter;
    private ArrayList<Destination> list;

    private static final String ARG_PARAM = "param";
    private static final String ARG_PARAM2 = "param2";
    private static final String ARG_PARAM3 = "param3";
    private String mParam1;
    private String mParam2;
    private int mParam3;

    public static ChangeFragment newInstance(String Param,String Param2,int mParam3){
        ChangeFragment fragment = new ChangeFragment();
        Bundle bundle = new Bundle();
        bundle.putString(ARG_PARAM,param);
        bundle.putString(ARG_PARAM2,param2);
        bundle.putInt(ARG_PARAM3,param3);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null){
            mParam1 =getArguments().getString(ARG_PARAM);
            mParam2 =getArguments().getString(ARG_PARAM2);
            mParam3 =getArguments().getInt(ARG_PARAM3);
        }
    }
}
