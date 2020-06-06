package com.cabbietransport.pilot.ui.activity.forgot_password;

import com.cabbietransport.pilot.base.MvpView;
import com.cabbietransport.pilot.data.network.model.ForgotResponse;

public interface ForgotIView extends MvpView {

    void onSuccess(ForgotResponse forgotResponse);
    void onError(Throwable e);
}
