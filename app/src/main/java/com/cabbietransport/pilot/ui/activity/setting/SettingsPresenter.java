package com.cabbietransport.pilot.ui.activity.setting;

import com.cabbietransport.pilot.base.BasePresenter;
import com.cabbietransport.pilot.data.network.APIClient;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class SettingsPresenter<V extends SettingsIView> extends BasePresenter<V> implements SettingsIPresenter<V> {

    @Override
    public void changeLanguage(String languageID) {
        getCompositeDisposable().add(APIClient
                .getAPIClient()
                .postChangeLanguage(languageID)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(getMvpView()::onSuccess, getMvpView()::onError));
    }
}
