package com.cabbietransport.pilot.ui.bottomsheetdialog.cancel;

import com.cabbietransport.pilot.base.MvpView;
import com.cabbietransport.pilot.data.network.model.CancelResponse;

import java.util.List;

public interface CancelDialogIView extends MvpView {

    void onSuccessCancel(Object object);
    void onError(Throwable e);
    void onSuccess(List<CancelResponse> response);
    void onReasonError(Throwable e);
}
