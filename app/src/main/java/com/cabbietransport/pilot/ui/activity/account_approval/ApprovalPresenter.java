package com.cabbietransport.pilot.ui.activity.account_approval;

import com.cabbietransport.pilot.base.BasePresenter;
import com.cabbietransport.pilot.data.network.APIClient;

import java.util.HashMap;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class ApprovalPresenter<V extends ApprovalIView> extends BasePresenter<V> implements ApprovalIPresenter<V> {
    @Override
    public void ApprovalHelp() {
        getCompositeDisposable().add(
                APIClient
                        .getAPIClient()
                        .getHelp()
                        .subscribeOn(Schedulers.computation())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(
                                //trendsResponse -> getMvpView().onSuccess(trendsResponse),
                                //  throwable -> getMvpView().onError(throwable)
                        )
        );
    }

    @Override
    public void sendApprovalReminder(HashMap<String, Object> obj) {
        getCompositeDisposable().add(APIClient
                .getAPIClient()
                .sendReminderMessage(obj)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(getMvpView()::onSuccess, getMvpView()::onError));
    }


}
