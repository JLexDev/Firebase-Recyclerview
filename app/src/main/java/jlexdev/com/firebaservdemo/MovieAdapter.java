package jlexdev.com.firebaservdemo;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

    // No existe la suerte si no la buscas, no existe el resultado si no lo trabajas

public class MovieAdapter extends RecyclerView.Adapter<MovieHolder> {

    private ArrayList<Movie> data;

    public MovieAdapter(ArrayList<Movie> data) {
        this.data = data;
    }
    @NonNull
    @Override
    public MovieHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_list_movie, parent, false);

        return new MovieHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieHolder holder, int position) {

        Movie item = data.get(position);
        holder.bindMovie(item);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
