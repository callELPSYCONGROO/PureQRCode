package com.wuhenjian.pureqrcode.contants;

/**
 * 请求、响应码
 * 请求码为十以内的数字
 * 响应码为请求码后面增加一个1
 */
public class RequestResultCodeContant {

    public final static int CREATE_REQUEST_CODE = 1;
    public final static int CREATE_RESULT_CODE = 11;
    public final static String CREATE_QR_KEY = "createQR";

    public final static int ANALYSIS_REQUEST_CODE = 2;
    public final static int ANALYSIS_RESULT_CODE = 21;
    public final static String ANALYSIS_STRING_KEY = "analysisQR";
}
