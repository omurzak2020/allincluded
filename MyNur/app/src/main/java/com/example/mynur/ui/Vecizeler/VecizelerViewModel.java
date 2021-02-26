package com.example.mynur.ui.Vecizeler;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class VecizelerViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public VecizelerViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }

}