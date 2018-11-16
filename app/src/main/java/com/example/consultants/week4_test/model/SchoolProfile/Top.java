
package com.example.consultants.week4_test.model.SchoolProfile;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Top implements Serializable
{

    @SerializedName("item")
    @Expose
    private String item;
    @SerializedName("count")
    @Expose
    private int count;
    private final static long serialVersionUID = -117099881437049938L;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
