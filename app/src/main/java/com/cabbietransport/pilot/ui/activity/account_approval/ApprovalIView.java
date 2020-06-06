package com.cabbietransport.pilot.ui.activity.account_approval;

import com.cabbietransport.pilot.base.MvpView;
import com.cabbietransport.pilot.data.network.model.Approval;
import com.cabbietransport.pilot.data.network.model.ReminderMessage;

public interface ApprovalIView extends MvpView {

    void onSuccess(Approval object);

    void onSuccess(ReminderMessage response);

    void onError(Throwable e);
}
