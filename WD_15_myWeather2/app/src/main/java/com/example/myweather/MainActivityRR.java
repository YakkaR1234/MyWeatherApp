package com.example.myweather;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivityRR extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_rr);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        RecyclerView recyclerView = findViewById(R.id.recyclevrview);

        List<Item> items = new ArrayList<>();
        items.add(new Item("History", "press the Refresh button to \nrefresh the list", R.drawable.fo_days_pic));
        items.add(new Item("####", "asdufhalsdfua", R.drawable.images));
        items.add(new Item("####", "asdufhalsdfua", R.drawable.images));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(this, items));  // Pass activity context

        int spacingInPixels = getResources().getDimensionPixelSize(R.dimen.recycler_view_item_spacing);
        recyclerView.addItemDecoration(new SpaceItemDecoration(spacingInPixels));




    }
}
