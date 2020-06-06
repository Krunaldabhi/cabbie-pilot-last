package com.cabbietransport.pilot.ui.activity.summary;


import com.cabbietransport.pilot.base.MvpView;
import com.cabbietransport.pilot.data.network.model.Summary;

public interface SummaryIView extends MvpView {

    void onSuccess(Summary object);

    void onError(Throwable e);
}
