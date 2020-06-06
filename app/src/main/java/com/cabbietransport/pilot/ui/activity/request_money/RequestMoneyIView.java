package com.cabbietransport.pilot.ui.activity.request_money;

import com.cabbietransport.pilot.base.MvpView;
import com.cabbietransport.pilot.data.network.model.RequestDataResponse;

public interface RequestMoneyIView extends MvpView {

    void onSuccess(RequestDataResponse response);
    void onSuccess(Object response);
    void onError(Throwable e);

}
