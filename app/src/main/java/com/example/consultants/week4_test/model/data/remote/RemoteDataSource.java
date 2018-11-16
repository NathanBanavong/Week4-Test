package com.example.consultants.week4_test.model.data.remote;

import android.util.Log;

import com.example.consultants.week4_test.model.SchoolProfile.SchoolProfile;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RemoteDataSource {
    public static final String TAG = RemoteDataSource.class.getSimpleName() + "_TAG";

    private Retrofit createInstance() {
        Log.d(TAG, "createInstance: ");
        return new Retrofit.Builder()
                .baseUrl(NetworkHelper.NYC_URL)
//                use for converting the response using Gson
                .addConverterFactory(GsonConverterFactory.create())
                //using rxjava adapter
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    private RemoteService getRemoteService() {
        Log.d(TAG, "getRemoteService: ");
        return createInstance().create(RemoteService.class);
    }

    //use call object
    public Call<SchoolProfile> getDickVenue() {
        Log.d(TAG, "getDickVenue: ");
        return getRemoteService().getDickUser();    }

    //using rxjava
    public Observable<SchoolProfile> getDickUserObs() {
        Log.d(TAG, "getDickUserObs: ");
        return getRemoteService().getDickUserObs();
    }


}
