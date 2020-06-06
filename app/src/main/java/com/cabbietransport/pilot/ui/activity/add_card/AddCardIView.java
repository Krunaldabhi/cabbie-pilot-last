package com.cabbietransport.pilot.ui.activity.add_card;

import com.cabbietransport.pilot.base.MvpView;

public interface AddCardIView extends MvpView {

    void onSuccess(Object card);

    void onError(Throwable e);
}
