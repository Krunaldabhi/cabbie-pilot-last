package com.cabbietransport.pilot.ui.fragment.incoming_request;

import com.cabbietransport.pilot.base.MvpView;

public interface IncomingRequestIView extends MvpView {

    void onSuccessAccept(Object responseBody);
    void onSuccessCancel(Object object);
    void onError(Throwable e);
}
