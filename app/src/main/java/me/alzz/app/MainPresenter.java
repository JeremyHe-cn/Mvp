package me.alzz.app;

import me.alzz.mvp.BasePresenter;

/**
 * Created by jeremyhe on 2017/9/12.
 */

public class MainPresenter extends BasePresenter<IMainView> {

    public void queryMsg() {
        // may be query from db or network
        String msg = "msg from query";

        if (mView == null) {
            // log or ignore
        } else {
            mView.showMsg(msg);
        }
    }
}