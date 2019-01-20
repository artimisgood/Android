package com.example.myapplication3;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private RecyclerView recyclerView;
    private List<Animal> animals = new ArrayList<>();
    private AnimalAdapter animalAdapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_fragment_layout, container,false);
        recyclerView = view.findViewById(R.id.first_recycle_view);
        for(int i = 0;i < 10; i++) {
            if (i % 2 == 0) {
                Animal temp = new Animal(R.drawable.c, "我是第三种");
                animals.add(temp);
            } else {
                Animal temp = new Animal(R.drawable.b, "我是第二中");
                animals.add(temp);
            }
        }
            animalAdapter = new AnimalAdapter(animals, getContext());
        //设置recyclelayout的布局管理器
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
//        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),2));
        recyclerView.setAdapter(animalAdapter);

        return view;
    }
}
