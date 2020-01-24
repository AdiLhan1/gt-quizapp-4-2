package com.geektech.quizapp_gt_4_2.main;

import android.util.Log;

import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    public MainViewModel() {
        Log.d("ololo", "View model create");
    }

    @Override
    protected void onCleared() {
        super.onCleared();
    }

}
