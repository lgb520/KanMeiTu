package com.ixuea.courses.kanmeitu.util;

import android.content.Context;
import android.content.SharedPreferences;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.getBoolean;

public class SharePreferencesUtil {
    private  static  final  String TAG="TAG";
    private  static  final  String KEY_LOGIN="KEY_LOGIN";

    private  static SharedPreferences mPreferences;
    private  static  SharedPreferences.Editor mEditor;
    private  static  SharePreferencesUtil mSharePreferenceUtil;
    private final Context context;

    public SharePreferencesUtil(Context context) {
        this.context = context.getApplicationContext();
        mPreferences=this.context.getSharedPreferences(TAG,Context.MODE_PRIVATE);
        mEditor=mPreferences.edit();
    }

    //单例简单实现
    public static SharePreferencesUtil getInstance(Context context){
        if (mSharePreferenceUtil==null){
            mSharePreferenceUtil=new SharePreferencesUtil(context);
        }
        return mSharePreferenceUtil;
    }

    //判断是否登陆

    public boolean isLogin(){return getBoolean (KEY_LOGIN,false);}

    public void setLogin(boolean value){putBoolean(KEY_LOGIN,value);}

    private void putBoolean(String key, boolean value) {
        mEditor.putBoolean(key, value);
        mEditor.commit();
    }

    private String get(String key){return mPreferences.getString(key,"");}
    private boolean getBoolean(String key, Boolean defaultValue) {
        return mPreferences.getBoolean(key,defaultValue);
    }

    private void putInt(String key,int value){
        mEditor.putInt(key,value);
        mEditor.apply();
    }

    private int getInt(String key,int defaultValue){
        return mPreferences.getInt(key,defaultValue);
    }

}
