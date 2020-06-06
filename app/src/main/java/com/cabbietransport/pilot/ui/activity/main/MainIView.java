package com.cabbietransport.pilot.ui.activity.main;

import com.cabbietransport.pilot.base.MvpView;
import com.cabbietransport.pilot.data.network.model.SettingsResponse;
import com.cabbietransport.pilot.data.network.model.TripResponse;
import com.cabbietransport.pilot.data.network.model.UserResponse;

public interface MainIView extends MvpView {
    void onSuccess(UserResponse user);

    void onError(Throwable e);

    void onSuccessLogout(Object object);

    void onSuccess(TripResponse tripResponse);

    void onSuccess(SettingsResponse response);

    void onSettingError(Throwable e);

    void onSuccessProviderAvailable(Object object);

    void onSuccessFCM(Object object);

    void onSuccessLocationUpdate(TripResponse tripResponse);

}
