package com.tsl.mvpframe;

/**
 * Created by suning.tang on 2017/4/26.
 */

public interface IBaseModel {
    void sendRequestToServer();

    void setApiInterface(String apiInterface);

    void setMethod(int method);

    void cancelRequest();

}
