package com.example.sayla.bakhtiyarandroidfragment;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragement1 extends Fragment {

Pass p;
    public Fragement1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragement1, container, false);
    }
    public interface Pass{
        void onlick(String name);

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        p = (Pass) context;
    }

    public void func(View v){
        p.onlick("asdf");
    }

}
