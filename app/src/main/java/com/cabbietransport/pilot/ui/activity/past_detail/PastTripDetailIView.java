package com.cabbietransport.pilot.ui.activity.past_detail;


import com.cabbietransport.pilot.base.MvpView;
import com.cabbietransport.pilot.data.network.model.HistoryDetail;

public interface PastTripDetailIView extends MvpView {

    void onSuccess(HistoryDetail historyDetail);
    void onError(Throwable e);
}
