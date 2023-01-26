package com.example.mesteccomerce.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mesteccomerce.R;

import java.util.List;

public class HomeFeedAdapter extends RecyclerView.Adapter<HomeFeedHolder> {

    private Context context;
    private List<String> data;

    public HomeFeedAdapter(Context context, List<String> data){
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public HomeFeedHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.home_feed_item,parent, false);
        return new HomeFeedHolder(view);
    }


    // Where we set the items to be displayed in the view
    @Override
    public void onBindViewHolder(@NonNull HomeFeedHolder holder, int position) {
        String text = data.get(position);
        holder.getTextViewTitle().setText(text);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
