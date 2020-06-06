package com.cabbietransport.pilot.ui.fragment.offline;

import com.cabbietransport.pilot.base.MvpView;

public interface OfflineIView extends MvpView {

    void onSuccess(Object object);
    void onError(Throwable e);
}
