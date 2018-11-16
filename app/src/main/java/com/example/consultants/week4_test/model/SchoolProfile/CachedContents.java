
package com.example.consultants.week4_test.model.SchoolProfile;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CachedContents implements Serializable
{

    @SerializedName("largest")
    @Expose
    private String largest;
    @SerializedName("non_null")
    @Expose
    private int nonNull;
    @SerializedName("average")
    @Expose
    private String average;
    @SerializedName("null")
    @Expose
    private int _null;
    @SerializedName("top")
    @Expose
    private List<Top> top = null;
    @SerializedName("smallest")
    @Expose
    private String smallest;
    @SerializedName("sum")
    @Expose
    private String sum;
    private final static long serialVersionUID = -445988916034403474L;

    public String getLargest() {
        return largest;
    }

    public void setLargest(String largest) {
        this.largest = largest;
    }

    public int getNonNull() {
        return nonNull;
    }

    public void setNonNull(int nonNull) {
        this.nonNull = nonNull;
    }

    public String getAverage() {
        return average;
    }

    public void setAverage(String average) {
        this.average = average;
    }

    public int getNull() {
        return _null;
    }

    public void setNull(int _null) {
        this._null = _null;
    }

    public List<Top> getTop() {
        return top;
    }

    public void setTop(List<Top> top) {
        this.top = top;
    }

    public String getSmallest() {
        return smallest;
    }

    public void setSmallest(String smallest) {
        this.smallest = smallest;
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

}
