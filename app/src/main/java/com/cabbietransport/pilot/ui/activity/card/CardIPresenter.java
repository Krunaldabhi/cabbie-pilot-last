package com.cabbietransport.pilot.ui.activity.card;

import com.cabbietransport.pilot.base.MvpPresenter;

public interface CardIPresenter<V extends CardIView> extends MvpPresenter<V> {

    void deleteCard(String cardId);

    void card();

    void changeCard(String cardId);
}
