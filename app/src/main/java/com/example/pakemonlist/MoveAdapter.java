package com.example.pakemonlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MoveAdapter extends RecyclerView.Adapter<MoveAdapter.MoveViewHolder> {

    ArrayList<String> list;

    public MoveAdapter(ArrayList<String> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public MoveViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_move,parent,false);
        return new MoveViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MoveViewHolder holder, int position) {
        holder.onBind(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MoveViewHolder extends RecyclerView.ViewHolder {
        ImageView nameTv;
        public MoveViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTv = itemView.findViewById(R.id.nameTv);
        }
        public void onBind(String image){
            Glide.with(nameTv).load(image).into(nameTv);
        }
    }
}
