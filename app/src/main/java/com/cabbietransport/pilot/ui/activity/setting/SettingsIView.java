package com.cabbietransport.pilot.ui.activity.setting;

import com.cabbietransport.pilot.base.MvpView;

public interface SettingsIView extends MvpView {

    void onSuccess(Object o);

    void onError(Throwable e);

}
