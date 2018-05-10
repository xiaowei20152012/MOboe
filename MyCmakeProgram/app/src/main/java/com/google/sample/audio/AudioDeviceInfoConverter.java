package com.google.sample.audio;


import android.annotation.TargetApi;
import android.media.AudioDeviceInfo;

class AudioDeviceInfoConverter {

    /**
     * Converts an {@link android.media.AudioDeviceInfo} object into a human readable representation
     *
     * @param adi The AudioDeviceInfo object to be converted to a String
     * @return String containing all the information from the AudioDeviceInfo object
     */
    @TargetApi(23)
    static String toString(AudioDeviceInfo adi) {
        StringBuilder sb = new StringBuilder();
        sb.append("Id: ");
        sb.append(adi.getId());

        sb.append("\n Product name: ");
        sb.append(adi.getProductName());

        sb.append("\nType: ");
        sb.append(adi.getType());

        sb.append("\nIs source: ");
        sb.append(adi.isSource() ? "Yes" : "No");

        sb.append("\nIs sink: ");
        sb.append(adi.isSink() ? "Yes" : "No");

        sb.append("\nChannel counts: ");
        sb.append(adi.getChannelCounts());

        sb.append("\nChannel masks: ");
        sb.append(adi.getChannelMasks());

        return sb.toString();
    }
}
