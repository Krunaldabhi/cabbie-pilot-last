package com.cabbietransport.pilot.ui.fragment.upcoming;


import com.cabbietransport.pilot.base.MvpPresenter;

public interface UpcomingTripIPresenter<V extends UpcomingTripIView> extends MvpPresenter<V> {

    void getUpcoming();

}
