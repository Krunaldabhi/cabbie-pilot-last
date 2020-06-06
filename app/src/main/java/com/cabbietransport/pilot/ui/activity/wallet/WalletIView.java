package com.cabbietransport.pilot.ui.activity.wallet;

import com.cabbietransport.pilot.base.MvpView;
import com.cabbietransport.pilot.data.network.model.WalletMoneyAddedResponse;
import com.cabbietransport.pilot.data.network.model.WalletResponse;

public interface WalletIView extends MvpView {

    void onSuccess(WalletResponse response);

    void onSuccess(WalletMoneyAddedResponse response);

    void onError(Throwable e);
}
