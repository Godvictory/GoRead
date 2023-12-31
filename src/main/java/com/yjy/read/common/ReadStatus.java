package com.yjy.read.common;

import lombok.Getter;

// 用枚举 来区分状态
public enum ReadStatus {

    UNREAD(0, "未读"),
    READING(1, "阅读中"),
    FINISH(2, "已读完");;

    @Getter
    private int value;
    private String desc;

    ReadStatus(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

}
