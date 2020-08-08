package jlexdev.com.firebaservdemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    private ArrayList<Movie> movie;


    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main, container, false);


        // Cargar Datos
        movie = new ArrayList<Movie>();



        // Init RV
        recyclerView = view.findViewById(R.id.recycler_movie);
        recyclerView.setHasFixedSize(true);

        // Adapter
        adapter = new MovieAdapter(movie);
        recyclerView.setAdapter(adapter);

        // LayoutManager
        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);

        return view;
    }

}
