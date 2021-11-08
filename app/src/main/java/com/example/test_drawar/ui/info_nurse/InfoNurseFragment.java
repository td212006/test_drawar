package com.example.test_drawar.ui.info_nurse;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.test_drawar.R;
import com.example.test_drawar.databinding.FragmentInfoNurseBinding;

public class InfoNurseFragment extends Fragment {

    private InfoNurseViewModel InfoNurseViewModel;
    private FragmentInfoNurseBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        InfoNurseViewModel =
                new ViewModelProvider(this).get(InfoNurseViewModel.class);

        binding = FragmentInfoNurseBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textInfoNurse;
        InfoNurseViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}