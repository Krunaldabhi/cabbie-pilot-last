package com.cabbietransport.pilot.ui.activity.help;


import com.cabbietransport.pilot.base.MvpPresenter;

public interface HelpIPresenter<V extends HelpIView> extends MvpPresenter<V> {

    void getHelp();
}
