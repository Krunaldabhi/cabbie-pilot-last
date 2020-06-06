package com.cabbietransport.pilot.ui.bottomsheetdialog.rating;

import com.cabbietransport.pilot.base.MvpView;
import com.cabbietransport.pilot.data.network.model.Rating;

public interface RatingDialogIView extends MvpView {

    void onSuccess(Rating rating);
    void onError(Throwable e);
}
