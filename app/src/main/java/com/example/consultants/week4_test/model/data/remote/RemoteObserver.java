package com.example.consultants.week4_test.model.data.remote;

import com.example.consultants.week4_test.model.SchoolProfile.SchoolProfile;


import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class RemoteObserver implements Observer<SchoolProfile> {

    public static final String TAG = RemoteObserver.class.getSimpleName() + "_TAG";
    SchoolCallback schoolCallback;

    public RemoteObserver(SchoolCallback callback) {
        this.schoolCallback = callback;

    }

    @Override
    public void onSubscribe(Disposable d) {

    }

    @Override
    public void onNext(SchoolProfile schoolProfile) {
//        TODO need to pass a schoolprofile - only one school, not list
//schoolCallback.onSuccess(schoolProfile.);
    }

    @Override
    public void onError(Throwable e) {

    }

    @Override
    public void onComplete() {

    }
}
