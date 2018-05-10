package com.google.sample.audio;


import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.Spinner;

public class AudioDeviceSpinner extends Spinner {
    private static final int AUTO_SELECT_DEVICE_ID = 0;
    private static final String TAG = AudioDeviceSpinner.class.getSimpleName();
    private int directionType;
    private AudioDevice

    public AudioDeviceSpinner(Context context) {
        super(context);
    }

    public AudioDeviceSpinner(Context context, int mode) {
        super(context, mode);
    }

    public AudioDeviceSpinner(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AudioDeviceSpinner(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public AudioDeviceSpinner(Context context, AttributeSet attrs, int defStyleAttr, int mode) {
        super(context, attrs, defStyleAttr, mode);
    }

    public AudioDeviceSpinner(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes, int mode) {
        super(context, attrs, defStyleAttr, defStyleRes, mode);
    }

    public AudioDeviceSpinner(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes, int mode, Resources.Theme popupTheme) {
        super(context, attrs, defStyleAttr, defStyleRes, mode, popupTheme);
    }


    private void init(Context context) {
        m
    }
}
