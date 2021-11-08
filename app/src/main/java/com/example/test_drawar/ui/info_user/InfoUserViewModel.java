package com.example.test_drawar.ui.info_user;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InfoUserViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public InfoUserViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("利用者情報");
    }

    public LiveData<String> getText() {
        return mText;
    }
}