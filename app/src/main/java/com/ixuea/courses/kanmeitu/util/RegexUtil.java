package com.ixuea.courses.kanmeitu.util;

public class RegexUtil {
    private static  final String PHONE_REGEX="^((13[0-9])|(14[5,7,9])|(15[^4])|(18[0-9])|(17[0,1,3,5,6,7,8]))\\d{8}$";
    private  static final String EMAIL_REGEX="^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";

    public static boolean isPhone(String value) {return  value.matches(PHONE_REGEX);}

    public static boolean isEmail(String value) {return value.matches(EMAIL_REGEX);}
}
