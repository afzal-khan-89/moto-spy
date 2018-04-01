package com.geon.spymoto.network.apputil;


import com.geon.spymoto.network.remote.RetroService;
import com.geon.spymoto.network.remote.RetrofitClient;

/**
 * Created by Babu on 1/5/2018.
 */

public class ApiUtils {

    private static final String BASE_URL = "http://www.geon-bd.com/vts/index.php/";
    public static RetroService getRetrofitService() {
        return RetrofitClient.getClient(BASE_URL).create(RetroService.class);
    }
}
