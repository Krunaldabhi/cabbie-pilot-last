package com.cabbietransport.pilot.ui.activity.forgot_password;

import com.cabbietransport.pilot.base.MvpPresenter;

import java.util.HashMap;

public interface ForgotIPresenter<V extends ForgotIView> extends MvpPresenter<V> {

    void forgot(HashMap<String, Object> obj);

}
