package com.cabbietransport.pilot.ui.activity.wallet_detail;

import com.cabbietransport.pilot.base.BasePresenter;
import com.cabbietransport.pilot.data.network.model.Transaction;

import java.util.ArrayList;

public class WalletDetailPresenter<V extends WalletDetailIView> extends BasePresenter<V> implements WalletDetailIPresenter<V> {
    @Override
    public void setAdapter(ArrayList<Transaction> myList) {
        getMvpView().setAdapter(myList);
    }
}
