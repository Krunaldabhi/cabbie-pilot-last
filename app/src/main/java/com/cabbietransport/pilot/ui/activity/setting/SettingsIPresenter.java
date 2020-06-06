package com.cabbietransport.pilot.ui.activity.setting;

import com.cabbietransport.pilot.base.MvpPresenter;

public interface SettingsIPresenter<V extends SettingsIView> extends MvpPresenter<V> {
    void changeLanguage(String languageID);
}
