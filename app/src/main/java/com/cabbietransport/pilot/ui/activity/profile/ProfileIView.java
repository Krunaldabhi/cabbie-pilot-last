package com.cabbietransport.pilot.ui.activity.profile;

import com.cabbietransport.pilot.base.MvpView;
import com.cabbietransport.pilot.data.network.model.UserResponse;

public interface ProfileIView extends MvpView {

    void onSuccess(UserResponse user);

    void onSuccessUpdate(UserResponse object);

    void onError(Throwable e);

    void onSuccessPhoneNumber(Object object);

    void onVerifyPhoneNumberError(Throwable e);

}
