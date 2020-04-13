package com.example.android.miwok;

import android.view.View;

public class Word {
/** default translation of the word*/
    private String mDefaultTranslation;
    /** Miwok translation of the word*/
    private String mMiwokTranslation;
// the id of the images
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    private int mAudioResourceId;



    public Word( String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId){

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;



    }

    public Word( String defaultTranslation, String miwokTranslation, int audioResourceId ){

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
    public int getImageResourceId(){
        return mImageResourceId;
    }
    public int getAudioResourceId(){
        return mAudioResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Word{" + "mDefaultTranslation: " +mDefaultTranslation+ " mMiwokTranslation"+ mMiwokTranslation
                + " mImageResourceId " + mImageResourceId+ " mAudioResourceId" + mAudioResourceId+ "}";
    }
}

