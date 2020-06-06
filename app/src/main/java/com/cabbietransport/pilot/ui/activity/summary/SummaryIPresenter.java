package com.cabbietransport.pilot.ui.activity.summary;


import com.cabbietransport.pilot.base.MvpPresenter;

public interface SummaryIPresenter<V extends SummaryIView> extends MvpPresenter<V> {

    void getSummary();
}
