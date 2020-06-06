package com.cabbietransport.pilot.ui.activity.instant_ride;

import com.cabbietransport.pilot.base.MvpView;
import com.cabbietransport.pilot.data.network.model.EstimateFare;
import com.cabbietransport.pilot.data.network.model.TripResponse;

public interface InstantRideIView extends MvpView {

    void onSuccess(EstimateFare estimateFare);

    void onSuccess(TripResponse response);

    void onError(Throwable e);

}
