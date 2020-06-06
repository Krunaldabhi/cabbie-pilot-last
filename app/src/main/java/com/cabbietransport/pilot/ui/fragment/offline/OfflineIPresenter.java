package com.cabbietransport.pilot.ui.fragment.offline;

import com.cabbietransport.pilot.base.MvpPresenter;

import java.util.HashMap;

public interface OfflineIPresenter<V extends OfflineIView> extends MvpPresenter<V> {

    void providerAvailable(HashMap<String, Object> obj);
}
