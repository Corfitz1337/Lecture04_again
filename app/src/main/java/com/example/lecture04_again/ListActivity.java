package com.example.lecture04_again;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<Animal> animals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        this.animals = new ArrayList<Animal>();
        createModel();

        this.recyclerView = (RecyclerView) findViewById(R.id.animals_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        this.recyclerView.setHasFixedSize(true);

        // adding things to the recycleview
        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        this.recyclerView.addItemDecoration(itemDecoration);

        // use a linear layout manager
        this.layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        this.recyclerView.setLayoutManager(layoutManager);

        // specify an adapter
        this.mAdapter = new ListAdapter(animals);
        this.recyclerView.setAdapter(mAdapter);
    }

    private void createModel(){
        Animal cat = new Animal("3","Black", "Cat");
        animals.add(cat);
        Animal dog = new Animal("1","Yellow", "Dog");
        animals.add(dog);
        Animal bird = new Animal("7","White", "Bird");
        animals.add(bird);
        Animal spider = new Animal("1","Black", "Spider");
        animals.add(spider);
        Animal fish = new Animal("2","Blue", "Fish");
        animals.add(fish);
        Animal whale = new Animal("9","Red", "Whale");
        animals.add(whale);
        Animal frog = new Animal("3","Green", "Frog");
        animals.add(frog);
        Animal frog1 = new Animal("3","Green", "Frog");
        animals.add(frog1);
        Animal frog2 = new Animal("3","Green", "Frog");
        animals.add(frog2);
        Animal frog3 = new Animal("3","Green", "Frog");
        animals.add(frog3);
        Animal frog4 = new Animal("3","Green", "Frog4");
        animals.add(frog4);
        Animal frog5 = new Animal("3","Green", "Frog5");
        animals.add(frog5);
        Animal frog7 = new Animal("3","Green", "Frog6");
        animals.add(frog7);
        Animal frog6 = new Animal("3","Green", "Frog7");
        animals.add(frog6);
    }

}