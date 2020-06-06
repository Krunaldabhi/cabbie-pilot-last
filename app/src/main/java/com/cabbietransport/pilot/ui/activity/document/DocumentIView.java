package com.cabbietransport.pilot.ui.activity.document;

import com.cabbietransport.pilot.base.MvpView;
import com.cabbietransport.pilot.data.network.model.DriverDocumentResponse;

public interface DocumentIView extends MvpView {

    void onSuccess(DriverDocumentResponse response);

    void onDocumentSuccess(DriverDocumentResponse response);

    void onError(Throwable e);

    void onSuccessLogout(Object object);

}
