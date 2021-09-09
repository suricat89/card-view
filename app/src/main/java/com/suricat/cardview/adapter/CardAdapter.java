package com.suricat.cardview.adapter;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.suricat.cardview.R;
import com.suricat.cardview.model.Card;

import java.util.List;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.MyViewHolder> {
    private List<Card> cards;

    public CardAdapter(List<Card> cards) {
        this.cards = cards;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View listCards = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_layout, parent, false);

        return new MyViewHolder(listCards);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Card card = this.cards.get(position);
        holder.txtName.setText(card.getName());
        holder.txtDateTime.setText(card.getDate().toString());
        holder.imgPicture.setImageResource(card.getImageId());
        holder.txtDescription.setText(card.getDescription());
    }

    @Override
    public int getItemCount() {
        return cards.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView txtName;
        TextView txtDateTime;
        ImageView imgPicture;
        TextView txtDescription;
        Button btLike;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            txtName = itemView.findViewById(R.id.txtName);
            txtDateTime = itemView.findViewById(R.id.txtDateTime);
            imgPicture = itemView.findViewById(R.id.imgPicture);
            txtDescription = itemView.findViewById(R.id.txtDescription);
            btLike = itemView.findViewById(R.id.btLike);
        }
    }
}
