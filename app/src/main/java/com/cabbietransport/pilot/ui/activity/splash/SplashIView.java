package com.cabbietransport.pilot.ui.activity.splash;

import com.cabbietransport.pilot.base.MvpView;
import com.cabbietransport.pilot.data.network.model.CheckVersion;

public interface SplashIView extends MvpView {

    void verifyAppInstalled();

    void onSuccess(Object user);

    void onSuccess(CheckVersion user);

    void onError(Throwable e);

    void onCheckVersionError(Throwable e);
}
