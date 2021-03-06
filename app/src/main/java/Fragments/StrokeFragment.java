package Fragments;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ultimatesketchbookproject.R;

import ViewModels.StrokeViewModel;

public class StrokeFragment extends Fragment {

    public static StrokeFragment newInstance() {
        return new StrokeFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        StrokeViewModel mViewModel = new ViewModelProvider(requireActivity()).get(StrokeViewModel.class);
        return inflater.inflate(R.layout.fragment_stroke, container, false);
    }

}