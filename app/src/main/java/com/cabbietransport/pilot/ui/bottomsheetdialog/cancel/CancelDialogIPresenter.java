package com.cabbietransport.pilot.ui.bottomsheetdialog.cancel;

import com.cabbietransport.pilot.base.MvpPresenter;

import java.util.HashMap;

public interface CancelDialogIPresenter<V extends CancelDialogIView> extends MvpPresenter<V> {

    void cancelRequest(HashMap<String, Object> obj);
    void getReasons();
}
