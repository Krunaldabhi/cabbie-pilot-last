package com.cabbietransport.pilot.ui.activity.password;

import com.cabbietransport.pilot.base.MvpView;
import com.cabbietransport.pilot.data.network.model.ForgotResponse;
import com.cabbietransport.pilot.data.network.model.User;

public interface PasswordIView extends MvpView {

    void onSuccess(ForgotResponse forgotResponse);

    void onSuccess(User object);

    void onError(Throwable e);
}
