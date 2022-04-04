package com.example.lecture04_again;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdapter  extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    @NonNull
    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // create a new view
        View v = (View) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.animal_row, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        Animal animal = myAnimals.get(position);
        holder.name.setText(animal.getName());
        holder.age.setText(animal.getAge());
        holder.color.setText(animal.getColor());
    }

    @Override
    public int getItemCount() {
        return myAnimals.size();
    }

    private List<Animal> myAnimals;
    // Provide a suitable constructor (depends on the kind of dataset)
    public ListAdapter(List<Animal> myAnimals) {
        this.myAnimals = myAnimals;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        // each data item is just a string in this case
        public final TextView name;
        public final TextView age;
        public final TextView color;

        public ViewHolder(final View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.animal_name);
            age = (TextView) itemView.findViewById(R.id.animal_age);
            color = (TextView) itemView.findViewById(R.id.animal_color);
        }
    }

}
