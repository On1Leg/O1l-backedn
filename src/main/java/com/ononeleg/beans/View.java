package com.ononeleg.beans;

/**
 * Created by ilya on 07/12/2016.
 */
public class View {

    private long viewCount;
    private long numberRequestView;


    public long getViewCount() {
        return viewCount;
    }

    public void setViewCount(long viewCount) {
        this.viewCount = viewCount;
    }

    public long getNumberRequestView() {
        return numberRequestView;
    }

    public void setNumberRequestView(long numberRequestView) {
        this.numberRequestView = numberRequestView;
    }

    public View(long viewCount, long numberRequestView) {
        this.viewCount = viewCount;
        this.numberRequestView = numberRequestView;
    }
}
