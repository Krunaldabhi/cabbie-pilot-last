package com.cabbietransport.pilot.ui.fragment.upcoming;

import com.cabbietransport.pilot.base.MvpView;
import com.cabbietransport.pilot.data.network.model.HistoryList;

import java.util.List;

public interface UpcomingTripIView extends MvpView {

    void onSuccess(List<HistoryList> historyList);
    void onError(Throwable e);
}
