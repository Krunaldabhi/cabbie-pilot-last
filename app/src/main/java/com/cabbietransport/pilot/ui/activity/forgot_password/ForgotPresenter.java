package com.cabbietransport.pilot.ui.activity.forgot_password;

import com.cabbietransport.pilot.base.BasePresenter;
import com.cabbietransport.pilot.data.network.APIClient;

import java.util.HashMap;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class ForgotPresenter<V extends ForgotIView> extends BasePresenter<V> implements ForgotIPresenter<V> {

   @Override
    public void forgot(HashMap<String, Object> obj) {
       getCompositeDisposable().add(
               APIClient
                       .getAPIClient()
                       .forgotPassword(obj)
                       .subscribeOn(Schedulers.computation())
                       .observeOn(AndroidSchedulers.mainThread())
                       .subscribe(
                               trendsResponse -> getMvpView().onSuccess(trendsResponse),
                               throwable -> getMvpView().onError(throwable)
                       )
       );
   }
}
