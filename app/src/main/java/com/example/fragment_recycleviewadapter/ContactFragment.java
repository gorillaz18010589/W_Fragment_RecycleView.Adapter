package com.example.fragment_recycleviewadapter;

//1.加入api
//2.準備RecycleView 在要灌入的頁面
//3.item頁面設置
//4.Model設定 get/set
//5.設定RecycleView.Adapter
//6.回來後準備好資料
//7.RecycleView 設定

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ContactFragment extends Fragment {
    private List<Contact> contactList;
    private View view;
    private RecyclerView recyclerView;

    public ContactFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_contact, container, false);
        recyclerView = recyclerView.findViewById(R.id.contact_recyclerView);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(),contactList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(recyclerViewAdapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //新增資料上去  new Contact()//建構式給直
        contactList = new ArrayList<>();
        contactList.add(new Contact("hank","123545646",R.drawable.ic_call_black_24dp));
        contactList.add(new Contact("hank","123545646",R.drawable.ic_call_black_24dp));
        contactList.add(new Contact("hank","123545646",R.drawable.ic_call_black_24dp));
        contactList.add(new Contact("hank","123545646",R.drawable.ic_call_black_24dp));
        contactList.add(new Contact("hank","123545646",R.drawable.ic_call_black_24dp));


    }
}
