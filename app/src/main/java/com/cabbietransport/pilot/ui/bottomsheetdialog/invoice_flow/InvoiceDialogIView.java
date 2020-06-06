package com.cabbietransport.pilot.ui.bottomsheetdialog.invoice_flow;

import com.cabbietransport.pilot.base.MvpView;

public interface InvoiceDialogIView extends MvpView {

    void onSuccess(Object object);
    void onError(Throwable e);
}
