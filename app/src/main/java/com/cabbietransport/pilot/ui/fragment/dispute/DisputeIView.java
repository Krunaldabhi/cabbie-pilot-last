package com.cabbietransport.pilot.ui.fragment.dispute;

import com.cabbietransport.pilot.base.MvpView;
import com.cabbietransport.pilot.data.network.model.DisputeResponse;

import java.util.List;

public interface DisputeIView extends MvpView {

    void onSuccessDispute(List<DisputeResponse> responseList);

    void onSuccess(Object object);

    void onError(Throwable e);
}
