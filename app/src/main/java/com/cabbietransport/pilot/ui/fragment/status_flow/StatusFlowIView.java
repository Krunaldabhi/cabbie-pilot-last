package com.cabbietransport.pilot.ui.fragment.status_flow;

import com.cabbietransport.pilot.base.MvpView;
import com.cabbietransport.pilot.data.network.model.TimerResponse;

public interface StatusFlowIView extends MvpView {

    void onSuccess(Object object);

    void onWaitingTimeSuccess(TimerResponse object);

    void onError(Throwable e);
}
