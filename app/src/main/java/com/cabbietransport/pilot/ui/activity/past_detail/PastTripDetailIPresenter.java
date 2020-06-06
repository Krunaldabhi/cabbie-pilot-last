package com.cabbietransport.pilot.ui.activity.past_detail;


import com.cabbietransport.pilot.base.MvpPresenter;

public interface PastTripDetailIPresenter<V extends PastTripDetailIView> extends MvpPresenter<V> {

    void getPastTripDetail(String request_id);
}
