package com.lx.springbootmyself.tools;

import java.util.UUID;

public class StringTools {
    /***
     * get   uuid32
     * @return String
     */
    public static String getUUID32(){
    String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
    return uuid;
    }
}
