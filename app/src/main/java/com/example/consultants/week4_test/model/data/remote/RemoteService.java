package com.example.consultants.week4_test.model.data.remote;

import com.example.consultants.week4_test.model.SchoolProfile.SchoolProfile;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface RemoteService {


    @GET("api/venue/")
    Call<SchoolProfile> getDickUser();

    //    using the rxjava observable
    @GET("api/venue/")
    Observable<SchoolProfile> getDickUserObs();
}
