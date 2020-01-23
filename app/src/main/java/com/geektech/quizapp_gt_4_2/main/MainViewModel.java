package com.geektech.quizapp_gt_4_2.main;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    public MutableLiveData<Integer> counter = new MutableLiveData<>();
    private int num = 0;

    public MainViewModel() {
        Log.d("ololo", "View model create");
    }

    public void onLoginClick() {

    }

    public void increaceNum() {
        Log.e("TAG", "increaceNum: ");
        num = num + 1;
        counter.setValue(num);
    }

    public void decreaceNum() {
        Log.e("TAG", "increaceNum: ");
        num--;
        counter.setValue(num);
    }

    @Override
    protected void onCleared() {
        super.onCleared();
    }

}
