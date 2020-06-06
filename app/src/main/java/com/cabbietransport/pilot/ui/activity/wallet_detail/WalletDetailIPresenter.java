package com.cabbietransport.pilot.ui.activity.wallet_detail;

import com.cabbietransport.pilot.base.MvpPresenter;
import com.cabbietransport.pilot.data.network.model.Transaction;

import java.util.ArrayList;

public interface WalletDetailIPresenter<V extends WalletDetailIView> extends MvpPresenter<V> {
    void setAdapter(ArrayList<Transaction> myList);
}
