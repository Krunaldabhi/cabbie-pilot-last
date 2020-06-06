package com.cabbietransport.pilot.ui.fragment.past;


import com.cabbietransport.pilot.base.MvpPresenter;

public interface PastTripIPresenter<V extends PastTripIView> extends MvpPresenter<V> {

    void getHistory();

}
