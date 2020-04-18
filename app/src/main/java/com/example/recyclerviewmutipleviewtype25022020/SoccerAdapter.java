package com.example.recyclerviewmutipleviewtype25022020;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class SoccerAdapter extends RecyclerView.Adapter<SoccerAdapter.ItemHolder>{

    private ArrayList<Soccermodel> msoccermodelArrayList;

    public SoccerAdapter() {
        msoccermodelArrayList = new ArrayList<>();
    }
    public void submitData(ArrayList<Soccermodel> soccermodelArrayList){
        if(soccermodelArrayList != null){
            if(msoccermodelArrayList.size()>0){
                msoccermodelArrayList.clear();
                msoccermodelArrayList.addAll(soccermodelArrayList);
            }else{
                msoccermodelArrayList.addAll(soccermodelArrayList);
            }
            notifyDataSetChanged();
        }
    }


    @NonNull
    @Override
    public ItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_layout_food, parent,false);
        return new ItemHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemHolder holder, int position) {
        Soccermodel soccermodel = msoccermodelArrayList.get(position);
        holder.mTvten.setText(soccermodel.getName());
        DecimalFormat decimalFormat = new DecimalFormat("###.###.###");
        holder.mTvgia.setText("$"+decimalFormat.format(soccermodel.getPrice()));
        holder.mTvmota.setText(soccermodel.getName());
        holder.mimg.setImageResource(soccermodel.getHinhanh());

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ItemHolder extends RecyclerView.ViewHolder{

        ImageView mimg;
        TextView mTvten,mTvgia,mTvmota;
        public ItemHolder(@NonNull View itemView) {
            super(itemView);
            mimg = itemView.findViewById(R.id.imagesoccer);
            mTvten = itemView.findViewById(R.id.textviewname);
            mTvgia= itemView.findViewById(R.id.textgia);
            mTvmota = itemView.findViewById(R.id.textmota);
        }
    }
}
