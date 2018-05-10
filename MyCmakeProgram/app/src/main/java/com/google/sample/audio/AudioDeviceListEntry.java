package com.google.sample.audio;


import android.annotation.TargetApi;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;

import java.util.List;
import java.util.Vector;

public class AudioDeviceListEntry {
    private int id;
    private String name;

    public AudioDeviceListEntry(int deviceId, String deviceName) {
        id = deviceId;
        name = deviceName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AudioDeviceListEntry that = (AudioDeviceListEntry) obj;
        if (id != that.id) {
            return false;
        }
        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
    @TargetApi(23)
    static List<AudioDeviceListEntry> createListFrom(AudioDeviceInfo[] devices, int directionType){
        List<AudioDeviceListEntry> listEntries = new Vector<>();
        for (AudioDeviceInfo info : devices) {
            if (directionType == AudioManager.GET_DEVICES_ALL ||
                    (directionType == AudioManager.GET_DEVICES_OUTPUTS && info.isSink()) ||
                    (directionType == AudioManager.GET_DEVICES_INPUTS && info.isSource())) {
                listEntries.add(new AudioDeviceListEntry(info.getId(), info.getProductName() + " " +
                        AudioDeviceInfoConverter.typeToString(info.getType())));
            }
        }
        return listEntries;
    }
}
