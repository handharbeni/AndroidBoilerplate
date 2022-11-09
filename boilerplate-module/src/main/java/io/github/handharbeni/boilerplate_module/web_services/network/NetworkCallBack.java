package io.github.handharbeni.boilerplate_module.web_services.network;


public interface NetworkCallBack {

    void getResults(String results);
    void onError(int statusCode, String error);

}
