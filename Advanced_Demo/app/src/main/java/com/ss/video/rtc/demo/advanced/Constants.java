package com.ss.video.rtc.demo.advanced;

/**
 * VolcEngineRTC 常量定义
 */
public class Constants {

    //APPID 使用SDK前需要为自己的应用申请一个AppId，详情参见{https://www.volcengine.com/docs/6348/69865}
    public static final String APPID = "63802c9692739f015cbfdc1b";

    //TOKEN 加入房间的时候需要使用token完成鉴权，详情参见{https://www.volcengine.com/docs/6348/70121}

    //public static final String APPKEY = "2a1441ecc6564606bb7790b02980bc1d";

    //INPUT_REGEX SDK 对房间名、用户名的限制是：非空且最大长度不超过128位的数字、大小写字母、@ . _ -
    public static final String INPUT_REGEX = "^[a-zA-Z0-9@._-]{1,128}$";

    public static final String PASSWORD_REGEX = "^[a-zA-Z0-9]{0,128}$";

    public static final String ROOM_ID_EXTRA = "extra_room_id";

    public static final String USER_ID_EXTRA = "extra_user_id";

    public static final String PASSWORD_EXTRA = "extra_password";

    public static final String TOKEN_EXTRA = "extra_token";

    public static final String SP_FILE_NAME = "advanced_start";

    public static final String DATABASE_URI = "http://81.68.111.184:8080/DispatcherServlet";

}
