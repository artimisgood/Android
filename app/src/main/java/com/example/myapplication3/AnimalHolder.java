package com.example.myapplication3;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class AnimalHolder extends RecyclerView.ViewHolder {
    private ImageView imageView;
    private TextView textView;

    public AnimalHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.animal_item_image_item);
        textView = itemView.findViewById(R.id.animal_item_text_item);

    }
    public void bindView(Animal animal){
        imageView.setImageResource(animal.getImage());
        textView.setText(animal.getText());
    }
}
