package moshrouk.android.example.com.recyclerview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    List<Itemlist> itemlists;
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.Recyclerview);
        //recyclerView.setHasFixedSize(true);
        //Then we do a setLayoutManager
        // LinearLayoutManager>>which is to make the Recycler display the items horizontally one under the other
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        itemlists = new ArrayList<>();

        for (int i = 0; i<=20 ; i++) {
            Itemlist itemlist =new Itemlist(
                    "heading " + i ,
                    "description heading");

            itemlists.add(itemlist);

        }
        adapter =new RecyclerAdabter(itemlists,this);
        recyclerView.setAdapter(adapter);

    }
}
