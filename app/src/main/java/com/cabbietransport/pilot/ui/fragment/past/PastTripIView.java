package com.cabbietransport.pilot.ui.fragment.past;


import com.cabbietransport.pilot.base.MvpView;
import com.cabbietransport.pilot.data.network.model.HistoryList;

import java.util.List;

public interface PastTripIView extends MvpView {

    void onSuccess(List<HistoryList> historyList);
    void onError(Throwable e);
}
