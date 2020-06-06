package com.cabbietransport.pilot.ui.fragment.incoming_request;

import com.cabbietransport.pilot.base.MvpPresenter;

public interface IncomingRequestIPresenter<V extends IncomingRequestIView> extends MvpPresenter<V> {

    void accept(Integer id);
    void cancel(Integer id);
}
