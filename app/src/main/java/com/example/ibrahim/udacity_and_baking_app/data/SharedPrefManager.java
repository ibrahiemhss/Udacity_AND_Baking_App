package com.example.ibrahim.udacity_and_baking_app.data;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by ibrahim on 30/12/17.
 * SharedPrefManager will save the value of selected sort of show that will base in query url
 *
 * @see <a href="https://github.com/ibrahiemhss/Mashaweer-master/blob/master/app/src/main/java/com/mashaweer/ibrahim/mashaweer/data/SharedPrefManager.java"">https://github.com</a>
 */
@SuppressWarnings("unused")
public class SharedPrefManager {
    private static final String PREF_INDEX = "pref_index";
    private static final String PREF_IS_FIRST_OPEN = "pref_first_open";
    private static final String PREF_DETAILS_POSITION = "pref_position";
    private static final String PREF_BAKE_NAME = "pref_bake_name";

    private static final String PREF_VIDEO_URL = "pref_video_url";
    private static final String SHARED_PREF_NAME = "save_contents";
    private static SharedPrefManager mInstance;
    private final SharedPreferences pref;

    private SharedPrefManager(Context context) {
        pref = context.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
    }

    public static synchronized SharedPrefManager getInstance(Context context) {
        if (mInstance == null) {
            mInstance = new SharedPrefManager(context);

        }
        return mInstance;
    }

    public int getPrefDetailsPosition() {
        return pref.getInt(PREF_DETAILS_POSITION, 0);

    }

    public void setPrefDetailsPosition(int position) {
        SharedPreferences.Editor editor = pref.edit();
        editor.putInt(PREF_DETAILS_POSITION, position);
        editor.apply();
        editor.commit();

    }

    public String getPrefBakeName() {
        return pref.getString(PREF_BAKE_NAME, null);

    }

    public void setPrefBakeName(String bakeName) {
        SharedPreferences.Editor editor = pref.edit();
        editor.putString(PREF_BAKE_NAME, bakeName);
        editor.apply();
        editor.commit();

    }


    public int getPrefIndex() {
        return pref.getInt(PREF_INDEX, 0);

    }

    public void setPrefIndex(int index) {
        SharedPreferences.Editor editor = pref.edit();
        editor.putInt(PREF_INDEX, index);
        editor.apply();
        editor.commit();

    }

    public String getVideoUrl() {
        return pref.getString(PREF_VIDEO_URL, null);

    }

    public void seSetVideoUrl() {
        SharedPreferences.Editor editor = pref.edit();
        editor.putString(PREF_VIDEO_URL, null);
        editor.apply();
        editor.commit();

    }

    public void setOpned() {
        SharedPreferences.Editor editor = pref.edit();
        editor.putBoolean(PREF_VIDEO_URL, false);
        editor.apply();
        editor.commit();

    }

    public boolean isOpened() {
        return pref.getBoolean(PREF_IS_FIRST_OPEN, false);

    }

    public void setOpened(boolean isOpen) {
        SharedPreferences.Editor editor = pref.edit();
        editor = pref.edit();
        editor.putBoolean(PREF_IS_FIRST_OPEN, isOpen);
        editor.apply();
        editor.commit();

    }

}