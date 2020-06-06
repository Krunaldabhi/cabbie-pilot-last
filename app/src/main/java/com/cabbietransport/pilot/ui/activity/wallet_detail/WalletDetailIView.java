package com.cabbietransport.pilot.ui.activity.wallet_detail;

import com.cabbietransport.pilot.base.MvpView;
import com.cabbietransport.pilot.data.network.model.Transaction;

import java.util.ArrayList;

public interface WalletDetailIView extends MvpView {
    void setAdapter(ArrayList<Transaction> myList);
}
