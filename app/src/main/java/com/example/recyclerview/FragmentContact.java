package com.example.recyclerview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FragmentContact extends Fragment {

    private RecyclerView recyclerView;
    private List<Contact> lstcontact;
    private LinearLayout linearLayout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.contact_fragment, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycle_view);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(), lstcontact);


        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(recyclerViewAdapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstcontact = new ArrayList<>();
        lstcontact.add(new Contact("Mitul Sharma", "9999999999", R.drawable.mypic));
        lstcontact.add(new Contact("Peter", "8888888888", R.drawable.ic_info_black_24dp));
        lstcontact.add(new Contact("John", "7777777777", R.drawable.ic_call_black_24dp));
        lstcontact.add(new Contact("Kim", "6666666666", R.drawable.ic_call_black_24dp));
        lstcontact.add(new Contact("Peter", "5555555555", R.drawable.ic_info_black_24dp));
        lstcontact.add(new Contact("John", "4444444444", R.drawable.ic_call_black_24dp));
    }

}
