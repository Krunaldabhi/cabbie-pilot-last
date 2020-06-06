package com.cabbietransport.pilot.ui.bottomsheetdialog.rating;

import com.cabbietransport.pilot.base.MvpPresenter;

import java.util.HashMap;

public interface RatingDialogIPresenter<V extends RatingDialogIView> extends MvpPresenter<V> {

    void rate(HashMap<String, Object> obj, Integer id);
}
