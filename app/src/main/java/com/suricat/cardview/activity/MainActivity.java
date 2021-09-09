package com.suricat.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.suricat.cardview.R;
import com.suricat.cardview.adapter.CardAdapter;
import com.suricat.cardview.model.Card;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerPost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPost = findViewById(R.id.recyclerPost);

        List<Card> cards = getCardList();
        CardAdapter cardAdapter = new CardAdapter(cards);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        // GridLayoutManager layoutManager = new GridLayoutManager(getApplicationContext(), 2);
        recyclerPost.setLayoutManager(layoutManager);
        recyclerPost.setHasFixedSize(true);
        recyclerPost.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerPost.setAdapter(cardAdapter);

    }

    private List<Card> getCardList () {
        List<Card> cards = new ArrayList<>();

        cards.add(new Card("AC/DC", new Date(), R.drawable.ac_dc, "You've been... Thunderstruck!"));
        cards.add(new Card("Queen", new Date(), R.drawable.freddie_mercury, "Freddie Mercury, the myth"));
        cards.add(new Card("Iron Maiden", new Date(), R.drawable.iron_maiden, "Bruce Dickinson flying all arround the world"));
        cards.add(new Card("Guns n' Roses", new Date(), R.drawable.guns_n_roses, "A classic"));
        cards.add(new Card("Nightwish", new Date(), R.drawable.nightwish, "Floor Jansen rocking singing Ghost Love Score"));
        cards.add(new Card("Linkin Park", new Date(), R.drawable.linkin_park, "RIP Chester Bennington"));
        cards.add(new Card("Rammstein", new Date(), R.drawable.rammstein, "Till Lindemann setting fire everywhere"));
        cards.add(new Card("Metallica", new Date(), R.drawable.metallica, "Gimme fuel, gimme fire, gimme that which I desire!"));

        return cards;
    }
}