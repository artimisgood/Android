package com.example.myapplication3;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class AnimalAdapter extends RecyclerView.Adapter <AnimalHolder>{
    private List<Animal> animals;
    private Context context;
    public AnimalAdapter(List<Animal>animals,Context context){
        this.animals = animals;
        this.context = context;
    }
    @NonNull
    @Override
    public AnimalHolder onCreateViewHolder(@NonNull ViewGroup viewGroup , int i) {
        //通过LayoutInFlater类里的static方法from获取一个对象，这个对象是获取布局UI的，返回一个View类的对象
        View view = LayoutInflater.from(context).inflate(R.layout.animal_item,viewGroup,false);
        AnimalHolder animalHolder = new AnimalHolder(view);
        return animalHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalHolder animalHolder, int i) {
        animalHolder.bindView(animals.get(i));
    }

    @Override
    public int getItemCount() {

        return animals.size();
    }
}
