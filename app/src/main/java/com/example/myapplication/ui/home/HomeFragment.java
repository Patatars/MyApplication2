package com.example.myapplication.ui.home;



import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Adapters.NewsAdapter;
import com.example.myapplication.Models.News;
import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentHomeBinding;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {


    private FragmentHomeBinding binding;
    private TextView date;
    private TextView event;

    @SuppressLint("DefaultLocale")
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        date = root.findViewById(R.id.date);
        event = root.findViewById(R.id.eventName);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            date.setText(String.format("%d.%d", LocalDate.now().getDayOfMonth(),LocalDate.now().getMonth().getValue() ));
        }
        event.setText("Фестиваль мыльных пузырей");
        RecyclerView recyclerView = root.findViewById(R.id.recyclerView);
        recyclerView.setAdapter(NewsAdapter.adapter);


        return root;
    }




    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}