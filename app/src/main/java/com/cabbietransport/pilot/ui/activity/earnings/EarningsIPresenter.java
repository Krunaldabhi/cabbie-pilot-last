package com.cabbietransport.pilot.ui.activity.earnings;


import com.cabbietransport.pilot.base.MvpPresenter;

public interface EarningsIPresenter<V extends EarningsIView> extends MvpPresenter<V> {

    void getEarnings();
}
