package com.cabbietransport.pilot.ui.activity.add_card;

import com.cabbietransport.pilot.base.MvpPresenter;

public interface AddCardIPresenter<V extends AddCardIView> extends MvpPresenter<V> {

    void addCard(String stripeToken);
}
