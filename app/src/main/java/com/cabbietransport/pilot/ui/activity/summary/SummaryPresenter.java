package com.cabbietransport.pilot.ui.activity.summary;


import com.cabbietransport.pilot.base.BasePresenter;
import com.cabbietransport.pilot.data.network.APIClient;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class SummaryPresenter<V extends SummaryIView> extends BasePresenter<V> implements SummaryIPresenter<V> {
    @Override
    public void getSummary() {
        getCompositeDisposable().add(
                APIClient
                        .getAPIClient()
                        .getSummary("")
                        .subscribeOn(Schedulers.computation())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(
                                trendsResponse -> getMvpView().onSuccess(trendsResponse),
                                throwable -> getMvpView().onError(throwable)
                        )
        );
    }
}
