package com.cabbietransport.pilot.ui.activity.reset_password;

import com.cabbietransport.pilot.base.MvpView;

public interface ResetIView extends MvpView {

    void onSuccess(Object object);
    void onError(Throwable e);
}
