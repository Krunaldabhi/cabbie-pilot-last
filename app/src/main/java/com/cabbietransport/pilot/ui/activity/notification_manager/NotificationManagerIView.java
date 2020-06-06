package com.cabbietransport.pilot.ui.activity.notification_manager;

import com.cabbietransport.pilot.base.MvpView;
import com.cabbietransport.pilot.data.network.model.NotificationManager;

import java.util.List;

public interface NotificationManagerIView extends MvpView {

    void onSuccess(List<NotificationManager> managers);

    void onError(Throwable e);

}