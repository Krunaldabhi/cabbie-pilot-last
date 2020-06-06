package com.cabbietransport.pilot.ui.activity.invite_friend;

import com.cabbietransport.pilot.base.MvpView;
import com.cabbietransport.pilot.data.network.model.UserResponse;

public interface InviteFriendIView extends MvpView {

    void onSuccess(UserResponse response);
    void onError(Throwable e);

}
