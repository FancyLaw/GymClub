package com.example.jasper.ccxapp.entitiy;

import android.graphics.Bitmap;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jasper on 2017/4/19.
 */

public class ShowItemModel implements Serializable {
    private String msgKey;
    private List<Long> groupBelongToList;
    private String showUsername;
    private File showAvatar;
    private String showText;
    private String showTime;

    private ArrayList<String> showImagesList;
    private String showVideo;

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public File getShowAvatar() {
        return showAvatar;
    }

    public void setShowAvatar(File showAvatar) {
        this.showAvatar = showAvatar;
    }

    public List<Long> getGroupBelongToList() {
        return groupBelongToList;
    }

    public void setGroupBelongToList(List<Long> groupBelongToList) {
        this.groupBelongToList = groupBelongToList;
    }

    public ArrayList<String> getShowImagesList() {
        return showImagesList;
    }

    public void setShowImagesList(ArrayList<String> showImagesList) {
        this.showImagesList = showImagesList;
    }

    public String getMsgKey() {
        return msgKey;
    }

    public void setMsgKey(String msgKey) {
        this.msgKey = msgKey;
    }

    public String getShowUsername() {
        return showUsername;
    }

    public void setShowUsername(String showUsername) {
        this.showUsername = showUsername;
    }

    public String getShowText() {
        return showText;
    }

    public void setShowText(String showText) {
        this.showText = showText;
    }


    public String getShowVideo() {
        return showVideo;
    }

    public void setShowVideo(String showVideo) {
        this.showVideo = showVideo;
    }
}
