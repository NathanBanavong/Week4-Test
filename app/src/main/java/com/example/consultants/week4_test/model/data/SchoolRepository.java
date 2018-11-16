package com.example.consultants.week4_test.model.data;

import android.util.Log;

import com.example.consultants.week4_test.model.data.remote.RemoteDataSource;
import com.example.consultants.week4_test.model.data.remote.RemoteObserver;
import com.example.consultants.week4_test.model.data.remote.SchoolCallback;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class SchoolRepository {
    public static final String TAG = SchoolRepository.class.getSimpleName() + "_TAG";
    RemoteDataSource remoteDataSource;

    public SchoolRepository(RemoteDataSource remoteDataSource) {
        Log.d(TAG, "DickRepository: ");
        this.remoteDataSource = remoteDataSource;
    }

    public void getDickVenue(final SchoolCallback callback) {
        Log.d(TAG, "getDickVenue: ");
        remoteDataSource.getDickUserObs()
//                    make the network call on the worker thread
                .subscribeOn(Schedulers.io())
//                    get the results back on the main thread
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new RemoteObserver(callback));
    }

}
