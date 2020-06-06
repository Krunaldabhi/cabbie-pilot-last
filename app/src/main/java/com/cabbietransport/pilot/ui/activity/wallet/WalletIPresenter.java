package com.cabbietransport.pilot.ui.activity.wallet;

import com.cabbietransport.pilot.base.MvpPresenter;

import java.util.HashMap;

public interface WalletIPresenter<V extends WalletIView> extends MvpPresenter<V> {

    void getWalletData();
    void addMoney(HashMap<String, Object> obj);
}
