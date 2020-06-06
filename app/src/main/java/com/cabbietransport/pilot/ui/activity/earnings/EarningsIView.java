package com.cabbietransport.pilot.ui.activity.earnings;


import com.cabbietransport.pilot.base.MvpView;
import com.cabbietransport.pilot.data.network.model.EarningsList;

public interface EarningsIView extends MvpView {

    void onSuccess(EarningsList earningsLists);

    void onError(Throwable e);
}
