package com.cabbietransport.pilot.ui.activity.sociallogin;

import com.cabbietransport.pilot.base.MvpView;
import com.cabbietransport.pilot.data.network.model.Token;

public interface SocialLoginIView extends MvpView {

    void onSuccess(Token token);
    void onError(Throwable e);
}
