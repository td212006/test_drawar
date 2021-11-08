package com.example.test_drawar.ui.info_nurse;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InfoNurseViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public InfoNurseViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("看護師情報");
    }

    public LiveData<String> getText() {
        return mText;
    }
}