package com.cabbietransport.pilot.ui.activity.notification_manager;

import com.cabbietransport.pilot.base.MvpPresenter;

public interface NotificationManagerIPresenter<V extends NotificationManagerIView> extends MvpPresenter<V> {
    void getNotificationManager();
}
