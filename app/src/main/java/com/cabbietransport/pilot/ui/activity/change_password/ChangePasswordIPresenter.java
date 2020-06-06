package com.cabbietransport.pilot.ui.activity.change_password;

import com.cabbietransport.pilot.base.MvpPresenter;

import java.util.HashMap;

public interface ChangePasswordIPresenter<V extends ChangePasswordIView> extends MvpPresenter<V> {

    void changePassword(HashMap<String, Object> obj);
}
