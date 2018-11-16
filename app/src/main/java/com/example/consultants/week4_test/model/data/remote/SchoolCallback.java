package com.example.consultants.week4_test.model.data.remote;

import com.example.consultants.week4_test.model.SchoolProfile.SchoolProfile;

import java.util.List;

public interface SchoolCallback {

    void onSuccess(List<SchoolProfile> venueList);

    void onFailure(String error);

}
