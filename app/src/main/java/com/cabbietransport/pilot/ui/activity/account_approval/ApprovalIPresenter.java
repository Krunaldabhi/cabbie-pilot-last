package com.cabbietransport.pilot.ui.activity.account_approval;


import com.cabbietransport.pilot.base.MvpPresenter;

import java.util.HashMap;


public interface ApprovalIPresenter<V extends ApprovalIView> extends MvpPresenter<V> {

    void ApprovalHelp();

    void sendApprovalReminder(HashMap<String, Object> obj);
}
