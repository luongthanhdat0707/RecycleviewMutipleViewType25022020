package com.example.recyclerviewmutipleviewtype25022020;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter <RecyclerView.ViewHolder> {

    private int COUNT_ROW =2;

    private ArrayList<Integer>mArrayListImage;
    private ArrayList<Integer>mArrayListSoocer;

    public MainAdapter() {
        mArrayListImage = new ArrayList<>();
        mArrayListSoocer = new ArrayList<>();
    }
    public void submitListImage(ArrayList<Integer>images){
        if(images!= null && images.size() >0 ){
            if(mArrayListImage.size() > 0 ){
                mArrayListImage.clear();
                mArrayListImage.addAll(images);
                notifyDataSetChanged();
            }
        }
        notifyDataSetChanged();
    }
    public void submitListSoocer(ArrayList<Integer>soccers){
        if(soccers!= null && soccers.size() >0 ){
            if(mArrayListImage.size() > 0 ){
                mArrayListImage.clear();
                mArrayListImage.addAll(soccers);
                notifyDataSetChanged();
            }
        }
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ImageHolder extends RecyclerView.ViewHolder{

        ImageView mImgBanner;
        public ImageHolder(@NonNull View itemView) {
            super(itemView);
            mImgBanner = itemView.findViewById(R.id.imageviewbanner);
        }
    }
    class ListSoccerHolder extends RecyclerView.ViewHolder {

        RecyclerView mRcvsoccer;

        public ListSoccerHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
