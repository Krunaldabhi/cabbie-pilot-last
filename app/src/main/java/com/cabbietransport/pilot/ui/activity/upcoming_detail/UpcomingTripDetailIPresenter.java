package com.cabbietransport.pilot.ui.activity.upcoming_detail;


import com.cabbietransport.pilot.base.MvpPresenter;

public interface UpcomingTripDetailIPresenter<V extends UpcomingTripDetailIView> extends MvpPresenter<V> {

    void getUpcomingDetail(String request_id);

}
