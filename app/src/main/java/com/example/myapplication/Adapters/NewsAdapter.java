package com.example.myapplication.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Models.News;
import com.example.myapplication.R;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {
    public static NewsAdapter adapter;
    private final LayoutInflater inflater;
    private final List<News> news;
    public NewsAdapter(Context context, List<News> news){
        this.inflater = LayoutInflater.from(context);
        this.news = news;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        News news1 = news.get(position);
        holder.postText.setText(news1.getText());
        holder.authorName.setText(news1.getAutor());
        holder.imageResource.setImageResource(news1.getImageResource());
        holder.authorAvatarResource.setImageResource(news1.getAuthorsAvatarResource());
    }

    @Override
    public int getItemCount() {
        return news.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        final ImageView authorAvatarResource, imageResource;
        final TextView authorName, postText;

        ViewHolder(View view){
            super(view);
            authorAvatarResource = view.findViewById(R.id.authorAvatarResource);
            imageResource = view.findViewById(R.id.imageResource);
            authorName = view.findViewById(R.id.authorName);
            postText = view.findViewById(R.id.postText);
        }
    }
}
