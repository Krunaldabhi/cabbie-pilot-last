package com.cabbietransport.pilot.ui.activity.regsiter;

import com.cabbietransport.pilot.base.MvpView;
import com.cabbietransport.pilot.data.network.model.LimoOwnerResponse;
import com.cabbietransport.pilot.data.network.model.SettingsResponse;
import com.cabbietransport.pilot.data.network.model.User;

import java.util.List;

public interface RegisterIView extends MvpView {

    void onSuccess(User user);

    void onSuccess(Object verifyEmail);

    void onSuccess(SettingsResponse response);

    void onSuccess(List<LimoOwnerResponse> response);

    void onError(Throwable e);

    void onSuccessPhoneNumber(Object object);

    void onVerifyPhoneNumberError(Throwable e);

    void onVerifyEmailError(Throwable e);

}
